package com.guigu.service.impl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.guigu.dao.WarehouseGoodsDao;
import com.guigu.service.WarehouseGoodsService;
import com.guigu.vo.PageVo;
import com.guigu.vo.Warehouse;
import com.guigu.vo.WarehouseGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseGoodsServiceImpl implements WarehouseGoodsService {
    @Autowired
    WarehouseGoodsDao dao;

    @Override
    public PageVo<WarehouseGoods> queryAllWarehouseGoods(int page ,int rows,WarehouseGoods warehouseGoods) {
        PageVo<WarehouseGoods> pageVo = new PageVo<>();
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(dao.queryAllWarehouseGoods(warehouseGoods));
        //获取总的记录数量
        pageVo.setTotal(dao.queryWarehouseGoodsCount(warehouseGoods));

        return pageVo;
    }

    @Override
    public int addWarehouseGoods(WarehouseGoods WarehouseGoods) {
        return dao.addWarehouseGoods(WarehouseGoods);
    }

    @Override
    public int delWarehouseGoods(int id) {
        return dao.delWarehouseGoods(id);
    }

    @Override
    public int updWarehouseGoods(WarehouseGoods WarehouseGoods) {
        return dao.updWarehouseGoods(WarehouseGoods);
    }
}
