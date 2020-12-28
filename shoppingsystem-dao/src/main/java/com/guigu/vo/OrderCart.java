package com.guigu.vo;


public class OrderCart {
    private Integer id;

    private Integer uid;

    private Integer gId;

    private String gImg;

    private String gName;

    private String gSpec;

    private Double gPrice;

    private int num;

    private Double sumPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgImg() {
        return gImg;
    }

    public void setgImg(String gImg) {
        this.gImg = gImg;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgSpec() {
        return gSpec;
    }

    public void setgSpec(String gSpec) {
        this.gSpec = gSpec;
    }

    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    @Override
    public String toString() {
        return "OrderCart{" +
                "id=" + id +
                ", uid=" + uid +
                ", gId=" + gId +
                ", gImg='" + gImg + '\'' +
                ", gName='" + gName + '\'' +
                ", gSpec='" + gSpec + '\'' +
                ", gPrice=" + gPrice +
                ", num=" + num +
                ", sumPrice=" + sumPrice +
                '}';
    }
}