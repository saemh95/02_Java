package edu.kh.op.practice;

import java.util.Scanner;
public class OperatorPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int userInput = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int userInput2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", userInput2/userInput);
		System.out.printf("남는 사탕 개수 : %d\n", userInput2%userInput);
		
		sc.nextLine();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String str = sc.next();
		
		System.out.print("학년(정수만) : ");
		int iNum1 = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int iNum2 = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int iNum3 = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String str2 = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double iNum4 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", iNum1, iNum2, iNum3, str, str2, iNum4);
		
		sc.nextLine();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int iNum1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int iNum2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int iNum3 = sc.nextInt();
		
		double iNum4 = ((iNum1+iNum2+iNum3)/3);
		
		System.out.printf("합계 : %d\n평균 : %.1f\n", iNum1+iNum2+iNum3, iNum4);
		
//		teachers reasoning 
//		int sum = iNum1+iNum2+iNum3;
//		double avg = sum/3.0;
//		boolean result = (iNum1>=40) && (iNum2>=40) && (iNum3>=40) && (avg>=60);
//		System.out.print(result ? "합격" : "불합격 : ");
		sc.nextLine();
	}
}

