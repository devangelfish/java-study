package kr.ac.syu.day02;

// Object : 설계도(class)를 가지고 실제로 만들어지는 붕어빵
// class  : 객체를 생성하기 위한 설계도 (붕어빵 틀)
class Car { // Car : 클래스 이름, 설계도 이름 (자동차)
	// *필드 선언 및 정의
	// 멤버 변수 (데이터)
	String name; // 변수 선언과 똑같다!
	int speed;
	
	// 멤버 메소드 (기능, 행위)
	void drive() {
		System.out.println("부아앙~~");
	}
	void info() {
		System.out.println("name : " + name
						 + ", speed : " + speed);
	}
	
	/*
	 *  1. Car를 만들기 위한 설계도(class)를 선언하고,
	 *  2. Car의 이름과 속도를 표시하기 위해 멤버 변수를 선언하고,
	 *  3. Car의 주행 기능(method)을 수행하기 위해 멤버 메소드 선언!
	 *  	-> Car 라는 객체를 활용하기 위해 Car Class를 설계(선언 및 정의)
	 */
	
} // Block Scope 내부에 설계에 대한 정보를 정의


public class ClassTest {
	public static void main(String[] args) {
		// 이미 만들어 놓은 또는 설계가 되어있는 객체(Object)들을 조합하는 형태
		//	-> 단, 현재의 이해를 돕기 위한것이지 실질적인 목적은 아니다!
		Car car = new Car(); // 인스턴스 생성
		// int num = 10; 와 유사한 형태!
		// 인스턴스와 객체는 다른 개념이지만, 편의를 위해 객체 생성
		
		car.name = "BMW"; // 생성한 객체의 멤버 이름을 접근하여 "BWM" 값을 대입
		// 생성한 객체의 이름(name)을 정해주겠다.
		car.speed = 330; // 생성한 객체의 멤버 속도를 접근하여 330 값을 대입
		// 생성한 객체의 속도(speed)를 정해주겠다.
		//	-> 초기화 작업
		
		// Car  -> int
		// car2 -> num
		Car car2; // 해당 타입(Car)의 객체(Object)를 담을 수 있는 변수 (참조 변수)
		// int num;
		car2 = new Car(); // Car를 생성하여 car2 변수에 담아라.
		// num = 10;		
		// ***** new : 객체를 생성하기 위한 키워드
		
		// . : 멤버 연산자, 접근 연산자
		car2.name = "Benz";
		car2.speed = 330;
		car2.drive();
		
		car.info();
		car2.info();
		
		System.out.println(car);
		System.out.println(car2); // 참조 변수는 주소 정보를 출력!
		// 이름은 하나야! 근데 가지고 있는 데이터는 여러 개야!
		// 배열과 같이! -> 배열도 객체!
	}
}





