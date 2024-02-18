package com.hw2.model.dto;


public class Employee extends Person{
	
//	- position : String // 직책
	
	private String position; 
	
//	+ Employee(String id, String name, String
//	position)
//	+ getInfo() : String
	
	public Employee() {}

	@Override
	public String getInfo() {
		return "ID : " + id + ", 이름 : " + name + ", 직책 : " + position;
	}
	//오버라이딩하여 객체 정보를 문자열로
	//
	//반환한다
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	//매개변수로 전달받은 id, name은
	//부모생성자를 이용해 초기화하고, position은
	//this 참조변수 이용하여 직접 초기화한다
	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}
	
}
