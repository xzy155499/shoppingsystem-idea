package com.guigu.service;


import com.guigu.vo.OrderCart;

import java.util.List;

public interface OrderCartService {

    List<OrderCart> queryUserShoppingCartByUid(OrderCart orderCart);

    int queryUserShoppingCartCountByUid(OrderCart orderCart);

    OrderCart gIdExistShoppingCart(OrderCart orderCart);

    int updateGoodsNumAndSumPrice(OrderCart orderCart);

    int delShoppingCartById(OrderCart orderCart);

    int addShoppingCart(OrderCart orderCart);
}
