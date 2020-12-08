package kr.ac.syu.day01;

import java.util.Scanner;

public class IFTest {
	public static void main(String[] args) {
		/*
			{ } (Block Scope) : 영역을 구분하는 특수문자
			
			if(조건식) {
				// 조건식이 true일 때 실행되는 영역
			}
			// 조건식이 false일 때 계속 수행
			// true 시 조건문 내부를 실행한 후에 다음 라인을 수행
			
			if(조건식) {
				// true 시 수행되는 영역
			} else {
				// false 시 수행되는 영역
			}
		 */
		// 자동 import : Ctrl + Shift + o
		//	-> 자동 관리!
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("이체 금액 입력 : ");
		int money = s.nextInt();
		System.out.println("입력된 금액 : " + money);
		
		if(money > 20000) { // 입력된 금액이 20000 초과라면,
			System.out.println("이체 한도를 넘어섰습니다.");
		} else { // 아니라면,
			System.out.println("정상적으로 이체가 완료되었습니다.");
		}
		System.out.println("업무 완료.");
		
		// 조건문의 중첩
		int num = 10;
		System.out.print("숫자 num은 ");
		if(num < 0) { // num이 0미만이라면,
			System.out.println("0미만");
		} else { // 아니라면,
//			System.out.println("0이상");
			if(num < 100) {
				System.out.println("0이상 100미만");
			} else {
				System.out.println("100이상");
			}
		}
		
		// 조건문의 연속 비교 (if ~ else if ~ ... ~ else if ~ else)
		num = 15;
		if(num < 10) {
			System.out.println("0미만");
		} else if(num < 20) {
			System.out.println("10이상 20미만");
		} else if(num < 30) {
			System.out.println("20이상 30미만");
		} else {
			System.out.println("30이상");
		}
		
//		if(true) {
//			System.out.println("무조건 수행");
//		} else {
//			// 조건식이 무조건 참이기에 수행되지 않을 영역!
//			// Dead Code
//		}
	}
}









