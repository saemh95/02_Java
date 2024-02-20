package edu.kh.collection.pack1.model.service;

import java.util.*;

import edu.kh.collection.pack1.model.vo.Student;

public class StudentService {

	private  Scanner sc = new Scanner(System.in); 
	
//	학생 정보를 저장할 리스트 생성
	private List<Student> studentList = new ArrayList<>(); 
//	ArrayList() == 기본 크기 10
	
//	ArrayList(용량) -> 큰값을 작정하면 메모리 많이 소모함
	
	// 검색(조회)에 효율적
//	private List studentList = new LinkedList(); 
	// 추가,수정,삭제에 효율적
	public StudentService() {
		
		studentList.add(new Student("Squid", 13, "Atlantic", 'M', 15));
		studentList.add(new Student("Pig", 5, "Argentina", 'M', 55));
		studentList.add(new Student("Pig-Moth", 3, "Amazon", 'F', 45));
		studentList.add(new Student("Fly", 1, "Everywere", 'M', 100));
	}
	
	public void ex() {
//		list test
		
		
		studentList.add(new Student());
//		studentList.add(sc);
//		studentList.add("Hello");
//		studentList.add(123);
//		studentList.add(123.456);
//		studentList.add('c');
//		studentList.add(new Object());
//		parameter type object == all types of parameter can be used
//		
//		if (studentList.get(0) instanceof Student) {			
//			System.out.println(((Student)studentList.get(0)).getName());
//		}
//		System.out.println(studentList.get(1));
//		System.out.println(studentList.get(2));
//		System.out.println(studentList.get(3));
//		System.out.println(studentList.get(4));
//		System.out.println(studentList.get(5));
//		System.out.println(studentList.get(6));
//		Object List.get(index i)
		
//		Generics
		
//		generic == collection -> type for only one : <>
		
		
//		studentList.set(1, sc);
		
	}
	
//	메뉴 출력용 메서드
	
	
	/** alt+shift+J 
	 * Method type
	 * 메뉴 출력용 메서드
	 * @author email@email.com
	 */
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("\n-----------학생 관리 프로그램-----------\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬");
			System.out.println("8. 이름순으로 정렬");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			try {
				menuNum = sc.nextInt();
				System.out.println();
				
				switch (menuNum) {
				case 1 : System.out.println(studentAdd()); break;
				case 2 : selectAll(); break;
				case 3 : System.out.println(studentUpdate()); break;
				case 4 : System.out.println(studentRemove()); break;
				case 5 : System.out.println(studentSearch1()); break;
				case 6 : studentSearch2(); break;
				case 7 : sortAge(); break;
				case 8 : sortName(); break;
				case 0 : System.out.println("프로그럄 종료"); break;
				default : System.out.print("잘못 입력하셨습니다");
				
				}
			} catch(InputMismatchException e) {
				System.out.print("숫자만 입력하세요");
				sc.nextLine();
				menuNum = -1;
			}		
		} while(menuNum != 0);
		sc.close();
	}
	
	/**
	 * 학생 정보 추가 메서드
	 */
	public String studentAdd() throws InputMismatchException{
		System.out.println("\n-----------학생 정보 추가-----------\n");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("거주지 : ");
		String region = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("점수 : ");
		int score = sc.nextInt();
				
		if (studentList.add(new Student(name, age, region, gender, score))) {
			return "성공";			
		} else {
			return "실패";
		}
	}
	/**
	 * 학생 정보 전체 조회
	 */
	public void selectAll() {
		System.out.println("\n-----------학생 정보 전체 조회-----------\n");
		
		if (studentList.isEmpty()) {
			System.out.println("입력된 학생이 없음");
			return;
		} else {
			
			int index = 0;
			for (Student std : studentList) {
				System.out.print((index++) + "번 : ");
				System.out.println(std);		
				/*for (Type variableName : arrayOrCollection) {
    				// Code to execute for each element
				} */
			}
		}
	}
	/**
	 * 학생 정보 수정
	 * 1- 정보가 studentList에 없다면"없음"
	 * 2- 이력된 숫자가 0보다 작으면 "음수는 입력할 수 없습니다"
	 * 3- studetnList 범위 내 인덱스 번호보다 크면, "범휘를 넘어선 값을 입력할 수 없음"
	 * 4- 수정 완려 "000의 정보가 변경 되었습니다"
	 */
	public String studentUpdate() throws InputMismatchException {
		System.out.println("\n-----------학생 정보 수정-----------\n");
		System.out.print("번호 검색 : ");
		int input = sc.nextInt();
		
		if (studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다";
		} else if (input<0) {
			return "음수는 입력할 수 없습니다";
		} else if (input >= studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
		} else {
			
			System.out.println(input + " 번째에 인덱스 정보");
			System.out.println(studentList.get(input));
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("거주지 : ");
			String region = sc.nextLine();
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			Student s = new Student(name, age, region, gender, score);
			Student temp = studentList.set(input, s); 
			return temp.getName() + "의 정보가 변경되었습니다";
		}
	}
	public String studentRemove() throws InputMismatchException{
		System.out.println("\n-----------학생 정보 제거-----------\n");
		
		System.out.print("학생 번호 검색 : ");
		int input = sc.nextInt();
		
		
		if (studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다";
		} else if (input<0) {
			return "음수는 입력할 수 없습니다";
		} else if (input >= studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
		} else {
			System.out.println(input + " 번째에 인덱스 정보");
			System.out.println(studentList.get(input));
			System.out.print("정말 삭제 하시겠습니다? (Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			if(ch == 'Y') {
				Student temp = studentList.remove(input);
				return temp.getName() + "의 정보가 제거되었습니다";
			} else {
				return "취소 되었습니다";
			}
		}
		
//		for (Student std : studentList) {
//			if (!std.getName().equals(input)) {
//				return "일치하는 학생이 없음";
//			} 
//			if (std.getName().equals(input)) {
//				studentList.remove(std);	
//			}
//		}
//		return "정상적으로 제거 되었습니다";
	}
	
	/**
	 * 이름이 일치하는 학생을 찾아서 조회하는 메서드 (완전일치)
	 * 1) 이름 입력 받기 -> studentList에서 꺼내온 Student 객채의 name 값이 같은지
	 * 2) -일치하면 Student 객체 출력
	 * 3) -일치하지 않으면 "검색 결과가 없습니다"
	 */
	public String studentSearch1() throws InputMismatchException{
		
		System.out.println("-----------이름으로 검색(일치)-----------");
		System.out.print("이름 검색 : ");
		String input = sc.next();
				
		if (studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다";
		} 
		for(Student std : studentList) {
			if (input.equals(std.getName())) {
				return std.toString();
			}
		} 
			return "검색 결과가 없습니다";
	}
//		return input;
	/**
	 * 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드 (포함)
	 * 1) 문자열 입력 studentList에서 꺼내온 Student 객체의 name 값에 포함되는 문자열인지 검사
	 * 2) -일치하면 모든 Student 객체 출력
	 * 3) -일치하지 않으면 "검색 결과가 없습니다"
	 */
	public void studentSearch2() throws InputMismatchException{
		
		System.out.println("-----------이름으로 검색(포함)-----------");
		System.out.print("이름 검색 : ");
		String input = sc.next();		
		boolean flag = true;
		
		if (studentList.isEmpty()) {
			System.out.println("입력된 학생 정보가 없습니다");
		} 
		for(Student std : studentList) {
			if (std.getName().contains(input)) {
				System.out.println(std);
//				return std.toString();
				flag = false;
			}
		} 
		if (flag) {	
			System.out.println("검색 결과가 없습니다");
		}
//		boolean String.contains(문자열) : String에 문자열이 포함 -> true / 없으면 false
	}
	
	public void sortAge() {
//		comparable
//		lowest to highest
		
		Collections.sort(studentList);
		
		for(Student std : studentList) {
			System.out.println(std);
		}
	}
	
	public void sortName() {
//		comporator
		
		Comparator<Student> nameComporator = Comparator.comparing(Student::getName);
		Collections.sort(studentList, nameComporator);
		
		for(Student std : studentList) {
			System.out.println(std);
		}
		
	}
}
