package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.MenuDao;
import com.guigu.service.MenuService;
import com.guigu.vo.MenuInfo;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Override
    public PageVo<MenuInfo> queryMenuByCond(MenuInfo menuInfo, int page, int rows) {
        PageVo<MenuInfo> pageVo = new PageVo<MenuInfo>();
        PageHelper.startPage(page,rows);

        pageVo.setRows(menuDao.queryMenuByCond(menuInfo));
        pageVo.setTotal(menuDao.queryMenuCountByCond(menuInfo));

        return pageVo;
    }

    @Override
    public int disabledMenu(MenuInfo menuInfo) {
        return menuDao.disabledMenu(menuInfo);
    }

    @Override
    public List<MenuInfo> queryAllMenu(int emp_id, int nodeType) {
        //查询所有的父菜单  父节点为0  菜单类型为1
        List<MenuInfo> menus = menuDao.queryMenuByEmpIdPidAndNodeType(emp_id, 0, 1);

        //将所有的父菜单的子菜单查询出来，绑定好
        for (MenuInfo menu : menus) {
            List<MenuInfo> childMenus1 = menuDao.queryMenuByEmpIdPidAndNodeType(emp_id, menu.getId().intValue(), 2);

            menu.setChildMenu(childMenus1);

            if (nodeType == 3) {
                for (MenuInfo menu2 : childMenus1) {
                    List<MenuInfo> childMenus2 = menuDao.queryMenuByEmpIdPidAndNodeType(emp_id, menu2.getId().intValue(), 3);
                    menu2.setChildMenu(childMenus2);
                }
            }
        }
        return menus;
    }

    @Override
    public List<MenuInfo> queryAllTreeMenu(int nodeType) {
        //查询所有的父菜单  父节点为0  菜单类型为1
        List<MenuInfo> menus = menuDao.queryAllMenuByPidAndNodeType(0, 1);
        //将所有的父菜单的子菜单查询出来，绑定好
        for (MenuInfo menu : menus) {
            List<MenuInfo> childMenus1 = menuDao.queryAllMenuByPidAndNodeType(menu.getId().intValue(), 2);

            menu.setChildMenu(childMenus1);

            if (nodeType == 3) {
                for (MenuInfo menu2 : childMenus1) {
                    List<MenuInfo> childMenus2 = menuDao.queryAllMenuByPidAndNodeType(menu2.getId().intValue(), 3);
                    menu2.setChildMenu(childMenus2);
                }
            }
        }
        return menus;
    }

    @Override
    public List<Integer> queryMenuIdByRid(int role_id) {
        return menuDao.queryMenuIdByRid(role_id);
    }
}
