package com.demo.monopoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	// create a new game for a host
	@PostMapping(value = "/create-game")
	public ResponseEntity<Person> createGame() {
		Person p = new Person("p1", "Demo user", 1000);
		service.createUser(p);
		return ResponseEntity.ok(p);

	}

	// adding a second user for the game
	@PostMapping(value = "/add/newplayer")
	public ResponseEntity<Person> createNewPlayer() {
		Person p = new Person("p2", "Demo user2", 1000);
		service.createUser(p);
		return ResponseEntity.ok(p);

	}

	//rolling a dice
	@GetMapping(value = "/roll-die/{id}")
	public ResponseEntity<String> rollDie(@PathVariable("id") String personId) {
		String message = service.rollDice(personId);
		return ResponseEntity.ok(message);
	}

}
