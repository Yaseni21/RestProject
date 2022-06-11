package com.example.restproject.controller;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restproject.R;

public class CaptionImageAdapter
        extends RecyclerView.Adapter<CaptionImageAdapter.ViewHolder> {
    private String[] names;
    private int[] prices;
    private int[] ids;

    public CaptionImageAdapter(String[] names, int[] prices, int[] ids) {
        this.names = names;
        this.prices = prices;
        this.ids = ids;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { // build Card view as object
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_image,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext() , ids[position]);

        imageView.setImageDrawable(dr);

        TextView txt = (TextView)cardView.findViewById(R.id.txtName);
        txt.setText(names[position]);

        TextView txt1 = (TextView)cardView.findViewById(R.id.txtPrice);
        txt1.setText("price: " + prices[position]);

    }






    @Override
    public int getItemCount() {
        return names.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
            private CardView cardView;
        public ViewHolder(@NonNull CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }
    }


}
