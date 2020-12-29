package com.guigu.dao;

import com.guigu.vo.UserMerchants;

import java.util.List;

public interface UserMerchantsDao {


    int addUserMerchants(UserMerchants userMerchants);
    int queUserMerchantsByMidAndUid(UserMerchants userMerchants);

    List<UserMerchants> queUserMerchantsByUid(int uid);
}
