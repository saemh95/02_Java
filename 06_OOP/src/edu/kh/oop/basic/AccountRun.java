package edu.kh.oop.basic;


import java.util.Scanner;

public class AccountRun {
//	getter/setter
//	deposit() : 전달받은 금액을 잔액에 누적한후, 현재 잔액을 콘솔에 출력
//	withdraw() : 비밀번호와 출금한 금액을 전달받아와서,  조건에 맞으면 잔액에서 차감후 현재 잔액 출력
//				1) 비밀번호와 일치하지 않으면 "비밀번호 불일치" 출력
//				2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		acc.setName("홍샘");
		acc.setAccountNumber("010-4964-7684");
		acc.setBalance(1000000);
		acc.setPw("aaaa");
		
		
//		System.out.print("입금 금액 : ");
//		int deposit = sc.nextInt();
		
//		System.out.print("출금 금액 : ");
//		int withdraw = sc.nextInt();
//		System.out.print("비밀번호를 입력하세요 : ");
//		String password = sc.next();
//		acc.withdraw(password, withdraw);
		
		System.out.println(acc.getName());
		System.out.println(acc.getAccountNumber());
		acc.deposit(5000);
		
//		System.out.print("비밀번호를 입력하세요 : ");
//		String password = sc.next();
		acc.withdraw("aaaa", 1600);
		acc.withdraw("aa", 1600);
		acc.withdraw("aaaa", 1600000000);
		acc.withdraw("a", 1600000000);

		
	}
	
}
