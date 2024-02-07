package edu.kh.oop.basic;


import java.util.Scanner;
import java.util.Arrays;
public class Account {
	
	Scanner sc = new Scanner(System.in);
	
//	이름
//	게좌번호
//	잔액
//	비밀번호
	
//	method
	
	private String name;
	private String accountNumber;
	private int balance;
	private String pw;
	
	
//	getter/setter
//	deposit() : 전달받은 금액을 잔액에 누적한후, 현재 잔액을 콘솔에 출력
//	withdraw() : 비밀번호와 출금한 금액을 전달받아와서,  조건에 맞으면 잔액에서 차감후 현재 잔액 출력
//				1) 비밀번호와 일치하지 않으면 "비밀번호 불일치" 출력
//				2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
//	Balance -- withdraw/deposit
	public int getBalance() {
		System.out.println(balance);
		return balance;
	}
	public void deposit (int amount) {
//		amount = sc.nextInt();
		balance += amount;
//		this.balance = amount;
		System.out.println(name + "의 현재 잔액 : " + balance);
	}
	
	public void withdraw (String password, int withdraw) {
		if(!pw.equals(password)) {			
			System.out.println("비밀번호 불일치");
		} else if (withdraw>balance) {
			System.out.println("잔액 부족");
		} else {
			balance -= withdraw;
			System.out.println(name + "의 현재 잔액 : " + balance);
		}
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	pw
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
