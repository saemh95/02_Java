package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.*;
public class Run {

	public static void main (String[] args) {
		
		MemberService service = new MemberService(); 
		service.displayMenu();
		
//		MemberService(); 기본생성자가 작성 되어있지 않지만
//		컴파일러가 코드를 번역할때
//		클래스 내부에 생성자가 하나도 없다면
//		자동으로 기본생성자를 추가해주기 때문에
//		문제 없이 사용가능
	}
	
}
