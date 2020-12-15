package com.guigu.vo;

public class GoodsParentType {
    private Integer pId;

    private String pName;

    private String pDescribe;

    @Override
    public String toString() {
        return "GoodsParentType{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pDescribe='" + pDescribe + '\'' +
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

    public GoodsParentType(Integer pId, String pName, String pDescribe) {
        this.pId = pId;
        this.pName = pName;
        this.pDescribe = pDescribe;
    }
    public GoodsParentType(){}
}