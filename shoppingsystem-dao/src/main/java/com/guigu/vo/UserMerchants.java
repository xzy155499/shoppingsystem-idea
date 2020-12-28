package com.guigu.vo;

public class UserMerchants {
    private Integer umId;

    private Integer uId;

    private Integer mId;

    private Merchants merchants;

    @Override
    public String toString() {
        return "UserMerchants{" +
                "umId=" + umId +
                ", uId=" + uId +
                ", mId=" + mId +
                ", merchants=" + merchants +
                '}';
    }

    public Integer getUmId() {
        return umId;
    }

    public void setUmId(Integer umId) {
        this.umId = umId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Merchants getMerchants() {
        return merchants;
    }

    public void setMerchants(Merchants merchants) {
        this.merchants = merchants;
    }
    public UserMerchants(){}
    public UserMerchants(Integer umId, Integer uId, Integer mId, Merchants merchants) {
        this.umId = umId;
        this.uId = uId;
        this.mId = mId;
        this.merchants = merchants;
    }
}