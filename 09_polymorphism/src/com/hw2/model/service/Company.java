package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.*;

public class Company implements ManagementSystem{

	
	
//	- employees : Employee[] // 전체 직원 저장용
//	배열
//	- employeeCount : int // 직원수
	
	private Employee[] employees;
	private int employeeCount;
	
//	+ Company(int size)
//	+ addPerson(Person person) : void
//	+ removePerson(String id) : void
//	+ displayAllPersons() : void

//	매개변수로 전달받은 size를 이용하여
//	Employee 객체배열을 size 크기로 생성한다.
//	employeeCount는 0으로 초기화한다.
//	public Company() {}
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}
	
	

	
	@Override
	public void addPerson(Person person) {
//		추상메서드를 상속받아 오버라이딩
//		해야하는 메서드. 매개변수로 전달받은
//		Person 객체가 Employee 클래스의
//		인스턴스이며, 배열에 공간이 있다면, 해당
//		객체를 employees 배열에 추가 후 추가된
//		객체의 정보를 출력.
//		만약 배열에 더 이상 공간이 없다면, 인원이
//		모두 충원되었다는 메시지 출력
		
		if (employeeCount < employees.length) {
			employees[employeeCount] = (Employee) person;
			employeeCount++;
			System.out.println("직원이 추가되었습니다 - " + person.getInfo());
//			return;
		} else {
			System.out.println("인원이 모두 충원되었습니다");
			
			
		}
	}

	@Override
	public void removePerson(String id) {
//		추상메서드를 상속받아 오버라이딩
//		해야하는 메서드. 매개변수로 전달받은 id와
//		일치하는 직원을 찾으면, 해당 직원을
//		삭제하고 관련 정보를 출력. 일치하는 id가
//		없다면 해당 id를 가진 직원을 찾을 수 없다는
//		메시지를 출력
		for (int i=0;i<employees.length;i++) {
			
			if (id.equals(employees[i].getId())) {
				i--;
				System.out.println("직원이 삭제되었습니다 - " + employees[i].getInfo());
			} else {
				System.out.println("직원을 찾을 수 없습니다");
			}
		}
		
	}

	@Override
	public void displayAllPerson() {
//		추상메서드를 상속받아 오버라이딩
//		해야하는 메서드. 전체 직원 명단을 출력하는
//		기능
		for (int i=0;i<employees.length;i++) {
//			employees[i] = new Employee().getInfo();
			
			
			System.out.println(employees[i].getInfo());
			
		}
		
	}




	public Employee[] getEmployees() {
		return employees;
	}




	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}




	public int getEmployeeCount() {
		return employeeCount;
	}




	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	

	
}
