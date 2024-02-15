package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.*;
public class InheritanceService {

//	비즈니스 로직 처리하는 클래스
	
	
//	상속 확인 예제
	
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("Squid");
		p.setAge(25);
		p.setNationality("Atlantic Ocean");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println();
		
//		Person -> Student inheritance
		Student s = new Student();
		
		s.setGrade(3);
		s.setClassRoom(5);
		s.setName(p.getName());
		s.setAge(p.getAge());
		s.setNationality(p.getNationality());
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getNationality());
		System.out.println(s.getGrade());
		System.out.println(s.getClassRoom());
		
		Employee e = new Employee();
		
		e.setAge(35);
		e.setCompany("KH Academy");
		e.setName("King Crab");
		e.setNationality("Artic Ocean");
		
		System.out.println();
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getNationality());
		System.out.println(e.getCompany());
		System.out.println();
		
		p.breath();
		p.move();
		s.breath();
		s.move();
		e.breath();
		e.move();
		
	}
	
	public void ex2() {
//		Student 매개변수 5개짜리 생성자
		
		Student s = new Student("Squid", 15, "Artic Ocrean", 1, 3);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getNationality());
		System.out.println(s.getGrade());
		System.out.println(s.getClassRoom());
	}
	
	public void ex3() {
		Student s = new Student();
		Employee e = new Employee();
		
		s.move();
		e.move();
	}
	
	public void ex4() {
		
		Person p = new Person("Squid", 5, "Atlantic Ocean");
		Student s = new Student("King Crab", 10, "Artic Ocea", 3, 16);
		Employee e = new Employee("Octopus", 15,"Inadian Ocean", "Octopus Co.");
//		e.setName("Octopus");
//		e.setAge(15);
//		e.setNationality("Indian Ocean");
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(e);
		
	}
	
}
