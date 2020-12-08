package kr.ac.syu.day03.cast;

public class Child02 extends Parent {
	public Child02() {
		name = "두 번째 자식";
	}
	
	void soccer() {
		System.out.println("마이볼 !!!");
	}
	void drink() {
		System.out.println("오늘 잘했어~ 쨘!");
	}
	
	@Override
	void info() {
		System.out.println(name + "에서 재정의된 info() Method Called...");
	}
}








