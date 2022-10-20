package com.example.DigitalFridgeAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//@Entity is a table named = "..." :
@Entity(name= "food_items")
public class FoodItem {

    //    PROPERTIES:::::::::::::;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Enum foodGroup;

    @Column
    private int expiryDate;

    @Column
    private float quantity; //To allow decimals of e.g. 3.5 ml

    @Column
    private boolean isExpired;

//    @ManyToMany

    //@JsonIgnoreProperties TO AVOID INFINITE dependencies LOOP ISSUE.
    @JsonIgnoreProperties({"food_items"})

    //    CONSTRUCTOR::::::::::

    public FoodItem(String name, Enum foodGroup, int expiryDate, float quantity, boolean isExpired) {
        this.name = name;
        this.foodGroup = foodGroup;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.isExpired = isExpired;

    }

    // no arg constructor/ empty constructor
    public FoodItem() {

    }

    //GETTERS + SETTERS ::::::::::::::

    //For the id property:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //For the Name Property:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //For the FoodGroup Property:
    public Enum getFoodGroup() {
        return foodGroup;
    }

    public void setFoodGroup(Enum foodGroup) {
        this.foodGroup = foodGroup;
    }

}