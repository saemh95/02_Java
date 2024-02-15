package edu.kh.oarr.model.service;

import java.util.Scanner;
import edu.kh.oarr.model.vo.*;
public class MemberService {

	private Scanner sc = new Scanner(System.in);
	private Member memberArr[] = new Member[5];
	private Member loginMember = null;
	
	public MemberService() {
		
		memberArr[0] = new Member("Squid", "1234", "스퀴드", 13, "지중해");
		memberArr[1] = new Member("Octopus", "qwer", "문어", 12, "서해안");
		memberArr[2] = new Member("Crab", "0000", "킹크랩", 11, "동해안");
		
	}
	public void displayMenu() {
		
		int menuNum = 0;
		do {
			System.out.println("---------회원 정보 관리 프로그램 v2---------");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : System.out.println(signup()); break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(searchUser());break;
			case 4 : 
				int result = updateUser();
				
				if (result == -1) {
				System.out.println("---------로그인 먼저 하세요---------");
			} else if (result == 0) {
				System.out.println("---------아이디/비밀번호 불일치---------");
			} else {
				System.out.println("---------수정 완료---------");
			};break;
			case 5 : searchRegion();break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.print("잘못 입력하셨습니다");
			}
		} while (menuNum!=0);
	}
//	memberArr의 비어있는 인덱스 번호를 return; method
//	단, 비어있는 인덱스가 없다면 return -1;
	
	public int emptyIndex() {
//		memberArr 배열을 0인덱스 부터 끝까지 접근해서
//		참조하는 값이 null 인 경우의 인겍스를 반환
		for(int i=0;i<memberArr.length;i++) {
			if(memberArr[i]==null) {
				return i;//현재 method exit -> give data back to where it is 호출
			}
		}
		//for - memberArr[i] but there is not if then return -1;
		return -1;
	}
	public String signup() {
		
		int index = emptyIndex();
		
		if (index==-1) {
			return"회원가입 불가, 자리소멸";
		} 
		
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
		System.out.print("지역 : ");
		String memberRegion = sc.next();
		
		if(memberPw.equals(memberPw2)) {
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, memberRegion);
			
			return "---------회원가입 성공---------";
			
		}else {
			return "---------비밀번호 불일치---------";
		}
	}
	
	public String login() {
		
		System.out.println("---------로그인---------");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
//		1)meberArr 배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
		for (int i=0; i<memberArr.length;i++) {
			
			if(memberArr[i]!=null) {
				
//				2) 회원정보의 아이디, 비밀번호와
//				입력받은 아이디, 비밀번호 일치
				if(memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {
					
					loginMember = memberArr[i];
					break;
				}
			}
			
		}
//		4) 로그인 성공/실패 여부에 따라 결과값 반환
		if (loginMember == null) {
			return "---------로그인 실페---------";
		} else {
			return loginMember.getMemberName() + "님 환영합니다";
		}
		
	}
	public void searchRegion() {
		
		System.out.println("---------회원 검색(지역)---------");
		
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		boolean flag = true;
//		1) memberArr 배열의 모든 요소 순차 접근
		for(int i=0;i<memberArr.length;i++) {
//			2) memberArr[i] 요소가 null 인 경우 반복 종료
			if(memberArr[i] == null) {
				break;
			}
			
			if(memberArr[i].getMemberRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s\n이름 : %s\n", memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false;
			}
		}
		
		if(flag == true) {
			System.out.println("일치하는 검색 결과가 없습니다");
		}
	}
	
	public String searchUser() {
		
		System.out.println("---------회원 정보 조회---------");
		
		
			if (loginMember == null) {
				return "---------로그인 먼저하세요---------";
			} 
			
			String str = "아이디 : " + loginMember.getMemberId();
			str += "\n이름 : " + loginMember.getMemberName();
			str += "\n나이 : " + loginMember.getMemberAge();
			str +=  "\n지역 : " + loginMember.getMemberRegion();
			return str;
	}
			

	
	public int updateUser() {
		System.out.println("---------회원정보 수정---------");


		if(loginMember == null) {
			return -1;
		} 	
		System.out.print("수정할 이름 : ");
		String updateName = sc.next();
		System.out.print("수정할 나이 : ");
		int updateAge = sc.nextInt();
		System.out.print("수정할 지역 : ");
		String updateRegion = sc.next();
		
	
		System.out.print("비밀번호 입력: ");
		String memberPw = sc.next();
		if (memberPw.equals(loginMember.getMemberPw())) {
			loginMember.setMemberName(updateName);
			loginMember.setMemberAge(updateAge);
			loginMember.setMemberRegion(updateRegion);
			return 1;
		} else {
			return 0;
		}
	}
}
