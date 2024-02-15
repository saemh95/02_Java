package edu.kh.inheritance.model.dto;

public /*final*/ class Employee extends Person{
	
	private String company;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age ,nationality);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
//	person - > method
//	move() method (override)
	
//	@Override 어노테이션 : 헤당 메셔드가 오버라이딩 되었음
	
//	@어노테이션(Annotation) : compiler annotation
	
	@Override
	public void move() {
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 움직인다");
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + company;
	}
	
//	final -> cannot be override
	
//	method의 기능이 변하면 안돼
	
	public final void onlyEmployee() {
		System.out.println("final method");
	}
	
	
	
}
