package com.guigu.service;

import com.guigu.vo.EmpRoleInfo;

public interface EmpRoleService {

    //删除 员工角色 根据员工id
    int delEmpRoleById(Integer emp_id);
    //授权 员工角色
    int shouQuanEmpRole(EmpRoleInfo empRoleInfo);

}
