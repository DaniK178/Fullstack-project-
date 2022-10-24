package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.ShoppingListItem;
import com.example.DigitalFridgeAPI.models.ShoppingListItemCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListItemRepository extends JpaRepository<ShoppingListItem, ShoppingListItemCompositeKey> {

}
