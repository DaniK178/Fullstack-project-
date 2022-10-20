package com.example.DigitalFridgeAPI.services;

import com.example.DigitalFridgeAPI.models.FoodItem;
import com.example.DigitalFridgeAPI.repositories.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {
    @Autowired
    FoodItemRepository foodItemRepository;

    //get All FoodItems:

    public List<FoodItem> getAllFoodItems() {
        return FoodItemRepository.findAll();
    }

    // get a specific foodItem by id:

    public Optional<FoodItem> getFoodItemById(Long id){     //  Optional: means it either has something in it or it doesn't
        return foodItemRepository.findByFoodItemId(id);
    }

    // get a specific foodItem by name:
    public Optional<FoodItem> getFoodItemByName(String foodItem){
        return foodItemRepository.findByFoodItemName(foodItem);
    }

    //Add FoodItem:

    public FoodItem saveFoodItem(FoodItem foodItem){
        FoodItem savedFoodItem = foodItemRepository.save(foodItem);
        return foodItem;
    }






}
