package edu.kh.array2.ex;

import java.util.Scanner;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Array2Example {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
//		2차원 배열
//		- 자료형이 같은 1차원 배열을 묶음으로 다루는 것
//		-> 행, 열 개념 추가
		
//		2차원 배열 선언
		
		int arr[][];
//		(arr) == 참조변수 == 참조형 == 레퍼런스 변수 == 레퍼런스 == ref
//		2차원 배열 할당
		
		arr = new int[2][3];
//		1)
//		arr[0][0] = 1;
//		arr[0][1] = 10;
//		arr[0][2] = 100;
//		
//		arr[1][0] = 2;
//		arr[2][1] = 20;
//		arr[3][2] = 200;
//		2)
		
		int num = 10; // 배열 요소 초기화에 사용할 변수
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
		
//		배열 길이
//		-> 배열명.length 는 변수가 직접 참고하고있는 배열의 길이를 반환
		
		for(int i=0;i<arr.length;i++) { // 행 반복 [2]			
			for(int j=0;j<arr[i].length;j++) { // [3]
				System.out.printf("[%d][%d]번째 입력 : ", i, j);
				int input = sc.nextInt();
				arr[i][j] += input;
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
//		Arrays.toString == 참조하고있는 1차원 배열값을 문자열로 반환
		
	}
	
	public void ex2() {
		
//		2차원 배열 선언과 동시에 초기화
		
		int arr[][] = { {1,3,5},
						{1,3,5},
						{0,3,56} };
		
//		System.out.println(Arrays.deepToString(arr));
		
//		행별로 합 출력
		for(int i=0; i<arr.length;i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.printf("%d행의 합 : %d\n", i+1, sum );			
		}
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int col = 0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				if(j==0) {
					sum1 += arr[i][j];
				} else if (j==1) {
					sum2 += arr[i][j];
				} else if (j==2) {
					sum3 += arr[i][j];
				}
			}
//			col = i;
		
		}
		System.out.println("열의 합 : "+sum1 );			
		System.out.println("열의 합 : "+sum2 );			
		System.out.println("열의 합 : "+sum3 );	
		
		
	}
	
	public void ex3() {
		
		char arr[][] = new char[4][];
		
		arr[0] = new char[2];
		arr[1] = new char[1];
		arr[2] = new char[2];
		arr[3] = new char[3];
		
		char ch = 'a';
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ch++;
//				System.out.print("alphabet : ");
//				char input = (char) sc.nextInt();
					
//				System.out.println(Arrays.deepToString(arr));
			}
			System.out.println();
			System.out.println(Arrays.deepToString(arr));
		}
		System.out.println();
		System.out.println(Arrays.deepToString(arr));
		
	}
	
}
