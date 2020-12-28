
package com.guigu.controller;

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
    @RequestMapping("/addUserMerchants.action")
    @ResponseBody
    public int addUserMerchants(UserMerchants userMerchants) {
        System.out.println(userMerchants);
        return service.addUserMerchants(userMerchants);
    }

}
