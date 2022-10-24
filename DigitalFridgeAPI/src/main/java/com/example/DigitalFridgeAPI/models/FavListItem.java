package com.example.DigitalFridgeAPI.models;

import javax.persistence.*;

@Entity(name = "fav_list_items")
public class FavListItem {
    @EmbeddedId
    @Column (name = "fav_list_item_id")
    private FavListItemCompositeKey id;

    @ManyToOne
    @MapsId("favourites_id")
    @JoinColumn(name = "favourites_id")
    private Favourites favourites;

    @ManyToOne
    @MapsId("food_item_id")
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;

    public FavListItem(Favourites favourites, FoodItem foodItem) {
        this.id = new FavListItemCompositeKey(favourites.getId(), foodItem.getId());
        this.favourites = favourites;
        this.foodItem = foodItem;
    }
    public FavListItem(){}

    public FavListItemCompositeKey getId() {
        return id;
    }

    public void setId(FavListItemCompositeKey id) {
        this.id = id;
    }

    public Favourites getFavourites() {
        return favourites;
    }

    public void setFavourites(Favourites favourites) {
        this.favourites = favourites;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}
