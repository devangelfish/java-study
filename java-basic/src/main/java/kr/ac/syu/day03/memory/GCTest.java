package kr.ac.syu.day03.memory;

/*
 *  System 클래스의 쓰레기 수집 정적 메소드
 *  1. public static void gc()
 *  	: 쓰레기 수집기 가동
 *  2. public static void runFinalization()
 *  	: 쓰레기 수거
 *  3. public static void runFinalizersOnExit(boolean value)
 *  	: 프로그램(프로세스) 종료 시 모든 객체를 수거
 */

class Coffee {
	private int no;
	
	public Coffee(int no) {
		this.no = no;
		System.out.println("커피 생성 : " + no);
	}
	public int getNo() {
		return no;
	}
	@Override
	protected void finalize() { // 소멸(해제) 시 호출되는 메소드!
		System.out.println(no + "번 객체 정리!");
	}
}

public class GCTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Coffee c = new Coffee(1);
		Coffee c2 = new Coffee(2);
		Coffee c3 = new Coffee(3);
		
//		System.runFinalizersOnExit(true);
		
		c2 = null;
		System.gc();
		// 호출하는 시점에 쓰레기에 해당되는 것들을 확인
		// 쓰레기 수거에 해당되는 finalize() 호출
		
//		System.out.println(c2.getNo());
		// ***** NullPointerException *****
		//		-> null을 참조하려 할 때 발생!
		//		-> getNo()이 문제가 아니다! -> c2가 null이다!
		
		c2 = new Coffee(4); // 4번 객체를 새롭게 생성해서, c2가 담는 것! 
	}
}












