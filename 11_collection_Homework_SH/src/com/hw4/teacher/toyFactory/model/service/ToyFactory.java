package com.hw4.teacher.toyFactory.model.service;

import java.util.*;
import java.util.Map.Entry;

import com.hw4.teacher.toyFactory.model.dto.Toy;
public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>();
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();
	
	public ToyFactory() {
		materialMap.put(1, "면목질");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		toySet.add(new Toy("파피", 12 , 57000, "빨간색", 19931225, addMaterials(1, 2, 4)));
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", 19950805, addMaterials(1, 4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", 19940312, addMaterials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", 19940505, addMaterials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 57000, "보라색", 19960128, addMaterials(1, 2, 4)));
	}
	
	public Set<String> addMaterials(Integer...newMaterials) {
		
		Set<String> addedMaterials = new HashSet<String>();
		
		for(Integer materialKey : newMaterials) {
//			맵에서 해당 번호(key)에 대응하는 재료를 가져와 추가
			String materialValue = materialMap.get(materialKey);
			if(materialValue != null) {
				addedMaterials.add(materialValue);
			}
		}
		return addedMaterials;
	}
	
	public void displayMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회");
			System.out.println("2. 세로운 장난감 만들기");
			System.out.println("3. 장난감 삭제");
			System.out.println("4. 장난감 제조일 순으로 조회");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회");
			System.out.println("6. 제료 추가");
			System.out.println("7. 제료 삭제");
			System.out.print("선택 : ");
			try {
				menuNum = sc.nextInt();
				
				switch (menuNum) {
				
				case 1 : showToy();
					break;
				case 2 : addToy();
					break;
				case 3 : removeToy();
					break;
				case 4 : sortToyByDate();
					break;
				case 5 : sortToyByAge();
					break;
				case 6 : addMaterial();
					break;
				case 7 : removeMaterial();
					break;
				case 0 : System.out.println("프로그램 종료");
					break;
				default : System.out.println("0~7 까지만 선택해 주세요");
				}
				
			} catch (Exception e) {
				System.out.println("잘못 선택하셨습니다");
				sc.nextLine();
				menuNum = -1;
			}
		} while (menuNum != 0);
		
		
	}

	private void showToy() throws Exception{
		System.out.println("<전체 장난감 조회>");
		int count = 0;
		for(Toy toys : toySet) {
			count++;
			System.out.println(count + "." + toys);
		}
	}

	private void addToy() {
		System.out.println("<세로운 장난감 만들기>");

		System.out.print("이름 : ");
		String name = sc.next();
		for (Toy toys : toySet) {
			if(toys.getName().equals(name)) {
				System.out.println("이미 존재하는 장난감 입니다");
				return;
			}
		}
		System.out.print("사용연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		System.out.print("제조년월일 : ");
		int manuDate = sc.nextInt();
		
		Set<String> materials = new HashSet<String>();
		while (true) {
			System.out.println("<재료 입력>");
			System.out.println("'q' 입력시 종료");
			System.out.print("재료 입력 : ");
			String input = sc.next();
			if(input.equals("q")) {
				break;
			}
			materials.add(input);
		}

		Toy toy = new Toy(name, age, price, color, manuDate, materials);
		toySet.add(toy);
		System.out.println("새로운 장난감이 추가되었습니다");

	}

	private void removeToy() throws Exception{
		System.out.println("<장난감 삭제>");
		System.out.print("삭제할 장난감 이름 : ");
		String name = sc.next();
		
		boolean flag = false;
		
		for (Toy toy : toySet) {
			if(toy.getName().equals(name)) {				
				toySet.remove(toy);
				flag = true;
				break;
			} 
		}
		if (flag) {
			System.out.println("'" + name + "'" + " 장난감 삭제되었습니다");
		} else {
			System.out.println("존제하지 않는 장난감 입니다");
		}
		
	}

	private void sortToyByDate() {
		System.out.println("<장난감 제조일 순으로 조회>");
				
		List<Toy>toySort=new ArrayList<Toy>(toySet);
		
		toySort.sort(Comparator.comparing(Toy::getManuDate));
		
		int count = 0;
		for (Toy toy : toySort) {
			count++;
			System.out.println(count + ". " + toy);         
		}
	}

	private void sortToyByAge() {
		System.out.println("<연령별 사용 가능한 장난감 리스트 조회>");

		Map<Integer, List<Toy>> ageSort = new HashMap<Integer, List<Toy>>(); 
		
		for(Toy toy : toySet) {
			int age = toy.getAge();
			
			ageSort.putIfAbsent(age, new ArrayList<>());
			
//			putIfAbsent : Map method 
//			해당 K != then 전달받은 값을 추가함
			
			ageSort.get(age).add(toy);
		}
		for (Entry<Integer, List<Toy>> entry : ageSort.entrySet()) {
			int age = entry.getKey();
			
			List<Toy> toyList = entry.getValue();
			
			System.out.println("[연령 : " + age + "세]");
			int count = 1;
			for (Toy toy : toyList ) {
				System.out.println(count + ". " + toy);
				count++;
			}
		}
		
	}

	private void addMaterial() throws Exception{
	System.out.println("<제료 추가>");
	System.out.println("-----현재 등록된 재료-----");
	for (Entry<Integer, String> material : materialMap.entrySet()) {
		 System.out.println(material.getKey() + " : " + material.getValue());
		}
	System.out.print("재료 고유번호 입력 : ");
	int key = sc.nextInt();
	System.out.print("재료명 입력 : ");
	String material = sc.next();
	
	if (materialMap.containsKey(key)) {
		System.out.println("이미 재료가 등록되어있음");
		System.out.print("덥어쓰시겠습니까? (Y/N) : ");
		String input = sc.next();
		
		if(input.equalsIgnoreCase("Y")) {
			materialMap.put(key, material);
			System.out.println("재료가 덥어쓰였습니다");
		} else if (input.equalsIgnoreCase("N")) {
			System.out.println("취소 되었습니다");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
		
	} else {
		materialMap.put(key, material);
		System.out.println("재료가 추가되었습니다");
	}
	
	}

	private void removeMaterial() {
		System.out.println("<제료 삭제>");
		System.out.println("-----현재 등록된 재료-----");
		for(Entry<Integer, String> material : materialMap.entrySet()) {
			System.out.println(material.getKey() + " : " + material.getValue());
		}
		System.out.print("삭제할 재료명 입력 : ");
		String input = sc.next();
		boolean flag = false;
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			if(entry.getValue().equals(input)) {
				materialMap.remove(entry.getKey());
				System.out.println("재료 '" + input + "' 가 성공적으로 제거되었습니다");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("존재하는 재료가 없습니다");
		}

	}
}
 