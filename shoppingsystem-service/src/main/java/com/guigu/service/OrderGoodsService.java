package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.OrderCart;
import com.guigu.vo.OrderGoods;
import com.guigu.vo.PageVo;

import java.util.List;

public interface OrderGoodsService {

    int addOrderGoods(OrderGoods orderGoods);

}
