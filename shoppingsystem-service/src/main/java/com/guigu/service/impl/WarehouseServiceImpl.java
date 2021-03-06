package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.GoodsDao;
import com.guigu.dao.GoodsParentDao;
import com.guigu.dao.WarehouseDao;
import com.guigu.dao.WarehouseGoodsDao;
import com.guigu.service.WarehouseService;
import com.guigu.service.GoodsService;
import com.guigu.vo.Goods;
import com.guigu.vo.Warehouse;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    WarehouseDao dao;
    @Autowired
    WarehouseGoodsDao wgdao;

    @Override
    public PageVo<Warehouse> queryAllWarehouse( int page, int rows, Warehouse warehouse) {
        PageVo<Warehouse> pageVo = new PageVo<>();
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        List<Warehouse> list = dao.queryAllWarehouse(warehouse);
        for (Warehouse w :list){
            if (w.getwCity().equals(w.getwProvince())){
                w.setDetailedAddress(w.getwProvince()+"-"+w.getwCounty());
            }else{
                w.setDetailedAddress(w.getwProvince()+"-"+w.getwCity()+"-"+w.getwCounty());
            }
        }
        //获取分页后 显示的数据集合
        pageVo.setRows(list);
        //获取总的记录数量
        pageVo.setTotal(dao.queryWarehouseCount(warehouse));
        return pageVo;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        return dao.addWarehouse(warehouse);
    }

    @Override
    public int delWarehouse(int id) {
        return dao.delWarehouse(id);
    }

    @Override
    public int updWarehouse(Warehouse warehouse) {
        return dao.updWarehouse(warehouse);
    }

    @Override
    public List<Warehouse> queWarehouseStatistical() {
        return dao.queWarehouseStatistical();
    }

    @Override
    public int turnWarehouse(int wid, int newwid, String nums, String gids) {
        String[] num = nums.split(",");
        String[] id = gids.split(",");
        for (int i = 0; i <id.length ; i++) {
            //添加仓库商品数量

                int row = wgdao.queWarehouseGoodsByWid(newwid,Integer.parseInt(id[i]));
                int upd =wgdao.updWarehouseGoodsnum(newwid,Integer.parseInt(id[i]),Integer.parseInt(num[i]));
                if (row==0){
                    int add = wgdao.addWarehouseGoodsnum(newwid,Integer.parseInt(id[i]),Integer.parseInt(num[i]));

                }
            //减去仓库商品数量
            int add1 = wgdao.updWarehouseGoodsnum(wid,Integer.parseInt(id[i]),-(Integer.parseInt(num[i])));
        }


        return 0;
    }
}
