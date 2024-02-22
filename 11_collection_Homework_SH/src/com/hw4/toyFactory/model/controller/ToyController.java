package com.hw4.toyFactory.model.controller;

import java.util.*;

import com.hw4.toyFactory.model.dto.Toy;
import com.hw4.toyFactory.service.ToyManagement;
public class ToyController implements ToyManagement {
	
	Toy toy = new Toy();
	private Set<Toy> toys = new HashSet<Toy>();
	
//	private List<Toy> toys = new ArrayList<>();
//	Toy toy = new Toy();
	@Override
	public void showToy() {
		for(Toy toy : toys) {
	         System.out.println(toy);
	      }

	}

	public Set<Toy> getToys() {
		return toys;
	}


	public void setToys(Set<Toy> toys) {
		this.toys = toys;
	}

	@Override
	public void addToy(Toy toy) {
		toys.add(toy);
		if (!toys.contains(toy)) {
			System.out.println(toy.getName() + " : 장난감에 추가되었습니다");
		}
		
	}

	@Override
	public void removeToy(String name) {
		for (Toy toy : toys) {
			if(toy.getName().equals(name)) {				
				toys.remove(toy);
			} else {
				System.out.println("존제하지 않는 장난감 입니다");
				return;
			}
		} 
		System.out.println("장난감 삭제 완료");
		
	}

	@Override
	public void sortToyByDate() {
		Comparator<Toy> ss = Comparator.comparing(Toy::getManuDate);
		
		List<Toy>toys=new ArrayList<>();
		
		for(Toy toy : toys) {
			toys.add(toy);
		}
		
		Collections.sort(toys, ss);
		 for(Toy toy : toys) {
	         System.out.println(toy);
	      }         
	}

	@Override
	public void sortToyByAge() {
		Comparator<Toy> ss = Comparator.comparing(Toy::getAge);
		
//		Collections.sort(toys, ss);
//		for(Toy toy : toys) {
//			System.out.println(toy);
//		}
		
	}

	
	@Override
	public void removeRecipe(Toy toy, Integer materialName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRecipe(String name) {
		
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(toy, toys);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToyController other = (ToyController) obj;
		return Objects.equals(toy, other.toy) && Objects.equals(toys, other.toys);
	}

	
	
	
	
}
