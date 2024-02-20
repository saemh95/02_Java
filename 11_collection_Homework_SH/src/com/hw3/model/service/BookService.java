package com.hw3.model.service;

import java.util.*;

import javax.annotation.processing.AbstractProcessor;

import com.hw3.model.dto.*;
public class BookService {

	private List<Book> book = new ArrayList<>();
	private List<Book> bookmark = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public BookService() {
		book.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		book.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
	}
	
	
	public void displayMenu() {
		
		int menuNum = 0;
			do {
				System.out.println("\n-----도서 목록 프로그램-----");
				System.out.println("\n1. 도서 등록");
				System.out.println("\n2. 도서 조회");
				System.out.println("\n3. 도서 수정");
				System.out.println("\n4. 도서 삭제");
				System.out.println("\n5. 즐겨찾기 추가");
				System.out.println("\n6. 즐겨찾기 삭제");
				System.out.println("\n7. 즐겨찾기 조회");
				System.out.println("\n8. 추천도서 뽑기");
				System.out.println("\n0. 프로그램 종료");
				
				System.out.print("\n메뉴를 입력하세요 : ");
				try {					
					menuNum = sc.nextInt();
					switch (menuNum) {
					case 1 : System.out.println(bookAdd());
						break;
					case 2 : bookShow();
						break;
					case 3 : System.out.println(bookUpdate());
						break;
					case 4 : 
						break;
					case 5 : 
						break;
					case 6 : 
						break;
					case 7 : 
						break;
					case 8 : 
						break;
					case 0 : System.out.println("프로그램 종료");
					break;
					default :
						System.out.println("잘못 입력하셨습니다");
					}
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력하세요");
					sc.nextLine();
					menuNum = -1;
				}
			} while (menuNum != 0);
			
		
	}
	
	public String bookAdd() throws InputMismatchException{
		System.out.println("\n-----도서 등록-----\n");
		System.out.print("도서 번호 : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 제목 : ");
		String name = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		if (book.add(new Book (id, name, author, price, publisher))) {
			return "등록 완료";
		} else {	
			return "등록 중단";
		}			
	}
	public void bookShow() throws InputMismatchException {
		System.out.println("\n-----도서 조회-----\n");
		if (book.isEmpty()) {
			System.out.println("검색할 도서가 없습니다");
		} else {
			for (Book book : book) {
				System.out.println(book.toString()); 
			}
		}		
	}
	
	
	
	public String bookUpdate() {
		return null;
	}
	
	public String bookRemove() {
		book.remove(0);
		return null;
	}
	
	public void bookmarkAdd(int id) {
		bookmark.add(book.get(id));
	}
	
	public void bookmarkRemove(int id) {
		bookmark.remove(book.get(id));
	}
	
	public String bookmarkShow() {
		return book.toString();
	}
	
	public int randomBook() {
		int random = (int) (Math.random()*book.size());
		return random;
		
	}
	
}
