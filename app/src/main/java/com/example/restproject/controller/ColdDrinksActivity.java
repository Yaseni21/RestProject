package com.example.restproject.controller;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restproject.R;

public class ColdDrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
       // Item it = new Item();
        String[] names = new String[Item.coldDrinks.length];
        int[] prices = new int[Item.coldDrinks.length];
        int[] ids = new int[Item.coldDrinks.length];



        for (int i = 0 ; i < names.length ; i++){
           names[i] = Item.coldDrinks[i].getItemName();
            prices[i] = Item.coldDrinks[i].getItemPrice();
            ids[i] = Item.coldDrinks[i].getItemImage();


        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionImageAdapter adapter = new CaptionImageAdapter(names , prices , ids);
        recycler.setAdapter(adapter);
    }
}
