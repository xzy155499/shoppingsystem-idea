package com.guigu.service;

import com.guigu.vo.PageVo;
import com.guigu.vo.RoleInfo;

import java.util.List;

public interface RoleService {

    //查询所有角色 信息 条件查询
    PageVo<RoleInfo> queryRoleByCond(RoleInfo roleInfo, int page, int rows) ;

    //添加角色信息
    int addRole(RoleInfo roleInfo);

    //修改角色信息
    int updateRoleByRoleId(RoleInfo roleInfo);

    //根据员工id，查询当前员工拥有的角色信息
    List<RoleInfo> queryRolesByEmpId(Integer emp_id);
}
