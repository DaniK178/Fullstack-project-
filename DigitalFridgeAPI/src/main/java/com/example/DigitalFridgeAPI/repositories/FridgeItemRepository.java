package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.FridgeItem;
import com.example.DigitalFridgeAPI.models.ShoppingListItemCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeItemRepository extends JpaRepository<FridgeItem, ShoppingListItemCompositeKey> {
}
