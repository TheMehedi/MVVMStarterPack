package com.themehedi.mvvmstarterpack.repository;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.themehedi.mvvmstarterpack.model.responseModel.CommonDropdownResponse;
import com.themehedi.mvvmstarterpack.model.responseModel.FakeUsersResponse;
import com.themehedi.mvvmstarterpack.network.ApiClient;
import com.themehedi.mvvmstarterpack.network.ApiInterface;
import com.themehedi.mvvmstarterpack.network.BaseUrl;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class UsersRepository {

    private static final String TAG = UsersRepository.class.getSimpleName();

    public LiveData<CommonDropdownResponse> getUsersList() {
        final MutableLiveData<CommonDropdownResponse> mutableLiveData = new MutableLiveData<>();

        ApiInterface getApiCallInstance = new ApiClient().getApiClient(BaseUrl.URL).create(ApiInterface.class);
        Call<CommonDropdownResponse> apiCall = getApiCallInstance.getCommonDropdownList();

        apiCall.enqueue(new Callback<CommonDropdownResponse>() {
            @Override
            public void onResponse(@NonNull Call<CommonDropdownResponse> call, @NonNull Response<CommonDropdownResponse> response) {
                String responseCode = String.valueOf(response.code());
                Log.d(TAG, responseCode);
                Log.e("responseCodeLogin", responseCode);
                CommonDropdownResponse supplierInfoResponse;
                if (response.isSuccessful()) {
                    if (response.code()==200){
                        supplierInfoResponse=response.body();
                        mutableLiveData.setValue(supplierInfoResponse);
                    }

                } else {
                    mutableLiveData.setValue(null);
                }
            }

            @Override
            public void onFailure(@NonNull Call<CommonDropdownResponse> call, @NonNull Throwable t) {
                Log.e("error", t.getMessage());
            }
        });



        return mutableLiveData;
    }
}
