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
        return foodItemRepository.findAll();
    }

    // get a specific foodItem by id:

    public Optional<FoodItem> getFoodItemById(Long id){     //  Optional: means it either has something in it or it doesn't
        return foodItemRepository.findByFoodItemId(id);
    }

    // get a specific foodItem by name:
    public Optional<FoodItem> getFoodItemByName(String foodItem){
        return foodItemRepository.findByFoodItemName(foodItem);
    }

    //Add New FoodItem:

    public FoodItem saveFoodItem(FoodItem foodItem){
        FoodItem savedFoodItem = foodItemRepository.save(foodItem);
        return foodItem;
    }

    //Delete FoodItem:

    public void deleteFoodItemById(long id){
        foodItemRepository.deleteById(id);
    }

    //get a specific foodItem by expiration true/false ??

    //update foodItem:

    public FoodItem updateFoodItem(Long id){
        return foodItemRepository.updateByFoodItemId(id);
    }






}
