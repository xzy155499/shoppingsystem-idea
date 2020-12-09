package com.guigu.realm;


/*import com.guigu.service.MenuService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;*/


import com.guigu.service.MenuService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class MyRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
/*
    @Autowired
    MenuService menuService;
    @Autowired
    RoleService roleService;
    @Autowired
    EmpService empService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        System.out.println("-----授权-----");
        //从参数中获取用户名
        AuthenticationToken token = (AuthenticationToken) principals.getPrimaryPrincipal();   //认证时，第一个参数传递的数据

        //System.out.println("授权时，取到的用户名：" + token.getPrincipal());
        String loginName = (String) token.getPrincipal();

        //根据用户名查询拥有的角色名(角色id)
        List<String> roles = roleService.queryRolesByLoginName(loginName);

        //根据用户名查询菜单code(菜单id)
        List<String> perms = menuService.queryMenuCodeByLoginNameAndNodeType(3, loginName);

        //返回权限信息(SimpleAuthorizationInfo)由父类AuthenticatingRealm 进行授权
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roles);
        authorizationInfo.addStringPermissions(perms);

        return authorizationInfo;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        System.out.println("-----认证-----");
        //通过token获取用户名
        String emp_name = (String) token.getPrincipal();

        //通过用户名去用户表查询当前用户数据(数据库里面当前用户名对应的密码)
        EmpInfo empInfo = empService.LoginQueryEmpByName(emp_name);

        if (empInfo == null) {
            throw new UnknownAccountException("当前帐号不存在！！！");
        }

        SimpleAuthenticationInfo authenticationInfo =
                new SimpleAuthenticationInfo(token, empInfo.getPassword(), ByteSource.Util.bytes("富得流油"), this.getName());

        return authenticationInfo;
    }

    public static void main(String[] args) {

        System.out.println("加密3后的密码："+new Md5Hash("232125","富得流油",5).toString());
    }*/
}
