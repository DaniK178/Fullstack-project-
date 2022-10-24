package com.example.DigitalFridgeAPI.services;

import com.example.DigitalFridgeAPI.models.Fridge;
import com.example.DigitalFridgeAPI.models.FridgeItem;
import com.example.DigitalFridgeAPI.repositories.FridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FridgeService {

    @Autowired
    FridgeRepository fridgeRepository;



    public Fridge addNewItem (Fridge fridge, FridgeItem fridgeItem){
        fridgeRepository.save(fridgeItem);
        return fridge;
    }



    public void removeUser(Long id){
        userRepository.deleteById(id);
    }

}
