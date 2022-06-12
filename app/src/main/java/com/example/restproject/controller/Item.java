package com.example.restproject.controller;

public class Item {
    private String itemName;
    private String itemPrice;
    private String itemCategory;
    private String itemImage;

    public static final Item[] coldDrinks = {
            new Item("Cola" , "3" , "Cold Drinks" , "R.drawable.cola"),
            new Item("Water" , "3" , "Cold Drinks" , "R.drawable.water"),
            new Item("Sprite" , "3" , "Cold Drinks" , "R.drawable.sprite"),
            new Item("Fanta" , "3" , "Cold Drinks" , "R.drawable.fanta")
    };

    public static final Item[] hotDrinks = {
            new Item("Coffee", "3", "Hot Drinks", "R.drawable.coffee"),
            new Item("Tea", "3", "Hot Drinks", "R.drawable.tea"),
            new Item("Lattee", "3", "Hot Drinks", "R.drawable.latte"),
            new Item("Espresso", "3", "Hot Drinks", "R.drawable.espresso")
    };

    public static final Item[] Salads = {
            new Item("Caeser Salad" , "3" , "Salads" , "R.drawable.caesar_salad"),
            new Item("Tabbouleh" , "3" , "Salads" , "R.drawable.tabbouleh"),
            new Item("Green Salad" , "3" , "Salads" , "R.drawable.green_salad"),
            new Item("Pasta Salad" , "3" , "Salads" , "R.drawable.pasta_salad")
    };

    public static final Item[] Desseerts = {
            new Item("Macron" , "3" , "Desserts" , "R.drawable.macrons"),
            new Item("Cookies" , "3" , "Desserts" , "R.drawable.cookies"),
            new Item("Cheese cake" , "3" , "Desserts" , "R.drawable.cheesecake"),
            new Item("Chocolate cake" , "3" , "Desserts" , "R.drawable.chocolatecake"),
            new Item("Brownies" , "3" , "Desserts" , "R.drawable.brownies")
    };

    public static final Item[] MainMeals = {
                    new Item("Pizza" , "3" , "MainMeals " , "R.drawable.pizza"),
                    new Item("Burger" , "3" , "MainMeals" , "R.drawable.burger"),
                    new Item("Spaghetti" , "3" , "MainMeals" , "R.drawable.spaghiti"),
                    new Item("Fettuccine " , "3" , "MainMeals" , "R.drawable.fuchini"),
                    new Item("Cheese sandwich " , "3" , "MainMeals" , "R.drawable.chees"),
                    new Item("Vegetable sandwich " , "3" , "MainMeals" , "R.drawable.vegeta"),
                    new Item("Shrimp with rice " , "3" , "MainMeals" , "R.drawable.shrimp")
    };

    public Item(String itemName, String itemPrice, String itemCategory, String itemImage) {
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

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
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
