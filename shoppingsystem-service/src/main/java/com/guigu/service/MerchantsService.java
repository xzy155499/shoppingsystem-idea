package com.guigu.service;


import com.guigu.vo.Merchants;
import com.guigu.vo.OrderInfo;
import com.guigu.vo.PageVo;

import java.util.List;

public interface MerchantsService {

    PageVo<Merchants> queryAllMerchants(int page, int rows, Merchants merchants);

    int addMerchants(Merchants merchants);

    int delMerchants(int id);

    int updMerchants(Merchants merchants);

    Merchants loginMerchants(Merchants merchants);

    int updMarehouseImg(Merchants merchants);

    List<Merchants> queMerchantsStatistical();

    PageVo<OrderInfo> queMerchantsOrder(int page, int rows, OrderInfo orderInfo);

    int updDeliveryByOid(OrderInfo orderInfo);
//    PageVo<OrderInfo> queMerchantsDelivery(int page, int rows,int id);
//    PageVo<OrderInfo> queMerchantsReceipt(int page, int rows,int id);
//    PageVo<OrderInfo> queMerchantsPick(int page, int rows,int id);
    List<Merchants> queMerchantsMonthByMid(int mid);

    List<Merchants> queMerchantsYearByMid(int mid);

    PageVo<Merchants> AllowMerchantsEnter(Merchants merchants,int page,int rows);

    int AgreeMerchants(int id);
}
