package edu.kh.control.practice;

import java.util.Scanner;
public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
//		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
//		짝수가 아니면 “홀수입니다.“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		if (input%2 == 0 && input >= 0) {
			System.out.println("짝수 입니다");
		} else if (input%2 == 1 && input >= 0) {
			System.out.println("홀수 입니다");
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void practice2() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		System.out.print("국어 : ");
		int kr = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int result = ((kr+eng+math)/3);
		
		if (kr>=40 && eng>=40 && math>=40 && result>=60) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다");
		}
			
		
		
		
	}
	
	public void practice3() {
//		1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
//		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		
		int jan = 1;
		int feb = 2;
		int mar = 3;
		int apr = 4;
		int may = 5;
		int jun = 6;
		int jul = 7;
		int aug = 8;
		int sep = 9;
		int oct = 10;
		int nov = 11;
		int dec = 12;
		
		if (month == jan) {
			System.out.println("1월은 31일까지 있습니다");
		} else if (month == feb) {
			System.out.println("2월은 28일까지 있습니다");
		} else if (month == mar) {
			System.out.println("3월은 31일까지 있습니다");
		} else if (month == apr) {
			System.out.println("4월은 30일까지 있습니다");
		} else if (month == may) {
			System.out.println("5월은 31일까지 있습니다");
		} else if (month == jun) {
			System.out.println("6월은 30일까지 있습니다");
		} else if (month == jul) {
			System.out.println("7월은 31일까지 있습니다");
		} else if (month == aug) {
			System.out.println("8월은 31일까지 있습니다");
		} else if (month == sep) {
			System.out.println("9월은 30일까지 있습니다");
		} else if (month == oct) {
			System.out.println("10월은 31일까지 있습니다");
		} else if (month == nov) {
			System.out.println("11월은 30일까지 있습니다");
		} else if (month == dec) {
			System.out.println("12월은 31일까지 있습니다");
		} else {
			System.out.printf("%d월은 잘못 입력된 달입니다", month);
		}
		  
	}
	
	public void practice4() {
		
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
		
		System.out.print("키(m) 를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double avg = weight/(height*height);
		
		if (avg < 18.5) {
			System.out.printf("키(m) 를 입력해 주세요 : %.2f\n", height);
			System.out.printf("몸무게(kg)를 입력해 주세요 : %.2f\n", weight);
			System.out.printf("BMI : %f\n", avg);
			System.out.println("저체중");
		} else if (avg >= 18.5 && avg <= 23) {
			System.out.printf("키(m) 를 입력해 주세요 : %.2f\n", height);
			System.out.printf("몸무게(kg)를 입력해 주세요 : %.2f\n", weight);
			System.out.printf("BMI : %f\n", avg);
			System.out.println("정상체중");
		} else if (avg >= 23 && avg <= 25) {
			System.out.printf("키(m) 를 입력해 주세요 : %.2f\n", height);
			System.out.printf("몸무게(kg)를 입력해 주세요 : %.2f\n", weight);
			System.out.printf("BMI : %f\n", avg);
			System.out.println("과체중");
		} else if (avg >= 25 && avg <= 30) {
			System.out.printf("키(m) 를 입력해 주세요 : %.2f\n", height);
			System.out.printf("몸무게(kg)를 입력해 주세요 : %.2f\n", weight);
			System.out.printf("BMI : %f\n", avg);
			System.out.println("비만");
		} else if (avg > 30) {
			System.out.printf("키(m) 를 입력해 주세요 : %.2f\n", height);
			System.out.printf("몸무게(kg)를 입력해 주세요 : %.2f\n", weight);
			System.out.printf("BMI : %f\n", avg);
			System.out.println("고도 비만");
		}
	}
	
	public void practice5() {
//		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
//		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		
		System.out.print("중간고사 점수 : ");
		double midExam = sc.nextDouble();
//		System.out.print("기말고사 점수 : ");
//		double exam = sc.nextDouble();
//		System.out.print("과제 점수 : ");
//		double homework = sc.nextDouble();
//		System.out.print("출석 횟수 : ");
//		double attendence = sc.nextDouble();
		
		double midExamResult = (midExam*2/10);
//		double examResult = (exam * 0.3);
//		double homeworkResult = (homework * 0.3);
//		double attendenceResult = ((attendence * 5)*0.2);
		
//		double result = midExamResult+examResult+homeworkResult+attendenceResult;
		
//		if (result >= 70 && attendence >= 14) {
//			System.out.printf("중간고사 점수(20%) : %.1f\n", midExamResult);
//			System.out.printf("기말고사 점수(30%) : %.1f\n", examResult);
//			System.out.printf("과제 점수(30%) : %.1f\n", homeworkResult);
//			System.out.printf("출석 횟수(20%) : %.1f\n", attendenceResult);
//			System.out.printf("총점 : %.1f", result);
//			System.out.println("PASS");
//		} else {
//			System.out.printf("중간고사 점수(20%) : %.1f\n", midExamResult);
//			System.out.printf("기말고사 점수(30%) : %.1f\n", examResult);
//			System.out.printf("과제 점수(30%) : %.1f\n", homeworkResult);
//			System.out.printf("출석 횟수(20%) : %.1f\n", attendenceResult);
//			System.out.printf("총점 : %.1f", result);
//			System.out.println("FAIL");
//		}
	}
	public void practice6() {
		System.out.print("중간고사 점수 : ");
		double midExam = sc.nextDouble();
		System.out.print("기말고사 점수 : ");
		double exam = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double homework = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		double attendence = sc.nextDouble();
		
		double midExamResult = (midExam*2/10);
		double examResult = (exam * 0.3);
		double homeworkResult = (homework * 0.3);
		double attendenceResult = ((attendence * 5)*0.2);
		
		double result = midExamResult+examResult+homeworkResult+attendenceResult;
		
		if (result >= 70 && attendence >= 14) {
			System.out.printf("중간고사 점수(20%) : %.1f\n", midExamResult);
			System.out.printf("기말고사 점수(30%) : %.1f\n", examResult);
			System.out.printf("과제 점수(30%) : %.1f\n", homeworkResult);
			System.out.printf("출석 횟수(20%) : %.1f\n", attendenceResult);
			System.out.printf("총점 : %.1f", result);
			System.out.println("PASS");
		} else {
			System.out.printf("중간고사 점수(20%) : %.1f\n", midExamResult);
			System.out.printf("기말고사 점수(30%) : %.1f\n", examResult);
			System.out.printf("과제 점수(30%) : %.1f\n", homeworkResult);
			System.out.printf("출석 횟수(20%) : %.1f\n", attendenceResult);
			System.out.printf("총점 : %.1f", result);
			System.out.println("FAIL");
		}
	}
	
}
