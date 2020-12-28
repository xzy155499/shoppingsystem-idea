package com.guigu.dao;


import com.guigu.vo.OrderCart;
import com.guigu.vo.OrderGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderGoodsDao {
    List<OrderGoodsDao> queOrderGoodsByOid(int oid);

    int addOrderGoods(OrderGoods orderGoods);
}