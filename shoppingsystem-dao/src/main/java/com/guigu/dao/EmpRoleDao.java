package com.guigu.dao;

import com.guigu.vo.EmpRoleInfo;

public interface EmpRoleDao {

    //删除 员工角色 根据员工id
    int delEmpRoleById(Integer emp_id);
    //授权 员工角色
    int shouQuanEmpRole(EmpRoleInfo empRoleInfo);

    /*//删除 角色菜单 根据角色id
    int delRoleMenuByRid(int rid);
    //授权 角色菜单
    int shouQuanRoleMenu(RoleMenuInfo roleMenuInfo);*/
}
