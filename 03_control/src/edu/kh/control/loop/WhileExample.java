package edu.kh.control.loop;


import java.util.Scanner;
public class WhileExample {
	Scanner sc = new Scanner(System.in);
	
	
//	while
//	별도의 초기식, 증감식이 존재하지 않고
//	반복 종료 조건을 자유롭게 설정하는 반복문
	
//	확실히 언제 반복이 끝날지는 모르지만 언젠간 반복
//	조건이 false 가 되는 경우 반보을 종료함
	
//	while(조건식) {
//		조건식이 true 일때 반복 수행할 구문
//	}
	
	public void ex1() {
		
		int input = 9;
		while(input != 0) {
			System.out.println("멘유 선택");
			System.out.println("1. Park");
			System.out.println("2. Evra");
			System.out.println("3. Ferdinand");
			System.out.println("0. End");
			
			System.out.print("멘유 선택 ->");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("Ji Sung Park"); break;
			case 2 : System.out.println("Patrice Evra"); break;
			case 3 : System.out.println("Rio Ferdinand"); break;
			case 0 : System.out.println("Man U END"); break;
			default : System.out.println("ONLY MAN U");
			}
			
		}
	}
	
	public void ex2() {
//		입력되는 모든 정수의 합 구하기
//		단, 0이; 입력되면 반복 종료후 결과 출력
//		->0이 입력되지 않으면 계속 반복
		
		int sum = 0;
		int input = 0;
		do {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input;
		} while (input != 0);
		System.out.printf("합계 : %7d", sum);
	}
	
}
