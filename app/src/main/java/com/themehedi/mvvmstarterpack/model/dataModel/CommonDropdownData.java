package com.themehedi.mvvmstarterpack.model.dataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommonDropdownData {
    @SerializedName("divisionList")
    @Expose
    private List<Division> divisionList = null;
    @SerializedName("districtList")
    @Expose
    private List<District> districtList = null;
    @SerializedName("upazilaList")
    @Expose
    private List<Upazila> upazilaList = null;
    @SerializedName("unionList")
    @Expose
    private List<Union> unionList = null;
    @SerializedName("officeList")
    @Expose
    private List<Office> officeList = null;
    @SerializedName("pauroshobaList")
    @Expose
    private List<Pauroshoba> pauroshobaList = null;
    @SerializedName("wardList")
    @Expose
    private List<Ward> wardList = null;
    @SerializedName("cityCorporationList")
    @Expose
    private List<CityCorporation> cityCorporationList = null;
    @SerializedName("officeTypeList")
    @Expose
    private List<OfficeType> officeTypeList = null;
    @SerializedName("designationList")
    @Expose
    private List<Designation> designationList = null;
    @SerializedName("gradeList")
    @Expose
    private List<Grade> gradeList = null;

    public List<Division> getDivisionList() {
        return divisionList;
    }

    public void setDivisionList(List<Division> divisionList) {
        this.divisionList = divisionList;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    public List<Upazila> getUpazilaList() {
        return upazilaList;
    }

    public void setUpazilaList(List<Upazila> upazilaList) {
        this.upazilaList = upazilaList;
    }

    public List<Union> getUnionList() {
        return unionList;
    }

    public void setUnionList(List<Union> unionList) {
        this.unionList = unionList;
    }

    public List<Office> getOfficeList() {
        return officeList;
    }

    public void setOfficeList(List<Office> officeList) {
        this.officeList = officeList;
    }

    public List<Pauroshoba> getPauroshobaList() {
        return pauroshobaList;
    }

    public void setPauroshobaList(List<Pauroshoba> pauroshobaList) {
        this.pauroshobaList = pauroshobaList;
    }

    public List<Ward> getWardList() {
        return wardList;
    }

    public void setWardList(List<Ward> wardList) {
        this.wardList = wardList;
    }

    public List<CityCorporation> getCityCorporationList() {
        return cityCorporationList;
    }

    public void setCityCorporationList(List<CityCorporation> cityCorporationList) {
        this.cityCorporationList = cityCorporationList;
    }

    public List<OfficeType> getOfficeTypeList() {
        return officeTypeList;
    }

    public void setOfficeTypeList(List<OfficeType> officeTypeList) {
        this.officeTypeList = officeTypeList;
    }

    public List<Designation> getDesignationList() {
        return designationList;
    }

    public void setDesignationList(List<Designation> designationList) {
        this.designationList = designationList;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }
}
