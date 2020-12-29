package com.guigu.service.impl;

import com.guigu.dao.OrderGoodsDao;
import com.guigu.service.OrderGoodsService;
import com.guigu.vo.OrderCart;
import com.guigu.vo.OrderGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderGoodsServiceImpl implements OrderGoodsService {
    @Autowired
    OrderGoodsDao orderGoodsDao;

    @Override
    public int addOrderGoods(OrderGoods orderGoods) {
        return orderGoodsDao.addOrderGoods(orderGoods);
    }
}
