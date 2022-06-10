package com.example.restproject.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restproject.R;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
       // Intent intent = getIntent();
    }

//    public void onClickSaladsBtn(View view){
//        Intent intent = new Intent(this, SaladsActivity.class);
//        startActivity(intent);
//    }
    public void onClickHotDrinksBtn(View view){
        Intent intent = new Intent(this, HotDrinksAvtivity.class);
        startActivity(intent);
    }
    public void onClickColdDrinksBtn(View view){
        Intent intent = new Intent(this, ColdDrinksActivity.class);
        startActivity(intent);
    }
//    public void onClickMealsBtn(View view){
//        Intent intent = new Intent(this, MealsActivity.class);
//        startActivity(intent);
//    }
//    public void onClickDessertBtn(View view){
//        Intent intent = new Intent(this, DessertActivity.class);
//        startActivity(intent);
//    }

}
