package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.GoodsDao;
import com.guigu.dao.GoodsParentDao;
import com.guigu.service.GoodsParentTypeService;
import com.guigu.service.GoodsService;
import com.guigu.vo.Goods;
import com.guigu.vo.GoodsParentType;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsParentTypeServiceImpl implements GoodsParentTypeService {
    @Autowired
    GoodsParentDao dao;

    @Override
    public List<GoodsParentType> queryAllGoodsParentType(GoodsParentType goodsParentType) {
        return dao.queryAllGoodsParentType(goodsParentType);
    }

    @Override
    public int addGoodsParentType(GoodsParentType goodsParentType) {
        return dao.addGoodsParentType(goodsParentType);
    }

    @Override
    public int delGoodsParentType(int id) {
        return dao.delGoodsParentType(id);
    }

    @Override
    public int updGoodsParentType(GoodsParentType goodsParentType) {

        return dao.updGoodsParentType(goodsParentType);
    }
}
