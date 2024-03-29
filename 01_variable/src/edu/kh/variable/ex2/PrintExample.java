package edu.kh.variable.ex2;

public class PrintExample {
	public static void main (String[] args) {
//		System.out.print() : 줄바꿈 X
//		System.out.println() : 줄바꿈 O
		System.out.println("테스트1");
		System.out.println("테스트2");

		System.out.print("테스트3");
		System.out.println();

		System.out.print("테스트4");
		System.out.println();
		
		int iNum1 = 10;
		int iNum2 = 5;
		
//		10+5=15
//		%d : 정수형, %o : 8진수, %x : 16진수
//		%c : 문자, %s : 문자열
//		%f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
//		%A : 16진수 실수
//		%b : 논리형
		
//		정렬방법
//		%5d : 5칸을 확보하고 오른쪽 정렬
//		- %-5d : 5칸을 확보하고 왼쪽 정렬
//		- %.2f : 소수점 아래 2자리까지만 표시
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2);
		System.out.println("hi");
		
//		*escape*
//		\t = tab
//		\n = new line
//		\\ = backslash
//		\' = 
		System.out.printf("%d + %d * %d / %d = %d\n", iNum1, iNum1, iNum2, 2, iNum1+iNum1*iNum2/2);
		
//		패턴 연습
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3);
		System.out.printf("%-5d\n", iNum3);
		
//		소수점 자리 제어
		System.out.printf("%f\n", 10/4.0);
		System.out.printf("%.2f\n", 10/4.0);
		System.out.printf("%.1f\n", 10/4.0);
		System.out.printf("%.0f\n", 10/4.0);
		
//		문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '조';
		String str = "안녕하세요";
//		false / 조 / 안녕하세요
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
		
		System.out.printf("\\\n");
		System.out.printf("\\o/\n");
		System.out.printf("a\tb\tc\td\n");

//		unicode escape
		System.out.println("\u0041");
		
		char ch1 = 'A';
		
		System.out.println((int)ch1);
		System.out.println((double)65/16);
		char ch2 = 'B';
		System.out.println((int)ch2);
		System.out.println((double)66/16);
		System.out.println("\u0042");
	
		
	}
}
