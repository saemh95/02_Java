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
	
}
