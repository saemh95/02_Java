package com.hw2.model.dto;


public abstract class Person{
	
//	# id : String // 고유번호
//	# name : String // 이름
	
	protected String id;
	protected String name;
	
//	+ Person(String id, String name)
//	+ abstract getInfo() : String // Person 정보를
//	문자열로 리턴
	public Person() {}
	
//	매개변수로 전달받은 id, name을 초기화한다
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	추상메서드
//	객체 정보를 문자열로 반환한다
	public abstract String getInfo();
	
	
}
