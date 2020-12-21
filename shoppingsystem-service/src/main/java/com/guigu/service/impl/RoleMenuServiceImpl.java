package com.guigu.service.impl;

import com.guigu.dao.RoleMenuDao;
import com.guigu.service.RoleMenuService;
import com.guigu.vo.RoleMenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMenuServiceImpl implements RoleMenuService {
    @Autowired
    RoleMenuDao roleMenuDao;

    @Override
    public int delRoleMenuByRid(int rid) {
        return roleMenuDao.delRoleMenuByRid(rid);
    }

    @Override
    public int shouQuanRoleMenu(RoleMenuInfo roleMenuInfo) {
        return roleMenuDao.shouQuanRoleMenu(roleMenuInfo);
    }
}
