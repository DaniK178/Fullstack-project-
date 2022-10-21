package com.example.DigitalFridgeAPI.models;

import javax.persistence.*;



    @Entity(name = "shopping_list_items")
    public class ShoppingListItem {

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

        public ShoppingListItem(ShoppingListItemCompositeKey id, com.example.DigitalFridgeAPI.models.Fridge fridge, FoodItem foodItem, Float quantity, String shop) {
            this.id = id;
            Fridge = fridge;
            this.foodItem = foodItem;
            this.quantity = quantity;
            Shop = shop;
        }

        public ShoppingListItemCompositeKey getId() {
            return id;
        }

        public void setId(ShoppingListItemCompositeKey id) {
            this.id = id;
        }

        public com.example.DigitalFridgeAPI.models.Fridge getFridge() {
            return Fridge;
        }

        public void setFridge(com.example.DigitalFridgeAPI.models.Fridge fridge) {
            Fridge = fridge;
        }

        public FoodItem getFoodItem() {
            return foodItem;
        }

        public void setFoodItem(FoodItem foodItem) {
            this.foodItem = foodItem;
        }

        public Float getQuantity() {
            return quantity;
        }

        public void setQuantity(Float quantity) {
            this.quantity = quantity;
        }

        public String getShop() {
            return Shop;
        }

        public void setShop(String shop) {
            Shop = shop;
        }
    }

