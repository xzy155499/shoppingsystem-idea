
package com.guigu.service;

import com.guigu.vo.Area;

import java.util.List;

public interface AreaService {
    //查询所有供货商
    List<Area> queryArea(Area a);
    List<Area> queryAreaAll();
}