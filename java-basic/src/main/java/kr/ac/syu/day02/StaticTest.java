package kr.ac.syu.day02;

class StaticSub {
	String name;
	static int sCnt;
	int iCnt;
	
	StaticSub() {
		sCnt++;
		iCnt++;
	}
	StaticSub(String name) {
		this.name = name;
		sCnt++;
		iCnt++;
	}
	// *메모리 할당 시점만 기억해보자!
	void prnCnt() { // 일반 메소드
		System.out.println("static int sCnt : " + sCnt);
		// 일반 메소드 내부에서 static 멤버 변수 사용 가능!
		
		System.out.println("int iCnt : " + iCnt); // 사용 가능!
	}
	static void prnInfo() { // 스태틱 메소드
		System.out.println("static void prnInfo() Method Called...");
		
//		System.out.println("int iCnt : " + iCnt);
		// 스태틱 메소드 내부에서 일반 멤버 사용은 불가능!
		//	-> prnInfo() 메소드의 메모리 할당 시 (프로그램 시작 시)
		//	     일반 멤버 iCnt는 메모리에 존재하지 않는다.
		// *iCnt는 프로그램 수행 중 동적 할당되어 사용되는 일반 멤버
		
//		System.out.println("static int sCnt : " + sCnt);
		// prnInfo() 메소드 메모리 할당 시 (프로그램 시작 시)
		// *sCnt도 메모리에 존재한다. (static)
	}
}

public class StaticTest {
	public static void print() { // 스태틱 멤버 메소드
		System.out.println("print() Method Called...");
	}
	public void print(int a) { // 일반 멤버 메소드
		System.out.println("print(int a) Method Called...");
	}
	
	// Q. 다음 메소드에 static 키워드가 붙어야 하는 이유?
	//	-> main도 메소드다! 메모리에 존재해야만 호출해서 사용 가능!
	public static void main(String[] args) {
		print(); // 동일한 클래스 영역 내에 있기 때문에 바로 호출 가능!
		System.out.println(StaticSub.sCnt); // 다른 클래스 스태틱 멤버 접근
		
		StaticTest.print();
		// 스태틱 멤버 접근 방법
		// [클래스 이름].[필드] 로 접근!
		//	-> 객체를 생성하지 않고, 클래스 이름으로 바로 접근하여 호출!
				
		// print(int a) -> StaticTest 클래스의 일반 멤버 메소드
		//					객체 생성 후에야 활용 가능! 메모리 할당을 해야 사용할 수 있다.
		StaticTest st = new StaticTest();
		st.print(10);
//		st.print(); // 참조 변수로 스태틱 멤버 호출? 가능하다! -> 권장 X
		
		// JVM은 프로그램을 수행하기 위해, 컴파일된 파일(.class)을
		// 읽어들인다. *클래스 단위로 읽어들인다.
		// JVM 내의 클래스 단위로 읽어들이는 Class Loader가 동작!
		/*
		 *  static 멤버(필드, 메소드)는 클래스 로딩 시점에 메모리를 할당!
		 *  
		 *  JVM은 class 단위로 읽어들여 프로그램 수행 준비.
		 *  클래스를 읽어들였을 때 필요한 메모리 공간을 만든다. (존재한다.)
		 *  
		 *  new		: 동적 메모리 할당
		 *  	-> 해당 구문을 수행할 시 그 시점에 메모리를 할당
		 *  static	: 정적 메모리 할당
		 *  	-> 프로그램 시작 시 메모리를 할당
		 *  
		 *  static 변수 (class 변수)
		 *  	StaticSub의 static 변수는,
		 *  	StaticSub Class 수준의 변수로,
		 *  	해당 클래스로 생성된 객체는 모두 동일하게 사용한다.
		 *  
		 *  전역 변수 (Global) -> 모든 영역에서 접근 가능
		 *  지역 변수 (Local)	-> 특정 영역 내에서만 접근 가능
		 *  	static 변수도 모든 객체(동일한 클래스)가 접근하여 사용하는 것이니,
		 *  	전역 변수다? 아니다!
		 *  	단지, 전역 변수의 성격처럼 보일 뿐! *클래스 변수 (Class)
		 */
		StaticSub ss = new StaticSub();
		ss.prnCnt();
		StaticSub ss2 = new StaticSub("카페");
		ss2.prnCnt();
		StaticSub ss3 = new StaticSub("라떼");
		ss3.prnCnt();
		// static 멤버는 미리 만들어져 있는 메모리 공간을 사용하므로,
		// 각각의 객체 생성 시 1씩 증가한다. -> 한 공간을 공유한다.
		// 일반 멤버는 생성 시 각자의 메모리 공간을 사용하므로,
		// ss, ss2, ss3는 각자 1 증가된 멤버를 접근한다.
		
		StaticSub.prnInfo();
	}
}













