package kr.ac.syu.day02.singleton;

public class Program {
	public static void main(String[] args) {
//		Calendar c; // public class
		// 참조 변수 선언 가능! (클래스 이름 접근)
//		c = new Calendar(); // private Constructor
		// 생성자 호출 불가능!
		
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		System.out.println("Calendar 1 : " + c);
		System.out.println("Calendar 2 : " + c2);
	}
}
