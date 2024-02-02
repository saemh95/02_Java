package edu.kh.op.ex;

import java.util.Scanner;
public class OpExample {

	public void ex1() {
		
//		Scanner sc = new Scanner(System.in);
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		int temp1 = 5;
		System.out.println(++temp1 + 5);
		
		int a = 10;
		int b = 20;
		
		System.out.println(a>b);
		System.out.println((a==b)==false);
		
		int c = 4;
		int d = 5;
		System.out.println((++c != d) == (--c != d));
	}

	public void ex2() {
		int a = 101;
		System.out.println((a>=100) && (a%2==0));
		int c =10;
		System.out.println((c>10)||(c%2==0));
	}
	public void ex3() {
		int num = 30;
		
		String result = num > 30 ? "num은 30보다 큰 수 이다" : "num은 30이하의 수이다";
		System.out.println(result);
		
//		입력 받은 정수가 음수인지 양수인지 구분
//		단, 0은 양수로 처리
		
//		ex)
//		정수 입력 :4
//		양수입니다.
		
//		정수 입력 : -5
//		음수 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num1 = sc.nextInt();
		String str2 = num1>=0 ? "양수 입니다." : "음수 입니다.";
		
		System.out.printf("%d : %s\n", num1, str2);
		
	}
	public void ex4() {
		
	}
}
