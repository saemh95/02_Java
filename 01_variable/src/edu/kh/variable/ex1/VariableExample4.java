package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main(String[] args) {
//		강제 형변환
//		- 기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
//		1) 값의 범위가 큰 자료형을 작은 자료형으로 변환 할때 사용
//		2) 출력되는 데이터의 표기법을 변환시키고 싶을때
		
//		강제 형변환 방법
//		-자료형을 변환 시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		
		double temp = 3.145555;
		int num = (int)temp;
		System.out.println(num);
		
		char ch = 'A';
		
		int iNum2 = ch;
		System.out.println(iNum2);
				
		System.out.println((int)ch);
		
		int iNum3 = 44085;
		System.out.println((char)iNum3);
		
//		오버플로우 현상은 컴퓨터가 미리 예측할수 없다
//		->개발자가 미리 예측해야함
		int i6 = 214848365;
		int result6 = i6+1;
		System.out.println(result6);
		
		
	}
}
