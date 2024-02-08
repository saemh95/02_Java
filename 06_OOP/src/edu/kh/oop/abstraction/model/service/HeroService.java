package edu.kh.oop.abstraction.model.service;


import edu.kh.oop.abstraction.model.vo.*;
public class HeroService {

	public void practice() {
		
		Hero mage = new Hero();
		Hero warrior = new Hero();
		
		mage.setNickName("오징어물회");
		mage.setJob("Mage");
		mage.setHp(100);
		mage.setExp(0);
		mage.setLevel(1);
		mage.setMp(17);
		
		mage.setNickName("오징어물회");
		mage.setJob("Dark Mage");
		mage.setHp(100);
		mage.setExp(0);
		mage.setLevel(1);
		mage.setMp(17);
		
			
		System.out.println(mage.getNickName());
		System.out.println(mage.getJob());
		System.out.println(mage.getHp());
		System.out.println(mage.getExp());
		System.out.println(mage.getHp());
		System.out.println(mage.getLevel());
		System.out.println(mage.getMp());
		System.out.println();
		
		mage.attack(600);
		mage.magicJump();
		System.out.println();
		
		System.out.println(mage.getHp());
		System.out.println(mage.getExp());
		System.out.println(mage.getMp());
		System.out.println(mage.getLevel());
		System.out.println();
		
		mage.attack(250);
		mage.magicJump();
		
		System.out.println();
		System.out.println(mage.getHp());
		System.out.println(mage.getExp());
		System.out.println(mage.getMp());
		System.out.println(mage.getLevel());
	}
}
