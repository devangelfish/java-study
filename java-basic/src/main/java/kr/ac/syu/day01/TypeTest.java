package kr.ac.syu.day01;

public class TypeTest {
	public static void main(String[] args) {
		// true, false를 저장할 수 있는 데이터 타입
		boolean bool = true;
		System.out.println(bool);
		
		// 문자 하나를 저장할 수 있는 데이터 타입
		char c = 'A'; // 문자하는 '' 표현
		System.out.println(c);
		
		Byte b = 10;
		System.out.println(b);
		System.out.println(Byte.SIZE);
		
		short s = 20;
		System.out.println(s);
		System.out.println(Short.SIZE);
		
		int i = 10;
		System.out.println(i);
		System.out.println(Integer.SIZE);
		
		long l = 10;
		System.out.println(l);
		System.out.println(Long.SIZE);
		
		float f = 3.5f;
//		float f = 3.5; // 저장 불가!
		// 3.5 라는 것도 데이터! 어딘가에 서랍장이 존재한다.
		//	- 이름없는 상수 (리터럴 상수)
		//	- 데이터 타입이 일치해야만 값을 저장 가능!
		//	- 3.5는 기본적으로 double 형식! flaot에 저장할 수 없다.
		//	- 3.5f -> 접미사 -> double을 float으로 바꾸기 위해 활용!
		//	  (3.5를 float 형태의 실수로 만들어라.)
		System.out.println(f);
		System.out.println(Float.SIZE);
		
		double d = 3.14;
		System.out.println(d);
		System.out.println(Double.SIZE);
	}
}










