package com.example.DigitalFridgeAPI.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name="favourites")
public class Favourites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

//// not sure if favourites should contain shopping list and fridge list?
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "shopping_id", referencedColumnName = "id")
//    private List<Shopping> shoppingList;
//    // not sure if favourites should contain shopping list and fridge list?
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fridge_id", referencedColumnName = "id")
//    private List<Fridge> fridgeList;


    @OneToOne(mappedBy = "favourites")
    private User user;

//    @OneToMany(mappedBy = "favourites")
//    Set<FavListItem> expiryDate;


//    @Column
//    @OneToMany(mappedBy = "favourites")
//    private List<FavListItem> favItems;

    public Favourites( String name, User user) {
        this.name = name;
        this.user = user;
//        this.favItems = new ArrayList<>();
//        this.shoppingList = new ArrayList<>();
//        this.fridgeList = new ArrayList<>();

    }

    public Favourites() {}


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

//        public List<FavListItem> getFavItems() {
//        return favItems;
//    }
//
//    public void setFavItems(List<FavListItem> favItems) {
//        this.favItems = favItems;
//    }

//    public List<Shopping> getShoppingList() {
//        return shoppingList;
//    }

//    public void setShoppingList(List<Shopping> shoppingList) {
//        this.shoppingList = shoppingList;
//    }

//    public List<Fridge> getFridgeList() {
//        return fridgeList;
//    }

//    public void setFridgeList(List<Fridge> fridgeList) {
//        this.fridgeList = fridgeList;
//    }

}

