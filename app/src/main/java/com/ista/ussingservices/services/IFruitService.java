package com.ista.ussingservices.services;

import com.ista.ussingservices.models.Fruit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface IFruitService {

    @GET("api/fruit/all")
    Call<List<Fruit>> listFruits();

}
