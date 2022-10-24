package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.Fridge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FridgeRepository extends JpaRepository<Fridge, Long> {
}
