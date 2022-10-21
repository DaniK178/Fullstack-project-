package com.example.DigitalFridgeAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "fridges")
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;

    //Fridge Item JOIN Table
    @OneToMany(mappedBy = "fridge")
    Set<FridgeItem> expiryDate;
    @OneToMany(mappedBy = "fridge")
    Set<FridgeItem> quantity;

    //Fridge - Shopping list JOIN
   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shopping_id", referencedColumnName = "id")
   private ShoppingList shoppingList;


   @JsonIgnore
    @ManyToMany
    @JoinTable(
            name ="users_fridges",
            joinColumns = {@JoinColumn(name="fridge_id",nullable = false)},
            inverseJoinColumns = {@JoinColumn(name="user_id",nullable = false)})
    //@JsonIgnoreProperties({"fridges"})
    private List<User> fridgeUsers;

    // LISTS FOR FRIDGE ITEMS
   @Column
   private List<FridgeItem> reminderItems;

    @Column
    private List<FridgeItem> fridgeItems;

   //CONSTRUCTORS


    public Fridge(String name) {
        this.name = name;
        this.shoppingList = null;
        this.reminderItems = new ArrayList<>();
        this.fridgeItems = new ArrayList<>();
        this.fridgeUsers = new ArrayList<>();
    }

    public Fridge() {
    }

    //Getters and Setters

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

    public Set<FridgeItem> getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Set<FridgeItem> expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Set<FridgeItem> getQuantity() {
        return quantity;
    }

    public void setQuantity(Set<FridgeItem> quantity) {
        this.quantity = quantity;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    public List<FridgeItem> getReminderItems() {
        return reminderItems;
    }

    public void setReminderItems(List<FridgeItem> reminderItems) {
        this.reminderItems = reminderItems;
    }

    public List<User> getFridgeUsers() {
        return fridgeUsers;
    }

    public void setFridgeUsers(List<User> fridgeUsers) {
        this.fridgeUsers = fridgeUsers;
    }

    public List<FridgeItem> getFridgeItems() {
        return fridgeItems;
    }

    public void setFridgeItems(List<FridgeItem> fridgeItems) {
        this.fridgeItems = fridgeItems;
    }
}
