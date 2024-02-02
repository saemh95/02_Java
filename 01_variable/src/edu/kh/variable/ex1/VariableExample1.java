package edu.kh.variable.ex1;

public class VariableExample1 {
	public static void main(String[] args) {
		System.out.println(2*3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		
//		Variable
//		-memory (RAM) 값을 기록하는 공건
//		-> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다
//		-different types of Variable (저장되는 값의 형태, 크기)
		
//		변수사용의 장점
//		1. 가독성 증가
//		2. 재사용성 증가
//		3. 코드의 효율
//		4. 유지보수성 증가
		
//		변수사용
		double pi = 3.141592653589793;
		int r = 5; //radius
		int h = 20; //height
		
		System.out.println(2*pi*r);
		System.out.println(pi*r*r);
		System.out.println(pi*r*r*h);
		System.out.println(4*pi*r*r);
		
		
			
	}
}