package com.guigu.service;

import com.guigu.vo.EmpInfo;
import com.guigu.vo.PageVo;

public interface EmpService {

    //登录 判断 用户名 密码是否正确
    EmpInfo LoginPassExist(EmpInfo empInfo);

    //查询所有员工 信息 条件查询
    PageVo<EmpInfo> queryEmpByCond(EmpInfo empInfo, int page, int rows) ;

    //删除员工信息 通过id
    int delEmpByEmpId(EmpInfo empInfo);

    //添加员工信息
    int addEmp(EmpInfo empInfo);

    //修改员工信息
    int updateEmpByEmpId(EmpInfo empInfo);
}
