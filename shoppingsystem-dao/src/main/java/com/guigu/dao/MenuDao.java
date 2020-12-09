package com.guigu.dao;

import com.guigu.vo.MenuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {


    List<MenuInfo> queryMenuByPidAndNodeType(@Param("emp_id") int emp_id,
                                             @Param("pid") int pid,
                                             @Param("nodeType") int nodeType);


}
