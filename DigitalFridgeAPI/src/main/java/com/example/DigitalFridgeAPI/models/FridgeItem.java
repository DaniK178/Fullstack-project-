package com.example.DigitalFridgeAPI.models;


import javax.persistence.*;

@Entity(name = "fridge_items")
public class FridgeItem {

    @EmbeddedId
    private FridgeItemCompositeKey id;
//    private FridgeItemCompositeKey id = new FridgeItemCompositeKey();

    @ManyToOne
    @MapsId("fridge_id")
    @JoinColumn(name = "fridge_id")
    private Fridge fridge;

    @ManyToOne
    @MapsId("food_item_id")
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;

    private Long expiryDate;

    private Float quantity;

    public FridgeItem(FridgeItemCompositeKey id, com.example.DigitalFridgeAPI.models.Fridge fridge, FoodItem foodItem, Long expiryDate, Float quantity) {
        this.id = id;
        this.fridge = fridge;
        this.foodItem = foodItem;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public FridgeItemCompositeKey getId() {
        return id;
    }

    public void setId(FridgeItemCompositeKey id) {
        this.id = id;
    }

    public com.example.DigitalFridgeAPI.models.Fridge getFridge() {
        return fridge;
    }

    public void setFridge(com.example.DigitalFridgeAPI.models.Fridge fridge) {
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

}
