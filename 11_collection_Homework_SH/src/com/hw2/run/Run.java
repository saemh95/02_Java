package com.hw2.run;

import java.util.*;

import com.hw2.model.dto.*;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
//		Zoo 객체 생성
//		Tiger 객체 생성하여 Zoo에 추가하기
//		Monkey 객체 생성하여 Zoo에 추가하기
		Zoo zoo = new Zoo();
		Animal tiger = new Tiger("호랑이");
		Animal monkey = new Monkey("원숭이");
		
//		동물원 메뉴 출력하여 입력한 값대로 코드 수행하기
		
		zoo.addAnimal(tiger);
		zoo.addAnimal(monkey);
		
		zoo.displayMenu();
		
	}
	
}
