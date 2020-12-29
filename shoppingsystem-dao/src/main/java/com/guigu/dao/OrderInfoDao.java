package com.guigu.dao;

import com.guigu.vo.OrderInfo;

import java.util.List;

public interface OrderInfoDao {
    //根据id查询订单
    OrderInfo queryOrderInfoById(String id);
    //查询所有订单
    List<OrderInfo> queryAllOrderInfo(OrderInfo orderInfo);
    //查询日销量
    List<OrderInfo> queryAllOrderInfoGoodsDay(int gid);
    //查询周销量
    List<OrderInfo> queryAllOrderInfoGoodsWeeks(int gid);
    //查询月销量
    List<OrderInfo> queryAllOrderInfoGoodsMonth(int gid);
    //查询所有订单数量
    int queryAllOrderInfoCond(OrderInfo orderInfo);
    //修改已发货状态
    int updOrderInfoInto(String id);
    //添加订单
    int addOrderInfo(OrderInfo orderInfo);
    //删除订单
    int delOrderInfo(String id);
    //根据用户查询订单(荣布斯排行榜)
    List<OrderInfo> queOrderByUid(int uid);

    //查询今日订单数量
    int queryAllOrderInfoDay();
    //查询本月订单数量
    int queryAllOrderInfoMonth();
    //查询日利润
    List<OrderInfo> queryAllOrderInfoGoodsDayProfits();
    //查询月利润
    List<OrderInfo> queryAllOrderInfoGoodsMontyProfits();


}