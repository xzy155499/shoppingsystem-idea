
package com.guigu.service.impl;

import com.guigu.dao.AreaDao;
import com.guigu.service.AreaService;
import com.guigu.vo.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaDao dao;

    public List<Area> queryArea(Area a) {
        return dao.queryArea(a);
    }

    @Override
    public List<Area> queryAreaAll() {
        Area a = new Area();
        a.setParentId(-1);
        List<Area> list = dao.queryArea(a);
        a:
        for (Area l:list){
            a.setParentId(l.getId());
            List<Area> list1 =dao.queryArea(a);
            for (Area l1:list1){
                a.setParentId(l1.getId());
                List<Area> list2 =dao.queryArea(a);
                l1.setArea(list2);
            }
            l.setArea(list1);
        }

        return list;
    }


}



