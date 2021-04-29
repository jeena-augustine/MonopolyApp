package com.demo.monopoly.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Place {

	@Id
	private int id;

	private String placeName;
	private int buy;
	private int rent;
	private int isClaimed;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getBuy() {
		return buy;
	}

	public void setBuy(int buy) {
		this.buy = buy;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getIsClaimed() {
		return isClaimed;
	}

	public void setIsClaimed(int isClaimed) {
		this.isClaimed = isClaimed;
	}

}
