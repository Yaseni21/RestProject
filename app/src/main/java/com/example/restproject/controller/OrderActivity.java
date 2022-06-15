package com.example.restproject.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restproject.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class OrderActivity extends AppCompatActivity {
    ImageView img;
    TextView nameTxt;
    TextView priceTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderinfo);
        img = findViewById(R.id.imageIteam);
        nameTxt = findViewById(R.id.iteamName);
        priceTxt = findViewById(R.id.iteamPrice);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
       // String image = intent.getStringExtra("image");
//        Bundle bundle = this.getIntent().getExtras();
//        int pic = bundle.getInt("image");
        nameTxt.setText(name);
        priceTxt.setText(price);
        //img.setImageResource(pic);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.MyOrder);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Home:
                        startActivity(new Intent(getApplicationContext(),CategoriesActivity.class));
                        overridePendingTransition(0,0);
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
                        return true;
                }
                return false;
            }
        });
    }
}