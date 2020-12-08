package kr.ac.syu.day02.singleton;

/*
 *  싱글톤 패턴 (단일체 패턴, Singleton pattern)
 *   : 객체를 단 하나만 생성(사용)하고 싶을 때
 */

public class Calendar { // 외부에서 접근 가능하도록 public class
	String name;
	
	// 외부 접근이 불가능하도록 private
//	private static Calendar obj;
	
	// 확정된 인스턴스를 갖도록 상수화, 선언과 동시에 초기화
	private final static Calendar obj = new Calendar();
	// 프로그램 시작 시 Calendar 객체 생성!
	
	// 외부에서 생성자를 호출하지 못하도록 private
	private Calendar() { }
	
	// getter
	public static Calendar getInstance() {
		// 최초 getInstance() 호출 시 Calendar 객체 생성!
//		if(obj == null) { // obj가 Calendar를 담고 있지 않다면,
//			obj = new Calendar(); // Calendar를 생성하여 담아라.
//		}
		return obj;
	}
}










