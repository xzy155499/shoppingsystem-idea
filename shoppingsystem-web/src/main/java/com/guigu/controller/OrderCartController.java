
package com.guigu.controller;

import com.guigu.service.AreaService;
import com.guigu.service.OrderCartService;
import com.guigu.vo.Area;
import com.guigu.vo.OrderCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderCartController {

    @Autowired
    OrderCartService orderCartService;
    //查询用户的购物车
    @CrossOrigin
    @RequestMapping("/queryUserShoppingCartByUid.action")
    @ResponseBody
    public List<OrderCart> queryUserShoppingCartByUid(OrderCart orderCart) {
        return orderCartService.queryUserShoppingCartByUid(orderCart);
    }
    //查询用户购物车有几条数据
    @CrossOrigin
    @RequestMapping("/queryUserShoppingCartCountByUid.action")
    @ResponseBody
    public int queryUserShoppingCartCountByUid(OrderCart orderCart) {
        return orderCartService.queryUserShoppingCartCountByUid(orderCart);
    }
    //判断 购买的商品是否在购物车里面
    @CrossOrigin
    @RequestMapping("/gIdExistShoppingCart.action")
    @ResponseBody
    public OrderCart gIdExistShoppingCart(OrderCart orderCart) {
        System.out.println("******************************"+orderCartService.gIdExistShoppingCart(orderCart));
        return orderCartService.gIdExistShoppingCart(orderCart);
    }
    //修改购物车商品数量 和价格
    @CrossOrigin
    @RequestMapping("/updateGoodsNumAndSumPrice.action")
    @ResponseBody
    public int updateGoodsNum(OrderCart orderCart) {
        return orderCartService.updateGoodsNumAndSumPrice(orderCart);
    }
    //删除
    @CrossOrigin
    @RequestMapping("/delShoppingCartById.action")
    @ResponseBody
    public int delShoppingCartById(OrderCart orderCart) {
        return orderCartService.delShoppingCartById(orderCart);
    }

    //添加到购物车
    @CrossOrigin
    @RequestMapping("/addShoppingCart.action")
    @ResponseBody
    public int addShoppingCart(OrderCart orderCart) {
        return orderCartService.addShoppingCart(orderCart);
    }


}
