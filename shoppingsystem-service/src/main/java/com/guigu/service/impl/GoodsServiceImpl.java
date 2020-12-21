package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.GoodsDao;
import com.guigu.dao.MenuDao;
import com.guigu.service.GoodsService;
import com.guigu.service.MenuService;
import com.guigu.vo.Goods;
import com.guigu.vo.MenuInfo;
import com.guigu.vo.PageVo;
import com.guigu.vo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao dao;


    @Override
    public PageVo<Goods> queryAllGoods(int page ,int rows,Goods goods) {
        PageVo<Goods> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        List<Goods> list = dao.queryAllGoods(goods);
        for (Goods g :list){
            g.setType(g.getGoodsParentType().getpName()+"---"+g.getGoodsChildType().getcName());
        }
        //获取分页后 显示的数据集合
        pageVo.setRows(list);
        //获取总的记录数量
        pageVo.setTotal(dao.queryAllGoodsCond(goods));

        return pageVo;
    }

    @Override
    public int updGoodsImg(Goods goods) {
        return dao.updGoodsImg(goods);
    }

    @Override
    public int addGoods(Goods goods) {
        return dao.addGoods(goods);
    }

    @Override
    public int delGoods(int id) {
        return dao.delGoods(id);
    }

    @Override
    public int updGoods(Goods goods) {
        return dao.updGoods(goods);
    }
}
