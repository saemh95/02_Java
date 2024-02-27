package edu.kh.lambda.test;

public class LambdaTest {
//	함수형 interface : to use lambda expression has to have only one abstract method

	
	public int operate(int a, int b, Calc calc) {
		return calc.calc(a, b);
		
	}

	public void ex() {
		Calc add = (a,b) -> a+b;
		Calc multiply = (a,b) -> a*b;
		Calc subtract = (a,b) -> a-b;
		Calc divide = (a,b) -> a/b;
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("add : " + operate(num1, num2, add));
		System.out.println("multiply : " + operate(num1, num2, multiply));
		System.out.println("subtract : " + operate(num1, num2, subtract));
		System.out.println("divide : " + operate(num1, num2, divide));
	}
	
	
}
