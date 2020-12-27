package com.guigu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.guigu.dao.MerchantsDao;
import com.guigu.service.MerchantsService;
import com.guigu.vo.Merchants;
import com.guigu.vo.OrderInfo;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    @Override
    public List<Merchants> queMerchantsStatistical() {
        return dao.queMerchantsStatistical();
    }

    @Override
    public PageVo<OrderInfo> queMerchantsOrder(int page, int rows, OrderInfo orderInfo) {
        PageVo<OrderInfo> pageVo = new PageVo<>();
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(dao.queMerchantsOrder(orderInfo));
        //获取总的记录数量
        pageVo.setTotal(dao.queMerchantsOrderCount(orderInfo));
        return pageVo;
    }

    @Override
    public int updDeliveryByOid(OrderInfo orderInfo) {
        return dao.updDeliveryByOid(orderInfo);
    }

    @Override
    public List<Merchants> queMerchantsMonthByMid(int mid) {
        SimpleDateFormat sformat = new SimpleDateFormat("MM");
        String date = sformat.format(new Date());
        List<Merchants> list = new ArrayList<>();
        for (int i =1;i>-11;i--){
            int monty = Integer.parseInt(date)+i-1;
            if (monty<=0){
                monty=monty+12;
            }
            Merchants m = new Merchants();
            m.setmName(monty+"月");
            try {
                m.setmId(dao.queMerchantsMonthByMid(mid,i));
                System.out.println(0);
            }catch (Exception e){
                m.setmId(0);
                System.out.println(e.getMessage());
            }

            list.add(m);
        }
        return list;
    }

    @Override
    public List<Merchants> queMerchantsYearByMid(int mid) {
        SimpleDateFormat sformat = new SimpleDateFormat("yyyy");
        String date = sformat.format(new Date());
        List<Merchants> list = new ArrayList<>();
        for (int i =1;i>-9;i--){
            int year = Integer.parseInt(date)+i-1;
            Merchants m = new Merchants();
            m.setmName(year+"年");
            try {
                m.setmId(dao.queMerchantsYearByMid(mid,i));
                System.out.println(0);
            }catch (Exception e){
                m.setmId(0);
                System.out.println(e.getMessage());
            }

            list.add(m);
        }
        return list;
    }

    @Override
    public PageVo<Merchants> AllowMerchantsEnter(Merchants merchants,int page,int rows) {
        PageVo<Merchants> pageVo = new PageVo<>();
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        List<Merchants> list = dao.AllowMerchantsEnter(merchants);
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
        pageVo.setTotal(dao.AllowMerchantsEnterCount(merchants));
        return pageVo;
    }

    @Override
    public int AgreeMerchants(int id) {
        return dao.AgreeMerchants(id);
    }
}
