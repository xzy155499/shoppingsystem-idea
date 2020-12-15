package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.WarehouseGoods;
import com.guigu.vo.PageVo;

import java.util.List;

public interface WarehouseGoodsService {

    List<WarehouseGoods> queryAllWarehouseGoods();

    int addWarehouseGoods(WarehouseGoods WarehouseGoods);

    int delWarehouseGoods(int id);

    int updWarehouseGoods(WarehouseGoods WarehouseGoods);
}
