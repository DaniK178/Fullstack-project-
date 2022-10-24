package com.example.DigitalFridgeAPI.components;

import com.example.DigitalFridgeAPI.models.*;
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
    ShoppingListItemRepository shoppingListItemRepository;

    @Autowired
    ShoppingListRepository shoppingListRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Fridge fridge1 = new Fridge("fridge1");
        Fridge fridge2 = new Fridge("fridge2");
        Fridge fridge3 = new Fridge("fridge3");

        fridgeRepository.save(fridge1);
        fridgeRepository.save(fridge2);
        fridgeRepository.save(fridge3);


        FoodItem foodItem1 = new FoodItem("bread", FoodGroup.CARBS);
        FoodItem foodItem2 = new FoodItem("pasta", FoodGroup.CARBS);
        FoodItem foodItem3 = new FoodItem("carrots", FoodGroup.VEGETABLES);

        foodItemRepository.save(foodItem1);
        foodItemRepository.save(foodItem2);
        foodItemRepository.save(foodItem3);

        FridgeItem fridgeItem1 = new FridgeItem(fridge1, foodItem1, 310022, 5.23f, true);
        FridgeItem fridgeItem2 = new FridgeItem(fridge1, foodItem1, 170222, 5.23f, true);
        FridgeItem fridgeItem3 = new FridgeItem(fridge2, foodItem3, 310422, 5.23f, false);
        FridgeItem fridgeItem4 = new FridgeItem(fridge2, foodItem1, 210522, 5.23f, true);
        FridgeItem fridgeItem5 = new FridgeItem(fridge3, foodItem2, 050422, 5.23f, false);

        fridgeItemRepository.save(fridgeItem1);
        fridgeItemRepository.save(fridgeItem2);
        fridgeItemRepository.save(fridgeItem3);
        fridgeItemRepository.save(fridgeItem4);
        fridgeItemRepository.save(fridgeItem5);

        User user1 = new User("danielleK", "bnta", "danielle@gmail.com");
        userRepository.save(user1);




    }
}
