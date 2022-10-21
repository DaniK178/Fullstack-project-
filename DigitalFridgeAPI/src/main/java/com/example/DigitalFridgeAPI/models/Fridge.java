package com.example.DigitalFridgeAPI.models;


FoodItem;
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

   @Column
   private List<FridgeItem> reminderItems;

   //Constructor

   public Fridge(String name,  List<Shopping> shoppingList, List<FridgeItem> reminderItems ){
       this.name = name;
       this.shoppingList = shoppingList;
       this.reminderItems = reminderItems;
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

    public List<Shopping> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Shopping> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public List<FridgeItem> getReminderItems() {
        return reminderItems;
    }

    public void setReminderItems(List<FridgeItem> reminderItems) {
        this.reminderItems = reminderItems;
    }
}
