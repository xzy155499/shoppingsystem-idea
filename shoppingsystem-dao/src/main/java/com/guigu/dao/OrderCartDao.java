package com.guigu.dao;


import com.guigu.vo.OrderCart;

import java.util.List;

public interface OrderCartDao {

    //查询 用户购物车数据
    List<OrderCart> queryUserShoppingCartByUid(OrderCart orderCart);

    //查询 用户购物车有几条数据
    int queryUserShoppingCartCountByUid(OrderCart orderCart);

    //判断 购买的商品是否在购物车里面
    OrderCart gIdExistShoppingCart(OrderCart orderCart);

    //改变商品数量
    int updateGoodsNumAndSumPrice(OrderCart orderCart);

    //删除购物车数据
    int delShoppingCartById(OrderCart orderCart);

    //添加数据到购物车
    int addShoppingCart(OrderCart orderCart);
}
