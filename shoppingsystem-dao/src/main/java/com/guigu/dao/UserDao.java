package com.guigu.dao;

import com.guigu.vo.UserInfo;

import java.util.List;

public interface UserDao {
    //登录检测
    public int userLogin(UserInfo userInfo);
    //查询用户
    public List<UserInfo> queryAllUser(UserInfo userInfo);
    //查询用户表数据总量
    public int queryCountUser(UserInfo userInfo);
    //添加(注册)
    public int addUser(UserInfo userInfo);
    //后台添加
    public int addUsers(UserInfo userInfo);
    //根据id查用户
    public UserInfo queryByIdUser(int id);
    //修改
    public int editUser(UserInfo userInfo);
    //删除
    public int delUser(int id);
    //查询今日注册用户
    int queryUserDay();
    //查询本月注册用户
    int queryUserMonth();
}
