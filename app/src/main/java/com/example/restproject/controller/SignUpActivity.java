package com.example.restproject.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restproject.R;
import com.example.restproject.controller.EmployeeRegisterActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void employeeSignClick(View view) {
        Intent intent = new Intent(this, EmployeeRegisterActivity.class);
        startActivity(intent);
    }

    public void goToLogInClick(View view) {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}
