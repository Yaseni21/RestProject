package com.example.restproject.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restproject.R;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
//        String[] names = new String[Item.Desseerts.length];
//        int[] prices = new int[Item.Desseerts.length];
//        int[] ids = new int[Item.Desseerts.length];
//
//
//
//        for (int i = 0 ; i < names.length ; i++){
//            names[i] = Item.Desseerts[i].getItemName();
//            prices[i] = Item.Desseerts[i].getItemPrice();
//            ids[i] = Item.Desseerts[i].getItemImage();
//
//
//        }
//        recycler.setLayoutManager(new GridLayoutManager(this , 2));
//        recycler.setLayoutManager(new GridLayoutManager(this,2));
//        CaptionImageAdapter adapter = new CaptionImageAdapter(names , prices , ids);
//        recycler.setAdapter(adapter);
    }
}