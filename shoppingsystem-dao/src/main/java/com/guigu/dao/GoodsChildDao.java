package com.guigu.dao;

import com.guigu.vo.Goods;
import com.guigu.vo.GoodsChildType;

import java.util.List;

public interface GoodsChildDao {


    List<GoodsChildType> queryAllGoodsChildType(int id);

    List<GoodsChildType> queryGoodsChildTypeById(int id);

    int addGoodsChildType(GoodsChildType goodsChildType);

    int delGoodsChildType(int id);

    int updGoodsChildType(GoodsChildType goodsChildType);

}
