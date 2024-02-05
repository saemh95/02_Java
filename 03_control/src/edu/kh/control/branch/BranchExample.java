package edu.kh.control.branch;

import java.util.Scanner;
public class BranchExample {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
//		1부터 10까지 1씩 증가하며 출력
//		단, 5를 출력하면 반복문 종료
		for(int i=1;i<=10;i++) {
			System.out.print(i + " ");
			 if (i == 5 ) {
				break;
			 }
		}
	}
	
	public void ex2() {
		
//		입력 받은 모든 문자열을 누적
//		단, "exit@" 입력시 문자열 누적 종료
//		결과 출력
		
		String str = "";
		
		while (true) {
			System.out.print("입력 (exit@ to exit) : ");
			String input = sc.next();
			
			if(input.equals("exit@")) {
//				String 자료형은 비교연사자(==)로 같은 문자열인지 팔별 불가
//				비교연산(==) 기본자료형끼리 연산에서만 사용 가능
//				** 해결방법 : 문자열1.equals(문자열2) 으로 비교 가능 **
				break;
			}
			str += input + "\n";
		}
		System.out.print(str);
	}
	
	public void ex3() {
//		continue: 다음 반복으로 넘어감
//		1~10까지 1씩 증가
//		3의배수 제외
		
		for (int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

	public void ex4() {
//		1~100까지 1씩 증
//		5의 배수는 건너뛰고
//		증가하는 값이 40이 되었을때 반복 멈춤
		
		for (int i=1;i<=100;i++) {
			if (i==40) {
				break;
			}
			if (i%5 == 0) {
				continue;
			}			
			System.out.print(i + " ");
		}
	}
	
	
	public void RSPGame() {
		
//		가위바위보 게임을 함
//		몇 판 할지 입력받음
//		입력 받은 판수 만큼 반복
//		컴퓨터 : Math.random(); 0~1매만 난수
//		1)1~3사이 난수 생성
//		2)1=가위,2=바위,3=보
//		컴퓨터와 플레이어 가위바위보 판별
//		플레이어승! / CPU승! / 비겼습니다!
//		매판마다 
//		현재 기록 : 2승 1무 0패
		
		System.out.println("[가위 바위 보 게이~!!]");
		System.out.print("몊판? : ");
		int count = sc.nextInt();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		
		for (int i=1;i<=count;i++) {
			System.out.println("\n" + i + "번째 게임");
			
			System.out.print("가위,바위,보 중 선택 : ");
			String userInput = sc.next();
			
			int random = (int)Math.random()*3+1;
			
			String CPU = null;
			switch (random) {
				case 1 : CPU = "가위"; 
				break;
				case 2 : CPU = "바위";
				break;
				case 3 : CPU = "보";
				break;
			}
			System.out.printf("CPU는 [%s]를 선택했습니다!\n", CPU);
			
			if(userInput.equals(CPU)) {
				System.out.println("비겼습니다!");
				draw++;
			} else {
				boolean win1 = userInput.equals("가위") && CPU.equals("보");
				boolean win2 = userInput.equals("바위") && CPU.equals("가위");
				boolean win3 = userInput.equals("보") && CPU.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("CPU 승!");
					lose++;
				}
			}
			System.out.printf("현재 기록: %d승 %d무 %d패\n", win, draw, lose);
		}		
	}
}
	




 