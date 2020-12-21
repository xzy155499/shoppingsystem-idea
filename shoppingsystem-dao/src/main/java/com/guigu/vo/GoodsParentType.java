package com.guigu.vo;


import java.util.List;

public class GoodsParentType {
    private Integer pId;

    private String pName;

    private String pDescribe;

    private List<GoodsChildType> goodsChildType;

    @Override
    public String toString() {
        return "GoodsParentType{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pDescribe='" + pDescribe + '\'' +
                ", goodsChildType=" + goodsChildType +
                '}';
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDescribe() {
        return pDescribe;
    }

    public void setpDescribe(String pDescribe) {
        this.pDescribe = pDescribe;
    }

    public List<GoodsChildType> getGoodsChildType() {
        return goodsChildType;
    }

    public void setGoodsChildType(List<GoodsChildType> goodsChildType) {
        this.goodsChildType = goodsChildType;
    }

    public GoodsParentType(Integer pId, String pName, String pDescribe, List<GoodsChildType> goodsChildType) {
        this.pId = pId;
        this.pName = pName;
        this.pDescribe = pDescribe;
        this.goodsChildType = goodsChildType;
    }

    public GoodsParentType(){}
}