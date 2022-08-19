package com.ista.ussingservices.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestAdapter {

    private static Retrofit retrofit;

    public static Retrofit getRestEngine() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.fruityvice.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
