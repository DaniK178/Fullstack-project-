package com.example.DigitalFridgeAPI.controllers;

import com.example.DigitalFridgeAPI.models.*;
import com.example.DigitalFridgeAPI.services.FridgeItemService;
import com.example.DigitalFridgeAPI.services.FridgeService;
import com.example.DigitalFridgeAPI.services.ShoppingListItemService;
import com.example.DigitalFridgeAPI.services.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping = endpoint
@RequestMapping("/fridges")
public class FridgeController {

    @Autowired
    FridgeService fridgeService;

    @Autowired
    FridgeItemService fridgeItemService;

    @Autowired
    ShoppingListService shoppingListService;

    @Autowired
    ShoppingListItemService shoppingListItemService;

// FRIDGE METHODS
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

    @GetMapping("/{fridgeId}/fridgeItem/{foodId}")
    public ResponseEntity<FridgeItem> getFridgeItemByID(@PathVariable Long fridgeId, @PathVariable Long foodId) {
         FridgeItemCompositeKey id = new FridgeItemCompositeKey(fridgeId, foodId);
         Optional <FridgeItem> fridgeItem = fridgeItemService.getFridgeItemByID(id);
             if (fridgeItem.isPresent()) {
                 return new ResponseEntity<>(fridgeItem.get(), HttpStatus.OK);

             } else {
                 return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
             }
    }
    @PostMapping("/{fridgeId}/fridgeItem")
    public ResponseEntity<FridgeItem> addNewFridgeItem(
            @PathVariable Fridge fridgeId,
            @RequestBody FoodItem foodItem,
            @RequestBody  Integer expiryDate,
            @RequestBody  Float quantity,
            @RequestBody  Boolean isExpired)
    {
        FridgeItem fridgeItem = new FridgeItem(fridgeId,foodItem,expiryDate,quantity,isExpired);
        fridgeItemService.addNewItem(fridgeItem);
        return ResponseEntity.ok().body(fridgeItem);
    }

    @PatchMapping("/{fridgeId}/fridgeItem/{foodId}"

    )


    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteFridgeItemById(@PathVariable Long id){
        fridgeService.removeFridge(id);
        String message = "Fridge" + id + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

// SHOPPING LIST ITEMS

    //get a shopping list item
    @GetMapping("/{fridgeId}/shoppingList")
    public ResponseEntity<ShoppingList> getShoppingListById(@PathVariable Long fridgeId) {
        Optional <ShoppingList> shoppingList = shoppingListService.getShoppingListByID(fridgeId);
        if (shoppingList.isPresent()) {
            return new ResponseEntity<>(shoppingList.get(), HttpStatus.OK);

        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    // Add a shopping list item


//
//    @PostMapping
//    public ResponseEntity<ShoppingListItem> addNewFridgeItem(@RequestBody Fridge fridge){
//        Fridge newFridge = fridgeService.addNewFridge(fridge);
//        return new ResponseEntity<>(fridgeItem, HttpStatus.CREATED);
//    }

    //remove a  shopping list item

    //update a shopping list item


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






