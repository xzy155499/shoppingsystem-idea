package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.GoodsChildType;
import com.guigu.vo.PageVo;

import java.util.List;

public interface GoodsChildTypeService {

    List<GoodsChildType> queryAllGoodsChildType(int id);

    int addGoodsChildType(GoodsChildType goodsChildType);

    int delGoodsChildType(int id);

    int updGoodsChildType(GoodsChildType goodsChildType);
}
