package com.hw1.model.dto;

public class Friend {

	private String name;
	
	public Friend() {
		
	}

	public Friend(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void pickLeader(Friend friend) {
		
		
		System.out.println(name + " 골목대장 축하");
	}
}