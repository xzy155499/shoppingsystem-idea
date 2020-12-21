package com.guigu.dao;

import com.guigu.vo.Merchants;

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

}
