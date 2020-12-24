package com.guigu.dao;

import com.guigu.vo.Merchants;
import com.guigu.vo.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MerchantsDao {


    List<Merchants> queryAllMerchants(Merchants merchants);

    int queryMerchantsCount(Merchants merchants);

    List<Merchants> queryMerchantsById(int id);

    int addMerchants(Merchants merchants);

    int delMerchants(int id);

    int updMerchants(Merchants merchants);

    Merchants loginMerchants(Merchants merchants);
    int updMarehouseImg(Merchants merchants);

    List<Merchants> queMerchantsStatistical();

    //待发货
    List<OrderInfo> queMerchantsOrder(OrderInfo orderInfo);
    int queMerchantsOrderCount(OrderInfo orderInfo);

    int updDeliveryByOid(OrderInfo orderInfo);

    int queMerchantsMonthByMid(@Param("mid")int mid,@Param("month")int month);

    int queMerchantsYearByMid(@Param("mid")int mid,@Param("year")int year);

}
