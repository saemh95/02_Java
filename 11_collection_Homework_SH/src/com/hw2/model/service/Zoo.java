package com.hw2.model.service;

import java.util.*;

import com.hw2.model.dto.*;

public class Zoo {
	private List<Animal> animals = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
//	private List<Animal> animals;
	public Zoo() {
//		animas = new ArrayList<Anima>();	
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		System.out.println("동물의 울음소리를 들어보세요.");
		for (Animal animal : animals) {
			animal.sound();
		}
		
//		((Tiger)animals.get(0)).sound();
//		((Monkey)animals.get(1)).sound();
//		
	}
	
	public void displayMenu() {
		int menuNum = 0;
		do {
			System.out.println("\n***** KH 동물원 *****\n");
			System.out.println("1. 동물 소리 듣기");
			System.out.println("2. 프로그램을 종료합니다");
			System.out.print("원하는 작업을 선택하세요 : ");
			try {			
				menuNum = sc.nextInt();
				switch(menuNum) {
				case 1 : showAnimals();
				break;
				case 2 : System.out.println("프로그램을 종료합니다.");
					break;
				default : System.out.println("잘못 입력 하셨습니다");
				}
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.nextLine();
			}
		}  while (menuNum != 2);
		sc.close();
	} 
	
}
