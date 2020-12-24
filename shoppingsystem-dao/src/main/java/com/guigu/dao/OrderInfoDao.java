package com.guigu.dao;

import com.guigu.vo.OrderInfo;

import java.util.List;

public interface OrderInfoDao {

    OrderInfo queryOrderInfoById(int id);

    List<OrderInfo> queryAllOrderInfo(OrderInfo orderInfo);

    int queryAllOrderInfoCond(OrderInfo orderInfo);

    int updOrderInfoInto(int id);

    int addOrderInfo(OrderInfo orderInfo);

    int delOrderInfo(int id);

    int updOrderInfo(OrderInfo orderInfo);
}