package com.guigu.controller;


import com.guigu.service.MenuService;
import com.guigu.vo.EmpInfo;
import com.guigu.vo.MenuInfo;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class MenuController {
    @Autowired
    MenuService menuService;

    //查询所有员工信息 分页
    @RequestMapping("/queryAllMenus.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<MenuInfo> queryAllMenus(MenuInfo menuInfo,
                                       @RequestParam(value = "page", defaultValue = "1") int page,
                                       @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return menuService.queryMenuByCond(menuInfo, page, rows);
    }

    //查询所有员工信息 分页
    @RequestMapping("/disabledMenu.action")
    @ResponseBody
    @CrossOrigin
    public int disabledMenu(MenuInfo menuInfo) {
        return menuService.disabledMenu(menuInfo);
    }
    //查询出所有的菜单信息(员工登录 不同的员工有不同的菜单信息) 导航菜单
    @CrossOrigin
    @RequestMapping("/queryAllMenu.action")
    @ResponseBody
    public List<MenuInfo> queryAllMenu(Integer emp_id) {
        return menuService.queryAllMenu(emp_id,2);
    }

    //查询出所有的菜单信息
    @CrossOrigin
    @RequestMapping("/queryAllTreeMenu.action")
    @ResponseBody
    public List<MenuInfo> queryAllTreeMenu() {
        return menuService.queryAllTreeMenu(2);
    }

    //根据角色id查询当前角色拥有的菜单
    @CrossOrigin
    @RequestMapping("/queryMenuIdByRid.action")
    @ResponseBody
    public List<Integer> queryMenuIdByRid(int role_id) {
        return menuService.queryMenuIdByRid(role_id);
    }
}
