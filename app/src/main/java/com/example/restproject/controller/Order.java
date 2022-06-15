package com.example.restproject.controller;

public class Order {

    private DBItem item;

    public Order(DBItem item) {
        this.item = item;
    }

    public DBItem getItem() {
        return item;
    }

    public void setItem(DBItem item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                '}';
    }
}
