package com.guigu.service;

import com.guigu.vo.MenuInfo;
import com.guigu.vo.PageVo;

import java.util.List;

public interface MenuService {

    PageVo<MenuInfo> queryMenuByCond(MenuInfo menuInfo, int page, int rows) ;

    int disabledMenu(MenuInfo menuInfo);

    List<MenuInfo> queryAllMenu(int emp_id, int nodeType);

    List<MenuInfo> queryAllTreeMenu(int nodeType);

    List<Integer> queryMenuIdByRid(int role_id);
}
