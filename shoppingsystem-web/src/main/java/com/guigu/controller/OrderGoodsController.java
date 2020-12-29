
package com.guigu.controller;

import com.guigu.service.OrderGoodsService;
import com.guigu.vo.OrderCart;
import com.guigu.vo.OrderGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderGoodsController {

    @Autowired
    OrderGoodsService orderGoodsService;

    //添加订单详情数据
    @CrossOrigin
    @RequestMapping("/addOrderGoods.action")
    @ResponseBody
    public int addOrderGoods(String orderId,String gIdList,String numList,String sumList) {
        OrderGoods orderGoods = new OrderGoods();
        String [] gIdArr = gIdList.split(",");
        String [] numArr = numList.split(",");
        String [] sumArr = sumList.split(",");
        int row = 0;
        orderGoods.setOrderId(orderId);
        for (int i = 0; i < gIdArr.length; i++) {
            orderGoods.setGoodsId(Integer.parseInt(gIdArr[i]));
            orderGoods.setNum(Integer.parseInt(numArr[i]));
            orderGoods.setSum(Double.parseDouble(sumArr[i]));
            row = orderGoodsService.addOrderGoods(orderGoods);
        }

        return row;
    }


}
