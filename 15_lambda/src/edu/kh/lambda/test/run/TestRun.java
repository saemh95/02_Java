package edu.kh.lambda.test.run;

import edu.kh.lambda.test.LambdaTest;
import java.util.*;
public class TestRun {

	public static void main(String[] args) {
		
		LambdaTest test = new LambdaTest();
		test.ex();
		
//		Comparator의 compare -> lambda expression
		List<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(51);
		number.add(11);
		number.add(24);
		number.add(370);
		number.add(1210);
		number.add(45);
		
		System.out.println("before : " + number);
		
		Collections.sort(number, (a, b) -> b-a);
		
		System.out.println("after : " + number);
		
		System.out.println("------------------------------------------------");
		
//		Runnable -> lambda
		Runnable runnable = () -> {
			System.out.println("Hello World");
			
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
}
