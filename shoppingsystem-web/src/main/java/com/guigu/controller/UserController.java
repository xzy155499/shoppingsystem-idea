package com.guigu.controller;

import com.guigu.service.UserService;
import com.guigu.vo.EmpInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.RoleInfo;
import com.guigu.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    //登录
    @CrossOrigin
    @RequestMapping("/loginUser.action")
    @ResponseBody
    public Map userLogin(UserInfo userInfo) {
        Map<String, Object> map = new HashMap<String, Object>();
        UserInfo userInfo1 = userService.userLogin(userInfo);
        if (userInfo1 != null) {
            map.put("code", 0);
            map.put("user", userInfo1);
        }else {
            map.put("code", "1");
            map.put("msg", "手机号或者密码错误");
        }
        return map;
    }
    //注册
    @CrossOrigin
    @RequestMapping("/registerUser.action")
    @ResponseBody
    public int registerUser(UserInfo userInfo) {
        return userService.registerUser(userInfo);
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
        return userService.editUser(userInfo);
    }
    @CrossOrigin
    @RequestMapping("/queDayUser.action")
    @ResponseBody
    public List<UserInfo> queDayUser( ) {
        return userService.queDayUser();
    }

}
