package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.EmpDao;
import com.guigu.service.EmpService;
import com.guigu.vo.EmpInfo;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao empDao;

    @Override
    public EmpInfo LoginPassExist(EmpInfo empInfo) {
        return empDao.LoginPassExist(empInfo);
    }

    @Override
    public int updateTime(EmpInfo empInfo) {
        return empDao.updateTime(empInfo);
    }

    @Override
    public PageVo<EmpInfo> queryEmpByCond(EmpInfo empInfo, int page, int rows) {
        PageVo<EmpInfo> pageVo = new PageVo<EmpInfo>();
        PageHelper.startPage(page,rows);

        pageVo.setRows(empDao.queryEmpByCond(empInfo));
        pageVo.setTotal(empDao.queryEmpCountByCond(empInfo));

        return pageVo;
    }

    @Override
    public int delEmpByEmpId(EmpInfo empInfo) {
        return empDao.delEmpByEmpId(empInfo);
    }

    @Override
    public int addEmp(EmpInfo empInfo) {
        return empDao.addEmp(empInfo);
    }

    @Override
    public int updateEmpByEmpId(EmpInfo empInfo) {
        return empDao.updateEmpByEmpId(empInfo);
    }
}
