package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.Fridge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FridgeRepository extends JpaRepository<Fridge, Long> {


    List<Fridge> findByFridgeName (String name);

}
