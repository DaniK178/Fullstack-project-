package com.example.DigitalFridgeAPI.services;

import com.example.DigitalFridgeAPI.models.FridgeItem;
import com.example.DigitalFridgeAPI.repositories.FridgeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FridgeItemService {

    @Autowired
    FridgeItemRepository fridgeItemRepository;

    //add new Item
    public FridgeItem addNewItem (FridgeItem fridgeItem){
        fridgeItemRepository.save(fridgeItem);
        return fridgeItem;
    }

    //get all food items
    public List<FridgeItem> getallFridgeItems(){
        return fridgeItemRepository.findAll();
    }

    //get item by ID
    public Optional<FridgeItem> getFridgeItemsByID(Long id){
        return fridgeItemRepository.findById(id);
    }

    //get item by name
//    public List<FridgeItem> getFridgeItemByName(String name){
//        return fridgeItemRepository.findById(id).get().getFridge().getReminderItems();
//    }


    //update Item

    //delete item by ID
    public void removeItem (Long id){
        fridgeItemRepository.deleteById(id);
    }

    //delete item by Name


    //add to Shopping List
    //for it to access the food item ID, within the fridge item, and add that to the list

    //add to favourites List






}
