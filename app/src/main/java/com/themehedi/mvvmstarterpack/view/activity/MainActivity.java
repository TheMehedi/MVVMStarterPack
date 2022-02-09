package com.themehedi.mvvmstarterpack.view.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.themehedi.mvvmstarterpack.R;
import com.themehedi.mvvmstarterpack.adapter.FakeUsersAdapter;
import com.themehedi.mvvmstarterpack.databinding.ActivityMainBinding;
import com.themehedi.mvvmstarterpack.helper.BaseActivity;
import com.themehedi.mvvmstarterpack.helper.ConnectionDetector;
import com.themehedi.mvvmstarterpack.helper.ItemClickListener;
import com.themehedi.mvvmstarterpack.model.dataModel.Division;
import com.themehedi.mvvmstarterpack.model.dataModel.Divisions;
import com.themehedi.mvvmstarterpack.model.responseModel.CommonDropdownResponse;
import com.themehedi.mvvmstarterpack.room.Room;
import com.themehedi.mvvmstarterpack.viewmodel.UserViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements ItemClickListener {

    ActivityMainBinding binding;
    ConnectionDetector cd;
    boolean isInternetAvailable = false;
    ProgressDialog dialog;

    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        cd = new ConnectionDetector(MainActivity.this);
        isInternetAvailable = cd.isConnectingToInternet();
        dialog = new ProgressDialog(MainActivity.this);

        if (isInternetAvailable) {
            try {
                userViewModel.getUsersListLiveData().observe(this, commonDropdownResponse -> {

                    if (commonDropdownResponse.getSuccess()){
                        //                Toast.makeText(ServiceWhomeActivity.this, "onChanged success!", Toast.LENGTH_SHORT).show();

                        List<Divisions> divisionsList = new ArrayList<>();

                        for (int i = 0; i< commonDropdownResponse.getData().getDivisionList().size(); i++){

                            Division division = commonDropdownResponse.getData().getDivisionList().get(i);
                            divisionsList.add(new Divisions(division.getValue(),division.getTextEn(), division.getTextBn(), division.getStatus()));

                        }


                        Room.getInstance(MainActivity.this).moaDao().insertAllDivision(divisionsList);

                        FakeUsersAdapter fakeUsersAdapter = new FakeUsersAdapter( MainActivity.this,MainActivity.this,Room.getInstance(MainActivity.this).moaDao().getAllDivision());
                        //                int resId = R.anim.layout_animation_left_right;
                        //                LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(this, resId);
                        //                binding.recyclerView.setLayoutAnimation(animation);

                        binding.recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 1, LinearLayoutManager.VERTICAL, false));
                        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
                        binding.recyclerView.setAdapter(fakeUsersAdapter);
//                    dialog.dismiss();


                    }else {
                        Toast.makeText(MainActivity.this, "onChanged failed!", Toast.LENGTH_SHORT).show();
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            createInternetAlert();
        }


    }

    private void createInternetAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(
                R.string.Your_internet_is_disconnected)
                .setCancelable(false).setPositiveButton(R.string.Enable_internet,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        startActivityForResult(new Intent(Settings.ACTION_SETTINGS), 0);
                    }
                });
        builder.setNegativeButton(R.string.Do_nothing,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


    @Override
    public void onItemClick(int position) {

    }
}