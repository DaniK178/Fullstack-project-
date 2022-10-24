package com.example.DigitalFridgeAPI.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "shopping_lists")
    public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;

    //Fridge to Shopping List -JOIN
    @OneToOne(mappedBy = "shoppingList")
    private Fridge fridge;

    //Shopping List Item - JOIN TABLE
    @OneToMany(mappedBy = "shoppingList")
    Set<ShoppingListItem> shoppingListItems;
    // to paste into Food Item


    public ShoppingList(String name, Fridge fridge) {
        this.name = name;
        this.fridge = fridge;
        this.shoppingListItems= new HashSet<>();

    }

    public ShoppingList() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public Set<ShoppingListItem> getShoppingListItems() {
        return shoppingListItems;
    }

    public void setShoppingListItems(Set<ShoppingListItem> shoppingListItems) {
        this.shoppingListItems = shoppingListItems;
    }
}
