package kr.ac.syu.day03.cast;

// 수퍼 클래스
//public class Parent { // 일반 클래스
public abstract class Parent { // 추상 클래스
	String name;
	int age;
	
	Parent() {
		name = "부모";
		age = 60;
	}
	
//	void info() { // 일반 메소드
//		System.out.println("Parent Class info() Method Called...");
//	}
	abstract void info(); // 추상 메소드, 원형만 기억!
	// 부모의 참조 변수 형태로 info()를 접근해야 하니!
	// p.info() 와 같이!
}
