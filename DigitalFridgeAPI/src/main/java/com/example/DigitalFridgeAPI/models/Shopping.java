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
    // to paste into Food Item


    public Shopping(long id, String name, Fridge fridge, Set<ShoppingListItem> quantity) {
        this.id = id;
        this.name = name;
        this.fridge = fridge;
        this.quantity = quantity;
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

    public Set<ShoppingListItem> getQuantity() {
        return quantity;
    }

    public void setQuantity(Set<ShoppingListItem> quantity) {
        this.quantity = quantity;
    }
}
