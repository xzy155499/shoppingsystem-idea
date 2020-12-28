package com.guigu.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

public class OrderInfo {
    private String orderId;

    private Integer userId;

    private Integer merchantId;

    private Integer empId;

    private Double sum;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date orderTime;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date deliveryTime;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date receiptTime;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date pickTime;

    private String orderState;

    private String remake;

    private EmpInfo empInfo;

    private UserInfo userInfo;

    private Merchants merchants;

    private List<OrderGoods> list;

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", merchantId=" + merchantId +
                ", empId=" + empId +
                ", sum=" + sum +
                ", orderTime=" + orderTime +
                ", deliveryTime=" + deliveryTime +
                ", receiptTime=" + receiptTime +
                ", pickTime=" + pickTime +
                ", orderState='" + orderState + '\'' +
                ", remake='" + remake + '\'' +
                ", empInfo=" + empInfo +
                ", userInfo=" + userInfo +
                ", merchants=" + merchants +
                ", list=" + list +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Date getPickTime() {
        return pickTime;
    }

    public void setPickTime(Date pickTime) {
        this.pickTime = pickTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Merchants getMerchants() {
        return merchants;
    }

    public void setMerchants(Merchants merchants) {
        this.merchants = merchants;
    }

    public List<OrderGoods> getList() {
        return list;
    }

    public void setList(List<OrderGoods> list) {
        this.list = list;
    }

    public OrderInfo(String orderId, Integer userId, Integer merchantId, Integer empId, Double sum, Date orderTime, Date deliveryTime, Date receiptTime, Date pickTime, String orderState, String remake, EmpInfo empInfo, UserInfo userInfo, Merchants merchants, List<OrderGoods> list) {
        this.orderId = orderId;
        this.userId = userId;
        this.merchantId = merchantId;
        this.empId = empId;
        this.sum = sum;
        this.orderTime = orderTime;
        this.deliveryTime = deliveryTime;
        this.receiptTime = receiptTime;
        this.pickTime = pickTime;
        this.orderState = orderState;
        this.remake = remake;
        this.empInfo = empInfo;
        this.userInfo = userInfo;
        this.merchants = merchants;
        this.list = list;
    }

    public OrderInfo(){}
}