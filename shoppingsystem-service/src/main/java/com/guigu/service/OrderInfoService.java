package com.guigu.service;

import com.guigu.vo.OrderInfo;
import com.guigu.vo.PageVo;

import java.util.List;

public interface OrderInfoService {

    List<OrderInfo> queryOrderInfoById(int id);

    PageVo<OrderInfo> queryAllOrderInfo(int page, int rows, OrderInfo orderInfo);

    int addOrderInfo(OrderInfo orderInfo);

    int delOrderInfo(int id);

    int updOrderInfo(OrderInfo orderInfo);

    int intoWarehouse(int id,String ids);
}
