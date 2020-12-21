package com.guigu.dao;
import com.guigu.vo.Area;

import java.util.List;

public interface AreaDao {
    //查询所有仓库
    List<Area> queryArea(Area c);
    List<Area> queryAreaAll();

    Area queryAreaById(int id);

}