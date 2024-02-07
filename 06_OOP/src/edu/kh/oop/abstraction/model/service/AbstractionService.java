package edu.kh.oop.abstraction.model.service;


import edu.kh.oop.abstraction.model.vo.*;
public class AbstractionService {
// ctrl + shift + o == import everything
	public void ex1() {
		
//		국민 객체 만들기
		People people1 = new People();
		People people2 = new People();
		People people3 = new People();
		
		
//	** 클래스 이름이 자료형처럼 사용된다
//		== 그래서 클래스를 "사용자 저의 자료형"
		
		people1.setName("홍길동");
		people1.setGender('남');
		people1.setpNo("910225-1235261");
		people1.setAddress("서울시 중구 남대문구 120 그레이츠청계 3층");
		people1.setAge(33);
		people1.setPhone("010-1526-5843");

		people2.setName("남길동");
		people2.setGender('여');
		people2.setpNo("920225-1235261");
		people2.setAddress("서울시 중구 남대문구 120 그레이츠청계 3층");
		people2.setAge(31);
		people2.setPhone("010-5833-1562");
		
		people3.setName("홍샘");
		people3.setGender('남');
		people3.setpNo("950104-1037217");
		people3.setAddress("서울시 성동구 용답동");
		people3.setAge(30);
		people3.setPhone("010-4964-7684");
		
		System.out.println(people1.getName());
		System.out.println(people1.getGender());
		System.out.println(people1.getpNo());
		System.out.println(people1.getAddress());
		System.out.println(people1.getAge());
		System.out.println(people1.getPhone());
		
		System.out.println();
		
		System.out.println(people2.getName());
		System.out.println(people2.getGender());
		System.out.println(people2.getpNo());
		System.out.println(people2.getAddress());
		System.out.println(people2.getAge());
		System.out.println(people2.getPhone());
		
		System.out.println();
		
		System.out.println(people3.getName());
		System.out.println(people3.getGender());
		System.out.println(people3.getpNo());
		System.out.println(people3.getAddress());
		System.out.println(people3.getAge());
		System.out.println(people3.getPhone());
		people3.tax();
		
	}
	
	
	
}
