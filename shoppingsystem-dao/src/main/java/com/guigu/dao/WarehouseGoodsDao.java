package com.guigu.dao;

import com.guigu.vo.GoodsChildType;
import com.guigu.vo.Warehouse;
import com.guigu.vo.WarehouseGoods;

import java.util.List;

public interface WarehouseGoodsDao {


    List<WarehouseGoods> queryAllWarehouseGoods(WarehouseGoods warehouseGoods);

    WarehouseGoods queryWarehouseGoodsById(int id);

    int addWarehouseGoods(WarehouseGoods WarehouseGoods);

    int queryWarehouseGoodsCount(WarehouseGoods warehouseGoods);

    int delWarehouseGoods(int id);

    int updWarehouseGoods(WarehouseGoods WarehouseGoods);
}
