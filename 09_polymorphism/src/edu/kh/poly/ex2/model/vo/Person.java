package edu.kh.poly.ex2.model.vo;

public class Person extends Animal {

	private String name;
	public Person () {}
	
	public Person (String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("먹어");
		
	}

	@Override
	public void breath() {
		System.out.println("쉼쉬어");
		
	}

	@Override
	public void move() {
		System.out.println("다리사용");
		
	}

	@Override
	public String toString() {
		return "Person : " + super.toString() + " / " + name;
	}
	
}
