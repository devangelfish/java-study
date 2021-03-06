package kr.ac.syu.day03;

// 1. 자바는 다중 상속을 지원하지 않는다.
//class AA extends BB, CC { }
//class BB { }
//class CC { }

// 다만, interface를 활용한 다중 상속의 형태는 지원
interface AA { }
interface BB { }
class MyClass implements AA, BB { }

// 단 하나의 class와 여러 interface 상속 가능
class CC { }
class MyClass02 extends CC implements AA, BB { }

// interface 끼리의 상속은 extends 활용
interface MyInterface extends AA, BB { }

// 2. interface를 활용한 상수 데이터 관리
//	-> 요일에 대한 정보를 상수(숫자)로 표현하겠다.
class Cweek {
	public static final int MON = 1;
	// ...
	public static final int SUN = 7;
} // 인터페이스로 상수 표현을 한다면,
interface Iweek {
	// 인터페이스의 필드는 다음이 생략된 형태!
	/*public static final*/ int VALUE = 0;
	int MON = 1, /* ... */ SUN = 7;
}

// 3. 무엇이 가능한가를 표시하는 용도 (클래스의 특성 표시)
//	-> ~able 로 끝나는 interface 이름을 사용, ~가능하다.
interface UpperCasePrintable { // 대문자로 출력 가능하다.
	/*public abstract*/ void toUpperCasePrint();
}
class Printer implements UpperCasePrintable {
	// interface 상속 시, interface의 추상 메소드는
	// 구현 클래스에서 무조건 재정의(Override) 해야 한다.
	//	-> Printer는 "대문자 출력"이라는 특징을 무조건 갖게 된다.
	@Override
	public void toUpperCasePrint() {
		// TODO
	}
	
	void print() { }		// default
//	public void print() { }	// public
}
class PrinterSub extends Printer {
	@Override
//	void print() { }		// default
	public void print() { }	// public
	/*
	 *  Override된 메소드의 접근 지시자는,
	 *  부모의 접근 지시자보다 좁혀질 수 없다.
	 *  단, 부모의 접근 지시자보다 확장은 가능!
	 *  	-> 상속을 받는다? *클래스를 확장한다!
	 */
}

public class InterfaceTest {
	public static void main(String[] args) {
		// 인터페이스 상수 -> 접근 방법 동일! (static)
		System.out.println(Iweek.MON);
		System.out.println(Cweek.MON);
	}
}

interface ColorPrintable {
	void print();
	void prnRED();
	void prnBLUE();
	// ...
}
abstract class ColorPrint {
	abstract void print();
	void prnRED() { }
	void prnBLUE() { }
	// ...
}

class MyPrinter /*implements ColorPrintable*/ extends ColorPrint {
	// interface 상속 시 모든 메소드를 재정의!
	//	-> 출력 기능, 빨간색 출력, 파란색 출력
	@Override
	public void print() { }
	
	// abstract 상속 시 추상 메소드만 재정의!
	//	-> 출력 기능은 무조건 갖되, 색상 출력은 필요에 따라 재정의
//	@Override
//	public void prnRED() { }
//	@Override
//	public void prnBLUE() { }
}











