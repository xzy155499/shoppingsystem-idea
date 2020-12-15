package com.guigu.dao;

import com.guigu.vo.GoodsChildType;
import com.guigu.vo.WarehouseGoods;

import java.util.List;

public interface WarehouseGoodsDao {


    List<WarehouseGoods> queryAllWarehouseGoods();

    List<WarehouseGoods> queryWarehouseGoodsById(int id);

    int addWarehouseGoods(WarehouseGoods WarehouseGoods);

    int delWarehouseGoods(int id);

    int updWarehouseGoods(WarehouseGoods WarehouseGoods);
}
