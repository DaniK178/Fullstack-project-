package com.example.DigitalFridgeAPI.repositories;


import com.example.DigitalFridgeAPI.models.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepository extends JpaRepository<Shopping, Long> {
}

