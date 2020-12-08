package kr.ac.syu.day02;

/*
 *  접근 지정자 (접근 제한자, 접근 지시자)
 *   : 클래스(class)간의 필드 접근 범위를 설정하는 용도(역할)
 *   
 *  public		: 어디서나 접근 가능 (접근 제한 X)
 *  private		: 클래스 내부에서만 접근 가능
 *  (default)	: 동일 패키지 내에서만 접근 가능
 *  			  (접근 지정자를 선언하지 않은 경우)
 *  protected	: 상속 관계에서 접근 가능
 *  
 *  private < default < protected < public
 */

class Dog {
	public	String name;	// public
			int age;		// default
	@SuppressWarnings("unused")
	private double weight;	// private
	
	Dog() {
		// 같은 클래스(Dog) 내부이기에 모두 접근 가능
		name = "아리";
		age = 3;
		weight = 3.6;
	}
}

class Cat {
	public String name;
	Dog dog; // 다른 클래스의 인스턴스 변수 선언 및 생성이 가능
	
	Cat() {
		name = "카페";
		dog = new Dog(); // Dog 인스턴스 생성
		// 다른 클래스(Dog)의 멤버 접근
		dog.name = "아리";
		dog.age = 3;
//		dog.weight = 3.6;
		// private 지정자이기 때문에 접근 불가
	}
}

// public class는 파일을 대표하는 클래스며, 단 하나만 존재할 수 있다!
//public class Panda { }

// PublicTest.java 파일을 대표하는 PublicTest 클래스
//	-> 대표 클래스는 파일명과 클래스명이 일치!
public class PublicTest {
	// main(...) Method : 프로그램 시작 시 JVM에 의해 호출되어 사용!
	// Q. 다음 메소드에 public 접근 지정자가 붙어야 하는 이유?
	//	-> JVM이 호출하기 위해서, 외부에서 호출 가능 하도록! (public)
	public static void main(String[] args) {
		System.out.println("main(...) Method Called...");
		
		Dog dog = new Dog();
		dog.name = "아리";
		dog.age = 3;
//		dog.weight = 3.6;
		// private 지정자이기 때문에 접근 불가
	}
}




