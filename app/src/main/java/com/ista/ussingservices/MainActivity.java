package com.ista.ussingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ista.ussingservices.models.Fruit;
import com.ista.ussingservices.services.FruitService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private FruitService service;
    private ListView lv_fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_fruits = findViewById(R.id.lv_Fruits);
        service = new FruitService();
        listAll();
    }

    private void fillListView(List<Fruit> fruits) {
        ArrayAdapter everyone = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, fruits);
        lv_fruits.setAdapter(everyone);
    }

    public void listAll() {
        Call<List<Fruit>> fruits = service.listAll();
        fruits.enqueue(new Callback<List<Fruit>>() {
            @Override
            public void onResponse(Call<List<Fruit>> call, Response<List<Fruit>> response) {
                List<Fruit> fr = response.body();
                fillListView(fr);
                Toast.makeText(MainActivity.this, "Petiocio exitosa", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Fruit>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Fallo", Toast.LENGTH_SHORT).show();
            }
        });
    }

}