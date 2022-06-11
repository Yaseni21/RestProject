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


    public static final Item[] MainMeals = {
            new Item("Pizza" , 3 , "MainMeals " , R.drawable.pizza),
            new Item("Burger" , 3 , "MainMeals" , R.drawable.burger),
                    new Item("Spaghetti" , 3 , "MainMeals" , R.drawable.spaghiti),
                    new Item("Fettuccine " , 3 , "MainMeals" , R.drawable.fuchini),
                    new Item("Cheese sandwich " , 3 , "MainMeals" , R.drawable.chees),
                    new Item("Vegetable sandwich " , 3 , "MainMeals" , R.drawable.vegeta),
                    new Item("Shrimp with rice " , 3 , "MainMeals" , R.drawable.shrimp)
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
