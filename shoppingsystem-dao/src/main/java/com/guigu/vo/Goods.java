package com.guigu.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Goods  implements Comparable<Goods> {
    private Integer gId;

    private String gName;

    private String gImg;

    private Double gPriceInto;

    private Double gPriceOut;

    private String gDescribe;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date gTime;

    private Integer gParent;

    private Integer gChild;

    private Integer gNum;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date gFinalSales;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date gFinalPurchase;

    private GoodsChildType goodsChildType;

    private GoodsParentType goodsParentType;

    private String type;

    private int warehouseNum;

    @Override
    public String toString() {
        return "Goods{" +
                "gId=" + gId +
                ", gName='" + gName + '\'' +
                ", gImg='" + gImg + '\'' +
                ", gPriceInto=" + gPriceInto +
                ", gPriceOut=" + gPriceOut +
                ", gDescribe='" + gDescribe + '\'' +
                ", gTime=" + gTime +
                ", gParent=" + gParent +
                ", gChild=" + gChild +
                ", gNum=" + gNum +
                ", gFinalSales=" + gFinalSales +
                ", gFinalPurchase=" + gFinalPurchase +
                ", goodsChildType=" + goodsChildType +
                ", goodsParentType=" + goodsParentType +
                ", type='" + type + '\'' +
                ", warehouseNum=" + warehouseNum +
                '}';
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgImg() {
        return gImg;
    }

    public void setgImg(String gImg) {
        this.gImg = gImg;
    }

    public Double getgPriceInto() {
        return gPriceInto;
    }

    public void setgPriceInto(Double gPriceInto) {
        this.gPriceInto = gPriceInto;
    }

    public Double getgPriceOut() {
        return gPriceOut;
    }

    public void setgPriceOut(Double gPriceOut) {
        this.gPriceOut = gPriceOut;
    }

    public String getgDescribe() {
        return gDescribe;
    }

    public void setgDescribe(String gDescribe) {
        this.gDescribe = gDescribe;
    }

    public Date getgTime() {
        return gTime;
    }

    public void setgTime(Date gTime) {
        this.gTime = gTime;
    }

    public Integer getgParent() {
        return gParent;
    }

    public void setgParent(Integer gParent) {
        this.gParent = gParent;
    }

    public Integer getgChild() {
        return gChild;
    }

    public void setgChild(Integer gChild) {
        this.gChild = gChild;
    }

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public Date getgFinalSales() {
        return gFinalSales;
    }

    public void setgFinalSales(Date gFinalSales) {
        this.gFinalSales = gFinalSales;
    }

    public Date getgFinalPurchase() {
        return gFinalPurchase;
    }

    public void setgFinalPurchase(Date gFinalPurchase) {
        this.gFinalPurchase = gFinalPurchase;
    }

    public GoodsChildType getGoodsChildType() {
        return goodsChildType;
    }

    public void setGoodsChildType(GoodsChildType goodsChildType) {
        this.goodsChildType = goodsChildType;
    }

    public GoodsParentType getGoodsParentType() {
        return goodsParentType;
    }

    public void setGoodsParentType(GoodsParentType goodsParentType) {
        this.goodsParentType = goodsParentType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWarehouseNum() {
        return warehouseNum;
    }

    public void setWarehouseNum(int warehouseNum) {
        this.warehouseNum = warehouseNum;
    }

    public Goods(Integer gId, String gName, String gImg, Double gPriceInto, Double gPriceOut, String gDescribe, Date gTime, Integer gParent, Integer gChild, Integer gNum, Date gFinalSales, Date gFinalPurchase, GoodsChildType goodsChildType, GoodsParentType goodsParentType, String type, int warehouseNum) {
        this.gId = gId;
        this.gName = gName;
        this.gImg = gImg;
        this.gPriceInto = gPriceInto;
        this.gPriceOut = gPriceOut;
        this.gDescribe = gDescribe;
        this.gTime = gTime;
        this.gParent = gParent;
        this.gChild = gChild;
        this.gNum = gNum;
        this.gFinalSales = gFinalSales;
        this.gFinalPurchase = gFinalPurchase;
        this.goodsChildType = goodsChildType;
        this.goodsParentType = goodsParentType;
        this.type = type;
        this.warehouseNum = warehouseNum;
    }

    public Goods(){}

    @Override
    public int compareTo(Goods o) {
        return o.getgParent()-this.gParent;
    }
}