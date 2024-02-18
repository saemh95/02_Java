package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.*;
public class Run {
	public static void main(String[] args) {
		new AbstractService();
		
		Calculator cal = new SHCalculator();
		
		System.out.println("합 : " + cal.add(20, 30));
		System.out.println("차 : " + cal.subtract(20, 30));
		System.out.println("곱 : " + cal.multiply(20, 30));
		System.out.println("몫 : " + cal.divide(20, 30));
	}
}
