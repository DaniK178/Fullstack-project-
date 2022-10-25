package com.example.DigitalFridgeAPI.services;

import com.example.DigitalFridgeAPI.models.Fridge;
import com.example.DigitalFridgeAPI.models.FridgeItem;
import com.example.DigitalFridgeAPI.models.ShoppingList;
import com.example.DigitalFridgeAPI.repositories.FridgeItemRepository;
import com.example.DigitalFridgeAPI.repositories.FridgeRepository;
import com.example.DigitalFridgeAPI.repositories.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FridgeService {

    @Autowired
    FridgeRepository fridgeRepository;

    @Autowired
    FridgeItemRepository fridgeItemRepository;

    @Autowired
    ShoppingListRepository shoppingListRepository;

    //Add a new fridge
    public Fridge addNewFridge (Fridge fridge){
        fridgeRepository.save(fridge);
        return fridge;
    }

//    public Fridge addNewFridge (Fridge fridge, ShoppingList shoppingList){
//        fridgeRepository.save(fridge);
//        shoppingListRepository.save(shoppingList);
//        return fridge;
//    }

    //GET ALL FRIDGES
    public List<Fridge> getAllFridges(){
        return fridgeRepository.findAll();
    }

    //GET FRIDGE BY ID
    public Optional<Fridge> getFridgeByID(Long id){
        return fridgeRepository.findById(id);
    }

//    public void deleteFridgeById(Long id) {
//        fridgeRepository.deleteById(id);
//    }

    public void removeFridge(Long id){
        fridgeRepository.deleteById(id);
    }


    //get fridge by name
//    public List<Fridge> getFridgeByName(String name){
//        List<Fridge> fridges = fridgeRepository.findByFridgeName(name);
//        return fridges;
//    }

    //Get the fridge reminder items

//    public List<Fridge> getReminderItemsByID(Long id){
//        return fridgeRepository.findById(id).get().getReminderItems();
//    }


//    //delete fridge by ID
//    public void removeFridge (Long id){
//        fridgeRepository.deleteById(id);
//    }
//
////    delete fridge by Name
//    public void removeFridgeByName(String name){
//        fridgeRepository.findByFridgeName(name).get().;
//    }

//




//    public void removeUser(Long id){
//        userRepository.deleteById(id);
//    }

}
