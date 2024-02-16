package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.*;
public class CarService {

	public void ex1() {
		
		Car car = new Car();	
		Tesla tesla = new Tesla();	
//		Spark spark = new Spark();
		
//		다형성
//		부모타입 참조변수 = 자식객체
		
		Car car2 = new Tesla();
		
		Car car3 = new Spark();
		
//		Polymorphism - upcasting
		
//		1-1) car (부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		
//		1-2) tesla (자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(100000);
//		spark.setEngine("v4");
//		spark.setFuel("휘발유");
		
//		1-3) car2 (부모 = 자식(tesla))
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		((Tesla) car2).setBatteryCapacity(100000);
		
		car3.setEngine("경차 엔진");
		car3.setEngine("휘발유");
		car3.setWheel(3);
		
//		2) 다형성 이용한 객체배열
//		객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것
//					부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		Car arr[] = new Car[3];
//		Car arr2[] = new Tesla[3];
		
		arr[0] = car;
		arr[1] = car2;
		arr[2] = car3;
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(i + "번째 인덱스의 엔진 : " + arr[i].getEngine());
		}
		System.out.println();
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
		
		
	}
	
//	전달받은 Car 또는 자식객체(Tesla,Spark)의 속성을 출력
//	매개변수에 부모타입 참조변수를 작성하면 모든 자식 객체를 전달받을 수 있음
	public void printCar(Car temp) {
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연로 : " + temp.getFuel());
		System.out.println("바퀴 : " + temp.getWheel());
		System.out.println();
	}
	
	
	public Car createCar(int num) {
		Car result = null;
		
		switch(num) {
		case 1 : result = new Car(); break;
		case 2 : result = new Tesla(); break;
		case 3 : result = new Spark(); break;		
		}
		return result;		
	}
	
	public void ex2() {
//		다형성(upcasting)을 이용한 매개변수 사용법
		
		Tesla t = new Tesla("전기모터", "전기", 4, 10000);
		
		Spark s = new Spark("경차 엔진", "휘발유", 4, 0.5);
		
		Car c = new Car("경유 엔진", "경유", 12);
				
		printCar(t);
		printCar(s);
		printCar(c);
		
		System.out.println("---------------------");
		
//		다형성을 이용한 반환형 사용법
		
//		Car arr[] = {new Car(), new Tesla(), new Spark()};
		
		Car arr[] = {createCar(1), createCar(2), createCar(3)};
		
//		instanceof : 객체의 자료형을 검사하는 연산자
//		-> 참조하는 객체가 특정 자료형이거나 부모쪽 상속관계인지 확인
		
		System.out.println(arr[1] instanceof Car);
		System.out.println(arr[1] instanceof Tesla);
		System.out.println(arr[1] instanceof Spark);
		
	}
	
	public void ex3() {
//		다형성 중 downcasting
//		downcasting
//		parent parameter = child parameter
//		only works with upcasing to downcasting
//		parent class "강제 형변환"

		Car c = new Tesla("전기모터", "전기", 4, 500000);
		
		System.out.println(((Tesla)c).getBatteryCapacity());
		
		Tesla t = (Tesla)c;
		
		System.out.println(t.getBatteryCapacity());
				
	}
	
	public void ex4() {
//		downcasting 주의사항!
		Car c = new Tesla();
		
//		Spark s = (Spark)c;
		
//		System.out.println(s.getDiscountOffer());
		
		if(c instanceof Spark) {
			Spark s = (Spark)c;
			System.out.println("Clear");
		} else {
			System.out.println("Error");
		}
		
	}
	
	public void ex5() {
		
//		binding
//		실제 실행할 메소드 코드와 호출하는 코드를 연결
		
		 Car c = new Car("Engine", "Fuel", 4);
		 
		 System.out.println(c.getEngine());
//		 c.getEngine == binding
		 
//		 프로그램 "실행 전"
//		 -> compiler : getEngine() -> inside Car class
//		 c.getEngine() -> connect edu.kh.poly.ex1.model.vo.Car.getEngine()
//		 ->정적 바인딩
		 
//		 다형성 적용 시 바인딩
		 
		 Car c2 = new Spark("Engine2", "Fuel2", 4, 0.5);

		 double c2DC = ((Spark)c2).getDiscountOffer();
		
		System.out.println(c2.toString());
//		edu.kh.poly.ex1.model.vo.Car.toString()
		
//		참조변수 c2가 Car 타입이므로
//		toStrin() 도 Car의 toString()호출 - 정적 바인딩
//		하지만 실행해보면 Spark 의 toString()이 호출
//		->compile Car 와 바인등
//		-> 실행시 Spark의 Override Method와 바인딩 == 동적바인딩
		 
	}
	
}
