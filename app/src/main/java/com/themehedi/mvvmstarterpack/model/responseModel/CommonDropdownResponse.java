package com.themehedi.mvvmstarterpack.model.responseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.themehedi.mvvmstarterpack.model.dataModel.CommonDropdownData;

public class CommonDropdownResponse {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private CommonDropdownData data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public CommonDropdownData getData() {
        return data;
    }

    public void setData(CommonDropdownData data) {
        this.data = data;
    }
}
