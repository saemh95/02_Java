package edu.kh.control.practice;


import java.util.Scanner;
public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int userInput = sc.nextInt();
		
		for(int i=1; i<=userInput; i++) {
			if (userInput > 1) {
				System.out.print(i + " ");
			} else if (userInput<=1) {
				System.out.print("1이상의 숫자를 입력해주세요");				
			}
			
		}	
	}
}
