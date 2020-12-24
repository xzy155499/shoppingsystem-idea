package com.guigu.vo;

public class OrderGoods {
    private Integer orderId;

    private Integer goodsId;

    private Integer num;

    private Double sum;

    private Goods goods;
    private int priceInto;
    private int priceOut;

    @Override
    public String toString() {
        return "OrderGoods{" +
                "orderId=" + orderId +
                ", goodsId=" + goodsId +
                ", num=" + num +
                ", sum=" + sum +
                ", goods=" + goods +
                ", priceInto=" + priceInto +
                ", priceOut=" + priceOut +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getPriceInto() {
        return priceInto;
    }

    public void setPriceInto(int priceInto) {
        this.priceInto = priceInto;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(int priceOut) {
        this.priceOut = priceOut;
    }

    public OrderGoods(Integer orderId, Integer goodsId, Integer num, Double sum, Goods goods, int priceInto, int priceOut) {
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.num = num;
        this.sum = sum;
        this.goods = goods;
        this.priceInto = priceInto;
        this.priceOut = priceOut;
    }

    public OrderGoods(){}
}