package kr.ac.syu.day02.pack.b;

import kr.ac.syu.day02.pack.a.TestData;

//import kr.ac.syu.day02.pack.a.Pen;
// 다른 패키지의 default 클래스 import 불가! (접근 불가)

// TestData와 다른 패키지에 있는 Program 클래스
//	-> 패키지가 다르다? 디렉토리 경로가 다르다!
public class Program {
	public static void main(String[] args) {
//		Pen pen;
		// 다른 패키지의 default class 접근 불가!
		
//		new Pen();
		// default class의 public 생성자는 어차피 사용 불가!
		
		/*
		 *  TestData 클래스의 접근 지정자가 public 이고,
		 *  TestData 생성자의 접근 지정자가 default 라면,
		 *  참조 변수는 선언 가능 하되, 생성자 호출은 불가능!
		 *  
		 *  TestData td;	 // "클래스 이름"을 가지고 참조 변수 선언
		 *  // 가능!
		 *  new TestData();	 // "생성자" 호출
		 *  // 불가능!
		 *  
		 *  그럼 어디에 써? 이미 생성되어있는 TestData 객체를 담기 위한 용도!
		 */
		
		TestData td = new TestData();
		System.out.println(td.name);
//		System.out.println(td.id);
		// protected, 상속 관계가 아니라 접근 불가
//		System.out.println(td.addr);
		// default, 다른 패키지에서 접근 불가
//		System.out.println(td.money);
		// private, 다른 클래스에서 접근 불가
	}
}
