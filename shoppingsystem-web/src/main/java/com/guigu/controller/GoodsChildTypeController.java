package com.guigu.controller;


import com.alibaba.fastjson.JSONObject;
import com.guigu.service.GoodsChildTypeService;
import com.guigu.service.GoodsService;
import com.guigu.vo.GoodsChildType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoodsChildTypeController {
    @Autowired
    GoodsChildTypeService service;

    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息)
    @CrossOrigin
    @RequestMapping(value="/queryAllGoodsChildType.action")
    @ResponseBody
    public List<GoodsChildType> queryAllMenu(@RequestParam(value = "id", defaultValue = "0") int id) {
        return service.queryAllGoodsChildType(id);
    }
    @CrossOrigin
    @RequestMapping(value="/addGoodsChildType.action")
    @ResponseBody
    public int addGoodsChildType(GoodsChildType goodsChildType) {
        return service.addGoodsChildType(goodsChildType);
    }

    @CrossOrigin
    @RequestMapping(value="/delGoodsChildType.action")
    @ResponseBody
    public int delGoodsChildType(int id) {
        return service.delGoodsChildType(id);
    }

    @CrossOrigin
    @RequestMapping(value="/updGoodsChildType.action")
    @ResponseBody
    public int updGoodsChildType(GoodsChildType goodsChildType) {
        return service.updGoodsChildType(goodsChildType);
    }
}
