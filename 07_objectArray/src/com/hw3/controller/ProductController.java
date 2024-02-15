package com.hw3.controller;

import com.hw3.model.vo.Product;
import java.util.Scanner;
public class ProductController {

	private Product[] pro = null;
	
	public static int count = 0;
	Scanner sc = new Scanner(System.in);
	{
		pro = new Product[10];
	}
	public void mainMenu() {
		int menuNum = 0;
		
		do {
		System.out.println("----------제품 관리 메뉴----------");
		System.out.println("1. 제품 정보 추가");
		System.out.println("2. 제품 전체 조회");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("메뉴 선택 : ");
		menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 : productInput();
				break;
			case 2 : productPrint();
				break;
			case 0 : System.out.println("프로그램 종료");
				break;
			default : System.out.println("0~2 번만 입력하세요");
			}
		} while(menuNum!=0);
		
	}
	
	
	public void productInput() {
//		키보드로 도서 정보를 입력 받아 객체 생성
//		-> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
//		현재 카운트 인덱스에 생성한 주소 저장
		System.out.println("----------제품 정보 추가----------");
		
		System.out.print("제품 번호 : ");
		int inputPId = sc.nextInt();
		System.out.print("제품명 : ");
		String inputPName = sc.next();
		System.out.print("가격 : ");
		int inputPrice = sc.nextInt();
		System.out.print("세금 : ");
		double inputTax = sc.nextDouble();
		
		pro[count] = new Product(inputPId, inputPName, inputPrice, inputTax);
				
	}
	
	public void productPrint() {
//		현재까지 기록된 도서 정보 모두 출력
		
		for (int i=0; i<count;i++) {
			System.out.println(pro[i].information());
		}
	}
	
//	추가적으로 제품 삭제, 수정, 검생 등등의 메소드를 응용해서 추가해보세요
}
