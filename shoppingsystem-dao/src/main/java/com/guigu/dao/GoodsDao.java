package com.guigu.dao;

import com.guigu.vo.Goods;
import com.guigu.vo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {

    Goods queryGoodsById(int id);
    List<Goods> queryAllGoods(Goods goods);

    int queryAllGoodsCond(Goods goods);

    int updGoodsImg(Goods goods);

    int addGoods(Goods goods);

    int delGoods(int id);

    int updGoods(Goods goods);


}
