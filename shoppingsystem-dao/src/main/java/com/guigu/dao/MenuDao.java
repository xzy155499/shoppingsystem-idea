package com.guigu.dao;

import com.guigu.vo.MenuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {

    //条件查询 菜单信息
    List<MenuInfo> queryMenuByCond(MenuInfo menuInfo);

    //条件查询 菜单信息数量
    int queryMenuCountByCond(MenuInfo menuInfo);

    //禁用菜单
    int disabledMenu(MenuInfo menuInfo);

    //导航菜单
    List<MenuInfo> queryMenuByEmpIdPidAndNodeType(@Param("emp_id") int emp_id,
                                                  @Param("pid") int pid,
                                                  @Param("nodeType") int nodeType);
    //树tree菜单
    List<MenuInfo> queryAllMenuByPidAndNodeType(@Param("pid") int pid,
                                                @Param("nodeType") int nodeType);

    //根据角色id查询当前角色拥有的菜单
    List<Integer> queryMenuIdByRid(int role_id);

}
