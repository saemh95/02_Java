package edu.kh.poly.ex2.model.vo;

// alt+shift+R = rename all
public abstract class Animal {
	
//	추상 클래스 (abstract class)
//	1. 미완성 메서드를 보유하고 있는 클레스
//	2. 객체로 만들면 안되는 클래스
//	-> 여러 타입들을 관리하기 위한 상위 타입
//	객체로 생성하여 사용하기 위한 목적이 X
	
//	field
	
//	-추상 클래스는 new 연사자를 통해 직접적인 개체 생성은 불가능하지만
//	상속받은 자식객체 생성시 내부에 부모 부분이 생성될때 새용한다.
	
	private String type;
	private String eatType;
	
	public Animal() {}
	
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}

	@Override
	public String toString() {
		return type + " / " + eatType;
	}
	
	
	public abstract void eat();
	public abstract void breath();
	public abstract void move();
	
}
