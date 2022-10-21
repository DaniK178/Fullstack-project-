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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "favourites_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"users"})
    private Favourites favourites;

    @ManyToMany
    @JoinTable(name ="users_fridges", joinColumns = {@JoinColumn(name="users_id",nullable = false)},
            inverseJoinColumns = {@JoinColumn(name="fridges_id",nullable = false)})
    @JsonIgnoreProperties({"users"})
    private Fridge fridge;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.favourites = null;
        this.fridge= null;
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

    public Favourites getFavourites() {
        return favourites;
    }

    public void setFavourites(Favourites favourites) {
        this.favourites = favourites;
    }
}
