package com.demo.monopoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.monopoly.model.Person;
import com.demo.monopoly.repo.PersonRepository;
import com.demo.monopoly.service.MonoPolyService;

@RestController
@RequestMapping("/api/v1")
public class GameController {

	@Autowired
	MonoPolyService service;

	@RequestMapping(value = "/roll-die/{id}")
	public void rollDie(@PathVariable("id") String personId) {
		service.dieDice(personId);
	}

}
