package com.rushikesh.apicallingresreq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.rushikesh.apicallingresreq.API.ApiController;
import com.rushikesh.apicallingresreq.Model.Data;
import com.rushikesh.apicallingresreq.Model.UserLIst;
import com.rushikesh.apicallingresreq.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Data> dataList;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getUserData();

    }

    private void getUserData() {

        Call<UserLIst> call =ApiController.getInstance().getApi().getUserList();

        call.enqueue(new Callback<UserLIst>() {
            @Override
            public void onResponse(Call<UserLIst> call, Response<UserLIst> response) {
                if (response.isSuccessful()){

//                    assert response.body() != null;
//                    dataList = response.body().getData();
//                    binding.fName.setText(dataList.get(0).getFirstName().toString());
//                    binding.lName.setText(dataList.get(0).getLastName().toString());
//                    binding.email.setText(dataList.get(0).getEmail().toString());

                    binding.fName.setText(response.body().getSupport().getText());
                    binding.lName.setText(response.body().getSupport().getUrl());


                }else {
                    Toast.makeText(getApplicationContext(), "Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UserLIst> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Please Try Again", Toast.LENGTH_SHORT).show();
            }
        });

    }
}