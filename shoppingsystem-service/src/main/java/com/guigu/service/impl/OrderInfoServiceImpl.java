package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;

import com.guigu.dao.*;
import com.guigu.service.OrderInfoService;
import com.guigu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    @Autowired
    UserDao udao;

    @Override
    public OrderInfo queryOrderInfoById(int id) {
        return dao.queryOrderInfoById(id);
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
        return dao.addOrderInfo(orderInfo);
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

    @Override
    public List<Goods> queryAllOrderInfoGoods() {

        List<Goods> goodsList = gdao.queryAllGoods(null);
        for (Goods g:goodsList){
            //日销量
            g.setgParent(0);
            //周销量
            g.setgChild(0);
            //月销量
            g.setWarehouseNum(0);
        }
        for (Goods g:goodsList){
            //日销量
            List<OrderInfo> list=dao.queryAllOrderInfoGoodsDay(g.getgId());
            for (OrderInfo o:list){
                for(OrderGoods og :o.getList()) {
                    if (g.getgId() == og.getGoodsId())
                        g.setgParent(g.getgParent() + og.getNum());
                }
            }
            List<OrderInfo> list1=dao.queryAllOrderInfoGoodsWeeks(g.getgId());
            for (OrderInfo o:list1){
                for(OrderGoods og :o.getList()) {
                    if (g.getgId() == og.getGoodsId())
                        g.setgChild(g.getgChild() + og.getNum());
                }
            }
            List<OrderInfo> list2=dao.queryAllOrderInfoGoodsMonth(g.getgId());
            for (OrderInfo o:list2){
                for(OrderGoods og :o.getList()) {
                    if (g.getgId() == og.getGoodsId())
                        g.setWarehouseNum(g.getWarehouseNum() + og.getNum());
                }
            }
        }
        Collections.sort(goodsList);
        return goodsList;
    }

    @Override
    public Map<String, Object> queHomeData() {
        Map<String, Object> map = new HashMap<>();
        int orderNumDay=dao.queryAllOrderInfoDay();
        int orderNumMonty =dao.queryAllOrderInfoMonth();

        int userNumDay=udao.queryUserDay();
        int userNumMonty=udao.queryUserMonth();

        List<OrderInfo> list = dao.queryAllOrderInfoGoodsDayProfits();
        int orderInfoGoodsDayProfits =0;
        for (OrderInfo o :list){
            for (OrderGoods og :o.getList()){
                orderInfoGoodsDayProfits+=(og.getPriceOut()-og.getPriceInto())*og.getNum();
            }
        }

        List<OrderInfo> list1 = dao.queryAllOrderInfoGoodsMontyProfits();
        int orderInfoGoodsMontyProfits =0;
        for (OrderInfo o :list1){
            for (OrderGoods og :o.getList()){
                orderInfoGoodsMontyProfits+=(og.getPriceOut()-og.getPriceInto())*og.getNum();
            }
        }
        map.put("orderNumDay",orderNumDay);
        map.put("orderInfoGoodsDayProfits",orderInfoGoodsDayProfits*0.95);
        map.put("userNumDay",userNumDay);
        map.put("orderNumMonty",orderNumMonty);
        map.put("orderInfoGoodsMontyProfits",orderInfoGoodsMontyProfits*0.95);
        map.put("userNumMonty",userNumMonty);
        return map;
    }

    @Override
    public List<UserInfo> queOrderByUid() {
        List<UserInfo> list = udao.queryAllUser(null);
        for(UserInfo u:list){
            double num=0;
            List<OrderInfo> olist = dao.queOrderByUid(u.getUser_id());
            for(OrderInfo o :olist){
                num+=o.getSum();
            }
            u.setPass(num+"");
        }
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <list.size() ; j++) {
                if (Double.parseDouble(list.get(i).getPass())>Double.parseDouble(list.get(j).getPass())){
                    UserInfo a = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,a);
                }
            }
        }
        return list;
    }

    @Override
    public int updOrderInfoState(OrderInfo orderInfo) {
        return dao.updOrderInfoState(orderInfo);
    }
}
