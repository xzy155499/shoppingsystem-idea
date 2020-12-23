package com.guigu.dao;

import com.guigu.vo.RoleMenuInfo;

public interface RoleMenuDao {

    //删除 角色菜单 根据角色id
    int delRoleMenuByRid(int rid);

    //授权 角色菜单
    int shouQuanRoleMenu(RoleMenuInfo roleMenuInfo);
}
