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
		std2.setName("성생싱");
		
//		System.out.println(std1.schoolName);
		
//		schoolName에 경고 => 제대로 작성을 안해서
		
//		static이 붙은 필드 == 'class.function'
		
//		System.out.println(Student.schoolName);
		Student.schoolName = "KH정보교육원";
		
//		System.out.println(std1.schoolName);
//		System.out.println(std2.schoolName);
		
//		static
//		== shared memory
//		how to use) className.function
		
		
	}
	
	public void ex3() {
//		constructor test
		
		User u1 = new User();
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		System.out.println();
		
		User u2 = new User();
		u2.setUserId("squid");
		u2.setUserPw("hello2");
		u2.setUserName("회어오");
		u2.setUserAge(15);
		u2.setUserGender('M');
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		System.out.println();
		
		User user = new User("hello", "PASSWORDISTHIS");
		System.out.println(user.getUserId());
		System.out.println(user.getUserPw());
		
		User userNew = new User("ID IS THIS", "PASSWORD", "NAME", 10, 'M');
		
	}
	
	public void ex4() {
		
		User u1 = new User();
		User u2 = new User("오징어물회","squidpassword");
		User u3 = new User("Squid","Squidpassword","오물회",20,'M');
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge(), u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge(), u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge(), u3.getUserGender());
	}
	
}
