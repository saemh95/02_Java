package com.hw1.run;



import java.util.*;

import com.hw1.model.dto.Friend;
public class Run {

	public static void main(String[] args) {
		List<Friend> bossFriend = new ArrayList<>();
		
		
		Friend friend = new Friend();
		
		bossFriend.add(new Friend("짱구"));
		bossFriend.add(new Friend("철수"));
		bossFriend.add(new Friend("유리"));
		bossFriend.add(new Friend("훈이"));
		bossFriend.add(new Friend("맹구"));
		int random = (int) (Math.random()*bossFriend.size());
		friend.pickLeader(bossFriend.get(random));
		

//		Friend 객체만 넣을 수 있는 ArrayList 객체 생성 후 
//		짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가하기
		
//		List에서 다섯갳게 중 랜덤으로 하나를 뽑아
//		골목대장이 누군지 출력하기
		
//		List<Friend> friends = List.of(new Friend("짱구"), new Friend("철수") );
//		Collections.addAll(bossFriend, new Friend("짱구"), new Friend("철수"));

	}
	
}
