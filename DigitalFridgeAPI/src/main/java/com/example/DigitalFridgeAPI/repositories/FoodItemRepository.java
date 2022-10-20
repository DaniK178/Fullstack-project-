package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodItemRepository extends JpaRepository <FoodItem, Long>  {


    Optional<FoodItem> findByFoodItemId(Long id);
    Optional<FoodItem> findByFoodItemName(String foodItem);

    List<FoodItem> findByFoodGroup(String foodItem);






}
