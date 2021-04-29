package com.demo.monopoly.service;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.monopoly.model.Person;
import com.demo.monopoly.model.Place;
import com.demo.monopoly.repo.PersonRepository;
import com.demo.monopoly.repo.PlaceRepository;

@Service
public class MonoPolyService {

	@Autowired
	PersonRepository personRepo;

	@Autowired
	PlaceRepository placeRepo;

	Random rand = new Random();
	int upperbound = 3;

	public void dieDice(String personId) {
		int random = rand.nextInt(upperbound);
		System.out.println(random);
		Place place = placeRepo.findById(random).get();
		Person person = personRepo.findById(personId).get();
		int cash = person.getCash();
		
		if (place.getIsClaimed() == 0) {
			cash = cash - place.getBuy();
			person.setCash(cash);
			place.setIsClaimed(1);
		} else if (place.getIsClaimed() == 1) {
			cash = cash - place.getRent();
			person.setCash(cash);
		}
		if(cash<0) {
			System.out.println("Sorry Game Over");
		}
		personRepo.save(person);

	}

}
