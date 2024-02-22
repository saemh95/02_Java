package com.hw4.teacher.toyFactory.run;

import com.hw4.teacher.toyFactory.model.service.ToyFactory;

public class ToyRun {

	public static void main(String[] args) {
		ToyFactory service = new ToyFactory();
		service.displayMenu();
	}
	
}
