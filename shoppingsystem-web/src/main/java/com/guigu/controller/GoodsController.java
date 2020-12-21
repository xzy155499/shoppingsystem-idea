package com.guigu.controller;


import com.alibaba.fastjson.JSONObject;
import com.guigu.service.GoodsService;
import com.guigu.service.MenuService;
import com.guigu.vo.Goods;
import com.guigu.vo.MenuInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.Goods;
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
public class GoodsController {
    @Autowired
    GoodsService service;

    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息)
    @CrossOrigin
    @RequestMapping(value="/queryAllGoods.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String queryAllMenu(@RequestParam(value = "page", defaultValue = "1") int page,
                                      @RequestParam(value = "rows", defaultValue = "5") int rows,
                               Goods goods) {
        return JSONObject.toJSONString(service.queryAllGoods(page,rows,goods));
    }

    @CrossOrigin
    @RequestMapping(value="/addGoods.action")
    @ResponseBody
    public Map addGoods(Goods goods, @RequestParam(value ="img", required = false) MultipartFile[] img) throws IOException {
        Map<String,String> map =new HashMap<String,String>();
        String imgurl ="";
        for (int i = 0; i <img.length ; i++) {
            imgurl+="../src/assets/img/"+img[i].getOriginalFilename()+",";
            img[i].transferTo(new File("E:\\ideaCode\\shoppingsystem-vue\\src\\assets\\img\\"+img[i].getOriginalFilename()));
        }
        imgurl=imgurl.substring(0,imgurl.length()-1);
        goods.setgImg(imgurl);
        int row = service.addGoods(goods);
        map.put("row",row+"");
        return map;
    }

    @CrossOrigin
    @RequestMapping(value="/delGoods.action")
    @ResponseBody
    public int delGoods(int id) {
        return service.delGoods(id);
    }

    @CrossOrigin
    @RequestMapping(value="/updGoodsImg.action")
    @ResponseBody
    public Map updGoods(Goods goods, @RequestParam(value ="img", required = false) MultipartFile[] img,@RequestParam(value ="imgName", required = false) String[] imgName) throws IOException {
        Map<String,String> map =new HashMap<String,String>();
        String imgurl ="";
        for (int i = 0; i <imgName.length ; i++) {
            imgurl+="../src/assets/img/"+imgName[i]+",";
        }
        for (int i = 0; i <img.length ; i++) {
            img[i].transferTo(new File("E:\\ideaCode\\shoppingsystem-vue\\src\\assets\\img\\"+img[i].getOriginalFilename()));
        }
        imgurl=imgurl.substring(0,imgurl.length()-1);
        goods.setgImg(imgurl);
        int row = service.updGoodsImg(goods);
        map.put("row",row+"");
        return null;
    }
    @CrossOrigin
    @RequestMapping(value="/updGoods.action")
    @ResponseBody
    public int updGoods(Goods goods) {
        return service.updGoods(goods);
    }
}
