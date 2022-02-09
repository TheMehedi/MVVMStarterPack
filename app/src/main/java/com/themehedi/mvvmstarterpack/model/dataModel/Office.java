package com.themehedi.mvvmstarterpack.model.dataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Office {
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
    @SerializedName("org_id")
    @Expose
    private Integer orgId;
    @SerializedName("office_type_id")
    @Expose
    private Integer officeTypeId;
    @SerializedName("parent_office_id")
    @Expose
    private Integer parentOfficeId;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("union_id")
    @Expose
    private Integer unionId;
    @SerializedName("upazilla_id")
    @Expose
    private Integer upazillaId;
    @SerializedName("district_id")
    @Expose
    private Integer districtId;
    @SerializedName("division_id")
    @Expose
    private Integer divisionId;
    @SerializedName("area_type_id")
    @Expose
    private Integer areaTypeId;
    @SerializedName("city_corporation_id")
    @Expose
    private Integer cityCorporationId;
    @SerializedName("pauroshoba_id")
    @Expose
    private Integer pauroshobaId;
    @SerializedName("ward_id")
    @Expose
    private Integer wardId;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("office_code")
    @Expose
    private String officeCode;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("address_bn")
    @Expose
    private Object addressBn;

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

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getOfficeTypeId() {
        return officeTypeId;
    }

    public void setOfficeTypeId(Integer officeTypeId) {
        this.officeTypeId = officeTypeId;
    }

    public Integer getParentOfficeId() {
        return parentOfficeId;
    }

    public void setParentOfficeId(Integer parentOfficeId) {
        this.parentOfficeId = parentOfficeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUnionId() {
        return unionId;
    }

    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    public Integer getUpazillaId() {
        return upazillaId;
    }

    public void setUpazillaId(Integer upazillaId) {
        this.upazillaId = upazillaId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getAreaTypeId() {
        return areaTypeId;
    }

    public void setAreaTypeId(Integer areaTypeId) {
        this.areaTypeId = areaTypeId;
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

    public Integer getWardId() {
        return wardId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getAddressBn() {
        return addressBn;
    }

    public void setAddressBn(Object addressBn) {
        this.addressBn = addressBn;
    }

}
