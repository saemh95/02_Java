package edu.kh.collection.pack2.model.vo;

import java.util.Objects;

public class Person{

	private String name;
	private int age;
	private char gender;
	
	public Person(String name, int age, char gender) {
		super();
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	
//	same data == 동일, 동등
//	동일 : 가르키고있는 것이 같다
//	동등 : 값이 갇음
	
//	동일 비교 : Object.hashCode() override
//	hash 함수 : 값을 넣으면 같은 길이의 문자열이 반환되는 함수
	
	
	/*
	 * @Override public int hashCode() { return Objects.hash(name, age, gender); }
	 * 
	 * @Override public boolean equals(Object obj) {
	 * 
	 * if(obj == null) return false; if(obj == this) return true;
	 * 
	 * if(!(obj instanceof Person)) return false;
	 * 
	 * Person other = (Person)obj; return name.equals(other.name) && age ==
	 * other.age && gender == other.gender; }
	 */
	
	
}

