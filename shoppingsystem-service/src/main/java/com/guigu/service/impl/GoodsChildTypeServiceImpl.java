package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.GoodsChildDao;
import com.guigu.dao.GoodsDao;
import com.guigu.dao.GoodsParentDao;
import com.guigu.service.GoodsChildTypeService;
import com.guigu.service.GoodsService;
import com.guigu.vo.Goods;
import com.guigu.vo.GoodsChildType;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsChildTypeServiceImpl implements GoodsChildTypeService {
    @Autowired
    GoodsChildDao dao;

    @Override
    public List<GoodsChildType> queryAllGoodsChildType(int id) {
        return dao.queryAllGoodsChildType(id);
    }

    @Override
    public int addGoodsChildType(GoodsChildType goodsChildType) {
        return dao.addGoodsChildType(goodsChildType);
    }

    @Override
    public int delGoodsChildType(int id) {
        return dao.delGoodsChildType(id);
    }

    @Override
    public int updGoodsChildType(GoodsChildType goodsChildType) {
        return dao.updGoodsChildType(goodsChildType);
    }
}
