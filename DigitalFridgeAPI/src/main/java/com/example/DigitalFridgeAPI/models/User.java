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
    @JsonIgnoreProperties({"user"})
//    making a list of FavListItem within the Favourites class
 private List<FavListItem> favourites;
//    or this   ??
//    private List<Favourites> favourites;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.favourites = new ArrayList<>();

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


    public List<FavListItem> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<FavListItem> favourites) {
        this.favourites = favourites;
    }

    public void addToFavourites (FavListItem favListItem) {
        this.favourites.add(favListItem);
    }
}
