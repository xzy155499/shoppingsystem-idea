package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.RoleDao;
import com.guigu.service.RoleService;
import com.guigu.vo.PageVo;
import com.guigu.vo.RoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleDao;
    @Override
    public PageVo<RoleInfo> queryRoleByCond(RoleInfo roleInfo, int page, int rows) {
        PageVo<RoleInfo> pageVo = new PageVo<RoleInfo>();
        PageHelper.startPage(page,rows);

        pageVo.setRows(roleDao.queryRoleByCond(roleInfo));
        pageVo.setTotal(roleDao.queryRoleCountByCond(roleInfo));

        return pageVo;
    }

    @Override
    public int addRole(RoleInfo roleInfo) {
        return roleDao.addRole(roleInfo);
    }

    @Override
    public int updateRoleByRoleId(RoleInfo roleInfo) {
        return roleDao.updateRoleByRoleId(roleInfo);
    }

    @Override
    public List<RoleInfo> queryRolesByEmpId(Integer emp_id) {
        return roleDao.queryRolesByEmpId(emp_id);
    }
}
