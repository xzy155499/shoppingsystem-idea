package com.guigu.vo;

import java.util.Arrays;
import java.util.List;

public class Area {
    private Integer id;
    private String code;
    private String name;
    private Integer level;
    private String cityCode;
    private String center;
    private int parentId;
    private List<Area> area;

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", cityCode='" + cityCode + '\'' +
                ", center='" + center + '\'' +
                ", parentId=" + parentId +
                ", area=" + area +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List<Area> getArea() {
        return area;
    }

    public void setArea(List<Area> area) {
        this.area = area;
    }

    public Area(Integer id, String code, String name, Integer level, String cityCode, String center, int parentId, List<Area> area) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.level = level;
        this.cityCode = cityCode;
        this.center = center;
        this.parentId = parentId;
        this.area = area;
    }

    public Area(){}
}
