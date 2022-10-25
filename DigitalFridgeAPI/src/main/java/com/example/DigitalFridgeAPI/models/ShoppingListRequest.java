package com.example.DigitalFridgeAPI.models;

import javax.naming.Name;

public class ShoppingListRequest {

    private String name;

    public ShoppingListRequest(String name) {
        this.name = name;
    }

    public ShoppingListRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
