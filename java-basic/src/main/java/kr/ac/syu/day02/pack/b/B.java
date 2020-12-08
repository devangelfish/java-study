package kr.ac.syu.day02.pack.b;

//import kr.ac.syu.day02.pack.a.TestData;
// import 수행 시 현재 B.java 파일 내에서 TestData 사용 가능!

// TestData와 다른 패키지이지만 상속 관계인 B 클래스
public class B extends kr.ac.syu.day02.pack.a.TestData {
	kr.ac.syu.day02.pack.a.TestData td 
		= new kr.ac.syu.day02.pack.a.TestData();
	// 다른 패키지 -> 디렉토리 경로가 다른 곳에 있는 클래스!
	// 사용하기 위해서 경로를 알려줘야 한다. 포함해야 한다. (import)
	//	-> 특정 부분에서만 경로 정보까지 작성하여 사용 가능!
	
	B b = new B();
	
	B() {
		System.out.println(td.name);	// public
//		System.out.println(td.id);		// protected
		System.out.println(b.id);
		// protected 필드 접근 방법은
		// 상속을 주는 TestData가 아니라,
		// 상속을 받는 B가 활용!
		//	-> 다른 패키지라도 상속 관계라면, 접근 가능!
//		System.out.println(td.addr);	// default
//		System.out.println(td.money);	// private
	}
}
