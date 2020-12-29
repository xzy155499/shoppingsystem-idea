package com.guigu.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Merchants {
    private Integer mId;

    private String mName;

    private String mUsername;

    private String mPwd;

    private String mImg;

    private String mSex;

    private String mCoordinates;

    private String mNote;

    private String mProvince;

    private String mCity;

    private String mCounty;

    private String mState;

    private String mStoresName;

    private String mDetailed;

    private String mDetailedAddress;

    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date mTime;

    private String mPhone;

    @Override
    public String toString() {
        return "Merchants{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mUsername='" + mUsername + '\'' +
                ", mPwd='" + mPwd + '\'' +
                ", mImg='" + mImg + '\'' +
                ", mSex='" + mSex + '\'' +
                ", mCoordinates='" + mCoordinates + '\'' +
                ", mNote='" + mNote + '\'' +
                ", mProvince='" + mProvince + '\'' +
                ", mCity='" + mCity + '\'' +
                ", mCounty='" + mCounty + '\'' +
                ", mState='" + mState + '\'' +
                ", mStoresName='" + mStoresName + '\'' +
                ", mDetailed='" + mDetailed + '\'' +
                ", mDetailedAddress='" + mDetailedAddress + '\'' +
                ", mTime=" + mTime +
                ", mPhone='" + mPhone + '\'' +
                '}';
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPwd() {
        return mPwd;
    }

    public void setmPwd(String mPwd) {
        this.mPwd = mPwd;
    }

    public String getmImg() {
        return mImg;
    }

    public void setmImg(String mImg) {
        this.mImg = mImg;
    }

    public String getmSex() {
        return mSex;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex;
    }

    public String getmCoordinates() {
        return mCoordinates;
    }

    public void setmCoordinates(String mCoordinates) {
        this.mCoordinates = mCoordinates;
    }

    public String getmNote() {
        return mNote;
    }

    public void setmNote(String mNote) {
        this.mNote = mNote;
    }

    public String getmProvince() {
        return mProvince;
    }

    public void setmProvince(String mProvince) {
        this.mProvince = mProvince;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    public String getmCounty() {
        return mCounty;
    }

    public void setmCounty(String mCounty) {
        this.mCounty = mCounty;
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState;
    }

    public String getmStoresName() {
        return mStoresName;
    }

    public void setmStoresName(String mStoresName) {
        this.mStoresName = mStoresName;
    }

    public String getmDetailed() {
        return mDetailed;
    }

    public void setmDetailed(String mDetailed) {
        this.mDetailed = mDetailed;
    }

    public String getmDetailedAddress() {
        return mDetailedAddress;
    }

    public void setmDetailedAddress(String mDetailedAddress) {
        this.mDetailedAddress = mDetailedAddress;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public Merchants(Integer mId, String mName, String mUsername, String mPwd, String mImg, String mSex, String mCoordinates, String mNote, String mProvince, String mCity, String mCounty, String mState, String mStoresName, String mDetailed, String mDetailedAddress, Date mTime, String mPhone) {
        this.mId = mId;
        this.mName = mName;
        this.mUsername = mUsername;
        this.mPwd = mPwd;
        this.mImg = mImg;
        this.mSex = mSex;
        this.mCoordinates = mCoordinates;
        this.mNote = mNote;
        this.mProvince = mProvince;
        this.mCity = mCity;
        this.mCounty = mCounty;
        this.mState = mState;
        this.mStoresName = mStoresName;
        this.mDetailed = mDetailed;
        this.mDetailedAddress = mDetailedAddress;
        this.mTime = mTime;
        this.mPhone = mPhone;
    }

    public Merchants(){}
}