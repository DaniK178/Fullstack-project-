package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.FavListItem;
import com.example.DigitalFridgeAPI.models.FavListItemCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavListItemRepository extends JpaRepository<FavListItem, FavListItemCompositeKey> {

}

