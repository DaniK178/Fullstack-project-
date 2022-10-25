package com.example.DigitalFridgeAPI.controllers;

import com.example.DigitalFridgeAPI.models.*;
import com.example.DigitalFridgeAPI.services.*;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@RestController
//@RequestMapping = endpoint
@RequestMapping("/fridges")
public class FridgeController {

    @Autowired
    FridgeService fridgeService;

    @Autowired
    FridgeItemService fridgeItemService;
    @Autowired
    FoodItemService foodItemService;

    @Autowired
    ShoppingListService shoppingListService;

    @Autowired
    ShoppingListItemService shoppingListItemService;

// FRIDGE METHODS ---
    @GetMapping
    public ResponseEntity<List<Fridge>> getAllFridges() {
        List<Fridge> fridges = fridgeService.getAllFridges();
        return new ResponseEntity<>(fridges, HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Fridge> getFridgebyID(@PathVariable Long id) {
        Optional<Fridge> fridge = fridgeService.getFridgeByID(id);
        return fridge.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Fridge> addNewFridge(@RequestBody Fridge fridge){
        Fridge newFridge = fridgeService.addNewFridge(fridge);

        return new ResponseEntity<>(fridge, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteFridgeById(@PathVariable Long id){
        fridgeService.removeFridge(id);
        String message = "Fridge" + id + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    //FRIDGE ITEMS ----

    @GetMapping("/{fridgeId}/fridgeItem")
    public ResponseEntity<List<FridgeItem>> getAllFridgeItems(@PathVariable Long fridgeId) {
        List<FridgeItem> fridgeItems = fridgeItemService.getAllFridgeItems(fridgeId);
        return new ResponseEntity<>(fridgeItems, HttpStatus.OK);
    }


    @GetMapping("/fridgeItem/{id}")
    public ResponseEntity<FridgeItem> getFridgeItemByID(@PathVariable Long id) {
        Optional <FridgeItem> fridgeItem = fridgeItemService.getFridgeItemById(id);
        if (fridgeItem.isPresent()) {
            return new ResponseEntity<>(fridgeItem.get(), HttpStatus.OK);

        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{fridgeId}/{foodItemId}/fridgeItem")
    public ResponseEntity<FridgeItem> addNewFridgeItem(
            @PathVariable Long fridgeId,
            @PathVariable Long foodItemId,
            @RequestBody RequestPojo request
            )

    {   System.out.println("first print");
        Fridge fridge = fridgeService.getFridgeByID(fridgeId).get();
        FoodItem foodItem = foodItemService.getFoodItemById(foodItemId).get();
        System.out.println("worked till here");
        FridgeItem fridgeItem = new FridgeItem(fridge,foodItem, request.getExpiryDate(), request.getQuantity(), request.getExpired());
        fridgeItemService.addNewItem(fridgeItem);
        return ResponseEntity.ok().body(fridgeItem);
    }

    @PatchMapping(value = "/fridgeItem/{id}")
    public ResponseEntity<FridgeItem> updateFridgeItemExpiryDate(@PathVariable Long id, @RequestBody RequestPojo request) {
        FridgeItem fridgeItem = fridgeItemService.getFridgeItemById(id).get();
        fridgeItemService.updateExpiryDate(id, request.getExpiryDate());
        return new ResponseEntity<>(fridgeItem, HttpStatus.OK);
    }


    @DeleteMapping(value = "/delete/foodItem/{id}")
    public ResponseEntity<String> deleteFridgeItemById(@PathVariable Long id){
        fridgeItemService.removeFridgeItem(id);
        String message = "FridgeItem" + id + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

// SHOPPING LIST ITEMS---------

//    @PostMapping
//    public ResponseEntity<ShoppingList> addNewFridge(@RequestBody Fridge fridge){
//        Fridge newFridge = fridgeService.addNewFridge(fridge);
//        return new ResponseEntity<>(fridge, HttpStatus.CREATED);
//    }

    //Post a shopping List Item
//    @PostMapping("/{fridgeId}/shoppingList/{foodItemId}")
//    public ResponseEntity<ShoppingListItem> addNewShoppingListItem(
//            @PathVariable Long fridgeId,
//            @PathVariable Long foodItemId,
//            @RequestBody ShoppingListItemRequestPojo request)
//    {
//        ShoppingList shoppingList = shoppingListService.getShoppingListByID(fridgeId).get();
//        FoodItem foodItem = foodItemService.getFoodItemById(foodItemId).get();
//        System.out.println("worked till here");
//        ShoppingListItem shoppingListItem = new ShoppingListItem(shoppingList, foodItem, request.getQuantity());
//        shoppingListItemService.addNewItem(shoppingListItem);
//        return ResponseEntity.ok().body(shoppingListItem);
//    }
//
//    //---Get Shopping List --
//    @GetMapping("/{fridgeId}/shoppingList")
//    public ResponseEntity<ShoppingList> getShoppingListById(@PathVariable Long fridgeId) {
//        Optional <ShoppingList> shoppingList = shoppingListService.getShoppingListByID(fridgeId);
//        if (shoppingList.isPresent()) {
//            return new ResponseEntity<>(shoppingList.get(), HttpStatus.OK);
//
//        } else {
//            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//        }
//    }
//
//    //---Get ALl Shopping List Items --
//
////    @GetMapping("{fridgeID}/shoppingList")
////    public ResponseEntity<List<ShoppingListItem>> getAllShoppingListItem(@PathVariable Long fridgeId) {
////        List<ShoppingListItem> shoppingListItems = shoppingListItemService.getAllShoppingListItems(fridgeId);
////        return new ResponseEntity<>(shoppingListItems, HttpStatus.OK);
////    }
//
//    //---Get Shopping List Item by ID --
//
//    @GetMapping("shoppingList/{id}")
//    public ResponseEntity<ShoppingListItem> getShoppingListItemByID(@PathVariable Long id) {
//        Optional <ShoppingListItem> shoppingListItem = shoppingListItemService.getShoppingListItemById(id);
//        if (shoppingListItem.isPresent()) {
//            return new ResponseEntity<>(shoppingListItem.get(), HttpStatus.OK);
//
//        } else {
//            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//        }
//    }
//
//   // - Delete shopping List Item by ID
//    @DeleteMapping(value = "{fridgeId}/delete/shoppingList/{id}")
//    public ResponseEntity<String> deleteShoppingListItemById(@PathVariable Long id){
//        shoppingListItemService.removeShoppingListItem(id);
//        String message = "Shopping List Item " + id + " has been deleted";
//        return new ResponseEntity<>(message,HttpStatus.OK);
//    }

    @PostMapping(value="/{fridgeId}/shoppingList")
    public ResponseEntity addShoppingList( @RequestBody ShoppingListRequest shoppingListRequest,
//                                           @RequestBody ShoppingList shoppingList,
                                           @PathVariable Long fridgeId)
    {
//        Fridge fridge = fridgeService.getFridgeByID(fridgeId).get();
//        ShoppingList newShoppingList = new ShoppingList(shoppingList.getName(), fridge);
        fridgeService.addShoppingList(shoppingListRequest.getName(), fridgeId);
//        return ResponseEntity.ok().body(shoppingList);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

//    @PostMapping(value="/favourites/{userId}")
//    public ResponseEntity addFavList(@RequestBody Map<String, String> bodyParams,@PathVariable Long userId) {
//        userService.addFavList(bodyParams.get("name"),userId);
//        return new ResponseEntity<>(null, HttpStatus.CREATED);
//    }


    }


    //Get a fridge by name
//    @GetMapping
//    public ResponseEntity<List<Fridge>> getFridgebyName(name) {
//        List<Fridge> fridges = fridgeService.getFridgeByName(name);
//        return new ResponseEntity<>(fridges, HttpStatus.OK);
//    }


    //Get shopping List for the fridge by ID
    //Get Shopping List by Name

    //Get Shopping List for every fridge the user is attached to  - frontend?






