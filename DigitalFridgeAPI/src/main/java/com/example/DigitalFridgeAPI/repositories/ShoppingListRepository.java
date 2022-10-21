package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {
}

