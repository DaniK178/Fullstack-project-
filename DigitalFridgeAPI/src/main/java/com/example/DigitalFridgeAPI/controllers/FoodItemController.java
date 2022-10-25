package com.example.DigitalFridgeAPI.controllers;


import com.example.DigitalFridgeAPI.models.FoodGroup;
import com.example.DigitalFridgeAPI.models.FoodItem;
import com.example.DigitalFridgeAPI.repositories.FoodItemRepository;
import com.example.DigitalFridgeAPI.services.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/foodItems")    //@RequestMapping = endpoint
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @Autowired
    FoodItemRepository foodItemRepository;

//GET METHODS (show)

    //Method 1: get all foodItems - grab all the foodItems from foodItemRepository (our database)

    @GetMapping // localhost:8080/foodItems
    public ResponseEntity<List<FoodItem>> getAllFoodItems() {
        // the controller will call the getAllFoodItems method from the foodItemService
//        List<FoodItem> foodItems = foodItemService.getAllFoodItems();
        return new ResponseEntity<>(foodItemRepository.findAll(), HttpStatus.OK);

    }

    //method: find foodItem by name:
    @GetMapping("/name")
    public void findByName(@PathVariable String foodItem) {
        foodItemService.getByName(foodItem);
    }

    //method: find foodItem by food Group:

    @GetMapping("/foodItems/food_Group")
    public void findByFoodGroup(@PathVariable String foodItem){
        foodItemService.getByFoodGroup(foodItem);
    }


    //Method to get foodItem by id:

    @GetMapping(value = "/{id}")
    public ResponseEntity<FoodItem> getFoodItemsById(@PathVariable Long id) {
        Optional<FoodItem> foodItem = foodItemService.getFoodItemById(id);
        if (foodItem.isPresent()) {
            return new ResponseEntity<>(foodItem.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }
//POST MAPPING (create)

    //method to add a new foodItem:
    @PostMapping("/add")
    public ResponseEntity<FoodItem> addNewFoodItem(@RequestBody String name,
                                                   @RequestBody FoodGroup foodGroup
                                                   ){
        FoodItem newFoodItem = new FoodItem ( name, foodGroup);
        foodItemService.saveFoodItem(newFoodItem);
        System.out.println(name + " has been added!");
        return ResponseEntity.ok().body(newFoodItem);
    }

//DELETE MAPPING (remove)
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        foodItemService.deleteFoodItemById(id);
    }







}
