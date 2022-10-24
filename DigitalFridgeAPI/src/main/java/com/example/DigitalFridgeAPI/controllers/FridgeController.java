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

    //create a new fridge

    @PostMapping
    public ResponseEntity<Fridge> addNewFridge(@RequestBody Fridge fridge){
        Fridge newFridge = fridgeService.addNewFridge(fridge);
        return new ResponseEntity<>(fridge, HttpStatus.CREATED);
    }

    //delete a fridge
//    @DeleteMapping(value = "/delete/{id}")
//    public void deleteById(@PathVariable Long id) {
//        fridgeService.deleteFridgeById(id);
//    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteFridgeById(@PathVariable Long id){
        fridgeService.removeFridge(id);
        String message = "Fridge" + id + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    //Fridge Item

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

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteFridgeById(@PathVariable Long id){
        fridgeService.removeFridge(id);
        String message = "Fridge" + id + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ShoppingListItem> addNewFridge(@RequestBody Fridge fridge){
        Fridge newFridge = fridgeService.addNewFridge(fridge);
        return new ResponseEntity<>(fridge, HttpStatus.CREATED);
    }


    }



    //Get a fridge by name
//    @GetMapping
//    public ResponseEntity<List<Fridge>> getFridgebyName(name) {
//        List<Fridge> fridges = fridgeService.getFridgeByName(name);
//        return new ResponseEntity<>(fridges, HttpStatus.OK);
//    }


//
//    @PostMapping
//    public ResponseEntity<Fridge> addNewFridge(@RequestBody Fridge fridge){
//        Fridge newFridge = fridgeService.addNewFridge(fridge);
//        return new ResponseEntity<>(fridge, HttpStatus.CREATED);
//    }

//    @PostMapping
//    public ResponseEntity<ShoppingListItem>addNewShoppingListItemfromFridgeItem(@RequestBody
//                                                                                    @RequestBody String name,
//                                                                                @RequestBody float averageRating,
//                                                                                @RequestBody  int time,
//                                                                                @RequestBody  int calories,
//
//                                                                                )




    //Get shopping List for the fridge by ID
    //Get Shopping List by Name

    //Get Shopping List for every fridge the user is attached to  - frontend?


    //Get Fridge Food items

    //Get fridge food item by id





