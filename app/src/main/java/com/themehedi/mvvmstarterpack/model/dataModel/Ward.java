package com.themehedi.mvvmstarterpack.model.dataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ward {
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
    @SerializedName("city_corporation_id")
    @Expose
    private Integer cityCorporationId;
    @SerializedName("pauroshoba_id")
    @Expose
    private Integer pauroshobaId;
    @SerializedName("upazilla_id")
    @Expose
    private Integer upazillaId;
    @SerializedName("union_id")
    @Expose
    private Integer unionId;
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

    public Integer getCityCorporationId() {
        return cityCorporationId;
    }

    public void setCityCorporationId(Integer cityCorporationId) {
        this.cityCorporationId = cityCorporationId;
    }

    public Integer getPauroshobaId() {
        return pauroshobaId;
    }

    public void setPauroshobaId(Integer pauroshobaId) {
        this.pauroshobaId = pauroshobaId;
    }

    public Integer getUpazillaId() {
        return upazillaId;
    }

    public void setUpazillaId(Integer upazillaId) {
        this.upazillaId = upazillaId;
    }

    public Integer getUnionId() {
        return unionId;
    }

    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
