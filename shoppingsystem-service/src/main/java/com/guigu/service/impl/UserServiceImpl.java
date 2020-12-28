package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.UserDao;
import com.guigu.service.UserService;
import com.guigu.vo.PageVo;
import com.guigu.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public int userLogin(UserInfo userInfo) {
        return userDao.userLogin(userInfo);
    }

    @Override
    public PageVo<UserInfo> queryAllUser(UserInfo userInfo, int page, int rows) {
        PageVo<UserInfo> pageVo = new PageVo<>();
        //放在 查询代码的前面
        PageHelper.startPage(page,rows);
        pageVo.setRows(userDao.queryAllUser(userInfo));

        pageVo.setTotal(userDao.queryCountUser(userInfo));

        return pageVo;
    }

    @Override
    public int addUser(UserInfo userInfo) {
        return userDao.addUser(userInfo);
    }

    @Override
    public int addUsers(UserInfo userInfo) {
        return userDao.addUsers(userInfo);
    }

    @Override
    public UserInfo queryByIdUser(int id) {
        return userDao.queryByIdUser(id);
    }

    @Override
    public int editUser(UserInfo userInfo) {
        return userDao.editUser(userInfo);
    }

    @Override
    public int delUser(int id) {
        return userDao.delUser(id);
    }

    @Override
    public List<UserInfo> queDayUser() {
        return userDao.queDayUser();
    }
}
