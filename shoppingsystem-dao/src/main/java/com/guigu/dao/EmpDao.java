package com.guigu.dao;

import com.guigu.vo.EmpInfo;

import java.util.List;

public interface EmpDao {

    //登录 判断 用户名 密码是否正确
    EmpInfo LoginPassExist(EmpInfo empInfo);

    //条件查询 员工信息
    List<EmpInfo> queryEmpByCond(EmpInfo empInfo);

    //修改登录时间
    int updateTime(EmpInfo empInfo);

    //条件查询 员工信息数量
    int queryEmpCountByCond(EmpInfo empInfo);

    //删除员工信息 通过id
    int delEmpByEmpId(EmpInfo empInfo);

    //添加员工信息
    int addEmp(EmpInfo empInfo);

    //修改员工信息
    int updateEmpByEmpId(EmpInfo empInfo);

}
