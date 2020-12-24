package com.guigu.controller;


import com.alibaba.fastjson.JSONObject;
import com.guigu.service.GoodsService;
import com.guigu.service.OrderInfoService;
import com.guigu.vo.Goods;
import com.guigu.vo.OrderInfo;
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
public class OrderInfoController {
    @Autowired
    OrderInfoService service;

    @CrossOrigin
    @RequestMapping(value="/queryAllOrderInfo.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String queryAllOrderInfo(@RequestParam(value = "page", defaultValue = "1") int page,
                                      @RequestParam(value = "rows", defaultValue = "5") int rows,
                               OrderInfo orderInfo) {
        return JSONObject.toJSONString(service.queryAllOrderInfo(page,rows,orderInfo));
    }

    @CrossOrigin
    @RequestMapping(value="/intoWarehouse.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public int intoWarehouse(int id ,String ids) {
        return service.intoWarehouse(id,ids);
    }



}