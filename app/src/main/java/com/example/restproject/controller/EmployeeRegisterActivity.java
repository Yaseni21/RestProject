package com.example.restproject.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restproject.R;

public class EmployeeRegisterActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_register);
    }

    public void mainSignClick(View view) {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }

    public void SignUpClick(View view) {

    }
}
