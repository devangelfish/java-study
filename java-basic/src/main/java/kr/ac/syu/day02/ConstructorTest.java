package kr.ac.syu.day02;

/*
 *  생성자의 특징
 *  1. 클래스 이름과 동일
 *  2. 반환형이 존재하지 않음
 *  3. JVM이 디폴트 생성자 자동 생성(삽입)
 *  (단, 클래스 내에 생성자가 정의되어 있지 않은 경우)
 *  4. 오버로딩 지원
 *  5. 객체의 초기화 담당
 *  
 *  자바는 Overloading(오버오딩) 지원
 *   : 메소드의 이름은 같지만,
 *     매개변수의 개수나 데이터 타입에 따라 차이를 두는 방법
 *     -> 동일한 이름으로 하나 이상을 읽을 수 있다!
 *     -> 메소드명이 동일하더라도 처리할 수 있다! 
 */

class Member { // 클래스 이름은 첫 문자를 대문자로!
	// 필드 (데이터), 멤버 변수
	String name;
	
	// 생성자 (Constructor)
	Member() {
		System.out.println("default Constructor Member() Called...");
	}
//	Member(String _name) {	// '_' 를 활용한 구분 방법
	Member(String name) {	// this를 활용한 구분 방법
		// 매개변수 name은 메소드  영역 내에서만 사용 가능한 지역 변수!
//		name = _name;
		// 필드 이름과 매개변수의 이름이 똑같이 때문에 경고!
		// *스코프 탐색 : 자기 자신이 가지고 있는 것부터 인식!
		//		-> 해당 이름으로 접근 가능한 것이 자신 영역에 없다면, 더 넓은 영역을 찾는다.
		this.name = name;
		// Member.name = name;
		// this : 나 자신을 의미
		//	-> 현재 영역(class)의 필드를 접근하기 위한 키워드
	}
	
	// 멤버 메소드
	void info() {
		System.out.println("void info() Method Called...");
	}
	void info(int a) {
		System.out.println("void info(int a) Method Called...");
	}
	void info(double b) {
		System.out.println("void info(double b) Method Called...");
	}
//	int info(double b) {	// 이름은 해당 데이터를 찾기(식별) 위해 사용!
//							// 반환형이 달라도 이름이 같으면 사용 불가능!
//		System.out.println("int info(double b) Method Called...");
//		return 1;
//	}
	
	// 생성자 이름과 동일하되 반환형이 존재한다면,
	// 메소드로 취급! -> 권장 X
//	void Member() {
//		System.out.println("void Member() Method Called...");
//	}
}

class Person {
	String name;
	int age;
	// 나이는 특징은 0 값이 의미 있는 값!
	//	자동 초기화되는 값으로 활용하자니, 애매하다.
	//  보통 0이상이 의미있는 데이터에 대해 없음을 표현할 때는, -1 로 초기화!
	double height;
	
	// 상수 필드
//	final String ID = "e-1001"; // 선언과 동시에 초기화
	final String ID; // 선언만!
	// 객체 생성 시 객체의 데이터를 의미하는 필드
	//	-> 상수 필드는 무조건 초기화가 되어야한다!
	
	Person() {
//		this.name = "이름없음";
//		this.age = -1;
//		this.height = -1.0;
		// 모든 경우의 생성자에 각각 코드를 작성?
		
		this("이름없음");		// 나 자신의 생성자를 호출하는 방법!
//		Person("이름없음");	// 와 같은 형식! (단, 메소드 호출 방식이므로 사용 불가!)
		// Person(String name) 호출!
		//	this -> Person
	}
	Person(String name) {
//		this.name = name;
//		this.age = -1;
//		this.height = -1.0;
		this(name, -1);
	}
	Person(String name, int age) {
		this(name, age, -1.0);
	}
	Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		
		this.ID = "e-1001";
		// 객체 생성 시 본 영역(생성자)는 무조건 실행되므로,
		// 상수 필드를 선언만 한 후에 생성자에서 초기화 가능!
		// 다른 생성자를 선언했어도 본 영역에 도달한다라는 보장이 있다면,
		// 컴파일 에러는 발생하지 않는다.
		
		// *상수 필드는 객체 생성 시 무조건 초기화되어야 한다!
		//	1. 필드 선언과 동시에 초기화
		//	2. 생성자에서 초기화
	}
	
	void info() {
		System.out.println("name : " + name
						 + ", age : " + age
						 + ", height : " + height);
	}
}

public class ConstructorTest {
	public static void constantTest(final int value) {
//		value = 10; // 매개변수 value 가 상수화! -> 변경이 불가능!
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		constantTest(20);
		
		// 생성자 : 객체 생성 시 최초(단 한번) 호출!
		//	-> 생성자도 메소드
		Member m = new Member(); // Member 객체 생성
		/*
		 *  new Member();
		 *  new : 메모리를  생성(할당)하기 위한 키워드
		 *  Member() : 생성자 호출문
		 */
//		Member m = new Member("카페");
		// 생성자도 메소드이기 때문에, 인자 전달이 가능!
		
		// 오버로딩된 메소드 호출
		m.info();
		m.info(7);
		m.info(3.14);
		
		// 생성자 이름과 동일한 메소드 호출
//		m.Member();
		
		Member member = new Member("라떼");
//		member.name = "라떼";
		System.out.println(member.name);
		// 그냥 member.name 처럼 "접근"해서 사용하면 되지 않나?
		
		Member member2 = new Member(); // 기본 생성자 호출로 초기화 수행 X
		System.out.println(member2.name);
		// null : 아무것도 없음을 의미
		// member2.name을 초기화하지 않았을 시 null 값 출력
		//	new를 이용해 생성하면 자동 초기화?
		//	객체 또는 String -> null 초기화 (String도 객체!)
		//	기본 데이터 타입 -> 0, 0.0, ...
		
		Person person = new Person();
		// 초기화되지 않은 필드 출력 -> 자동 초기화!
		System.out.println(person.name);	// null
		System.out.println(person.age);		// 0
		System.out.println(person.height);	// 0.0
		
		Person p = new Person("아이유", 28, 162.1);
		p.info();
		Person p2 = new Person("아이유", 28);
		p2.info();
		Person p3 = new Person("아이유");
		p3.info();
		Person p4 = new Person();
		p4.info();
	}
}










