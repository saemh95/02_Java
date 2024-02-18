package com.hw1.model.dto;

public class Poetry extends Book{

//	- numberOfPoems : int // 시 수
	
	private int numberOfPoems;
	
//	+ Poetry()
//	+ Poetry(String title, String author, int
//	numberOfPoems)
//	+ displayInfo() : void
	
	public Poetry() {}

	@Override
	public void displayInfo() {
		System.out.println("[시집] " + getTitle() + "/ 저자 : " + getAuthor() + " / " + "시수 : " + numberOfPoems);
		
	}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
}
