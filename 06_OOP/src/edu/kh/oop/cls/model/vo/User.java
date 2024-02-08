package edu.kh.oop.cls.model.vo;

public class User {
	
//	속성 
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
//  --기능
	
//	-생성자 (constructor)
	
//	기본생성자 (default constructor)
	public User() {
		
//		기능
		System.out.println("default constructor");
		
//		field initialization
		userId = "user01";
		userPw = "pass01";
		userName = "오어회";
		userAge = 20;
		userGender = 'M';
		
		
	}

//	매개변수 생성자
//	** overloading, this., parameter
	
	public User(String userId, String userPw) {
		
		System.out.println("para meter constructor");
		System.out.println(userId + " / " + userPw);
		
		this.userId = userId;
		this.userPw = userPw;
		
	}
	
	public User(String userId, String userPw, String userName, int userAge, char userGender) {
		
		this(userId, userPw);
		System.out.printf("This is user\n %s\n %s\n %s\n %d\n %c\n", userId, userPw, userName, userAge, userGender);
		
//		this.userId = userId;
//		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	
//	public User(){
//		
//	}
	
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	public char getUserGender() {
		return userGender;
	}


	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
}
