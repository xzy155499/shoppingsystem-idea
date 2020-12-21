package com.guigu.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class EmpInfo {

    //主键 编号
    private Integer emp_id;
    //姓名
    private String emp_name;
    //照片
    private String photo;
    //性别
    private String emp_sex;
    //年龄
//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Integer emp_age;
    //身份证号
    private String id_number;
    //联系电话
    private String phone;
    //地址
    private String address;
    //账号
    private String account;
    //密码
    private String pass;
    //上次登录时间
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String last_time;
    //本次登录时间
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String this_time;
    //访问次数
    private Integer login_count;
    //状态
    private Integer isdelete;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmp_sex() {
        return emp_sex;
    }

    public void setEmp_sex(String emp_sex) {
        this.emp_sex = emp_sex;
    }

    public Integer getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(Integer emp_age) {
        this.emp_age = emp_age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }

    public String getThis_time() {
        return this_time;
    }

    public void setThis_time(String this_time) {
        this.this_time = this_time;
    }

    public Integer getLogin_count() {
        return login_count;
    }

    public void setLogin_count(Integer login_count) {
        this.login_count = login_count;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

}
