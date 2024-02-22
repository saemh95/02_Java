package com.hw4.teacher.toyFactory.model.dto;

import java.util.*;

public class Toy {


	private String name;
	private int age;
	private int price;
	private String color;
	private int manuDate;
	private Set<String> materials;
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getManuDate() {
		return manuDate;
	}
	public void setManuDate(int manuDate) {
		this.manuDate = manuDate;
	}
	public Set<String> getMaterials() {
		return materials;
	}
	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	
	
	public Toy() {
		
	}
	
	
	public Toy(String name, int age, int price, String color, int manuDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manuDate = manuDate;
		this.materials = materials;
	}
	//	materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder();
		
		for (String material : materials) {
			sb.append(material).append(", ");
		}
		
//		마지막 쉼표와 공백 제거하기
		if(sb.length()>0) {
			sb.setLength(sb.length()-2);
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " / 사용가능한연령 : " + age + " / 각격 : " + price + " / 색상 : " + color + " / 재조년월일 : " + manuDate
				+ " / 제료 : " + getMaterialsAsString();	
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, manuDate, materials, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && manuDate == other.manuDate
				&& Objects.equals(materials, other.materials) && Objects.equals(name, other.name)
				&& price == other.price;
	}
	public int compareTo(Toy other) {
		return this.name.compareTo(other.name);
	}
	
	
	
}
