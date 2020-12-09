package com.guigu.service.impl;

import com.guigu.dao.MenuDao;
import com.guigu.service.MenuService;
import com.guigu.vo.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Override
    public List<MenuInfo> queryAllMenu(int emp_id, int nodeType) {
        //查询所有的父菜单  父节点为0  菜单类型为1
        List<MenuInfo> menus = menuDao.queryMenuByPidAndNodeType(emp_id, 0, 1);

        //将所有的父菜单的子菜单查询出来，绑定好
        for (MenuInfo menu : menus) {
            List<MenuInfo> childMenus1 = menuDao.queryMenuByPidAndNodeType(emp_id, menu.getId().intValue(), 2);

            menu.setChildMenu(childMenus1);

            if (nodeType == 3) {
                for (MenuInfo menu2 : childMenus1) {
                    List<MenuInfo> childMenus2 = menuDao.queryMenuByPidAndNodeType(emp_id, menu2.getId().intValue(), 3);
                    menu2.setChildMenu(childMenus2);
                }
            }
        }
        return menus;
    }
}
