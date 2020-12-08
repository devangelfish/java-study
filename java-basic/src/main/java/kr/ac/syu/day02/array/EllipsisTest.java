package kr.ac.syu.day02.array;

import java.util.Arrays;

public class EllipsisTest {
	/*
	 *  ... : Ellipsis
	 *  기존 매개 변수 선언 방법
	 *  (int n1, int n2) -> 매개변수 2개
	 *  ...
	 *  (int n1, int n2, int n3, ... , int n9, int n10) -> 매개변수 10개
	 *  	-> 매개 변수를 여러 개 처리할 수 있도록 메소드를 만들자니,
	 *  	      메소드 정의가 너무 많아진다.
	 *  	-> 인자 개수의 상황에 따라 모든 메소드를 정의?
	 *  
	 *  가변 배열 형식의 매개변수 선언 방법
	 *  (int... n) -> int[] n : 넣은 인자 개수만큼 자동으로 배열로 생성!
	 */
	// 전달되는 모든 인자를 출력하는 메소드
	public static void prnInt(int... n) { // n -> int[]
		for(int i : n)
			System.out.print(i + " ");
		System.out.println("");
	}
	public static void prnString(String... sArr) { // sArr -> String[]
		for(String str : sArr)
			System.out.print(str + " ");
		System.out.println("");
	}
//	public static void print(String... addrs, int id) { // 마지막 인자로 활용!
	public static void print(int id, String... addrs) {
		System.out.println("id : " + id);
		System.out.println("addrs : " + Arrays.toString(addrs));
	}
	public static void main(String[] args) {
		prnInt(1);
		prnInt(1, 2);
		prnInt(1, 2, 3);
		
		prnString("one");
		prnString("one", "two");
		prnString("one", "two", "three");
		
		System.out.printf("%d\n", 10);
		// printf(String foramt, Object... obj) { ... }
		
		print(1001, "천안시 서북구", "두정동");
	}
}










