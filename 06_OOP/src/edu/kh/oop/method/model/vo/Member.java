package edu.kh.oop.method.model.vo;

public class Member {

//	필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	
//	생성자
	public Member() {}
//	ctrl + space ->first


	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	//	alt+shift+s -> Generate constructor and using field
	}
		
	//	public Member(String memberId, String memberPw, String memberName, int memberAge) {
	//		this.memberId = memberId;
	//		this.memberPw = memberPw;
	//		this.memberName = memberName;
	//		this.memberAge = memberAge;
	//	}
		
	// getter/setter
	public String getMemberId () {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}



//	메서드
	
}
