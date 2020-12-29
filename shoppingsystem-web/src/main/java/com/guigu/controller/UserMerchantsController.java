
package com.guigu.controller;

import com.alibaba.fastjson.JSON;
import com.guigu.service.UserMerchantsService;
import com.guigu.vo.Area;
import com.guigu.vo.UserMerchants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserMerchantsController {

    @Autowired
    UserMerchantsService service;

    @CrossOrigin
    @RequestMapping(value = "/addUserMerchants.action")
    @ResponseBody
    public int addUserMerchants(UserMerchants userMerchants) {
        return service.addUserMerchants(userMerchants);
    }

    @CrossOrigin
    @RequestMapping(value = "/queUserMerchantsByUid.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String queUserMerchantsByUid(int uid) {
        return JSON.toJSONString(service.queUserMerchantsByUid(uid));
    }
}
