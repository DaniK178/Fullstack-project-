package com.example.DigitalFridgeAPI.models;

public class ShoppingListRequestPojo {

    private Integer quantity;

    public ShoppingListRequestPojo(Integer quantity) {
        this.quantity = quantity;
    }

    public ShoppingListRequestPojo() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
