package com.guigu.service;

import com.github.pagehelper.Page;
import com.guigu.vo.Goods;
import com.guigu.vo.WarehouseGoods;
import com.guigu.vo.PageVo;

import java.util.List;

public interface WarehouseGoodsService {

    PageVo<WarehouseGoods> queryAllWarehouseGoods(int page,int rows,WarehouseGoods warehouseGoods);

    int addWarehouseGoods(WarehouseGoods WarehouseGoods);

    int delWarehouseGoods(int id);

    int updWarehouseGoods(WarehouseGoods WarehouseGoods);
}
