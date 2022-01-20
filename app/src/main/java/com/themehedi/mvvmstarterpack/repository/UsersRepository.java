package com.themehedi.mvvmstarterpack.repository;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

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

    public LiveData<List<FakeUsersResponse>> getUsersList() {
        final MutableLiveData<List<FakeUsersResponse>> mutableLiveData = new MutableLiveData<>();

        ApiInterface getApiCallInstance = new ApiClient().getApiClient(BaseUrl.URL).create(ApiInterface.class);
        Call<List<FakeUsersResponse>> apiCall = getApiCallInstance.getUsersList();

        apiCall.enqueue(new Callback<List<FakeUsersResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<FakeUsersResponse>> call, @NonNull Response<List<FakeUsersResponse>> response) {
                String responseCode = String.valueOf(response.code());
                Log.d(TAG, responseCode);
                Log.e("responseCodeLogin", responseCode);
                List<FakeUsersResponse> supplierInfoResponse;
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
            public void onFailure(@NonNull Call<List<FakeUsersResponse>> call, @NonNull Throwable t) {
                Log.e("error", t.getMessage());
            }
        });



        return mutableLiveData;
    }
}
