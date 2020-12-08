package kr.ac.syu.day03;

/*
 *  Inner Class
 *   : 클래스 내부에 클래스가 존재하는 형태 (내부 클래스)
 *   
 *  [형태]
 *  class OuterClass {
 *  	class InnerClass {
 *  
 *  	}
 *  	static class NestedClass {
 *  
 *  	}
 *  }
 */

class Outer {
	Outer() {
		// 클래스 내부에서는 직접 생성 가능!
//		Nested nst = new Nested();
//		nst.goo();
		
		Nested.goo(); // static 메소드는 클래스 이름으로 접근!
	}
	class Inner {
		public void foo() {
			System.out.println("Inner Class foo() Method Called...");
		}
	}
	static class Nested {
		Nested() {
			System.out.println("Nested Class Constructor Nested() Called...");
		}
		
//		public void goo() { // 일반 메소드
		public static void goo() { // 스태틱 메소드
			System.out.println("Nested Class goo() Method Called...");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		// 일반 내부 클래스 접근 방법
		Outer out = new Outer(); // Outer 먼저 생성!
		Outer.Inner oi = out.new Inner();
		// Outer.Inner : Outer 클래스의 멤버다! -> 접근 연산자
		//	-> 내부 클래스 이름 (타입)
		// out.new Inner() : 생성된 Outer를 통해 Innter를 접근하여 생성!
		oi.foo();
		
		Outer.Inner oi2 = new Outer().new Inner();
		oi2.foo();
		
		// static 내부 클래스 접근 방법
//		Outer.Nested on = new Outer.Nested();
//		Outer.Nested on = new Outer.new Nested(); // 스태틱 멤버다! 불가!
//		on.goo();
		
		new LOL().process();
		// 생성과 동시에 메소드 호출!
		// 생성된 LOL 객체를 기억하는 참조 변수가 존재하지 않는다.
		//	-> 일회용성, 생성된 객체는 재 사용할 수 없다.
		
		// Game 인터페이스를 상속 받는 익명 클래스
		Game g = new Game() {
			@Override
			public void process() {
				System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
			}
		};
		g.process();
		
		new Game() {
			 @Override
			 public void process() {
				 System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
			 }
		}.process(); // 일회용성
		// Game 인터페이스를 상속받는 익명 클래스 사용과 동시에 메소드 호출!		
	}
}

interface Game {
	void process();
}
class LOL implements Game {
	@Override
	public void process() {
		System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
	}
}








