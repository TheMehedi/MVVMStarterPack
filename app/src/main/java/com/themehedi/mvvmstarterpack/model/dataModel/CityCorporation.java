package com.themehedi.mvvmstarterpack.model.dataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CityCorporation {
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("text_en")
    @Expose
    private String textEn;
    @SerializedName("text_bn")
    @Expose
    private String textBn;
    @SerializedName("division_id")
    @Expose
    private Integer divisionId;
    @SerializedName("district_id")
    @Expose
    private Integer districtId;
    @SerializedName("status")
    @Expose
    private Integer status;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextEn() {
        return textEn;
    }

    public void setTextEn(String textEn) {
        this.textEn = textEn;
    }

    public String getTextBn() {
        return textBn;
    }

    public void setTextBn(String textBn) {
        this.textBn = textBn;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
