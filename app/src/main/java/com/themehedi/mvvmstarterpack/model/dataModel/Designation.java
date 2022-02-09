package com.themehedi.mvvmstarterpack.model.dataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Designation {
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("text_en")
    @Expose
    private String textEn;
    @SerializedName("text_bn")
    @Expose
    private String textBn;
    @SerializedName("org_id")
    @Expose
    private Integer orgId;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("total_post")
    @Expose
    private Integer totalPost;
    @SerializedName("sorting_order")
    @Expose
    private Integer sortingOrder;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
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

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalPost() {
        return totalPost;
    }

    public void setTotalPost(Integer totalPost) {
        this.totalPost = totalPost;
    }

    public Integer getSortingOrder() {
        return sortingOrder;
    }

    public void setSortingOrder(Integer sortingOrder) {
        this.sortingOrder = sortingOrder;
    }
}
