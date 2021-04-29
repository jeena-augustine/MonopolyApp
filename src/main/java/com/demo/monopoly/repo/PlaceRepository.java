package com.demo.monopoly.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.monopoly.model.Place;

public interface PlaceRepository extends JpaRepository<Place, Integer> {

}
