package com.demo.monopoly.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.monopoly.model.Person;

public interface PersonRepository extends JpaRepository<Person, String> 
{

	
}
