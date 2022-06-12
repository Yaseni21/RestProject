package com.example.restproject.controller;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.restproject.R;
import com.example.restproject.controller.Item;

import java.util.List;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CaptionImageAdapter
        extends RecyclerView.Adapter<CaptionImageAdapter.ViewHolder>{
    private Context context;
    private List<DBItem> items;


    public CaptionImageAdapter(Context context, List<DBItem> items){
        this.context = context;
        this.items = items;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_image,
                parent,
                false);



        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final DBItem item = items.get(position);
        CardView cardView = holder.cardView;
//        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
//        Glide.with(context).load(item.getItemImage()).into(imageView);
        TextView txt = (TextView)cardView.findViewById(R.id.txtName);
        txt.setText(item.getItemName());
        TextView txt1 = (TextView)cardView.findViewById(R.id.txtPrice) ;
        txt1.setText(item.getItemPrice());
        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}

