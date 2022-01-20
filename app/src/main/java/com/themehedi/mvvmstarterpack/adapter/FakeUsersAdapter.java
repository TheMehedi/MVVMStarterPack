package com.themehedi.mvvmstarterpack.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.themehedi.mvvmstarterpack.R;
import com.themehedi.mvvmstarterpack.databinding.UserItemBinding;
import com.themehedi.mvvmstarterpack.helper.ItemClickListener;
import com.themehedi.mvvmstarterpack.model.responseModel.FakeUsersResponse;

import java.util.List;


public class FakeUsersAdapter extends RecyclerView.Adapter<FakeUsersAdapter.ViewHolder>{
    private final Context context;
    Activity mActivity;
    private final List<FakeUsersResponse> dataModel;
    ItemClickListener clickListener;
//    PrefManager prefManager;


    public FakeUsersAdapter(Context context, Activity mActivity, List<FakeUsersResponse> dataModel) {
        this.context = context;
        this.mActivity=mActivity;
        this.dataModel = dataModel;
//        this.prefManager=new PrefManager(mActivity);

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.user_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        FakeUsersResponse data = dataModel.get(position);

        holder.binding.nameTv.setText(data.getName());
        holder.binding.companyTv.setText(data.getCompany().getName());
        holder.binding.emailTv.setText(data.getEmail());
        holder.binding.phoneTv.setText(data.getPhone());
        holder.binding.websiteTv.setText(data.getWebsite());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }

    @Override
    public int getItemCount() {
       /* if (GlobalData.isOpenMainTabsLink){
            return dataModel.size();
        }else {
            if (dataModel.size()>6){
                return 6;
            }
        }*/

        Log.i("recyclerSize", " " + dataModel.size());
        return dataModel.size();
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        clickListener = itemClickListener;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        UserItemBinding binding;

        ViewHolder(UserItemBinding layoutBinding) {
            super(layoutBinding.getRoot());
            binding = layoutBinding;
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) clickListener.onItemClick(getAdapterPosition());
        }

    }

}