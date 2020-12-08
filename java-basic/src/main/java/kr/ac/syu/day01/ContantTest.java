package kr.ac.syu.day01;

public class ContantTest {
	public static void main(String[] args) {
		// 상수 : 변하지 않는 수, *확정된 수
		//	-> 상수는 모두 대문자로 하는게 관례
		final int CONST_NUMBER = 10;
		// 상수를 만드는 방법? 으로 기억하지 말고, 다음처럼 기억!
		//	-> 변수를 상수화 시킨다!
		// final : 상수화 키워드, 변하지 못하도록 막아라. (최종적으로 확정해라!)
//		CONST_NUMBER = 20; // 변경 불가능!
		System.out.println(CONST_NUMBER);
		
	}
}
