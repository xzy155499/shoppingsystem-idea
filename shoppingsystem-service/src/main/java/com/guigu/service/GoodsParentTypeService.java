package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.GoodsParentType;
import com.guigu.vo.PageVo;

import java.util.List;

public interface GoodsParentTypeService {

    List<GoodsParentType> queryAllGoodsParentType(GoodsParentType goodsParentType);

    int addGoodsParentType(GoodsParentType goodsParentType);

    int delGoodsParentType(int id);

    int updGoodsParentType(GoodsParentType goodsParentType);
}
