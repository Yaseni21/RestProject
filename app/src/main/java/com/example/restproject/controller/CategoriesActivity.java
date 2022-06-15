package com.example.restproject.controller;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.toolbox.JsonArrayRequest;
import com.example.restproject.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
       // Intent intent = getIntent();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.Home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Home:
                        return true;
                    case R.id.LogOut:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.AboutUs:
                        startActivity(new Intent(getApplicationContext(),aboutActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.MyOrder:
                        startActivity(new Intent(getApplicationContext(),OrderListActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    public void onClicksaladsBtn(View view){
        Intent intent = new Intent(this, SaladsActivity.class);

        startActivity(intent);
    }
    public void onClickHotDrinksBtn(View view){
        Intent intent = new Intent(this, HotDrinksAvtivity.class);
        startActivity(intent);
    }
    public void onClickColdDrinksBtn(View view){
        Intent intent = new Intent(this, ColdDrinksActivity.class);
        startActivity(intent);
    }
    public void onClickMealBtn(View view){
        Intent intent = new Intent(this, MainMealsActivity.class);
        startActivity(intent);
    }
    public void onClickDessertBtn(View view){
        Intent intent = new Intent(this, DessertActivity.class);
        startActivity(intent);
    }



}
