package com.example.DigitalFridgeAPI.services;

import com.example.DigitalFridgeAPI.models.Favourites;
import com.example.DigitalFridgeAPI.models.User;
import com.example.DigitalFridgeAPI.repositories.FavListItemRepository;
import com.example.DigitalFridgeAPI.repositories.FavouritesRepository;
import com.example.DigitalFridgeAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FavouritesRepository favouritesRepository;

    @Autowired
    FavListItemRepository favListItemRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }
    public void addUser(Map<String, String> userParams) {
        String username = (userParams.get("username"));
        String password = (userParams.get("password"));
        String email = (userParams.get("email"));
        User user = new User(username, password,email);
        saveUser(user);
        }

    public void addFavourites(Favourites favourites){
        favouritesRepository.save(favourites);
    }


}

