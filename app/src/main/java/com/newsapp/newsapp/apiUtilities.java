package com.newsapp.newsapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiUtilities {

    public static Retrofit retrofit = null;

    public static ApiInterface getApiInterface(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }

}
