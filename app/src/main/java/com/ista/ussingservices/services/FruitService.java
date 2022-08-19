package com.ista.ussingservices.services;

import com.ista.ussingservices.models.Fruit;

import java.util.List;

import retrofit2.Call;


public class FruitService {

    private IFruitService fruitService;

    public Call<List<Fruit>> listAll() {
        fruitService = RestAdapter.getRestEngine().create(IFruitService.class);
        Call<List<Fruit>> fruits = fruitService.listFruits();
        return fruits;
    }

}
