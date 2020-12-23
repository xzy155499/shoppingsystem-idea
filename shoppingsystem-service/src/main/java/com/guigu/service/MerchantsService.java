package com.guigu.service;

import com.guigu.vo.Goods;
import com.guigu.vo.Merchants;
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
}
