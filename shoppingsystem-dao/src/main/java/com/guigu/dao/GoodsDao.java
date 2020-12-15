package com.guigu.dao;

import com.guigu.vo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {


    List<Goods> queryAllGoods();

    int queryAllGoodsCond();


}
