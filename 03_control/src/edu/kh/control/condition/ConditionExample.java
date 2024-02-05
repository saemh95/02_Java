package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
//		if문 = 조건식이 true 일때만 내부코드 수행
		
//		if(조건식) {
//		조건식이 true 일때
//		}
		System.out.print("정수 입력 : ");
		int iNum1 = sc.nextInt();
		
		if(iNum1 > 0) {
			System.out.println("양수입니다");
		} 
		if(iNum1 <= 0) {
			System.out.println("양수가 아닙니다");			
		}
	}
	
	public void ex2() {
//		if-else
//		조건식 결과가 true 면 if문
//		false면 else 수행
		
//		홀짝 검사
//		입력받은 정수값이 홀수이면 "홀수입니다"출럭
//		0이면 "0입니다"
//		짝수이면 "짝수입니다"
		
		System.out.print("숫자 입력 : ");
		int iNum1 = sc.nextInt();
		
		
		if (iNum1%2 != 0) {
			System.out.println("홀수입니다");
		} else {
			if(iNum1 == 0) {
				System.out.println("0입니다");				
			} else {
				System.out.println("짝수입니다");			
			}
		} 
	}
	
	public void ex3() {
//		양수, 음수, 0
		System.out.print("숫자 입력 : ");
		int iNum1 = sc.nextInt();
		
		if(iNum1 > 0) {
			System.out.println("양수입니다");
		} else if (iNum1 == 0 ) {
			System.out.println("0입니다");
		} else {
			System.out.println("음수입니다");
		}
	}
//	
	public void ex4() {
//		month
//		season for the month - 출력
//		if winter -15 > 한파 경보, -12 > 한파 주의보
//		summer 35 > 폭염 경보, 33 > 폭염 주의보
//		1~12 X = "Not a season"
//		1,2,12 = winter
//		3~5 = spring
//		6~8 = summer
//		9~11 = fall
		
		System.out.print("Type in Month to know the season : ");
		
		int input1 = sc.nextInt();
		System.out.print("Tempreture : ");
		int input2 = sc.nextInt();
		
		
		if (input1 >= 3 && input1 <= 5 ) {
			System.out.print("Spring");
		} else if (input1 >=6 && input1 <=8) {
			System.out.println("Summer"); 
			if(input2 <= 35 && input2 >= 33) {
				System.out.print("폭염 주의보");
			} else if (input2 >= 35) {
				System.out.print("폭염 경보");
			}
		} else if (input1 >= 9 && input1 <= 11) {
			System.out.print("Fall");
		} else if (input1 ==1 || input1 ==2 || input1 ==12) {
			System.out.println("Winter"); 
			if (input2 <= -15 && input2 >= -12 ) {
				System.out.print("한파 주의보");
			} else if (input2 <= -16) {
				System.out.print("한파 경보");
			}
		} else {
			System.out.print("Not a season");
		}
	}
	
	public void ex5() {
//		나이를 입력받아
//		13세 이하면"어린이입니다"
//		13세 초과 19세 이하면 : "청소년입니다"
//		19세 초과시 : "성인입니다
		
		System.out.print("나이를 입력하세요 : ");
		int input1 = sc.nextInt();
		
		if (input1 <= 13) {
			System.out.println("어린이 입니다");
		} else if (input1 >= 13 && input1 < 19) {
			System.out.println("청소년 입니다");
		} else {
			System.out.println("성인입니다");
		}
	}
	
	public void ex6() {
//		점수(100점 만점)를 입력받아
//		90점 이상:A
//		80정 시아 90점 미만:B
//		70정 시아 80점 미만:C
//		60정 시아 70점 미만:D
//		60정 미만:F
//		0점 미만, 100점 초과:"잘못 입력하셨습니다"
		
		System.out.print("점수를 입력하세요 : ");
		int input1 = sc.nextInt();
		
		if (input1 >= 90 && input1 <= 100) {
			System.out.println("A");
		} else if (input1 < 90 && input1 >= 80) {
			System.out.println("B");
		} else if (input1 < 80 && input1 >= 70) {
			System.out.println("C");
		} else if (input1 < 70 && input1 >= 60) {
			System.out.println("D");
		} else if (input1 < 60 && input1 >= 0) {
			System.out.println("F");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	
	public void ex7() {
//		놀이기구 탑승 제한 검사
//		나이가 12세이상, 키 140.0cm 이상일 경우만 "탑승 가능"
//		나이가 12미만인 경우 : "적정 연령이 아닙니다"
//		키카 140.0cm 미만 : "적정 키카 아닙니다"
//		나이를 0세 미만, 100세 초과시 : "잘못 입력 하셨습니다"
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		if (age >= 12 && age < 100 &&height >= 140.0) {
			System.out.println("탑승 가능");
		} else if (age <= 11 && age > 0) {
			System.out.println("적정 연령이 아닙니다");
		} else if (height < 140.0) {
			System.out.println("적정 키가 아닙니다");
		} else if (age < 0 || age > 100) {
			System.out.println("잘못 입력 하셨습니다");
		}
	}
	
	public void ex8() {
//		놀이기구 탑승 제한 검사 프로그램
//		조건 - 나이 : 12세이상
//		키 : 140.0cm 이상
//		나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력하셨습니다"
//		키를 0~240.0cm 사이로 이력하지 않은 경우 : " 키를 잘못 입력하셨습니다"
//		입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
//		나이 O, 키 X : 나이는 적절하나, 키가 적절치 않음
//		나이 X, 키 O : 키는 적절하나 ,나이는 적절치 않음
//		나이 X, 키 X : 나이와 키 모두 적절치 않음
//		나이 O, 키 O : 탑승 가능
		

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		if (age >= 12 && age < 100 && height >= 140.0 && height < 240) {
			System.out.println("탑승 가능");
		} else if (age <= 11 && age > 0 && height >= 140) {
			System.out.println("키는 적절하나 ,나이는 적절치 않음");
		} else if (height < 140.0 && age < 12) {
			System.out.println("나이와 키 모두 적절치 않음");
		} else if (age >= 12 && age < 100 && height < 140 && height < 240) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		} else if (age < 0 || age > 100) {
			System.out.println("나이를 잘못 입력 하셨습니다");
		} else if (height < 0 || height > 240.0) {
			System.out.println("키를 잘못 입력 하셨습니다");
		}
	}
	
}
