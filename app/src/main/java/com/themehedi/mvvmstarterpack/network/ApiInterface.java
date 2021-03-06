package com.themehedi.mvvmstarterpack.network;

import com.themehedi.mvvmstarterpack.model.responseModel.CommonDropdownResponse;
import com.themehedi.mvvmstarterpack.model.responseModel.FakeUsersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    //https://jsonplaceholder.typicode.com/users

    @GET("external-user-dropdowns")
    Call<CommonDropdownResponse> getCommonDropdownList();

}
