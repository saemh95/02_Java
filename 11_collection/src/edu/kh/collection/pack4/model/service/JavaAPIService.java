package edu.kh.collection.pack4.model.service;

import java.util.*;

import javax.annotation.processing.AbstractProcessor;

public class JavaAPIService {

//	Wrapper Class
//	기본 자료형을 Objcet로 감싸는 class
	
//	collection
	
// 	boolean -> Boolean
//	byte -> Byte
//	short -> Short
//	int -> Integer
//	long -> Long
//	float -> Float
//	double -> Double
//	char -> Character
	
	
	
	public void ex1() {
		int num1 = 100;
		Integer warp1 = num1;
		int num2 = warp1;
		
		long num3 = 10_000_000_000L;
		long warp2 = num3;
		long nump4 =num2;
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1000);
		list.add(2000);
		list.add(3000);
		
		System.out.println(list.get(0) + list.get(1) + list.get(2));
	}
	
	public void ex2() {
		
		System.out.println("byte : " + Byte.BYTES);
		System.out.println("byte : " + Byte.SIZE);
		System.out.println("byte : " + Byte.MAX_VALUE);
		System.out.println("byte : " + Byte.MIN_VALUE);
		System.out.println("int : " + Integer.BYTES);
		System.out.println("int : " + Integer.SIZE);
		System.out.println("int : " + Integer.MAX_VALUE);
		System.out.println("double : " + Double.NaN);
		System.out.println("double : " + Double.NEGATIVE_INFINITY);
		System.out.println("double : " + Double.POSITIVE_INFINITY);
		System.out.println("double : " + Double.MAX_EXPONENT);
		System.out.println("double : " + Double.TYPE);
		System.out.println("boolean : " + Boolean.FALSE);
		System.out.println("boolean : " + Boolean.TRUE);
		System.out.println("boolean : " + Boolean.TYPE);
		
		System.out.println();
		
		System.out.println("[String -> 기본 자료형 변환]");
//		HTML 연결 시 많이 사용
//		HTML의 관련된 모든 값은 String
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("4");
		int i = Integer.parseInt("2");
		long l = Long.parseLong("3");
		float f = Float.parseFloat("0.0");
		double d = Double.parseDouble("0.1");
		boolean bool = Boolean.parseBoolean("true");
		
//		character there is none
		
		System.out.println("[기본 자료형 변환 -> String]");
		
//		long + String -> String 
//		속도 down 메모리 소모 up
		long test1 = 12343546L;
		String change1 = test1 + "";
		
//		Wrapper Class
//		코드 길지만 효율 좋음
		int test2 = 400;
		String change2 = Integer.valueOf(test2).toString();
		String test3 = "";
		
	}
	
	/**
	 * 불변성 (immutable) / 변하는것 (mutable)
	 */
	public void ex3() {
		System.identityHashCode(getClass());
		
		
	}
	
	public void ex4() {
		
		String temp1 = "Hello";
		String temp2 = "Hello";
		
		System.out.println(System.identityHashCode(temp1));
		System.out.println(System.identityHashCode(temp2));
		System.out.println(temp1.equals(temp2));
		System.out.println(temp1 == temp2);
		
		
	}
	
	public void ex5() {
		
		String temp1 = "abcd";
		String temp2 = new String("abcd");
		String temp3 = new String("abcd");
		
		System.out.println(System.identityHashCode(temp1));
		System.out.println(System.identityHashCode(temp2));
		System.out.println(System.identityHashCode(temp3));
		
		temp2 += "asd";
		System.out.println(System.identityHashCode(temp2));
	}
	
	/**
	 * mutable
	 * StringBuilder / StringBuffer
	 * 
	 * -기본 16글자 저장형 크키로 생성
	 * 
	 * 저장되는 문자열의 길이에 따라 크키가 증가/감소
	 * ->마음대로 문자영 수정, 삭제 가능
	 * -> 수정, 삭제를 해도 추가적인 객체 생성이 없어 효율이 좋음
	 * 
	 * 
	 * StrindBuilder : Thread Safe X
	 * : 속도면에서는 StringBuffer 보다 성능 좋음
	 * -> 멀티쓰레드 환경에서는 StringBUilder사용시 쓰레드 충돌 가능성있음
	 * ->단일 쓰레드 환경에서 유리
	 * 
	 * StringBuffer : Thread Safe O
	 * : 속도면에서는 StringBuilder 보다 성능 떨어짐
	 * -> 멀티쓰레드 환경에서 안전하게 동작함
	 * -> 멀티쓰레드 환경에서 유리
	 */
	public void ex6() {
		
		StringBuilder sb = new StringBuilder();
		
//		-> 두에 추가 (append), 앞에 추가 (insert)
		sb.append("=hi");
		sb.insert(0, "not=hi");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
//		StringBuilder -> String
		String temp = sb.toString();
		String arr[] = temp.split("=");
		System.out.println(temp);
		System.out.println(System.identityHashCode(temp));
		System.out.println(Arrays.toString(temp.split("=")));
		
		for(String str : arr) {
			System.out.println(str);
		}
		System.out.println();
		
//		equalsIgnoreCase() : 문자열을 비교할 때 대소문자를 무시하고 비교하는 메서드
		
		String str1 = "hello";
		String str2 = "HELLO";
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	
}
