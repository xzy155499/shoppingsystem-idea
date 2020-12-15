package com.guigu.controller;


import com.alibaba.fastjson.JSONObject;
import com.guigu.service.WarehouseGoodsService;
import com.guigu.service.GoodsService;
import com.guigu.vo.WarehouseGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WarehouseGoodsController {
    @Autowired
    WarehouseGoodsService service;

    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息)
    @CrossOrigin
    @RequestMapping(value="/queryAllWarehouseGoods.action")
    @ResponseBody
    public List<WarehouseGoods> queryAllMenu() {
        return service.queryAllWarehouseGoods();
    }
    @CrossOrigin
    @RequestMapping(value="/addWarehouseGoods.action")
    @ResponseBody
    public int addWarehouseGoods(WarehouseGoods WarehouseGoods) {
        return service.addWarehouseGoods(WarehouseGoods);
    }

    @CrossOrigin
    @RequestMapping(value="/delWarehouseGoods.action")
    @ResponseBody
    public int delWarehouseGoods(int id) {
        return service.delWarehouseGoods(id);
    }

    @CrossOrigin
    @RequestMapping(value="/updWarehouseGoods.action")
    @ResponseBody
    public int updWarehouseGoods(WarehouseGoods WarehouseGoods) {
        return service.updWarehouseGoods(WarehouseGoods);
    }
}
