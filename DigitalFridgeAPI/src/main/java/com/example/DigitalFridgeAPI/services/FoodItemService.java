package com.example.DigitalFridgeAPI.services;

import com.example.DigitalFridgeAPI.models.FoodGroup;
import com.example.DigitalFridgeAPI.models.FoodItem;
import com.example.DigitalFridgeAPI.models.User;
import com.example.DigitalFridgeAPI.repositories.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
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
        return foodItemRepository.findById(id);
    }

    // get a specific foodItem by name:
    public Optional<FoodItem> getByName(String foodItem){
        return foodItemRepository.findByName(foodItem);
    }

    // get foodItems by GroupName:
    public List<FoodItem> getAllFoodItemsByFoodGroup(FoodGroup foodGroup){
        return foodItemRepository.findByFoodGroup(foodGroup);
    }

    //Add New FoodItem:

    public FoodItem saveFoodItem(FoodItem foodItem){
        foodItemRepository.save(foodItem);
        return foodItem;
    }

//    public void addNewFoodItem(String name,FoodGroup foodGroup) {
//        String name = (userParams.get("username"));
//        String password = (userParams.get("password"));
//        String email = (userParams.get("email"));
//        User user = new User(username, password,email);
//        saveUser(user);
//    }

    //Delete FoodItem:

    public void deleteFoodItemById(long id){
        foodItemRepository.deleteById(id);
    }



}
