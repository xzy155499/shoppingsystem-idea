package com.guigu.dao;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderGoodsDao {
    List<OrderGoodsDao> queOrderGoodsByOid(int oid);
}