package edu.kh.oop.practice.model.service;


import edu.kh.oop.practice.model.*;
import edu.kh.oop.practice.model.vo.Book;
public class BookService {

	public void practice() {
		
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력

		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력

		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		System.out.printf("%s, %d, %.1f, %s\n", b1.getTitle(), b1.getPrice(), b1.getDiscountRate(), b1.getAuthor());
		b2.setTitle("자바의정석");
		b2.setPrice(30000);
		b2.setDiscountRate(0.2);
		b2.setAuthor("남궁성");
		
		System.out.printf("%s, %d, %.1f, %s\n", b2.getTitle(), b2.getPrice(), b2.getDiscountRate(), b2.getAuthor());
		System.out.println("=====================");
	
		System.out.println("수정된 결과 확인");
		Book b3 = new Book("C언어", 30000, 0.1, "홍길동");
		System.out.println("=====================");
		
		double price2 = b3.getPrice();
		double dc2 = b3.getDiscountRate();
		
		int rate2 = (int) (price2*dc2);
		
		int b2rate = (int) (price2-rate2);
		System.out.println("도서명 = " + b3.getTitle());
		System.out.println("할인된 가격 = " + b2rate);		
				
		
		double price = b2.getPrice();
		double dc = b2.getDiscountRate();
		
		int rate = (int) (price*dc);
		
		int b1rate = (int) (price-rate);
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = " + b1rate);	
	}
}
