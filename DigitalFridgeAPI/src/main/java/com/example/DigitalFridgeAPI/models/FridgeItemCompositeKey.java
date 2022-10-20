package com.example.DigitalFridgeAPI.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FridgeItemCompositeKey implements Serializable {


    @Column(name = "fridge_id")
    Long fridgeId;

    @Column(name = "food_item_id")
    Long foodItemId;
}
