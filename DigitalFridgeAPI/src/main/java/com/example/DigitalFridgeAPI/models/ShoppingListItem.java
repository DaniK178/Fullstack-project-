package com.example.DigitalFridgeAPI.models;

import javax.persistence.*;



    @Entity(name = "shopping_list_items")
    public class ShoppingListItem {

        @EmbeddedId
        @Column (name = "shopping_list_item_id")
        private ShoppingListItemCompositeKey id;
//        private ShoppingListItemCompositeKey id = new ShoppingListItemCompositeKey();

        //JOIN TO SHOPPING LIST
        @ManyToOne
        @MapsId("shopping_list_id")
        @JoinColumn(name = "shopping_list_id")
        private ShoppingList shoppingList;

        //JOIN TO FOOD ITEM
        @ManyToOne
        @MapsId("food_item_id")
        @JoinColumn(name = "food_item_id")
        private FoodItem foodItem;

        //ADDITIONAL PROPERTIES
        @Column(name = "quantity")
        private Float quantity;
        @Column(name = "shop")
        private String shop;

        //CONSTRUCTOR

        public ShoppingListItem(ShoppingList shoppingList, FoodItem foodItem, Float quantity) {
            this.id = new ShoppingListItemCompositeKey(shoppingList.getId(), foodItem.getId());
            this.shoppingList = shoppingList;
            this.foodItem = foodItem;
            this.quantity = quantity;
            this.shop = null;
        }

        public ShoppingListItem() {
        }

        public ShoppingListItemCompositeKey getId() {
            return id;
        }

        public void setId(ShoppingListItemCompositeKey id) {
            this.id = id;
        }

        public ShoppingList getShoppingList() {
            return shoppingList;
        }

        public void setShoppingList(ShoppingList shoppingList) {
            this.shoppingList = shoppingList;
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
            return shop;
        }

        public void setShop(String shop) {
            shop = shop;
        }
    }

