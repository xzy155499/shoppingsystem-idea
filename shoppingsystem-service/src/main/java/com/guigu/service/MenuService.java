package com.guigu.service;

import com.guigu.vo.MenuInfo;

import java.util.List;

public interface MenuService {

    List<MenuInfo> queryAllMenu(int emp_id, int nodeType);
}
