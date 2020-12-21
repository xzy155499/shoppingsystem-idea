package com.guigu.dao;

import com.guigu.vo.GoodsChildType;
import com.guigu.vo.GoodsParentType;

import java.util.List;

public interface GoodsParentDao {


    List<GoodsParentType> queryAllGoodsParentType(GoodsParentType goodsParentType);

    List<GoodsParentType> queryGoodsParentTypeById(int id);

    int addGoodsParentType(GoodsParentType goodsParentType);

    int delGoodsParentType(int id);

    int updGoodsParentType(GoodsParentType goodsParentType);
}
