package com.kh.variable.practice2;

import java.util.Scanner;
public class Practice3 {
	
	public void input2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		Double iNum1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		Double iNum2 = sc.nextDouble();

		System.out.print("수학 : ");
		Double iNum3 = sc.nextDouble();
		
		System.out.printf("총점 : %d\n", (int)(iNum1+iNum2+iNum3));
		System.out.printf("평균 : %d\n", (int)(iNum1+iNum2+iNum3)/3);
		
	}
	
	
	public void input3() {
//		sc.next() & sc.nextLine()
		
//		next() : space X
//		nextLine() : space O
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("문자열 입력 1 : ");
		 String str1 = sc.nextLine();

		 System.out.print("문자열 입력 2 : ");
		 String str2 = sc.next();
		 
		 System.out.println(str1);
		 System.out.println(str2);
		
	}
	
	public void input4() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수 입력 : ");
		int iNum1 = sc.nextInt();
//		nextInt()/next()/nextDouble()
		System.out.println(iNum1);
//		입력버퍼에 남은 개행문자 제거
		sc.nextLine();
		
		
		System.out.print("문자열 입력 : ");
		String str3 = sc.nextLine();
		
		System.out.println(str3);
		
	}
}
