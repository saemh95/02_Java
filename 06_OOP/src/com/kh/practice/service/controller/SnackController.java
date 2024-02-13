package com.kh.practice.service.controller;

import com.kh.practice.service.model.vo.*;

public class SnackController {
	
	Snack snack1 = new Snack();
	
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		snack1.setKind(kind);
		snack1.setName(name);
		snack1.setFlavor(flavor);
		snack1.setNumOf(numOf);
		snack1.setPrice(price);
		
		System.out.print("저장 완료되었습니다");
		
		return snack1.information();
	}
	

	public String confirmData() {
		
		return snack1.information();
	}
}
