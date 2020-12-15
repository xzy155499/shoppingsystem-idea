package com.guigu.controller;


import com.alibaba.fastjson.JSONObject;
import com.guigu.service.WarehouseService;
import com.guigu.service.GoodsService;
import com.guigu.vo.PageVo;
import com.guigu.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WarehouseController {
    @Autowired
    WarehouseService service;

    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息)
    @CrossOrigin
    @RequestMapping(value="/queryAllWarehouse.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String queryAllMenu(@RequestParam(value = "page", defaultValue = "1") int page,
                                          @RequestParam(value = "rows", defaultValue = "5") int rows,
                                          Warehouse warehouse) {
        return JSONObject.toJSONString(service.queryAllWarehouse(page,rows,warehouse));
    }
    @CrossOrigin
    @RequestMapping(value="/addWarehouse.action")
    @ResponseBody
    public int addWarehouse(Warehouse warehouse) {
        return service.addWarehouse(warehouse);
    }

    @CrossOrigin
    @RequestMapping(value="/delWarehouse.action")
    @ResponseBody
    public int delWarehouse(int id) {
        return service.delWarehouse(id);
    }

    @CrossOrigin
    @RequestMapping(value="/updWarehouse.action")
    @ResponseBody
    public int updWarehouse(Warehouse warehouse) {
        return service.updWarehouse(warehouse);
    }
}
