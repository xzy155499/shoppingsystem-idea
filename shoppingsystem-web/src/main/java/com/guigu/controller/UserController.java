package com.guigu.controller;

import com.guigu.service.UserService;
import com.guigu.vo.PageVo;
import com.guigu.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @CrossOrigin
    @RequestMapping("/userlogin.action")
    @ResponseBody
    public int userLogin(UserInfo userInfo) {
        return userService.userLogin(userInfo);
    }
    @CrossOrigin
    @RequestMapping("/queryAllUser.action")
    @ResponseBody
    public PageVo<UserInfo> queryAllUser(UserInfo userInfo,
                                         @RequestParam(value = "page", defaultValue = "1") int page,
                                         @RequestParam(value = "rows", defaultValue = "10") int rows) {
        return userService.queryAllUser(userInfo, page, rows);
    }
    @CrossOrigin
    @RequestMapping("/addUser.action")
    @ResponseBody
    public int addUser(UserInfo userInfo) {
        return userService.addUser(userInfo);
    }
    @CrossOrigin
    @RequestMapping("/addUsers.action")
    @ResponseBody
    public int addUsers(UserInfo userInfo) {
        return userService.addUsers(userInfo);
    }
    @CrossOrigin
    @RequestMapping("/delUser.action")
    @ResponseBody
    public int delUser(UserInfo userInfo) {
        return userService.delUser(userInfo.getUser_id());
    }
    @CrossOrigin
    @RequestMapping("/queryByIdUser.action")
    @ResponseBody
    public UserInfo queryByIdUser(UserInfo userInfo) {
        return userService.queryByIdUser(userInfo.getUser_id());
    }
    @CrossOrigin
    @RequestMapping("/editUser.action")
    @ResponseBody
    public int editUser(UserInfo userInfo) {
        System.out.println(userInfo);
        return userService.editUser(userInfo);
    }
}
