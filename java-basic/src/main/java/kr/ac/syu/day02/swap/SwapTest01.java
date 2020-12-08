package kr.ac.syu.day02.swap;

public class SwapTest01 {
	/*
	 *  Call By Value : 값에 의한 호출
	 *  단순히 값만 받아오기에,
	 *  main과 swap의 a, b는 서로 다른 변수!
	 *  	-> 인자 전달 : main a 값이 swap a 로 대입되는 형태!
	 */
	public static void swap(int a, int b) { // "int a = [전달된 인자 값]"와 같이 대입되는 형태!
		// swap 메소드 영역의 매개변수 a, b
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		// main 메소드 영역의 지역변수 a, b
		int a = 7;
		int b = 3;
		System.out.println("a : " + a + ", b : " + b);
		
//		int temp = a;
//		a = b;
//		b = temp;
		swap(a, b);
		
		System.out.println("a : " + a + ", b : " + b);
	}
}
