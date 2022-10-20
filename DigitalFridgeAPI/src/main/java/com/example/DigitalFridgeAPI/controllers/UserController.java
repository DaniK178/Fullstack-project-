package com.example.DigitalFridgeAPI.controllers;

import com.example.DigitalFridgeAPI.models.User;
import com.example.DigitalFridgeAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

//    get a list of users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

//    get a user by ID

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        if(user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


//    adding a new user

    @PostMapping
    public ResponseEntity addNewUser(@RequestBody Map<String, String> userParams) {
        userService.addUser(userParams);
        return new ResponseEntity<>(mull, HttpStatus.CREATED);
    }


//    deleting a user

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
    }

}
