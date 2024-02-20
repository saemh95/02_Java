package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
//		comiple error normally == systax error == mispelled
//		runtime error == program run (use if to resolve)
		
		int arr[] = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;


		if(3 >=arr.length) {
			System.out.println("배열 범위를 초과했습니다");
		} else {
			arr[4] = 40;
		}
	}
	
	
}

