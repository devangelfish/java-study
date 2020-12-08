package kr.ac.syu.day03.cast;

public class Program {
	/*
	 *  instanceof 연산자
	 *  [형태] : A instanceof B
	 *  		A가 B로 형 변환이 가능한지?
	 *  	- 형변환(인스턴스)이 가능한지를 묻는 연산자
	 *  	- 가능하면 true, 불가능하면 false
	 */
	static void info(Parent p) {	// 자식 전달, Parent p = c01
									// 자동 형변환, Up Casting
		p.info(); // ***** 상속 관계를 주는 설계 목적!
		// 자식 클래스가 늘어난다해도 코드가 변경되지 않는다. -> 편해!
		// 단, 아래의 instanceof 연산자는 자식 클래스마다 조건을 추가적으로 걸어야한다!
		
		// 참조 변수 p는 자식 객체의 주소를 담을 수 있는 특징!
		if(p instanceof Child01) {
			Child01 c = (Child01)p; // 강제 형변환, Down Casting
			// 객체를 담을 수 있는 참조 변수의 형변환이다!
			//	-> 조건문이 true라면, p가 실제로 가지고 있는 것은?
			//	      자식인 Child01 c01 이다!
			c.study();
			c.sleep();
			
//			p.study(); // 불가! 부모의 멤버가 아니다.
			// 자식으로 강제 형변환 하는 경우
			//	-> 자식의 참조 변수로만 호출 가능한 변수나 메소드가 존재한다.
			//	      자식만이 가지고 있는 멤버들! ( study(), sleep() )
//			c.info();
//			p.info();
			// 형변환 하지 않고 바로 info() 호출!
			//	-> 자식의 info() 메소드가 호출된다.
			// *참조 변수 p는 자식을 담고 있다!
			// *부모 참조 변수로 info() 이름을 사용하되, (부모에 info()를 선언 해놓은 이유)
			//	실제 담긴 객체는 자식이기에 부모의 info()는 가려지고 자식의 info()가 호출된다!
			//	즉, 담고 있는 자식의 재정의된 메소드가 호출되는 것!
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.soccer();
			c.drink();
//			c.info();
//			p.info();
		} else {
//			p.info();
		}
	}
	
	public static void main(String[] args) {
//		Parent p = new Parent();
		
		// 부모의 참조 변수에 생성된 자식을 담아라.
//		Parent p = new Child01();
		// double = int 와 같이
		//	-> 큰 그릇에 작은 그릇을 담는 형태
		// Child01 타입이 Parent 타입으로 자동 형변환!
		
		// 자식의 참조 변수에 부모를 생성하여 담아라.
//		Child01 c = new Parent(); 			// 컴파일 에러!
//		Child01 c = (Child01)new Parent();	// 런타임 에러!
		// Parent 타입을 Child01 타입으로 강제 형변환
		// ClassCastException 발생! (변환 불가!)
		
//		Parent parent = new Parent();
//		info(parent);
		Child01 c01 = new Child01();
		info(c01);
		Child02 c02 = new Child02();
		info(c02);
		// info(Parent p) 메소드의 매개 변수가 부모 타입으로,
		// 자식 타입의 인자가 전달될 수 있다.
	}
}











