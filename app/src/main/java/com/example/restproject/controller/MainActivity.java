package com.example.restproject.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restproject.R;

public class MainActivity extends AppCompatActivity {
    //test for pushing
    private static final String EXTRA_MESSAGE = "";
    private static final String customers = "test test";
    EditText usernameEditText, passwordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void createNewClick2(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
       Intent intent = new Intent(this , CategoriesActivity.class);
       startActivity(intent);
    }

//public void login(View view) {
//    Intent intent = new Intent(this , HomeActivity.class);
//    startActivity(intent);
//}
}
