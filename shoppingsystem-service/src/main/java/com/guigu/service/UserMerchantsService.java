
package com.guigu.service;


import com.guigu.vo.UserMerchants;

import java.util.List;

public interface UserMerchantsService {

    int addUserMerchants(UserMerchants userMerchants);

    List<UserMerchants> queUserMerchantsByUid(int uid);
}