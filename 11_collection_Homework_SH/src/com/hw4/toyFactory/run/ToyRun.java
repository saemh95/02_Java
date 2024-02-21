package com.hw4.toyFactory.run;

import com.hw4.toyFactory.model.service.ToyService;

public class ToyRun {

	public static void main(String[] args) {
		
		ToyService service = new ToyService();
		service.displayMenu();
	}
	
}
