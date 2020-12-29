package com.guigu.dao;

import com.guigu.vo.GoodsChildType;
import com.guigu.vo.Warehouse;

import java.util.List;

public interface WarehouseDao {


    List<Warehouse> queryAllWarehouse(Warehouse warehouse);

    int queryWarehouseCount(Warehouse warehouse);

    Warehouse queryWarehouseById(int id);

    int addWarehouse(Warehouse warehouse);

    int delWarehouse(int id);

    int updWarehouse(Warehouse warehouse);

    List<Warehouse> queWarehouseStatistical();

}
