package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.*;

public class AbstractService {

	public void ex1() {
		
//		Animal a = new Animal();
		Person p = new Person("blue", "carnivour", "name");
		Fish f = new Fish();
		
		System.out.print(new Fish("yellow", "carnivour"));
		System.out.println();
		System.out.println(p);
		p.breath();
		p.eat();
		p.move();
		
		new Fish().eat();
		
	}
	
	/**
	 * @deprecated Use {@link #ex2()} instead
	 */
	public void ex() {
		ex2();
	}

	public void ex2() {
		
//		person -> animal / fish -> animal
		
//		Animal a = new Person();
//		a.getClass();
		
		Animal arr[] = new Animal[2];
		arr[0] = new Person("person", "nothing", "name");
		arr[1] = new Fish("fish", "nothing");
		
		for(int i=0; i<arr.length;i++) {
			arr[i].eat();
			arr[i].breath();
			arr[i].move();
			System.out.println(arr[i].toString());
			System.out.println("-----------------------------------");
		}
	}
	
}
