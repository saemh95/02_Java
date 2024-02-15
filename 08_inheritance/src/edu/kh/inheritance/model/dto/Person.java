package edu.kh.inheritance.model.dto;

public class Person {

//	DTO (Data Transfer Object) : 비지니스 계충과 데이터 교환을 위해 사용하는 객체
//	object class
//	- highest parent in a class
//	- if there is no inheritance in a class -> compiler default add "extends Object"
	
	
	
//	field
	private String name;
	private int age;
	private String nationality;
//	private char gender;
//	private String address;
	
//	Constructor 
	public Person() {}

//	parameterized constructor
	public Person(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	
//	method
//	getter/setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void breath () {
		System.out.println("사람은 코나 입으로 숨을 쉰다");
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다");
	}

	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
	}
	
	
	
}
