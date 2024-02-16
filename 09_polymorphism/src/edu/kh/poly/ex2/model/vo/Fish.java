package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal{

	public Fish () {}
	
	public Fish (String type, String eatType) {
		super(type, eatType);
	}
	@Override
	public void eat() {
		 System.out.println("뻐금뻐금");
		
	}

	@Override
	public void breath() {
		 System.out.println("물속에서");
		
	}

	@Override
	public void move() {
		 System.out.println("꼬리사용");
		
	}

	@Override
	public String toString() {
		return "Fish : " + super.toString();
	}

	
}
