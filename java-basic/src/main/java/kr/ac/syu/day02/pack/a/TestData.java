package kr.ac.syu.day02.pack.a;

// *접근이라는 것은 클래스명, 생성자명, 필드명을 다른 곳에서 사용하는 것!
// default class
class Pen { // 접근 지정자가 생략되어 있는 형태
	int length;
//	Pen() { }			// default 클래스, default 생성자
	public Pen() { }	// default 클래스, public  생성자
	
	/*
	 *  JVM에 의해 생성되는 기본 생성자의 접근 지정자는?
	 *  	-> class 접근 지정자에 따라 결정된다.
	 *  	-> 생성자를 보통 public으로 다 지정해주는 형태도 존재하는데,
	 *  	      어차피 class의 접근 지정 형태에 따라 접근 권한이 정해진다.
	 */
}

//private class Phone { } // 컴파일 에러!
// Phone 이름 접근해야 class를 사용할 수 있는데?
// private 지정한다? 말도 안된다!
class Phone {
	@SuppressWarnings("unused")
	private class Address { // 내부 클래스 가능!
		// Phone 클래스 내에서만 사용할 내부 클래스 정의.
	}
	// 왜? Address를 사용한 친구가 있다! Phone 클래스
}

public class TestData {
	public		String	name;
	protected	String	id;
				String	addr;
	@SuppressWarnings("unused")
	private		int 	money;
	
	public TestData() {
		// 클래스 내부에서는 모두 접근 가능!
		name = "카페";
		id = "e-1001";
		addr = "Seoul";
		money = 3000;
	}
}
