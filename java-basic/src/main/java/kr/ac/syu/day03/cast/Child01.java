package kr.ac.syu.day03.cast;

// 서브 클래스
//	-> 추상 클래스를 상속 받아, 몸체를 가지지 않은 info() 메소드를 재정의!
//	   (몸체, Body를 가지게끔 했다. 실체화!) *구현 클래스
public class Child01 extends Parent {
	public Child01() {
		name = "첫 번째 자식";
	}
	
	void study() {
		System.out.println("재미있는 자바 프로그래밍!");
	}
	void sleep() {
		System.out.println("자야되는데 자꾸 버그가 생각나...");
	}
	
	@Override
	public void info() { // 부모 메소드를 재정의한 메소드, 몸체(Body, { })를 가지게끔!
		System.out.println(name + "에서 재정의된 info() Method Called...");
	}
}







