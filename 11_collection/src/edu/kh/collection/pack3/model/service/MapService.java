package edu.kh.collection.pack3.model.service;

import java.util.*;
import java.util.Map.Entry;

import edu.kh.collection.pack2.model.vo.Person;

public class MapService {

//	Map : 특정 Key 를 입력하면 : value 얻르 수 있는 컬렉션 객체
	
//	K : V 형식으로 구성
	
//	one K:V -> Entry
	
		public void method1() {
			
			Map<Integer, String> map = new HashMap<Integer, String>();
			
			map.put(1, "hello");
			map.put(2, "hello");
			map.put(3, "bye");
			map.put(4, "bye");
			map.put(5, "ok");
			System.out.println(map.toString());
			
			System.out.println(map.get(1));
			System.out.println(map.keySet());
			System.out.println(map.hashCode());
			System.out.println(Map.entry(1, "HI"));
			System.out.println(map.entrySet());
			map.remove(3);
			
			System.out.println(map);
			
			map.clear();
			
			System.out.println(map);
		}	
		
		public void method2() {
			Map <String, String> map = new HashMap<String, String>();
			
			map.put("학원", "서울시 중구");
			map.put("집", "서울시 성동구");
			map.put("롯데타워", "서울시 송파구");
			map.put("63빌딩", "서울시 영등포구");
			
			Set<String> mapSet = map.keySet();
			System.out.println(mapSet);
			
			for (String set : mapSet) {
				System.out.print("장소 : "+ set + " / ");
				System.out.println("주소 : " + map.get(set));
			}
		}
		
		/**
		 * Map Entry 순차 접근 하기 2
		 * -Map.entrySet();
		 */
		public void method3() {
			
			Map <String, String> map = new HashMap<String, String>();
			
			map.put("학원", "서울시 중구");
			map.put("집", "서울시 성동구");
			map.put("롯데타워", "서울시 송파구");
			map.put("63빌딩", "서울시 영등포구");
			
			Map <String, String> sortedMap = new TreeMap<String, String>(map);
			
//			Set<Entry<String, String>> entrySet = map.entrySet();
			int count = 1;
			for (Entry<String, String> set : sortedMap.entrySet()) {
				
				System.out.println(count++ + "번 : " + set.getKey() + set.getValue());
			}
			
		}
		
		/**
		 * Map 활용하기 - dto(data transfer object) 대체하기
		 * - 서로 다른 데이터를 한번에 묶어서 관리해야 하는 경우
		 * 
		 */
		public void method4() {
			
			Person person = new Person("Squid", 85, 'M');
			
//			dto -> map
//			Key == always "String"
//			Value == Object
			
			Map <String, Object> person2 = new HashMap<String, Object>();
			person2.put("name", "Squid");
			person2.put("age", 25);
			person2.put("gender", 'M');
			
			System.out.printf("name : %s, age : %d, gender : %c", person2.get("name"), person2.get("age"), person2.get("gender"));
			
			
		}
		
}
