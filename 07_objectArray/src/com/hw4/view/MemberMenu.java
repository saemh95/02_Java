package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {

	private MemberController mc = new MemberController();
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
//		반복문을 이용하여 메인 메뉴를 반복적으로 실행 (각 메뉴 별 서브메뉴 호출)
	}
	
	public void insertMember() {
//		메인 메뉴에서 1번 선태시 실행되는 메소드이며 등록할 회원에 대한 정보를 입력받고
//		동일한 아이디가 없는 경우 MemberController의 insertMember 메소드 실행
		int memberCount = mc.getMemberCount(); 
		
//		1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
		
		if (memberCount>MemberController.SIZE) {
			System.out.println("회원 수가 최대치에 도달했습니다");
			return;
		}
		
//		2. 아이디를 입력 받아 MemberControllerdml checkId() method ->> 결과 값
		System.out.println("--------신규 회원 등록--------");
		System.out.print("아이디 입력 : ");
		String userId = sc.next();
		
		if (mc.checkId(userId)!=null) {
//			2-1. 결과 값이 null이 아닌 겨우 즉, 동일한 아이디가 존재하는 경우
//			"동일한 아이디가 존재합니다. 회원등록 실패" 출력
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			return;
		} 
//		2-2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
//		나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이, 성별, 이메일)
//		입력받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성후
//		MemberController의 insertMember() method 전달
//		"성공적으로 회원 등록이 되었습니다." 출력
		System.out.print("비밀번호 : ");
		String userPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String userPw2 = sc.next();
		System.out.print("이름 : ");
		String userName = sc.next();
		System.out.print("나이 : ");
		int userAge = sc.nextInt();
		System.out.print("성별 : ");
		char userGender = sc.next().charAt(0);
		System.out.print("이메일 : ");
		String userEmail = sc.next();
		
		if (userPw.equals(userPw2)) {
			Member newMember = new Member(userId, userPw, userName, userAge, userGender, userEmail);
			
			mc.insertMember(newMember);
			System.out.println("성공적으로 회원 등록이 되었습니다");
		} else {
			System.out.println("비밀번호 불일치");
		}	
		

		
	}
	
	public void searchMember() {
//		메인 메뉴에서 2번 선태시 실행되는 서브메뉴 -> 반복실행 각 서브메뉴에 해당하는 검색 내용을 입력 받고
//		MemberController의 searchMember 메소드 실행
	}
	public void updateMember() {
//		메인 메뉴에서 3번 선태시 실행되는 서브메뉴 -> 반복실행 각 서브메뉴에 해당하는 수정할 내용을 압력 받고
//		MemberController의 searchMember 메소드 실행

	}
	
	public void deletMember() {
//		메인 메뉴에서 4번 선택시 실행되는
//		메소드이며 삭제할 회원 아이디를
//		입력 받고 MemberController의
//		deleteMember 메소드 실행
	}
	
	public void pritAllMember() {
//		메인 메뉴에서 5번 선택시 실행되는
//		메소드이며 MemberController의
//		getMem 메소드 실행의 결과 값을
//		반복문을 통해 출력
	}
	
	public void sortMember() {
//		메인 메뉴에서 6번 선택시 실행되는
//
//		서브메뉴 → 반복실행
//		각 서브메뉴에 해당하는
//		MemberController의 정렬
//		메소드들을 실행함으로써 그 결과
//		값으로 반복문을 통해 출력
	}
	
	
}
