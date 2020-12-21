package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.MerchantsDao;
import com.guigu.service.MerchantsService;
import com.guigu.vo.Merchants;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MerchantsServiceImpl implements MerchantsService {
    @Autowired
    MerchantsDao dao;

    @Override
    public PageVo<Merchants> queryAllMerchants( int page, int rows, Merchants merchants) {
        PageVo<Merchants> pageVo = new PageVo<>();
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        List<Merchants> list = dao.queryAllMerchants(merchants);
        for (Merchants m :list){
            if (m.getmCity().equals(m.getmProvince())){
                m.setmDetailed(m.getmProvince()+"-"+m.getmCounty());
            }else{
                m.setmDetailed(m.getmProvince()+"-"+m.getmCity()+"-"+m.getmCounty());
            }
        }
        //获取分页后 显示的数据集合
        pageVo.setRows(list);
        //获取总的记录数量
        pageVo.setTotal(dao.queryMerchantsCount(merchants));
        return pageVo;
    }

    @Override
    public int addMerchants(Merchants merchants) {
        return dao.addMerchants(merchants);
    }

    @Override
    public int delMerchants(int id) {
        return dao.delMerchants(id);
    }

    @Override
    public int updMerchants(Merchants merchants) {
        return dao.updMerchants(merchants);
    }

    @Override
    public Merchants loginMerchants(Merchants merchants) {
        return dao.loginMerchants(merchants);
    }

    @Override
    public int updMarehouseImg(Merchants merchants) {
        return dao.updMarehouseImg(merchants);
    }
}
