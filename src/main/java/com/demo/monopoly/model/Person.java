package com.demo.monopoly.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Person {
	@Id
	private String id;

	private String personName;

	private int cash;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPerson_name() {
		return personName;
	}

	public void setPerson_name(String person_name) {
		this.personName = person_name;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

}
