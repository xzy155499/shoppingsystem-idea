package com.guigu.service;

import com.guigu.vo.OrderInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserService {
    //登录检测
    public UserInfo userLogin(UserInfo userInfo);

    //注册
    int registerUser(UserInfo userInfo);

    //查询所有
    public PageVo<UserInfo> queryAllUser(UserInfo userInfo, int page, int rows);
    //添加
    public int addUsers(UserInfo userInfo);
    //根据id查用户
    public UserInfo queryByIdUser(int id);
    //修改
    public int editUser(UserInfo userInfo);
    //删除
    public int delUser(int id);
    //今日新增用户
    List<UserInfo> queDayUser();
    //查询用户订单
    PageVo<OrderInfo> queOrderByUid(int uid, String state, int page, int rows);
}
