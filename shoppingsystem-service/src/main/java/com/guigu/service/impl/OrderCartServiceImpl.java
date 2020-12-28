package com.guigu.service.impl;

import com.guigu.dao.OrderCartDao;
import com.guigu.service.OrderCartService;
import com.guigu.vo.OrderCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderCartServiceImpl implements OrderCartService {
    @Autowired
    OrderCartDao orderCartDao;

    @Override
    public List<OrderCart> queryUserShoppingCartByUid(OrderCart orderCart) {
        return orderCartDao.queryUserShoppingCartByUid(orderCart);
    }

    @Override
    public int queryUserShoppingCartCountByUid(OrderCart orderCart) {
        return orderCartDao.queryUserShoppingCartCountByUid(orderCart);
    }

    @Override
    public OrderCart gIdExistShoppingCart(OrderCart orderCart) {
        return orderCartDao.gIdExistShoppingCart(orderCart);
    }

    @Override
    public int updateGoodsNumAndSumPrice(OrderCart orderCart) {
        return orderCartDao.updateGoodsNumAndSumPrice(orderCart);
    }

    @Override
    public int delShoppingCartById(OrderCart orderCart) {
        return orderCartDao.delShoppingCartById(orderCart);
    }

    @Override
    public int addShoppingCart(OrderCart orderCart) {
        return orderCartDao.addShoppingCart(orderCart);
    }
}
