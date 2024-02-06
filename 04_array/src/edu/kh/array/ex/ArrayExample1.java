package edu.kh.array.ex;


import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample1 {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
//		array
//		-같은 자료형의 변수를 하나의 묶음으로 다루는 것
//		-묶여진 변수들은 하나의 배열명으로 불러지고
//		구분은 index
		
//		변수 vs 배열
		int num;
//		in stack gives a space for int of 4byte and the name is num
		num=10;
		System.out.println("num = " + num);
		
		int[] arr;
//		int arr[];
//		stack 영역에 int[] 자료형 공간을 4byte 할당하고
//		그 공간에 arr 이라는 이름을 부여
//		** 해당 변수는 참조형으로 주소값만 저장 함
		arr = new int[3];
		arr[0] =10;
		arr[1] =101;
		arr[2] =10;
		
//		new = heap memory
//		int[3] = int 3개를 하나의 묶음
		
//		생성된 int[]에는 시작 주소가 지정됨
		System.out.println("Arr 주소" + arr);
		
//		Hashcode == heap address;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String[] arr2 = new String[5];
		arr2[0] = "hello";
		arr2[1] = "my";
		arr2[2] = "name";
		arr2[3] = "is";
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
	}
	
	public void ex2() {
		
		int [] arr = new int[4];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		
		System.out.println("배열의 길이 : " + arr.length);
		for (int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
//			System.out.printf("arr[%d] arr[%d] arr[%d] arr[%d]", arr[0], arr[1], arr[2], arr[3]);
		}
	}
	
	public void ex3() {
		
//		5명의 키(cm)를 입력받고 평균 구하기
		
		double height[] = new double[5];
		
		for(int i=0;i<height.length;i++) {
			System.out.print((i+1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			
		}
		System.out.println("");
		double sum = 0;
		
		for(int i=0;i<height.length;i++) {
			sum += height[i];
		}
		System.out.printf("\n평균 키(cm) : %.2f", sum/height.length);		
		
	}
	
	public void ex4() {
		
//		입력받은 인원수 만큼의 점수를 입력받아 배열에 저장
//		입력 완료 : 점수 합계, 평균, 최고점, 최저점 출력
		
//		ex)
//		입력 받을 인원 수 : 4
//		1변 점수 입력 : 10
//		2변 점수 입력 : 20
//		3변 점수 입력 : 30
//		4변 점수 입력 : 40
		
//		합계 : 
//		평균 :
//		최고점 :
//		최저점 : 
		System.out.print("입력 받을 인원 수 : ");
		int studentNum = sc.nextInt();
		
		int input[] = new int[studentNum];  
		int sum = 0;
		for (int i=0;i<input.length;i++) {
//			sum+=input[studentNum];
			System.out.printf("%d번 점수 입력 : ", i+1);
			input[i] = sc.nextInt();
		}
		for (int i=0;i<input.length;i++) {
			sum += input[i];
		}
		
		System.out.println("");
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", (double)sum/input.length);
		
		
//		최고점
		
//		int maxValue = Arrays.stream(input).max().getAsInt();
		int best = input[0];
		for (int i=0;i<input.length;i++) {
			if(input[i]>best) {
				best = input[i];
			}
		}
//		System.out.println(best);
		System.out.printf("최고점 : %d\n", best);
		
//		최소점

//		int maxValue = Arrays.stream(input).min().getAsInt();
		int worst = input[0];
		for (int i=0;i<input.length;i++) {
			if(input[i]<worst) {
				worst = input[i];
			}
		}
		System.out.printf("최저점 : %d\n", worst);
	}
	
	public void ex5() {
		
//		배열 선언과 동시에 초기화
		
		char[] arr = new char[5];
		
		for (int i=0;i<5;i++) {
//			System.out.printf("%d번 입력 : ", i+1);
			arr[i] = (char)('A' + i);
			
		}
//		** Arrays class
		
//		Arrays.toSring(배열명) : 모든 요소값을 출력
		System.out.println(Arrays.toString(arr));
		int arr2[] = new int[4];
		System.out.println(Arrays.toString(arr2));
		boolean arr3[] = new boolean[5];
		String arr4[] = new String[3];
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		char[] arr5 = {'A', 'B', 'C', 'D', 'E'};
		
		System.out.println(Arrays.toString(arr5));
	}
	
	public void ex6() {
		
//		점심 메뉴 뽑기 프로그램
		
		String arr[] = {"돈카츠", "라멘", "굶기", "김천", "꽝", "맥도날드"};
		
//		System.out.println("오늘 점심 메뉴 : " + arr[(int)(Math.random()*6)]);

	}
	
	public void ex7() {
		
//		배열을 이용한 검색
		
//		입력 받은 정수가 배열에 있는지 없는지 확인
//		만약 있다면 몇번 인덱스에 있는지 출력
//		int[] arr = {100 ~ 1000};
		
		
//		ex)
//		정수 입력 : 200
//		1번째 인덱스에 존재
		
//		정수 입력 : 5
//		존재하지 않음
		
		int arr[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
				
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int check = 0;
		for(int i=0;i<arr.length;i++) {

			if (input == arr[i]) {
				System.out.printf("%d번째 인덱스에 존재\n", i);
			} else {
				check += 1;
			}
		}
		if(check==arr.length) {
			System.out.println("존재하지 않음");
		}
		System.out.println("");
//		신호를 나타내기 위한 변수
//		flag == false
//		flag == true
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==input) {
				System.out.printf("%d번째 인덱스에 존재\n", i);
				flag = true;
			}
		}
		if(!flag) { //flag==false 
			System.out.println("존재하지 않음");
		}
	}	
	
	public void ex8() {
//		입력 받은 값과 일치하는 값이 있으면 인덱스 번호 출력
//		없으면 "존재하지 않음" 출력
		
		String arr[] = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도",};
		
		System.out.print("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i].equals(input)) {
				System.out.printf("%d번째 인덱스에 존재", i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
		
		
	}
	
	public void ex9() {
//		1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
//		2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
//		3. 단, 일치하는 문자 없을 경우 "존재하지 않습니다" 출럭
		
//		문자열 입력 : hello
//		[h, e, l, l, o]
//		검색할 문자 입력 : l
//		2개 존재
		
		System.out.print("문자열 입력 : ");
		String input = sc.next();
		char[] arr = new char[input.length()];
		
//		String string = new String(input);
//		string.length();
		
//		String arr[] = new String[string];
		for (int i=0;i<arr.length;i++) {
//			String arr[] = new String[string.length()];
			arr[i]=input.charAt(i);
		}
		System.out.print(Arrays.toString(arr));
		System.out.println("");
		System.out.print("검색할 문자 입력 : ");
		char inputChar = sc.next().charAt(0);
		int count = 0;
		
		for (int i=0;i<arr.length;i++) {
			if (inputChar == arr[i]) {
				count++;
			}
		}
		if(count>0) {
			System.out.printf("%d개 존재", count);
		} else {
			System.out.println("존재하지 않습니다");
		}
		
//		배열 검색
//		String.length() : 문자열이 길이
//		ex) "Hello".length() -> 5
//		String.charAt(index) :문자열에 특정 index에 위치한 문자 하나
//		ex) "Hello".charAt(1) -> 'e'
//		count(숫자세기)
		
		
	}
	
	
	
}