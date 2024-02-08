package edu.kh.oop.abstraction.model.vo;

public class Hero {

	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
//	getter/setter
//	attack(exp): nick+"은/는 공격을 했다!" 출력 후 전달받은 경험치를 현재 경험치에 누적,
//				누적 경험치가 500을 넘으면 레벨 1 업 하기
//	magicJum() : 점프 할 때마다 nickName + "의 점프!" 출력, 동시에 mp가 -10씩 감소됨.
//				단, 현재 mp가 0 이하라면 "더이상 매직 점프할 수 없어요!" 출력
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	public int getHp() {
		System.out.print("현제 hp 는 : ");
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	public int getMp() {
		System.out.print("현제 mp 는 : ");
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	public int getLevel() {
		System.out.print("현제 level 는 : ");
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	public int getExp() {
		System.out.print("현제 exp 는 : ");
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
//	attack(exp): nick+"은/는 공격을 했다!" 출력 후 전달받은 경험치를 현재 경험치에 누적,
//	누적 경험치가 500을 넘으면 레벨 1 업 하기
//	
	public void attack(int attack) {
		
		System.out.println(nickName + "은/는 공격을 했다!");
		exp += attack;
		if (exp > 500) {
			level += 1;
			exp = exp-500;
		}
	}
	
//	magicJum() : 점프 할 때마다 nickName + "의 점프!" 출력, 동시에 mp가 -10씩 감소됨.
//	단, 현재 mp가 0 이하라면 "더이상 매직 점프할 수 없어요!" 출력
	
	public void magicJump() {
		
		
		if(mp < 10) {
			System.out.println("더이상 매직 점프를 사용할 수 없습니다!");
		} else {
			System.out.println(nickName + "의 점프!");
			mp -= 10;
		}
	}
	
	
}
