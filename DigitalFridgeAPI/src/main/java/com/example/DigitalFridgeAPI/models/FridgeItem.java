package com.example.DigitalFridgeAPI.models;


import javax.persistence.*;

@Entity(name = "fridge_items")
public class FridgeItem {

    @EmbeddedId
//    @Column (name = "fridge_item_id")
    private FridgeItemCompositeKey id;
//    private FridgeItemCompositeKey id = new FridgeItemCompositeKey();

    //JOIN TO FRIDGE
    @ManyToOne
    @MapsId("fridge_id")
    @JoinColumn(name = "fridge_id")
    private Fridge fridge;

    //JOIN TO FOOD ITEM
    @ManyToOne
    @MapsId("food_item_id")
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;

    //ADDITIONAL PROPERTIES
    @Column(name = "is_expired")
    private boolean isExpired;

    @Column(name = "expiry_date")
    private Long expiryDate;

    @Column(name = "quantity")
    private Float quantity;

    //CONSTRUCTOR
    public FridgeItem(FridgeItemCompositeKey id, Fridge fridge, FoodItem foodItem, Long expiryDate, Float quantity, Boolean isExpired) {
        this.id = id;
        this.fridge = fridge;
        this.foodItem = foodItem;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.isExpired = isExpired;
    }

    public FridgeItem() {
    }

    public FridgeItemCompositeKey getId() {
        return id;
    }

    public void setId(FridgeItemCompositeKey id) {
        this.id = id;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public Long getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Long expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

}
