package com.guigu.controller;


import com.guigu.service.MenuService;
import com.guigu.vo.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class MenuController {
    @Autowired
    MenuService menuService;

    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息)
    @CrossOrigin
    @RequestMapping("/queryAllMenu.action")
    @ResponseBody
    public List<MenuInfo> queryAllMenu() {
        return menuService.queryAllMenu(1,2);
    }

}
