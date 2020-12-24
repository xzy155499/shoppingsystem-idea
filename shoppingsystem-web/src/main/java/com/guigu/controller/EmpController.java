package com.guigu.controller;

import com.guigu.service.EmpService;
import com.guigu.service.RoleService;
import com.guigu.vo.EmpInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.RoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    EmpService empService;
    @Autowired
    RoleService roleService;

    //登录
    @RequestMapping("login.action")
    @ResponseBody
    @CrossOrigin
    public Map login(EmpInfo empInfo, HttpSession session) {
        Map<String, Object> map = new HashMap<String, Object>();
        EmpInfo empInfo1 = empService.LoginPassExist(empInfo);
        if (empInfo1 != null) {
            List<RoleInfo> roleInfos = roleService.queryRolesByEmpId(empInfo1.getEmp_id());
            empInfo1.setLast_time(empInfo1.getThis_time());
            empService.updateTime(empInfo1);
            map.put("roles",roleInfos);
            map.put("code",0);
            map.put("msg","登录成功");
        }
//        else if(empInfo1.getIsdelete() == 1){
//            map.put("code",2);
//            map.put("msg","你已离职或解雇,无法登录系统");
//        }
        else  {
            map.put("code","1");
            map.put("msg","用户名或者密码错误");
        }
        map.put("emp", empInfo1);
        return map;
    }

    //查询所有员工信息 分页
    @RequestMapping("queryAllEmp.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<EmpInfo> queryAllEmp(EmpInfo empInfo,
                                       @RequestParam(value = "page", defaultValue = "1") int page,
                                       @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return empService.queryEmpByCond(empInfo, page, rows);
    }

    //删除 员工信息通过id
    @RequestMapping("delEmpByEmpId.action")
    @ResponseBody
    @CrossOrigin
    public int delEmpByEmpId(EmpInfo empInfo) {
        return empService.delEmpByEmpId(empInfo);
    }

    //添加 员工信息
    @RequestMapping("addEmp.action")
    @ResponseBody
    @CrossOrigin
    public int addEmp(EmpInfo empInfo) {
        return empService.addEmp(empInfo);
    }

    //修改 员工信息
    @RequestMapping("updateEmpByEmpId.action")
    @ResponseBody
    @CrossOrigin
    public int updateEmpByEmpId(EmpInfo empInfo) {
        return empService.updateEmpByEmpId(empInfo);
    }
}
