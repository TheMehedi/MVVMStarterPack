package com.themehedi.mvvmstarterpack.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.themehedi.mvvmstarterpack.model.responseModel.CommonDropdownResponse;
import com.themehedi.mvvmstarterpack.model.responseModel.FakeUsersResponse;
import com.themehedi.mvvmstarterpack.repository.UsersRepository;

import java.util.List;


public class UserViewModel extends ViewModel {
    private final UsersRepository usersRepository;

    public UserViewModel() {
        usersRepository = new UsersRepository();
    }

    public LiveData<CommonDropdownResponse> getUsersListLiveData() {
        return usersRepository.getUsersList();
    }

}