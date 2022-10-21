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

    //Fridge Item JOIN Table
    @OneToMany(mappedBy = "fridge")
    Set<FridgeItem> expiryDate;

    @OneToMany(mappedBy = "fridge")
    Set<FridgeItem> quantity;
    //to paste  into food item

    //Fridge - Shopping list JOIN
   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shopping_id", referencedColumnName = "id")
   private List<ShoppingList> shoppingList;

    // REMINDER ITEMS
   @Column
   private List<FridgeItem> reminderItems;

   //CONSTRUCTORS

   public Fridge(String name,  List<ShoppingList> shoppingList, List<FridgeItem> reminderItems ){
       this.name = name;
       this.shoppingList = shoppingList;
       this.reminderItems = reminderItems;
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

    public List<ShoppingList> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<ShoppingList> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public List<FridgeItem> getReminderItems() {
        return reminderItems;
    }

    public void setReminderItems(List<FridgeItem> reminderItems) {
        this.reminderItems = reminderItems;
    }
}
