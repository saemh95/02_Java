package edu.kh.variable.ex2;


import java.util.Scanner;
public class ScannerExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		문자열 입력
//		문자열 3번 입력 = 1줄로 출력
		
		System.out.print("입력 1 : ");
		String str1 = sc.next();
		
		System.out.print("입력 2 : ");
		String str2 = sc.next();
		
		System.out.print("입력 3 : ");
		String str3 = sc.next();
		
		System.out.printf("%s %s %s\n", str1, str2, str3);
		
		
	}
}
