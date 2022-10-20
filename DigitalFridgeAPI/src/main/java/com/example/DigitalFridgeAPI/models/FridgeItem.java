package com.example.DigitalFridgeAPI.models;


import javax.persistence.*;

@Entity(name = "fridge_item")
public class FridgeItem {

    @EmbeddedId
    private FridgeItemCompositeKey id = new FridgeItemCompositeKey();

    @ManyToOne
    @MapsId("fridge_id")
    @JoinColumn(name = "fridge_id")
    private Fridge Fridge;

    @ManyToOne
    @MapsId("food_item_id")
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;

    private Long expiryDate;

    private Float quantity;





}
