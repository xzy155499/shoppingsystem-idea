
package com.guigu.controller;

import com.guigu.service.AreaService;
import com.guigu.vo.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AreaController {

    @Autowired
    AreaService service;
    @CrossOrigin
    @RequestMapping("/queryarea.action")
    @ResponseBody
    public List<Area> queryArea(Area s) {
        if (s.getParentId()==0){
            s.setParentId(-1);
        }
        return service.queryArea(s);
    }
    @CrossOrigin
    @RequestMapping("/queryareaAll.action")
    @ResponseBody
    public List<Area> queryAreaAll() {
        return service.queryAreaAll();
    }

}
