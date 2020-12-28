package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.OrderInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.UserInfo;

import java.util.List;
import java.util.Map;

public interface OrderInfoService {

    OrderInfo queryOrderInfoById(int id);

    PageVo<OrderInfo> queryAllOrderInfo(int page, int rows, OrderInfo orderInfo);

    int addOrderInfo(OrderInfo orderInfo);

    int delOrderInfo(int id);

    int updOrderInfo(OrderInfo orderInfo);

    int intoWarehouse(int id,String ids);

    List<Goods> queryAllOrderInfoGoods();

    Map<String,Object> queHomeData();

    List<UserInfo> queOrderByUid();
}
