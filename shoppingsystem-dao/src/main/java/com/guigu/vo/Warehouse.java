package com.guigu.vo;

public class Warehouse {
    private Integer wId;

    private String wName;

    private String wCoordinates;

    private String wNote;

    private String wProvince;

    private String wCity;

    private String wCounty;

    private String wDetailed;

    private String detailedAddress;

    @Override
    public String toString() {
        return "Warehouse{" +
                "wId=" + wId +
                ", wName='" + wName + '\'' +
                ", wCoordinates='" + wCoordinates + '\'' +
                ", wNote='" + wNote + '\'' +
                ", wProvince='" + wProvince + '\'' +
                ", wCity='" + wCity + '\'' +
                ", wCounty='" + wCounty + '\'' +
                ", wDetailed='" + wDetailed + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                '}';
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getwCoordinates() {
        return wCoordinates;
    }

    public void setwCoordinates(String wCoordinates) {
        this.wCoordinates = wCoordinates;
    }

    public String getwNote() {
        return wNote;
    }

    public void setwNote(String wNote) {
        this.wNote = wNote;
    }

    public String getwProvince() {
        return wProvince;
    }

    public void setwProvince(String wProvince) {
        this.wProvince = wProvince;
    }

    public String getwCity() {
        return wCity;
    }

    public void setwCity(String wCity) {
        this.wCity = wCity;
    }

    public String getwCounty() {
        return wCounty;
    }

    public void setwCounty(String wCounty) {
        this.wCounty = wCounty;
    }

    public String getwDetailed() {
        return wDetailed;
    }

    public void setwDetailed(String wDetailed) {
        this.wDetailed = wDetailed;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public Warehouse(Integer wId, String wName, String wCoordinates, String wNote, String wProvince, String wCity, String wCounty, String wDetailed, String detailedAddress) {
        this.wId = wId;
        this.wName = wName;
        this.wCoordinates = wCoordinates;
        this.wNote = wNote;
        this.wProvince = wProvince;
        this.wCity = wCity;
        this.wCounty = wCounty;
        this.wDetailed = wDetailed;
        this.detailedAddress = detailedAddress;
    }
    public Warehouse(){}
}