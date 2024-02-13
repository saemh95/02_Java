package edu.kh.oop.method.model.service;

import java.util.Scanner;
import edu.kh.oop.method.model.vo.Member;
public class MemberService {
	
//	필드
	private Scanner sc = new Scanner(System.in);
	private Member memberInfo = null; //가입한 회원의 정보를 저장할 변수
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수
	
//	기능
	
//	Method
	
//		메뉴화면출력기능
	public void displayMenu() {
		
		int menuNum = 0; //메뉴 선택용 변수 
		
		do {
			System.out.println("회원 정보 관리 프로그램");
			System.out.println("1. 화원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.hasNextLine();
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(logIn()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : 
				int result = updateMember();
				if(result == -1) {
					System.out.println("로그인후 이용해");
				} else if (result == 0) {
					System.out.println("비밀번호 불일치");
				} else {
					System.out.println("회원 정보 수정됨");
				}
				break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("0~4번호만 입력");
			}
			
		} while (menuNum!=0);
		
	}
//	회원가입 기능
	public String signUp() {
		
//		해당 메서드는 끝나고 호출한 곳으로 돌아갈때
//		Str 자로형 값을 가지고 돌아간다
		System.out.println("\n-------회원 가입--------");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
//		비밀번호, 비밀번호 확인 일치하면 회원가입
//		일치하지 않으면 회원가입 실패
		
		if (memberPw.equals(memberPw2)) {
			
//			입력받은 정보를 이용해서 Member 객체를 생성한후
//			생성된 객체의 주소를 필드에 있는 memberInfo 대입
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			
			return "\n---------회원가입 성공---------\n";
			
		} else {
			return "\n비밀번호 불일치. 회원가입 실패\n";
		}
				
	}
	
	public String logIn() {
		
		System.out.println("\n---------로그인---------");
		
		if (memberInfo == null) {
			return "회원가입 먼저해 이놈아";
		}
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		if (memberId.equals(memberInfo.getMemberId()) && memberPw.equals(memberInfo.getMemberPw())) {
			loginMember = memberInfo;
			return loginMember.getMemberName() + "님 로그인 성공\n";
		} else {
			return "\n잘못 입력하셨습니다\n";
		}
	}
	
	public String selectMember() {
		
//		1) 로그인 여부 확인  -> 로그인 안했을떄 "로그인 후 이용해주세요"
//		2) 로그인 되어있는 경우
//		회원 정보를 출력할 문자열을 만들어서 반환(return) 비밀번호 제외
		System.out.println("\n---------회원 정보 조회----------");
		if (loginMember==null) {
			return "로그인 후 이용해주세요";
		} 
		String str = "아이디 : "  + loginMember.getMemberId() +"\n";
		str += "이름 : " + loginMember.getMemberName() +"\n";
		str += "나이 : " + loginMember.getMemberAge() + "세\n";
		return str;
			
	}
	
	public int updateMember() {
		
		System.out.println("\n---------회원 정보 수정----------");
		
//		1) 로그인 여부 확인
		if (loginMember==null) {
			return -1;
		}
		
//		2) 로그인이 되어있을때
//		2-1) 수정할 회원 정보 입력 받기 (이름,나이)
		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		if(inputPw.equals(loginMember.getMemberPw())) {
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);			
			return 1;
		} else {
//			System.out.println("비밀번호 불일치");
			return 0;
		}
		

//		2-2) 비밀번호를 입력 받아서 로그인한 회원의 비밀번호와 일치하는지
//		-> 비밀번호 일치 : 로그인한 회원의 이름, 나이 정보를 입력받아 값으로 변경 후 return 1;
//		-> 비밀번호 다를 경우 return 0;
		
		
	}
	
}
