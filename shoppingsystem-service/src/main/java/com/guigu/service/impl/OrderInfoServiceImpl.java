package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;

import com.guigu.dao.GoodsDao;
import com.guigu.dao.OrderInfoDao;
import com.guigu.dao.WarehouseDao;
import com.guigu.dao.WarehouseGoodsDao;
import com.guigu.service.OrderInfoService;
import com.guigu.vo.Goods;
import com.guigu.vo.OrderInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    OrderInfoDao dao;
    @Autowired
    WarehouseDao wdao;
    @Autowired
    WarehouseGoodsDao wgdao;
    @Autowired
    GoodsDao gdao;

    @Override
    public List<OrderInfo> queryOrderInfoById(int id) {
        return null;
    }

    @Override
    public PageVo<OrderInfo> queryAllOrderInfo(int page, int rows, OrderInfo orderInfo) {
        PageVo<OrderInfo> pageVo = new PageVo<>();
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(dao.queryAllOrderInfo(orderInfo));
        //获取总的记录数量
        pageVo.setTotal(dao.queryAllOrderInfoCond(orderInfo));

        return pageVo;
    }

    @Override
    public int addOrderInfo(OrderInfo orderInfo) {
        return 0;
    }

    @Override
    public int delOrderInfo(int id) {
        return 0;
    }

    @Override
    public int updOrderInfo(OrderInfo orderInfo) {
        return 0;
    }

    @Override
    public int intoWarehouse(int id,String ids) {
        OrderInfo o = dao.queryOrderInfoById(id);
        //最后一次出售时间
        for (int i = 0; i < o.getList().size(); i++) {
            gdao.updFinalSales(o.getList().get(i).getGoodsId(),o.getList().get(i).getNum());
        }
        //订单状态
        dao.updOrderInfoInto(id);
        //仓库数量

        String[] str = ids.split(",");
        List<Warehouse> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(wdao.queryWarehouseById(Integer.parseInt(str[i])));
        }
        for (int i = 0; i < o.getList().size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k <list.get(j).getList().size() ; k++) {
                    if (o.getList().get(i).getGoodsId()==list.get(j).getList().get(k).getgId()){
                        //System.out.println(list.get(j).getList().get(k));
                        //订单的数量和仓库的数量比较
                        if(o.getList().get(i).getNum()>list.get(j).getList().get(k).getWgNum()){
                            int num = o.getList().get(i).getNum()-list.get(j).getList().get(k).getWgNum();
                            wgdao.updWarehouseGoodsnum(list.get(j).getList().get(k).getwId(),o.getList().get(i).getGoodsId(),-list.get(j).getList().get(k).getWgNum());
                            o.getList().get(i).setNum(num);
                        }else if (o.getList().get(i).getNum()!=0){
                            wgdao.updWarehouseGoodsnum(list.get(j).getList().get(k).getwId(),o.getList().get(i).getGoodsId(),-o.getList().get(k).getNum());
                            o.getList().get(i).setNum(0);
                        }

                        break;
                    }
                }
            }
        }


        return 0;
    }
}
