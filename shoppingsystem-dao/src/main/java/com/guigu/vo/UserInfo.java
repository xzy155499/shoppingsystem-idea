package com.guigu.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserInfo {
    //用户编号
    private int user_id;
    //姓名
    private String user_name;
    //头像
    private String photo;
    //性别
    private String user_sex;
    //出生日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birth_date;
    //身份证号
    private String id_number;
    //联系电话
    private String phone;
    //账号
    private String account;
    //密码
    private String pass;

    public UserInfo() {
    }

    public UserInfo(int user_id, String user_name, String photo, String user_sex, Date birth_date, String id_number, String phone, String account, String pass) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.photo = photo;
        this.user_sex = user_sex;
        this.birth_date = birth_date;
        this.id_number = id_number;
        this.phone = phone;
        this.account = account;
        this.pass = pass;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", photo='" + photo + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", birth_date=" + birth_date +
                ", id_number='" + id_number + '\'' +
                ", phone='" + phone + '\'' +
                ", account='" + account + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

}
