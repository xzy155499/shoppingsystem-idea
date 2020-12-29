package com.guigu.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.guigu.service.GoodsService;
import com.guigu.service.OrderInfoService;
import com.guigu.vo.Goods;
import com.guigu.vo.OrderInfo;
import com.guigu.vo.UserInfo;
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
import java.util.List;
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
    public int intoWarehouse(String id ,String ids) {
        return service.intoWarehouse(id,ids);
    }

 @CrossOrigin
    @RequestMapping(value="/queryOrderInfoById.action")
    @ResponseBody
    public String queryOrderInfoById(String id) {
        return JSON.toJSONString(service.queryOrderInfoById(id));
    }

    @CrossOrigin
    @RequestMapping(value="/queryAllOrderInfoGoods.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String queryAllOrderInfoGoods() {
        return JSONObject.toJSONString(service.queryAllOrderInfoGoods());
    }

    @CrossOrigin
    @RequestMapping(value="/queHomeData.action")
    @ResponseBody
    public Map<String, Object> queHomeData() {
        return service.queHomeData();
    }

    @CrossOrigin
    @RequestMapping(value="/queOrderByUid.action")
    @ResponseBody
    public List<UserInfo> queOrderByUid() {
        return service.queOrderByUid();
    }

    @CrossOrigin
    @RequestMapping(value="/addOrderInfo.action")
    @ResponseBody
    public int addOrderInfo(OrderInfo orderInfo) {
        return service.addOrderInfo(orderInfo);
    }

    //修改订单状态
    @CrossOrigin
    @RequestMapping(value="/updOrderInfoState.action")
    @ResponseBody
    public int updOrderInfoState(OrderInfo orderInfo) {
        return service.updOrderInfoState(orderInfo);
    }


}
