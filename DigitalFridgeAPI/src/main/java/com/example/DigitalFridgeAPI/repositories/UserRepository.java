package com.example.DigitalFridgeAPI.repositories;
import com.example.DigitalFridgeAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);


//    to do:
//    return a list of favourite food items??
//    List<FoodItem> findAllByUserId(long id);
}
