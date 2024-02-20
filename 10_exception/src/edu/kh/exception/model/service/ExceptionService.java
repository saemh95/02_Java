package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

//	예외(Exception) : source code 수정으로 해결 가능한 오류

//	예외 2종류
//	1) Uncheck Exception : (ex. runtime exception)
//	2) Check Exception : (ex. IOException)
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");
		
		System.err.print("정수 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int input2 = sc.nextInt();
		
//		try {
//			System.err.println("두 정수 나누기한 몫 : " + input1/input2);
//		} catch(ArithmeticException e) {
//            System.out.println("0 으로 나눌수 없음");
//		}
//		try- catch 안해도 if-else 으로찾을수 있음
		
		if(input2 !=0) {			
			System.err.println("두 정수 나누기한 몫 : " + input1/input2);
		} else {
			System.out.println("0 으로 나눌수 없음");
		}
	}
	
	public void ex2() {
		
		try {
			System.out.print("입력 1 : "); //InputMismatchException
			int num1 = sc.nextInt();
			System.out.print("입력 2 : "); //InputMismatchException
			int num2 = sc.nextInt();
			System.out.println("결과 : " + num1/num2); // ArithmeticException
			
			String str = null;
			System.out.println(str.charAt(0)); // NullPointerException
		} catch (InputMismatchException e) {
			System.out.println("타입에 맞는것만 넣어주세요");
		} catch (ArithmeticException e) {
			System.out.println("0 으로 나눌수 없음");
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void ex3() {
		
		try {
			System.out.print("입력 1 : "); //InputMismatchException
			int num1 = sc.nextInt();
			System.out.print("입력 2 : "); //InputMismatchException
			int num2 = sc.nextInt();
			System.out.println("결과 : " + num1/num2); // ArithmeticException
			
			String str = null;
			System.out.println(str.charAt(0)); // NullPointerException
		} catch (ArithmeticException e) {
			System.out.println("0 으로 나눌수 없음");
		} finally {
			System.out.println("무조건 수행됨");
			sc.close();
			
		}
		
	}
	public void ex4() {
		
//		throws : 호출한 메서드에게 예외를 던짐
//		호출한 메서드에게 예외를 처리하라고 위임
		
		try {
			methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}
		
	}
	
	public void methodA() throws IOException {
		methodB();
	}
	
	public void methodB() throws IOException {
		methodC();
	}
	
	public void methodC() throws IOException {
//		예외 강제 발생
		throw new IOException();
		
	}
}
