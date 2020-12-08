package kr.ac.syu.day02.pack.a;

// TestData와 동일 패키지에 있는 A 클래스
public class A {
	TestData td = new TestData();
	
	A() {
		System.out.println(td.name);
		System.out.println(td.id);
		System.out.println(td.addr);
//		System.out.println(td.money);
		// 동일 패키지지만, private 이기 때문에 접근 불가!
	}
}
