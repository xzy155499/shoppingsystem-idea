package com.guigu.controller;


import com.alibaba.fastjson.JSONObject;
import com.guigu.service.GoodsParentTypeService;
import com.guigu.service.GoodsService;
import com.guigu.vo.GoodsParentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoodsParentTypeController {
    @Autowired
    GoodsParentTypeService service;

    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息)
    @CrossOrigin
    @RequestMapping(value="/queryAllGoodsParentType.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String queryAllMenu(GoodsParentType goodsParentType) {
        return JSONObject.toJSONString(service.queryAllGoodsParentType(goodsParentType));
    }
    @CrossOrigin
    @RequestMapping(value="/addGoodsParentType.action")
    @ResponseBody
    public int addGoodsParentType(GoodsParentType goodsParentType) {
        return service.addGoodsParentType(goodsParentType);
    }

    @CrossOrigin
    @RequestMapping(value="/delGoodsParentType.action")
    @ResponseBody
    public int delGoodsParentType(int id) {
        return service.delGoodsParentType(id);
    }

    @CrossOrigin
    @RequestMapping(value="/updGoodsParentType.action")
    @ResponseBody
    public int updGoodsParentType(GoodsParentType goodsParentType) {
        return service.updGoodsParentType(goodsParentType);
    }
}
