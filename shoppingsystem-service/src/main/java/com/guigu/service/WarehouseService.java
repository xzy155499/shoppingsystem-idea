package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.Warehouse;
import com.guigu.vo.PageVo;

import java.util.List;

public interface WarehouseService {

    PageVo<Warehouse> queryAllWarehouse(int page, int rows, Warehouse warehouse);

    int addWarehouse(Warehouse warehouse);

    int delWarehouse(int id);

    int updWarehouse(Warehouse warehouse);

    List<Warehouse> queWarehouseStatistical();

    int turnWarehouse(int wid,int newwid,String nums,String gids);
}
