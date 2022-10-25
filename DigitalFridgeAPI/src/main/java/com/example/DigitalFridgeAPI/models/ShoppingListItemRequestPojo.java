package com.example.DigitalFridgeAPI.models;

public class ShoppingListItemRequestPojo {

    private Integer quantity;

    public ShoppingListItemRequestPojo(Integer quantity) {
        this.quantity = quantity;
    }

    public ShoppingListItemRequestPojo() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
