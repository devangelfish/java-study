package kr.ac.syu.day03;

//import java.lang.Object;
// java.lang.Object를 import하지 않아도,
// 상속 관계가 된다?
//	-> java.lang.* 패키지는 자동으로 포함되어 있다!

class AAA /*extends Object*/ { // 예시일 뿐!
	// *모든 클래스는 최상위 클래스 Object를 상속한다.
	//	-> 재정의 하지 않고도, toString() 호출 가능! 부모의 toString() 호출!
	@Override
	public String toString() {
		return "AAA Class...";
	}
}

public class ObjectTest {
	public static void main(String[] args) {
		AAA a = new AAA();
		System.out.println(a.toString());
		System.out.println(a); // toString() 자동 호출!
	}
}







