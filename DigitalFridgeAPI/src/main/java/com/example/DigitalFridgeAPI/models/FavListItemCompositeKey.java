package com.example.DigitalFridgeAPI.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FavListItemCompositeKey implements Serializable {

        @Column(name = "favourites_id")
        Long favouritesId;

        @Column(name = "favListItem_id")
        Long favListItemId;



}
