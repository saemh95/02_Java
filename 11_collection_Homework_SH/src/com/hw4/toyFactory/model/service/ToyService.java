package com.hw4.toyFactory.model.service;

import java.util.*;

import com.hw4.toyFactory.*;
import com.hw4.toyFactory.model.controller.ToyController;
import com.hw4.toyFactory.model.dto.*;
public class ToyService {
	
	ToyController controller = new ToyController();
	private Scanner sc = new Scanner(System.in);
	public ToyService () {		
		Toy toy = new ToyMaterial();

		controller.addToy(new ToyMaterial("파피", 12 , 57000, "빨간색", 19931225, 1, "면직물"));
		controller.addToy(new ToyMaterial("마미롱레그", 8, 36000, "분홍색", 19950805, 1, "면직물"));
		
	}
	public void displayMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회");
			System.out.println("2. 세로운 장난감 만들기");
			System.out.println("3. 장난감 삭제");
			System.out.println("4. 장난감 제조일 순으로 조회");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회");
			System.out.println("6. 제료 추가");
			System.out.println("7. 제료 삭제");
			System.out.print("선택 : ");
			try {
				menuNum = sc.nextInt();
				
				switch (menuNum) {
				
				case 1 : showToy();
					break;
				case 2 : addToy();
					break;
				case 3 : removeToy();
					break;
				case 4 : sortToyByDate();
					break;
				case 5 : sortToyByAge();
					break;
				case 6 : addRecipe();
					break;
				case 7 : removeRecipe();
					break;
				case 0 : System.out.println("프로그램 종료");
					break;
				default : System.out.println("0~7 까지만 선택해 주세요");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("잘못 선택하셨습니다");
				sc.nextLine();
			}
		} while (menuNum != 0);
		
		
	}

	private void removeRecipe() throws InputMismatchException{
		controller.removeRecipe(null, null);
		
	}

	private void addRecipe() throws InputMismatchException{
		System.out.println("<제료 추가>");
		
	}

	private void sortToyByAge() throws InputMismatchException{
		System.out.println("<연령별 사용 가능한 장난감 리스트 조회>");
		controller.sortToyByAge();
		
	}

	private void sortToyByDate() throws InputMismatchException{
		System.out.println("<장난감 제조일 순으로 조회>");
		
		controller.sortToyByDate();
		
	}

	private void removeToy() throws InputMismatchException{
		System.out.println("<장난감 삭제>");
		System.out.print("삭제할 장난감 이름 : ");
		String name = sc.next();
		controller.removeToy(name);
		
	}

	private void addToy() throws InputMismatchException{
		System.out.println("<세로운 장난감 만들기>");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("사용연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		System.out.print("제조년월일 : ");
		int manuDate = sc.nextInt();
		System.out.print("사용재료ID : ");
		int materialId = sc.nextInt();
		System.out.print("사용재료 : ");
		String materialName = sc.next();
		
		Toy toy = new ToyMaterial(name, age, price, color, manuDate, materialId, materialName);
		controller.addToy(toy);
		System.out.println("저장 완료");
		
	}

	private void showToy() throws InputMismatchException{
		System.out.println("<전체 장난감 조회>");
		
		Collections.sort(controller.getToys());
		for (Toy toy1 : controller.getToys()) {
			System.out.println(toy1);
		}
		controller.showToy();
		
	}
	
}
