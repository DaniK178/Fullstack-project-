package com.example.DigitalFridgeAPI.repositories;

import com.example.DigitalFridgeAPI.models.Favourites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouritesRepository extends JpaRepository<Favourites, Long> {
}

