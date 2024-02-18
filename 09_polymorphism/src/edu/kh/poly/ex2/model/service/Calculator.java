package edu.kh.poly.ex2.model.service;

public interface Calculator {
	
//	interface = 
	
	
//	field
	public static final double PI = 3.14;
	static final int MAX_NUM = 100000;
	public int MIN_NUM = -100000;
	int ZERO = 0;
	
//	method (public abstract)
	public abstract int add(int num1, int num2);
	int subtract(int num1, int num2);
	public abstract int divide(int num1, int num2);
	int multiply(int num1, int num2);
}
