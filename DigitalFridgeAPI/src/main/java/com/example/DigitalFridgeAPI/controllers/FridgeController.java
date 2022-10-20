package com.example.DigitalFridgeAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping = endpoint
@RequestMapping("/fridge")
public class FridgeController {

    @Autowired
    com.example.DigitalFridgeAPI.services.FridgeService FridgeService;

}

@GetMapping
public ResponseEntity<List<Fridge>> getAll() {

    List<Recipe> recipes = recipeService.getAllRecipes();
    return new ResponseEntity<>(recipes, HttpStatus.OK);

}
