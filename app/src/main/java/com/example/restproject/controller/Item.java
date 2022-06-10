package com.example.restproject.controller;

import com.example.restproject.R;

public class Item {
    private String itemName;
    private int itemPrice;
    private String itemCategory;
    private int itemImage;

    public static final Item[] coldDrinks = {
            new Item("Cola" , 3 , "Cold Drinks" , R.drawable.cola),
            new Item("Water" , 3 , "Cold Drinks" , R.drawable.water),
            new Item("Sprite" , 3 , "Cold Drinks" , R.drawable.sprite),
            new Item("Fanta" , 3 , "Cold Drinks" , R.drawable.fanta)
    };

    public static final Item[] hotDrinks = {
            new Item("Coffee" , 3 , "Hot Drinks" , R.drawable.coffee),
            new Item("Tea" , 3 , "Hot Drinks" , R.drawable.tea),
            new Item("Lattee" , 3 , "Hot Drinks" , R.drawable.latte),
            new Item("Espresso" , 3 , "Hot Drinks" , R.drawable.espresso)
    };

    public Item(String itemName, int itemPrice, String itemCategory, int itemImage) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemCategory='" + itemCategory + '\'' +
                ", itemImage='" + itemImage + '\'' +
                '}';
    }
}
