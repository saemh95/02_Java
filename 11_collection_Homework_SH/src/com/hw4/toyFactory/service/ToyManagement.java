package com.hw4.toyFactory.service;

import java.util.Map;

import com.hw4.toyFactory.model.dto.Toy;

public interface ToyManagement {

	void showToy ();
	void addToy (Toy toy);
	void removeToy (String name);
	void sortToyByDate ();
	void sortToyByAge ();
	void addRecipe (String name);
	void removeRecipe (Toy toy, Integer materialName);
}
