package edu.kh.control.loop;


import java.util.Scanner;
public class ForExample {
	Scanner sc = new Scanner(System.in);
	
//	for 문
//	for(초기식; 조건식; 증감식) {
//		조건식이 true 라면 반복 수행할 코드
//	}
//	
	public void ex1() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
		}
		
	}
	public void ex2() {
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i<=input; i++) {
			System.out.println(i);
		}
	}
	
	public void ex3() {
//		영어 알파벳 A~Z 까지 한줄로 출력
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i);
		}
		System.out.println("");
		for(char i='A'; i<='Z';i++) {
			System.out.print(i);
		}
	}
	
	public void ex4() {
//		정수를 5개를 입력 받아서 합계 구하기
		int sum = 0;
		for (int i=1;i<=5;i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			sum += input;
//			System.out.println(i);
		}
		System.out.printf("합계 : %d\n", sum);
	}
	
	public void ex5() {
//		1부터 20까지 1씩 증가하면서 출력
//		단, 입력받은 수의 배수는 양쪽에 () 표시
		
//		ex) 표시할 배수 : 3
//		1 2 (3) 4 5 (6) 7 8 9 .. 20
		
		System.out.print("배수를 입력 하세요 : ");
		int input = sc.nextInt();
		for (int i=1;i<=20;i++) {
			
			if(i % input == 0) {
				System.out.printf("(%d)\s",i);
				
			} else {
				System.out.printf("%d ",i);
			}
		}
	}
	
	public void ex6() {
		
//		구구단 출력
//		2~9 사이 수를 하나 입력받아 해당 단을 출력
//		단, 입력받은 수가 2~9사이 숫자가 아니면
//		"잘못 입력하셨습니다" 출럭
		
		System.out.print("구구단을 입력하세요 : ");
		int sum = sc.nextInt();
		
//		for (int i=1;i<=10;i++) {
////			sum = i*sum;
//			if(sum <= 0) {
//				System.out.println("잘못 입력 하셨습니다.");
//			} else {
//				System.out.printf("%d X %d = %d\n", sum, i, sum*i);
//			}
//		}
//		System.out.println("");
		if(sum >=2 && sum <=9) {
			for(int i=1;i<=9;i++) {
				System.err.printf("%d X %d = %d\n", sum, i, sum*i);
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void ex7() {
		
//		구구단 모두 출력하기
		
		for(int sum=2;sum<=9;sum++) {
			for(int i=1;i<=9;i++) {
				System.out.printf("%d X %d = %2d  ", sum, i, sum*i);
			}
			System.out.println("");
		}
		System.out.println("--");
		for(int sum=9;sum>=2;sum--) {
			for(int i=1;i<=9;i++) {
				System.out.printf("%d X %d = %2d  ", sum, i, sum*i);
			}
			System.out.println("");
		}
	}
	
	public void ex8() {
//		숫자 세기 count
//		1부터 20까지 1씩 증가하면서
//		입력받은 수의 배수의 총개수 출력
//		입력받은 수의 배수의 합꼐 출력
				
		int count = 0;
		int sum = 0;
		String result ="";
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		for (int i=1; i<=20;i++) {
			if (i%input==0) {
				result += i + " ";
				count++;
				sum += i;
			}
		}
		System.out.printf("%s: %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", input, sum);
		
	}
	
	
}
