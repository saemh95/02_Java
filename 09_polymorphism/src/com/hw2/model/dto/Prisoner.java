package com.hw2.model.dto;

public class Prisoner extends Person{

//	- crime : String // 죄목
	
	private String crime;

	
	
//	+ Prisoner(String id, String name, String crime)
//	+ getInfo() : String
	
	
//	매개변수로 전달받은 id, name은
//	부모생성자를 이용해 초기화하고, crime은
//	this 참조변수 이용하여 직접 초기화한다
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}
	
	
//	오버라이딩하여 객체 정보를 문자열로
//
//	반환한다
	@Override
	public String getInfo() {
		return "ID : " + id + ", 이름 : " + name + ", 죄목 : " + crime;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	
}
