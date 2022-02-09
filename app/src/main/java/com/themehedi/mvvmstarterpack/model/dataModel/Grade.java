package com.themehedi.mvvmstarterpack.model.dataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Grade {
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("text_en")
    @Expose
    private Integer textEn;
    @SerializedName("text_bn")
    @Expose
    private String textBn;
    @SerializedName("status")
    @Expose
    private Integer status;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getTextEn() {
        return textEn;
    }

    public void setTextEn(Integer textEn) {
        this.textEn = textEn;
    }

    public String getTextBn() {
        return textBn;
    }

    public void setTextBn(String textBn) {
        this.textBn = textBn;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
