package edu.kh.oop.cls.model.vo;

public class Student {

	
//	필드 : 객체의 속성을 작성하는 클래스 내부 영역
//	==맴버 변수
//	instance function : 필드에 작성되는 이반 변수
//	private int age;
	
//	class function (== static function)
//	public static String schoolName;
	
//	필드 구성
	
//	[Access Modifiers]
//	+public #protected ~(default) -private
	
//	[Variable]
//	final, static, final static, static final
	
//	[Data tyoe]
//	default, (), array, class
	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	
	public void ex() {
		
		TestVO testVO = new TestVO();
		
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
//		System.out.println(v4);
	}
	
	public static String schoolName= "KH고등학교";
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
//	2. 생성자 ( constructor)
	
//	-new 연산자를 통해서 객체를 생성할때
//	생성된 객체의 필드 값이 초기화 + 지정된 기능을 수행하는 역할
	
//	-생성자 작성 규칙
//	1) 생성자의 이름은 반드시 class==constructor
//	2) 반환형이 존재하지 않는다
	
//	-생성자 종류
//	1) 기본 생성자
//	2) 매개변수 생성자
	
	
	public Student() {
		System.out.println("HELLOOOOOOOO");
	}
	public Student(int num1, int num2) {
		

	}
	
	
	
	
	
}
