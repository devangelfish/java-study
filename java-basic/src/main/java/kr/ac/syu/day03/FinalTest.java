package kr.ac.syu.day03;

import java.util.Random;

/*
 *  final 키워드
 *  	상수화 키워드!
 *  	확정시키겠다. 변경이 불가능하도록 막겠다!
 */

// final class : 상속하는 것을 허용하지 않겠다.
/*final*/ class FinalSuper {
	// final method
	//	: Override(재정의)를 허용하지 않겠다.
	//	   단, final class 가 아니라면 상속은 허용된다!
	final void foo() {
		// TODO
	}
}
class FinalSub extends FinalSuper {
//	@Override
//	void foo() { // 오버라이딩 불가능!
//		// TODO
//	}
}

@SuppressWarnings("serial")
class MyRandom extends Random {
	// 부모 클래스 Random의 nextInt() 메소드 재정의!
	@Override
	public int nextInt(int max) {
		return super.nextInt(max) + 1;
		// 난수 생성 기능까지 구현하기는 싫으니,
		// 부모의 기능을 가져와 결과만 바꿔(가공 하여) 반환하겠다.
	}
}

// String class는 final class 이기에 상속 불가!
//class MyString extends String { }

public class FinalTest {
	public static void main(String[] args) {
		Random r = new Random(); // 난수 생성 기능 제공
		int rNum = r.nextInt(2); // 0~1
		// nextInt(int bound)
		//	: 들어간 인자의 범위만큼 난수 생성, 기준은 0부터
		System.out.println(rNum);
		
		rNum = r.nextInt(2) + 1; // 1~2
		System.out.println(rNum);
		
		MyRandom mr = new MyRandom();
		rNum = mr.nextInt(2); // 1~2
		System.out.println(rNum);
	}
}









