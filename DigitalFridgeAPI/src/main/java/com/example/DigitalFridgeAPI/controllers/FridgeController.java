package com.example.DigitalFridgeAPI.controllers;

import com.example.DigitalFridgeAPI.models.Fridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping = endpoint
@RequestMapping("/fridge")
public class FridgeController {

    @Autowired
    com.example.DigitalFridgeAPI.services.FridgeService fridgeService;

    @GetMapping
    public ResponseEntity<List<Fridge>> getAllFridges() {
        List<Fridge> fridges = fridgeService.getAllFridges();
        return new ResponseEntity<>(fridges, HttpStatus.OK);
    }

    //get a particular fridge

    @GetMapping
    public ResponseEntity<List<Fridge>> getAllFridgebyID() {
        List<Fridge> fridges = fridgeService.getAllFridgeByID();
        return new ResponseEntity<>(fridges, HttpStatus.OK);
    }

    //Get a fridge by name

    //create a new fridge

    @PostMapping
    public ResponseEntity<Fridge> addNewFridge(@RequestBody Fridge fridge){
        Fridge newFridge = fridgeService.addFridge(fridge);
        return new ResponseEntity<>(fridge, HttpStatus.CREATED);
    }


    //Get shopping List for the fridge by ID
    //Get Shopping List by Name

    //Get Shopping List for every fridge the user is attached to  - frontend?


    //Get Fridge Food items

    //Get fridge food item by id






}

