package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
//		Scanner = 프로그램 실행 중 키보드 입력을 받을수 있게하는 역할
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2);
	}
}
