package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.PageVo;

import java.util.List;

public interface GoodsService {

    PageVo<Goods> queryAllGoods(int page ,int rows);
}
