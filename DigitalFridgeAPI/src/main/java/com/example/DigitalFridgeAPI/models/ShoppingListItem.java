package com.example.DigitalFridgeAPI.models;

import javax.persistence.*;

public class ShoppingListItem {

    @Entity(name = "shopping_list_items")
    public class FridgeItem {

        @EmbeddedId
        private ShoppingListItemCompositeKey id = new ShoppingListItemCompositeKey();

        @ManyToOne
        @MapsId("shopping_list_id")
        @JoinColumn(name = "shopping_list_id")
        private Fridge Fridge;

        @ManyToOne
        @MapsId("food_item_id")
        @JoinColumn(name = "food_item_id")
        private FoodItem foodItem;


        private Float quantity;
        private String Shop;





    }

}
