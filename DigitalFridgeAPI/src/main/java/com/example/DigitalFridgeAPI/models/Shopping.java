package com.example.DigitalFridgeAPI.models;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "shopping_lists")
    public class Shopping {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

    @Column
    private String name;

        @OneToOne(mappedBy = "shopping_list")
        private Fridge fridge;

    @OneToMany(mappedBy = "shopping_list")
    Set<ShoppingListItem> quantity;

//    @OneToMany(mappedBy = "shopping_list")
//    Set<ShoppingListItem> shop;

    //to paste  into food item




}
