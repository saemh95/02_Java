
package edu.kh.oop.abstraction.model.vo;

// vo == value object
//	MVC == model view controller

public class People {

//	국민 가지고있는 속성
//	이름 성별 주민번호 주소 전화번호 나이
	
//	field == field function == member function == class function
	private String name;
	private char gender;
	private String pNo;
	private String address;
	private String phone;
	private int age;
	
//	alt + shif + s or source
//	Generate Getters and Setters
//	selecAll -> generate
	
	
	
	
//	기능 == 행동 == method
	public void tax() {
		System.out.println("Pay Your Tax");
	}
	
	public void vote() {
		System.out.println("Vote Your Vote");
	}
	
	
//	name 변수의 값을 돌려 보내주는 간접 접근 기능
	
//	void : 반환할 값이 없다
//	<-> 반환할 값이 있을 경우 그값의 자료형을 작성(반환형)
	public String getName() {
		return name;
	}

// name 변쉐 값을 세팅하는 간접 접근 기능
	public void setName(String name) {
//		매개변수 String name
//		-> String 타입의 데이터를 전달받아 저장하고 있는 변수
//		** this : 현재 객체
//		멤버변수 name 에 배개 변수 name 을 대입시키는 역할
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
