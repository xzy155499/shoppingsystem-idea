package com.guigu.controller;

import com.guigu.service.EmpRoleService;
import com.guigu.vo.EmpRoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpRoleController {
    @Autowired
    EmpRoleService empRoleService;

    //删除 员工角色根据员工id
    @RequestMapping("delEmpRoleById.action")
    @ResponseBody
    @CrossOrigin
    public int delEmpRoleById(Integer emp_id) {
        return empRoleService.delEmpRoleById(emp_id);
    }

    //授权 员工角色
    @RequestMapping("shouQuanEmpRole.action")
    @ResponseBody
    @CrossOrigin
    public int shouQuanEmpRole(EmpRoleInfo empRoleInfo) {
        return empRoleService.shouQuanEmpRole(empRoleInfo);
    }
}
