package com.guigu.dao;

import com.guigu.vo.RoleInfo;

import java.util.List;

public interface RoleDao {

    //条件查询 角色信息
    List<RoleInfo> queryRoleByCond(RoleInfo roleInfo);

    //条件查询 角色信息数量
    int queryRoleCountByCond(RoleInfo roleInfo);

    //添加角色信息
    int addRole(RoleInfo roleInfo);

    //修改角色信息
    int updateRoleByRoleId(RoleInfo roleInfo);

    //根据员工id，查询当前员工拥有的角色信息
    List<RoleInfo> queryRolesByEmpId(Integer emp_id);
}
