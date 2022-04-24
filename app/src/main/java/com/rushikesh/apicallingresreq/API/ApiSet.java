package com.rushikesh.apicallingresreq.API;

import com.rushikesh.apicallingresreq.Model.UserLIst;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiSet {

    @GET("users?page=2")
    Call<UserLIst> getUserList();

}
