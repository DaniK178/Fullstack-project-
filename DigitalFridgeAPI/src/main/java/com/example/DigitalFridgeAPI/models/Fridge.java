package com.example.DigitalFridgeAPI.models;


import com.example.DigitalFridgeAPI.services.FoodItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "fridges")
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "fridge")
    Set<FridgeItem> expiryDate;

    @OneToMany(mappedBy = "fridge")
    Set<FridgeItem> quantity;
    //to paste  into food item



   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shopping_id", referencedColumnName = "id")
    private List<Shopping> shoppingList;



   private List<FoodItem> ReminderItems;






}
