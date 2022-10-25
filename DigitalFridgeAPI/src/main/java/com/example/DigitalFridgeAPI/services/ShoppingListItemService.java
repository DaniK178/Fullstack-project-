package com.example.DigitalFridgeAPI.services;

import com.example.DigitalFridgeAPI.models.FridgeItem;
import com.example.DigitalFridgeAPI.models.ShoppingListItem;
import com.example.DigitalFridgeAPI.repositories.ShoppingListItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ShoppingListItemService{

    @Autowired
    ShoppingListItemRepository shoppingListItemRepository;

    public ShoppingListItem addNewItem (ShoppingListItem shoppingListItem){
        shoppingListItemRepository.save(shoppingListItem);
        return shoppingListItem;
    }

//    public List<ShoppingListItem> getAllShoppingListItems(Long id){
//        //we want to look into the fridge Item respository - find where fridge == fridge id
////        List <FridgeItem> allFridgeItems =
////        System.out.println(allFridgeItems);
//        Fr fridgeItemRepository.findAllByFridgeId(id);
//
//    }


    public Optional<ShoppingListItem> getShoppingListItemById(Long id) {
        return shoppingListItemRepository.findById(id);
    }


    public void removeShoppingListItem (Long id){
        shoppingListItemRepository.deleteById(id);
    }



}
