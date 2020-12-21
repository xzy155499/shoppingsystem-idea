package com.guigu.service.impl;

import com.guigu.dao.EmpRoleDao;
import com.guigu.service.EmpRoleService;
import com.guigu.vo.EmpRoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpRoleServiceImpl implements EmpRoleService {
    @Autowired
    EmpRoleDao empRoleDao;

    @Override
    public int delEmpRoleById(Integer emp_id) {
        return empRoleDao.delEmpRoleById(emp_id);
    }

    @Override
    public int shouQuanEmpRole(EmpRoleInfo empRoleInfo) {
        return empRoleDao.shouQuanEmpRole(empRoleInfo);
    }
}
