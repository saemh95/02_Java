package com.hw4.toyFactory.model.dto;

import java.util.*;
public class Toy implements Comparable<Toy>{

	private String name;
	private int age;
	private int price;
	private String color;
	private int manuDate;
	private Map<Integer, String> materials = new HashMap<>();
	
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
//	public Map<Integer, String> getRecipe() {
//		return recipe;
//	}
//	public void setRecipe(Map<Integer, String> recipe) {
//		this.recipe = recipe;
//	}
//	
	public Toy() {
		
	}
	
	public Toy(String name, int age, int price, String color, int manuDate) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manuDate = manuDate;
//		this.recipe = recipe;
	}
	@Override
	public String toString() {
		return "이름 : " + name + " / 사용가능한연령 : " + age + " / 각격 : " + price + " / 색상 : " + color + " / 재조년월일 : " + manuDate
				+ " / 제료 : ";	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, manuDate, name, price);
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
				&& Objects.equals(name, other.name) && price == other.price;
	}
	@Override
	public int compareTo(Toy other) {
		return this.name.compareTo(other.name);
	}
	public Map<Integer, String> getMaterials() {
		return materials;
	}
	public void setMaterials(Map<Integer, String> materials) {
		this.materials = materials;
	}
	
	
}
