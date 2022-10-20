package com.example.DigitalFridgeAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//@Entity is a table named = "..." :
@Entity(name= "foodItems")
public class FoodItem {

    //    PROPERTIES:::::::::::::;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Enum FoodGroup;

    @Column
    private int ExpiryDate;

    @Column
    private float Quantity; //To allow decimals of e.g. 3.5 ml

    @Column
    private boolean isExpired;

//    @ManyToMany

    //@JsonIgnoreProperties TO AVOID INFINITE dependencies LOOP ISSUE.
    @JsonIgnoreProperties({"foodItems"})

    //    CONSTRUCTOR::::::::::

    public FoodItem(String name, Enum foodGroup, int expiryDate, float quantity, boolean isExpired) {
        this.name = name;
        FoodGroup = foodGroup;
        ExpiryDate = expiryDate;
        Quantity = quantity;
        this.isExpired = isExpired;

    }

    // no arg constructor/ empty constructor
    public FoodItem(){

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
        return FoodGroup;
    }

    public void setFoodGroup(Enum foodGroup) {
        FoodGroup = foodGroup;
    }

    //For the ExpiryDate Property:
    public int getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        ExpiryDate = expiryDate;
    }

    //For the Quantity Property:
    public float getQuantity() {
        return Quantity;
    }

    public void setQuantity(float quantity) {
        Quantity = quantity;
    }

    //For the isExpired property
    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}






