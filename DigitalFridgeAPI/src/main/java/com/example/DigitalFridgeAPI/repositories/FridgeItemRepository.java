package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.FridgeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FridgeItemRepository extends JpaRepository<FridgeItem, Long> {
}
