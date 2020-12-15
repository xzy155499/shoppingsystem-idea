package com.guigu.vo;

public class WarehouseGoods {
    private Integer wgId;

    private Integer wId;

    private Integer gId;

    private Integer wgNum;

    private Goods goods;

    private Warehouse warehouse;

    @Override
    public String toString() {
        return "WarehouseGoods{" +
                "wgId=" + wgId +
                ", wId=" + wId +
                ", gId=" + gId +
                ", wgNum=" + wgNum +
                ", goods=" + goods +
                ", warehouse=" + warehouse +
                '}';
    }

    public Integer getWgId() {
        return wgId;
    }

    public void setWgId(Integer wgId) {
        this.wgId = wgId;
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getWgNum() {
        return wgNum;
    }

    public void setWgNum(Integer wgNum) {
        this.wgNum = wgNum;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public WarehouseGoods(Integer wgId, Integer wId, Integer gId, Integer wgNum, Goods goods, Warehouse warehouse) {
        this.wgId = wgId;
        this.wId = wId;
        this.gId = gId;
        this.wgNum = wgNum;
        this.goods = goods;
        this.warehouse = warehouse;
    }
    public WarehouseGoods(){}
}