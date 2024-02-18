package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.service.*;
public class Run {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//		Company의 생성자를 이용아혀 10칸짜리 Employee 개체배열 생성하는 Company
//		객체를 생성하여 ManagementSystem 자료형의 company에 주소를 저장
		
		Company company = new Company(10);
//		Prison의 생성자를 이용하여 10칸짜리 Employee 개체배열 생성하는 Prison
//		객체를 생성하여 ManagementSystem 자료형의 prison에 주소를 저장
		
		Company prisoner = new Company(10);
//		2명정도 직원 새로 등록하기
//		등록된 전체 직원 조회
		
		Employee employee1 = new Employee("EMP001", "유재석", "기획팀");
		Employee employee2 = new Employee("EMP002", "정현돈", "개발팀");
		
//		Employee addPerson = new Employee();
		company.addPerson(employee1);
		company.addPerson(employee2);
		company.displayAllPerson();
		
//		new Company(0).addPerson(person);
//		new person = 
		
//		2명 정도 수감자 새로 등록하기
//		등록된 전체 수감자 조회
		
//		EMP001 id를 가직 직원 삭제
//		1205 id를 가진 수감자 삭제
		
//		현재 남은 직원 모두 조회
//		현재남은 수감자 모두 조회
	}
}
