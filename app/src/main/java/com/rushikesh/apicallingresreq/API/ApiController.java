package com.rushikesh.apicallingresreq.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController
{
    private static final String BASE_URL="https://reqres.in/api/";
    public static ApiController client;
    public static Retrofit retrofit;

    public ApiController() {
        retrofit =new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized ApiController getInstance()
    {
        if (client==null)
            client = new ApiController();
        return client;
    }

    public ApiSet getApi()
    {
        return retrofit.create(ApiSet.class);
    }
}
