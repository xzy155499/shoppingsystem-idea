package com.guigu.controller;

import com.guigu.service.EmpRoleService;
import com.guigu.service.RoleMenuService;
import com.guigu.vo.EmpRoleInfo;
import com.guigu.vo.RoleInfo;
import com.guigu.vo.RoleMenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RoleMenuController {
    @Autowired
    RoleMenuService roleMenuService;

    //删除 角色根据角色id
    @RequestMapping("delRoleMenuByRid.action")
    @ResponseBody
    @CrossOrigin
    public int delRoleMenuByRid(Integer role_id) {
        return roleMenuService.delRoleMenuByRid(role_id);
    }

    //授权 角色菜单
    @RequestMapping("shouQuanRoleMenu.action")
    @ResponseBody
    @CrossOrigin
    public Map shouQuanRoleMenu(Integer role_id, String menuIds) {
        Map<String, String> map = new HashMap<String, String>();
        String msg = "授权失败,未知错误";
        String[] id = menuIds.split(",");
        for (String menu_id : id) {
            RoleMenuInfo roleMenuInfo = new RoleMenuInfo();
            roleMenuInfo.setRole_id(role_id);
            roleMenuInfo.setMenu_id(Integer.parseInt(menu_id));
            int num = roleMenuService.shouQuanRoleMenu(roleMenuInfo);
            if (num > 0) {
                msg = "授权成功";
            }
        }
        map.put("msg", msg);
        return map;
    }
}
