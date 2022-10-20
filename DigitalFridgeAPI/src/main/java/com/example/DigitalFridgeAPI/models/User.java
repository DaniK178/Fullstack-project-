//    need to import oodItem model here


package com.example.DigitalFridgeAPI.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true) // ensuring only unique username is allowed
    private String username;

    @Column
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"user"})
    private List<FoodItem> favItemsList;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.favItemsList = new ArrayList<>();
    }

    public User() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<FoodItem> getFavItemsList() {
        return favItemsList;
    }

    public void setFavItemsList(List<FoodItem> favItemsList) {
        this.favItemsList = favItemsList;
    }

    public void addToFavList (FoodItem foodItem) {
        this.favItemsList.add(foodItem);
    }
}
