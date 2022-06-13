package com.example.restproject.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.restproject.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DessertActivity extends AppCompatActivity {

    private static  final String BASE_URL = "http://10.0.2.2:80/rest/item.php?cat=Desserts";
    private List<DBItem> items = new ArrayList<>();
    private RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        recycler =  findViewById(R.id.recycler);

        recycler.setLayoutManager(new GridLayoutManager(this , 2 ));
        loadItems();
    }
    private void loadItems() {

        StringRequest stringRequest = new StringRequest(Request.Method.GET, BASE_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {

                            JSONArray array = new JSONArray(response);
                            for (int i = 0; i<array.length(); i++){

                                JSONObject object = array.getJSONObject(i);

                                String name = object.getString("i_name");
                                String image = object.getString("i_image");
                                int itemPrice = Integer.parseInt(object.getString("i_price"));
                                String itemCategory = object.getString("i_category");




                                DBItem item = new DBItem(name,itemPrice, itemCategory, image);
                                Toast.makeText(DessertActivity.this, item.toString(),Toast.LENGTH_LONG).show();
                                System.out.println(item);
                                items.add(item);
                            }

                        }catch (Exception e){

                        }

                        CaptionImageAdapter adapter = new CaptionImageAdapter(DessertActivity.this,
                                items);
                        recycler.setAdapter(adapter);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                System.out.println(error.toString());
                Toast.makeText(DessertActivity.this, error.toString(),Toast.LENGTH_LONG).show();

            }
        });

        Volley.newRequestQueue(DessertActivity.this).add(stringRequest);

    }
}