package kr.ac.syu.day01.method;

public class MethodTest01 {
	/*
	 * 	메소드의 형태
	 *  [반환형] [메소드 이름](매개변수) {
	 *  	[반환할 값];
	 *  }
	 *  반환형 : 반환할 값의 데이터 타입
	 *  메소드 이름 : 사용하고자 할 기능의 이름, 박스의 이름
	 *  
	 *  매개변수 (argument) - 받는 시점
	 *  	: 입력(input)시킬 데이터 타입 및 개수, 전달 순서대로 받는다!
	 *  인자 (parameter) - 전달 시점
	 *  	: 메소드를 호출하여 사용 시 전달할 데이터
	 *  *굳이 구분하지 않아도 된다. 다 알아들어요!
	 */
	// 1. 반환형 O, 매개변수 O
	public static int add(int a, int b) { // int a = 3, int b = 7
		// int a, int b -> 인자 값을 받아주는 매개변수!
		return a + b;
		// return : 값을 반환하라.
	}
	
	// 2. 반환형 O, 매개변수 X
	public static int getData() {
		return 10; // return 키워드로 10을 반환 (output)
	}
	
	// 3. 반환형 X, 매개변수 X
	public static void prnString() {
		// void : 반환형이 없음을 의미
		System.out.println("Hello Mehtod !!!");
	}
	
	// 4. 반환형 X, 매개변수 O
	// prnInfo("카페", 7) 처럼 호출!
	public static void prnInfo(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	// return : 값을 반환하거나 메소드를 즉시 종료하는 키워드
	//	-> 2가지 의미?
	//	-> 값을 반환하던 하지않던, 무조건 메소드 종료로 이어진다.
	public static void devide(int num1, int num2) {
		// num2가 0이 전달되었을 때를 처리하고 싶다!
		//	-> 예상 밖으로 동작하는 것을 방지한다. 예외 처리!
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; // 메소드 종료 (탈출)
			// 더 이상 수행하지 않고, 메소드를 즉시 끝내라.
		}
		System.out.println("나눗셈 결과 : " + (num1 / num2));
	}
	
	public static int test(int num) {
		System.out.println("num : " + num);
		// 조건식 내부에서만 return을 수행한다면,
		// 조건 만족 시에만 반환되므로, 반환에 대한 보장이 없다.
		// 무조건 true로 만들어도 컴파일 에러는 발생!
//		if(true) {
		if(num > 10) {
			System.out.println("10보다 큽니다.");
			return 1;
		}
		System.out.println("10보다 작습니다.");
		return 0;
	}
	
	public static void main(String[] args) {
		// return Test
		test(20);
		
		// add(3, 7) 메소드르 호출과 동시에 출력
		System.out.println("add(3, 7) : " + add(3, 7));
		// add(3, 7)	-> [메소드 이름]([인자1], [인자2])
		//				-> 3, 7이라는 상수 인자를 전달한다.
		
		getData(); // 10
		// getData() 메소드 호출, 호출 결과는 10
		System.out.println("getData() : " + getData());
		
		prnString();
		
		prnInfo("카페", 7);
		prnInfo("라떼", 6);
		
		devide(8, 2);
		devide(4, 0);
	}
}









