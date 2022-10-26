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

    @Autowired
    FavouritesRepository favouritesRepository;

    @Autowired
    FavListItemRepository favListItemRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        FoodItem foodItem1 = new FoodItem("bread", FoodGroup.CARBS);
        FoodItem foodItem2 = new FoodItem("pasta", FoodGroup.CARBS);
        FoodItem foodItem3 = new FoodItem("carrots", FoodGroup.VEGETABLES);
        FoodItem foodItem4 = new FoodItem("broccoli", FoodGroup.VEGETABLES);
        FoodItem foodItem5 = new FoodItem("milk", FoodGroup.DAIRY);
        FoodItem foodItem6 = new FoodItem("ketchup", FoodGroup.CONDIMENTS);
        FoodItem foodItem7 = new FoodItem("bacon", FoodGroup.MEAT);
        FoodItem foodItem8 = new FoodItem("mustard", FoodGroup.CONDIMENTS);
        FoodItem foodItem9 = new FoodItem("cheese", FoodGroup.DAIRY);

        foodItemRepository.save(foodItem1);
        foodItemRepository.save(foodItem2);
        foodItemRepository.save(foodItem3);
        foodItemRepository.save(foodItem4);
        foodItemRepository.save(foodItem5);
        foodItemRepository.save(foodItem6);
        foodItemRepository.save(foodItem7);
        foodItemRepository.save(foodItem8);
        foodItemRepository.save(foodItem9);

        Fridge fridge1 = new Fridge("fridge1");
        Fridge fridge2 = new Fridge("fridge2");
        Fridge fridge3 = new Fridge("fridge3");

        fridgeRepository.save(fridge1);
        fridgeRepository.save(fridge2);
        fridgeRepository.save(fridge3);

        ShoppingList shoppingList1 = new ShoppingList("shoppingList1",fridge1);
        ShoppingList shoppingList2 = new ShoppingList("shoppingList2",fridge2);
        ShoppingList shoppingList3 = new ShoppingList("shoppingList3",fridge3);

        shoppingListRepository.save(shoppingList1);
        shoppingListRepository.save(shoppingList2);
        shoppingListRepository.save(shoppingList3);


        ShoppingListItem shoppingListItem1 = new ShoppingListItem(shoppingList1, foodItem1, 5, "sainsbury");
        ShoppingListItem shoppingListItem2 = new ShoppingListItem(shoppingList1, foodItem2, 7, "tesco");
        shoppingListItemRepository.save(shoppingListItem1);
        shoppingListItemRepository.save(shoppingListItem2);

        fridge1.setShoppingList(shoppingList1);
        fridge2.setShoppingList(shoppingList2);
        fridge3.setShoppingList(shoppingList3);

        fridgeRepository.save(fridge1);
        fridgeRepository.save(fridge2);
        fridgeRepository.save(fridge3);


        FridgeItem fridgeItem1 = new FridgeItem(fridge1, foodItem1, 310022, 5.23f, true);
        FridgeItem fridgeItem2 = new FridgeItem(fridge1,  foodItem2, 170222, 5.23f, true);
        FridgeItem fridgeItem3 = new FridgeItem(fridge2, foodItem3, 310422, 5.23f, false);
        FridgeItem fridgeItem4 = new FridgeItem( fridge2, foodItem1, 210522, 5.23f, true);
        FridgeItem fridgeItem5 = new FridgeItem(fridge3, foodItem2, 050422, 5.23f, false);

        fridgeItemRepository.save(fridgeItem1);
        fridgeItemRepository.save(fridgeItem2);
        fridgeItemRepository.save(fridgeItem3);
        fridgeItemRepository.save(fridgeItem4);
        fridgeItemRepository.save(fridgeItem5);


        User user1 = new User("danielleK", "bnta", "danielle@gmail.com");
        userRepository.save(user1);
        User user2 = new User("random", "bnta", "random@gmail.com");
        userRepository.save(user2);

//        adding to user1 favourites list:

        Favourites favourites1= new Favourites("favourites1",user1);
        favouritesRepository.save(favourites1);
        FavListItem favListItem1 = new FavListItem(favourites1,foodItem1);
        FavListItem favListItem2 = new FavListItem(favourites1,foodItem2);
        FavListItem favListItem3 = new FavListItem(favourites1,foodItem3);
        favListItemRepository.save(favListItem1);
        favListItemRepository.save(favListItem2);
        favListItemRepository.save(favListItem3);
        user1.setFavourites(favourites1);
        userRepository.save(user1);

//        adding to user2 favourites list:
        Favourites favourites2= new Favourites("favourites2",user2);
        favouritesRepository.save(favourites2);
        FavListItem favListItem1_2 = new FavListItem(favourites2,foodItem1);
        FavListItem favListItem2_2 = new FavListItem(favourites2,foodItem2);
        FavListItem favListItem3_2 = new FavListItem(favourites2,foodItem3);
        favListItemRepository.save(favListItem1_2);
        favListItemRepository.save(favListItem2_2);
        favListItemRepository.save(favListItem3_2);
        user2.setFavourites(favourites2);
        userRepository.save(user2);









    }
}
