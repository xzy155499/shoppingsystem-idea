package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.PageVo;
import com.guigu.vo.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> queryGoodsById(int id);

    PageVo<Goods> queryAllGoods(int page ,int rows,Goods goods);

    int updGoodsImg(Goods goods);

    int addGoods(Goods goods);

    int delGoods(int id);

    int updGoods(Goods goods);

    PageVo<Goods> queryAllGoods1(int page ,int rows,Goods goods);
    List<Goods> queryAllGoods2(Goods goods);

}
