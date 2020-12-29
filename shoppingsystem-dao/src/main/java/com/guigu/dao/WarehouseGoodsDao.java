package com.guigu.dao;

import com.guigu.vo.GoodsChildType;
import com.guigu.vo.Warehouse;
import com.guigu.vo.WarehouseGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseGoodsDao {

    List<WarehouseGoods> queryAllWarehouseGoods(WarehouseGoods warehouseGoods);

    WarehouseGoods queryWarehouseGoodsById(int id);

    int addWarehouseGoods(@Param("wid")int wid,@Param("gid")int gid,@Param("num")int num);

    int addWarehouseGoodsnum(@Param("wid")int wid,@Param("gid")int gid,@Param("num")int num);

    int updWarehouseGoodsnum(@Param("wid")int wid,@Param("gid")int gid,@Param("num")int num);

    int queWarehouseGoodsByWid(@Param("wid")int wid,@Param("gid")int gid);


    int queryWarehouseGoodsCount(WarehouseGoods warehouseGoods);

    int delWarehouseGoods(int id);

    int updWarehouseGoods(WarehouseGoods WarehouseGoods);

    int queWarehouseNumByGid(int id);

}
