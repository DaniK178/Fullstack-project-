package com.example.DigitalFridgeAPI.components;

import com.example.DigitalFridgeAPI.models.FoodItem;
import com.example.DigitalFridgeAPI.models.Fridge;
import com.example.DigitalFridgeAPI.models.FridgeItem;
import com.example.DigitalFridgeAPI.models.ShoppingListItem;
import com.example.DigitalFridgeAPI.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {


    @Autowired
    FoodItemRepository foodItemRepository;

    @Autowired
    FridgeRepository fridgeRepository;

    @Autowired
    FridgeItemRepository fridgeItemRepository;

    @Autowired
    ShoppingListItem shoppingListItem;

    @Autowired
    ShoppingListRepository shoppingListRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Fridge fridge1 = new Fridge();
        Fridge fridge2 = new Fridge();
        Fridge fridge3 = new Fridge();




    }
}
