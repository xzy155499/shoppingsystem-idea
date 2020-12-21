package com.guigu.controller;


import com.alibaba.fastjson.JSONObject;
import com.guigu.service.MerchantsService;
import com.guigu.service.GoodsService;
import com.guigu.vo.PageVo;
import com.guigu.vo.Merchants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
public class MerchantsController {
    @Autowired
    MerchantsService service;

    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息)
    @CrossOrigin
    @RequestMapping(value="/queryAllMerchants.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String queryAllMenu(@RequestParam(value = "page", defaultValue = "1") int page,
                                          @RequestParam(value = "rows", defaultValue = "5") int rows,
                                          Merchants merchants) {
        return JSONObject.toJSONString(service.queryAllMerchants(page,rows,merchants));
    }
    @CrossOrigin
    @RequestMapping(value="/addMerchants.action")
    @ResponseBody
    public int addMerchants(Merchants merchants) {
        return service.addMerchants(merchants);
    }

    @CrossOrigin
    @RequestMapping(value="/delMerchants.action")
    @ResponseBody
    public int delMerchants(int id) {
        return service.delMerchants(id);
    }

    @CrossOrigin
    @RequestMapping(value="/updMerchants.action")
    @ResponseBody
    public int updMerchants(Merchants merchants) {
        return service.updMerchants(merchants);
    }

    @CrossOrigin
    @RequestMapping(value="/loginMerchants.action")
    @ResponseBody
    public Merchants loginMerchants(Merchants merchants) {
        return service.loginMerchants(merchants);
    }
    @CrossOrigin
    @RequestMapping(value="/updMarehouseImg.action")
    @ResponseBody
    public int updMarehouseImg(Merchants merchants , MultipartFile img) throws IOException {
        String imgurl="../src/assets/img/"+img.getOriginalFilename();
            img.transferTo(new File("E:\\ideaCode\\shoppingsystem-vue\\src\\assets\\img\\"+img.getOriginalFilename()));
        merchants.setmImg(imgurl);
        return service.updMarehouseImg(merchants);
    }



}
