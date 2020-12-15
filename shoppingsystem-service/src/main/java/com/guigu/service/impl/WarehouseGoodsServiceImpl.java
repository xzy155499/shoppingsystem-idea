package com.guigu.service.impl;
import com.guigu.dao.WarehouseGoodsDao;
import com.guigu.service.WarehouseGoodsService;
import com.guigu.vo.WarehouseGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseGoodsServiceImpl implements WarehouseGoodsService {
    @Autowired
    WarehouseGoodsDao dao;

    @Override
    public List<WarehouseGoods> queryAllWarehouseGoods() {
        return dao.queryAllWarehouseGoods();
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
