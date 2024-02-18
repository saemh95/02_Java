package com.hw2.model.service;

import com.hw2.model.dto.*;

public interface ManagementSystem {

//	+ abstract addPerson(Person person) : void
//	+ abstract removePerson(String id) : void
//	+ abstract displayAllPersons() : void
	
	void addPerson(Person person);
	void removePerson(String id);
	void displayAllPerson();
	
}
