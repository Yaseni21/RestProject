package com.example.restproject.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.restproject.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class OrderListActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_listview);


        ArrayAdapter   listAdapter = new ArrayAdapter<Item>(this,
                android.R.layout.simple_list_item_1,
                Item.Salads);

        ListView listView = (ListView)findViewById(R.id.order_list);
        listView.setAdapter(listAdapter);

    }
}
