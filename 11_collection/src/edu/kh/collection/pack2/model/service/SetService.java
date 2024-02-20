package edu.kh.collection.pack2.model.service;

import java.util.*;

import edu.kh.collection.pack2.model.vo.Person;

public class SetService {

	Scanner sc = new Scanner(System.in);
//	Set(집합)
	
//	-기본적으로 순서를 유지하지 않음
//	(index X) -> get() X
	
//	-중복 데이터를 저장 X
	
//	같은 객체가 들어오면 덮어쓰기
	
//	Set interface -> Child
//	1) HashSet : fast process
//	2) LinkedHashSet : remembers order
//	3) TreeSet : autmoatic sorting
	
	/**
	 * HashSet 사용법
	 * - 사용조건 : 객체에 equals() 오버라이딩 되어있어야함
	 * - 사용조건 : 객체에 hashCode() 오버라이딩 되어있어야함
	 * 
	 * -> String, Int 등 자바에서 제공하는 겍제는 
	 * 모두 equals(), hashCode() 오버라이딩 되어있는 상태
	 */
	public void method1() {
		
		Set<String> set = new HashSet<String>();
//		Set<String> set2 = new LinkedHashSet<String>();
		
		  // 1. boolean add(E e) : 추가
	      set.add("네이버");
	      set.add("카카오");
	      set.add("라인");
	      set.add("쿠팡");
	      set.add("배달의 민족");
	      set.add("당근마켓");
	      set.add("토스");
	      set.add("직방");
	      set.add("야놀자");
	      
	      System.out.println(set); // 호출했더니, 넣은 순서대로 꺼내진 게 아니라,
	                        // 뒤죽박죽 섞여 있음.
	      //즉, HashSet 은 순서 유지를 하지 않는다는 것을 확인할 수 있다.
	      
	      //중복 저장 시도 해보자.
	      set.add("배달의 민족");
	      set.add("배달의 민족");
	      set.add("배달의 민족");
	      set.add("배달의 민족");
	      set.add("배달의 민족");
	      
	      System.out.println(set); // 중복저장 안되고, 계속 덮어씌워진 거임.
	                        //chat gpt 에 따르면, 덮어씌워지는 것이 아니라, 
	                        // 기존의 것이 유지되고 새로운 것이 들어오지 못한다고 함.
	      
	      // null : 참조하는 객체가 없음
	      // null도 중복이 안되는지 확인해보자.
	      set.add(null);
	      set.add(null);
	      set.add(null);
	      set.add(null);
	      set.add(null);
	      
	      System.out.println(set); // 중복 안되네.
	      
	      // 2. int size() : Set 에 저장된 객체(참조변수)의 수 반환
	      System.out.println("set.size() : " + set.size());
	      
	      // 3. boolean remove(E e) :
	      // 전달받은 매개변수 e를 Set 에서 제거
	      // 제거 성공 true, 없으면 false
	      System.out.println(set.remove("배달의 민족")); //true
	      System.out.println(set.remove("유플러스")); //false
	      System.out.println(set);
	      
	      // 4. boolean contains(E e) :
	      // 전달받은 e가 Set에 포함되어 있으면 true, 없으면 false
	      System.out.println("직방 있는지 확인 : " +set.contains("직방"));
	      System.out.println("배달의 민족 있는지 확인 : " + set.contains("배달의 민족"));
	      
//	      5. set에서 clear
	      set.clear();
	      
//	      
	      System.out.println(set.isEmpty());

		
	}
	
	/**
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1. Iterator(반복자) 이용
	 * 2. List로 변환
	 * 3. 향상된 for문 이용
	 * 
	 */
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("쿠쿠다스");
		set.add("양파링");
		set.add("새우깡");
		set.add("맛동산");
		set.add("프링글스");
		
//		1. Iterator(반복자)
//		-컬렉션 객체에 저장된 요소를 하나씩 순차 접근하는 객체
		
//		Iterator Set.iterator() :
		Iterator<String> it = set.iterator();
		
//		boolean Iterator.hasNext() :
//		다음 순차 접근할 요소가 있으면 true, 없으면 false
		
		System.out.println("[Iterator]");
		while(it.hasNext()) {
//			다음 요소가 있으면 반복, 없으면 멈춤
			
//			Iterator.next() : 다음 요소를 꺼내와 반환
			String temp = it.next();
			System.out.println(temp);
			
		}
		
		System.out.println();
		System.out.println("[List로 변환]");
		
		List<String> list = new ArrayList<String>(set);
		for(int i=0;i<list.size();i++) {
			System.out.println(i + "번 : " + list.get(i));
		}
		
		System.out.println();
		System.out.println("[항상된 for문]");
		for(String snack : set) {
			System.out.println(snack);
		}
	}

	
	
	/**
	 * 직접 만든 클래스(person)를 이용해 만든 객체를
	 * Set에 저장 (중복제거확인)
	 */
	public void method3() {
		
		Person p1 = new Person("a", 0, 'a');
		Person p2 = new Person("A", 0, 'a');
		Person p3 = new Person("B", 0, 'b');
		Person p4 = new Person("C", 0, 'c');
		Person p5 = new Person("Fly", 16, 'F');
		
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		personSet.add(p5);
		System.out.println();
		for (Person person : personSet) {
			System.out.println(person);
		}
		
		System.out.println();
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p1 : " + p2.hashCode());
		System.out.println("p1 : " + p3.hashCode());
		System.out.println("p1 : " + p4.hashCode());
		System.out.println("p1 : " + p5.hashCode());
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
	
	public void method4() {
		
		Random random = new Random();
		Set<Integer> lotto = new TreeSet<Integer>();

		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45)+1);
		}
		
		System.out.println(lotto);
	}
	
	/**
	 * 로또 번호 생성기
	 * 
	 * 금액을 입력받아 (1원당)
	 * 1회식 번호를 생성해서 List에 저장후
	 * 생성 종료 한번에 출력
	 * 
	 * <pre>
	 * 금액 입력 : 3000
	 * 1회 : [11,13,22,34,44]
	 * 2회 : [12,37,36,41,43]
	 * 3회 : [7,8,13,31,42]
	 * </pre>
	 */
	public void lottoNumberGenerator() {
		
		System.out.println("-LOTTORY-");
		System.out.print("[1,000 per 1] select amount : ");
		
		List<Set<Integer>> result = new ArrayList<Set<Integer>>();
		Random random = new Random();
		try {
			int input = sc.nextInt();
			if (input <1000) {
				System.out.println("1,000원 단위로 입력");
			} else if (input%1000!=0) {
				System.out.println("1,000원 단위로 입력");
			}
			for(int i=0;i<input/1000;i++) {
				Set<Integer> lotto = new TreeSet<Integer>();
				while (lotto.size() < 6) {
					lotto.add(random.nextInt(45)+1);
				} result.add(lotto);
				System.out.println(i+1 + "회 : " + lotto);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
			sc.nextLine();
		}
		
		
		
	}
	
}
