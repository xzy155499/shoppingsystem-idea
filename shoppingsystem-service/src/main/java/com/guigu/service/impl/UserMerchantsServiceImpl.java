
package com.guigu.service.impl;

import com.guigu.dao.AreaDao;

import com.guigu.dao.UserMerchantsDao;
import com.guigu.service.UserMerchantsService;
import com.guigu.vo.UserMerchants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMerchantsServiceImpl implements UserMerchantsService {

    @Autowired
    UserMerchantsDao dao;


    @Override
    public int addUserMerchants(UserMerchants userMerchants) {
        return dao.addUserMerchants(userMerchants);
    }
}



