package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.*;

public class ClsService /* extends Student */ {

	public void ex1() {
//		클래스 접근 제한자 확인하기
		
		Student std = new Student();
		std.ex();
		
		System.out.println(std.v1);
//		System.out.println(std.v2);
//		System.out.println(std.v3);
//		System.out.println(std.v4);
		
//		inherited
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
//		System.out.println(v4);
		
	}
	public void ex2() {
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.setName("어엄우");
		std1.setName("성생싱");
		
		System.out.println(std1.schoolName);
		
//		schoolName에 경고 => 제대로 작성을 안해서
		
//		static이 붙은 필드 == 'class.function'
		
		System.out.println(Student.schoolName);
		Student.schoolName = "KH정보교육원";
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
//		static
//		== shared memory
//		how to use) className.function
	}
	
}
