package kr.ac.syu.day02.array;

import java.util.Arrays;

public class ArrayTest02 {
	public static void arrInfo(int[] arr) { // 정수형 배열 타입의 인자를 받겠다.
		for(int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// 배열 복사
		int[] org = { 10, 20, 30, 40, 50 };
		int[] cpy = new int[5]; // 길이 5인 정수형 빈 배열 생성
		
		arrInfo(org); // 배열 이름(변수 이름처럼) org를 인자로 전달!
		
//		for(int i = 0; i < org.length; i++) {
//			cpy[i] = org[i];
//		}
//		arrInfo(cpy);
		
		// org 0번지 부터의 데이터를 cpy 0번지 부터 org.length 길이만큼 복사!
//		System.arraycopy(org, 0, cpy, 0, org.length);
//		System.out.println(Arrays.toString(cpy));
		
		// org 3번지 부터의 데이터를 cpy의 1번지부터 2(길이)개 만큼 복사!
		System.arraycopy(org, 3, cpy, 1, 2);
		System.out.println(Arrays.toString(cpy));
		
		// 복사되지 않은 자리는 0으로 되어있다.
		// new를 이용한 배열 생성 시 초기화하지 않으면 자동으로 0으로 초기화!
		//	-> 최초 cpy 배열은 모두 0이 들어있는 배열!
		
//		int value; // 변수 선언
//		System.out.println(value); // 초기화되지 않은 변수
		// 컴파일 에러!
		
//		int[] arr;
//		System.out.println(arr[0]); // 초기화되지 않은 배열
		// 컴파일 에러!
	}
}














