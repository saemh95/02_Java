package edu.kh.array.practice.service;


import java.util.Arrays;
import java.util.Scanner;
public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		int arr[] = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]+=i+1;
		}
		System.out.print(Arrays.toString(arr));
		
		
		
		int sum = 0;
		for(int j=0; j<arr.length;j++) {
			
			if(j%2==0) {sum += arr[j];}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice2() {
		
//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		int arr[] = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]+=i+1;
		}
		System.out.print(Arrays.toString(arr));
		int sum = 0;
		for(int j=0;j<arr.length;j++) {
			
			if(j%2==1) {sum += arr[j];}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice3() {
		
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			sum += 1;
			arr[i] += sum;
			
			}
		System.out.print(Arrays.toString(arr));
		
	}
	
	public void practice4() {
		

		int arr[] = new int[4];
		for (int i=0;i<arr.length;i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(arr));
		System.out.print("검색할 값 : ");
		
		int find = sc.nextInt();
		boolean flag = false;
		
//		System.out.println(find);
		for (int j=0;j<arr.length;j++) {			
			if(find == arr[j]) {
				System.out.print("인덱스 : " + j);
				flag = true;
			} 
		}
		if (flag==false) {			
			System.out.println("일치하는 값이 존재하지 않습니다.");		
		}
	}
	
	public void practice5() {
		
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		System.out.print("문자 입력 : ");
		String input = sc.next();
		
		char arr[] = new char[input.length()];
		
		for (int i=0;i<arr.length;i++) {
			
			arr[i] = input.charAt(i);
		}
		System.out.printf("문자열 : %s\n", input);
//		System.out.println(Arrays.toString(arr));
		System.out.print("검색할 문자 입력 : ");
		char inputChar = sc.next().charAt(0);
		String result = "";
		
//		int index = 0;
		int count = 0;
		boolean flag = false;
		for (int j=0;j<arr.length;j++) {
			if(inputChar == arr[j]) {
				count++;
				flag = true;
//				index = j;
			}
		} 
		for(int i=0; i<arr.length;i++) {
			if(inputChar==arr[i]) {
				result += i + " ";
			}
		}
//		System.out.println(result);
		if (flag==true) {
			System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n", input, inputChar, result);
			System.out.printf("%c 개수 : %d\n", inputChar, count);
		} else {
			System.out.println("존재하지 않습니다");
		}
	}
	
	public void practice6() {
		
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {			
			sum += arr[i];
//			System.out.println(sum);
		}
//		System.out.println(sum);
		System.out.println(" ");
		System.out.printf("총 합 : %d", sum);
	}
	
	public void practice7() {
		
//		주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
//				[실행 화면]
//				주민등록번호(-포함) : 123456-1234567
//				123456-1******
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char arr[] = new char[input.length()];
		char hide = '*';
		
		for(int i=0;i<arr.length;i++) {
			arr[i] += input.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if (i > 7) {
				arr[i] = hide;
			}
		}
		System.out.println(arr);
		
		
		
	}
	
	public void practice8() {
		
//		3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
		
//				[실행 화면]
//				정수 : 4
//				다시 입력하세요.
//				정수 : -6
//				다시 입력하세요.
//				정수 : 5
//				1, 2, 3, 2, 1
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		while(input<3 || input%2==0) {
			System.out.println("다시 입력하세요");
			input = sc.nextInt();
		}
		
		int arr[] = new int[input];
		int half = input/2+1;
//		int iNum1 = half+1;
		
		for (int i=0;i<arr.length;i++) {
			arr[i] += i+1;
			if(arr[half]>=i) {
				arr[half] -= half-1;
//				arr[i] += minus;
				System.out.println(Arrays.toString(arr));
				System.out.println("--");
				
			}
//				System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
//		for (int i=0;i<arr.length;i++) {
//			
//			if(arr.length >= i/2) {
////				i = minus;
//				arr[i] += minus;
//				System.out.println(Arrays.toString(arr));
//			} 
//		}
//		System.out.println(Arrays.toString(arr));
	}
		
}
