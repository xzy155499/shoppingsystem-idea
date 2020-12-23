package com.guigu.controller;

import com.guigu.service.EmpService;
import com.guigu.service.RoleService;
import com.guigu.vo.EmpInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.RoleInfo;
import javafx.scene.control.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    RoleService roleService;

    //查询所有角色信息 分页
    @RequestMapping("queryAllRole.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<RoleInfo> queryAllRole(RoleInfo roleInfo,
                                       @RequestParam(value = "page", defaultValue = "1") int page,
                                       @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return roleService.queryRoleByCond(roleInfo, page, rows);
    }
    //添加 角色信息
    @RequestMapping("addRole.action")
    @ResponseBody
    @CrossOrigin
    public int addRole(RoleInfo roleInfo) {
        return roleService.addRole(roleInfo);
    }
    //修改 角色信息
    @RequestMapping("updateRoleByRoleId.action")
    @ResponseBody
    @CrossOrigin
    public int updateRoleByRoleId(RoleInfo roleInfo) {
        return roleService.updateRoleByRoleId(roleInfo);
    }
    //根据员工id，查询当前员工拥有的角色信息
    @RequestMapping("queryRolesByEmpId.action")
    @ResponseBody
    @CrossOrigin
    public List<RoleInfo> queryRolesByEmpId(Integer emp_id) {
        return roleService.queryRolesByEmpId(emp_id);
    }
}
