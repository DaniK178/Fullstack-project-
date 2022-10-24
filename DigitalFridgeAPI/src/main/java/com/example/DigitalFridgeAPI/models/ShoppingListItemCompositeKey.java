package com.example.DigitalFridgeAPI.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


    @Embeddable
    public class ShoppingListItemCompositeKey  implements Serializable {


        @Column(name = "shopping_list_id")
        Long shoppingListId;

        @Column(name = "food_item_id")
        Long foodItemId;
    }

