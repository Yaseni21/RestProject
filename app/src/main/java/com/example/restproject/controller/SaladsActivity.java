package com.example.restproject.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restproject.R;

public class SaladsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
        // Item it = new Item();
        String[] names = new String[Item.salads.length];
        int[] prices = new int[Item.salads.length];
        int[] ids = new int[Item.salads.length];



        for (int i = 0 ; i < names.length ; i++){
            names[i] = Item.salads[i].getItemName();
            prices[i] = Item.salads[i].getItemPrice();
            ids[i] = Item.salads[i].getItemImage();


        }
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        CaptionImageAdapter adapter = new CaptionImageAdapter(names , prices , ids);
        recycler.setAdapter(adapter);
    }

}