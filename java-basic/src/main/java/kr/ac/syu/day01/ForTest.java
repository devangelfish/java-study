package kr.ac.syu.day01;

/*
 *  반복문 3대 필수 요소
 *  1. 초기값
 *  2. 조건식 (탈출 조건, 종료 조건)
 *  3. 증감식
 *  @. 수행구문
 */

public class ForTest {	
	public static void main(String[] args) {
		/*
		 *  for(초기값; 조건식; 증감식) { 수행구문; }
		 *  
		 *  초기값; for( ; 조건식; 증감식) { 수행구문; }
		 *  
		 *  for(초기값1, 초기값2, ... ; 조건식; 증감식1, 증감식2, ...) {
		 *  	수행구문;
		 *  }
		 *  
		 *  for(초기값; 조건식; 증감식); // 수행구문이 없는 경우
		 *  
		 *  초기값 : 반복문을 수행할 기준이 되는 값
		 *  조건식 : 증감식을 통해 변경되는 변수의 탈출 조건
		 */
		// Infinity Loop (무한 루프)
//		for( ; ; ) {
//			System.out.println("Go!!!");
//		}
		// 해당 출력문에 도달하지 못한다면, 컴파일 에러!
//		System.out.println("Stop!!!");
		
		int i = 0;
		for( ; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("루프 종료 후 i : " + i);
		
		for(int j = 0; j < 10; j++) {
			System.out.print(j + " ");
		}
		System.out.println("");
//		System.out.println("루프 종료 후 j : " + j);
		// for 반복문 내부의 변수 j를 접근할 수 없다.
		
		// 변수의 가시성 (Scope)
		//	{ } : Block Scope, 영역 또는 지역
		int num = 10;
		boolean bool = false;
		if(num > 5) {
//			boolean bool = true;
			System.out.println(bool);
		}
//		System.out.println(bool);
		// 조건문 내부에서 변수 선언 시,
		// 외부에서는 볼 수 없다. 보이지 않는다. 접근하지 못한다.
		// *집 안에서 바깥 경치 보는거? 좋아요!
		//  집 밖에서 누가 안을 보는거? 안좋아요!
		
		// 반복문의 중첩 (구구단)
		for(int a = 2; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				System.out.println(a + " * " + b + " = " + (a * b));
			}
			System.out.println("");
		}
		
		// break : 해당 영역을 즉시 탈출, 빠져 나와라.
		// 1부터 100이하의 정수 중 3과 5의 최소 공배수
		for(int a = 1; a <= 100; a++) {
			if(a % 3 == 0 && a % 5 == 0) { // 15
				System.out.println("최소 공배수 : " + a);
				break;
			}
		}
		
		// continue : 수행 구문을 더 이상 수행하지 말고, 다음 루프로 넘어가라.
		for(int a = 1; a <= 10; a++) {
			if(a % 2 == 0) { // 짝수라면,
				continue;
			}
			System.out.print(a + " ");
		}
		System.out.println("");
		
		// label
		//	break는 현재 루프 하나만 탈출!
		//	중첩된 반복문을 한번에 탈출하고 싶을 때 사용!
		java: for(int a = 0; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				System.out.print('*');
				if(b == 4) {
					break java;
				}
			}
			System.out.println("");
		}
		// C언어의 goto문 처럼 수행 흐름을 강제로 이동!
		//	-> 스파게티 코드가 될 수 있으니 지양한다지만,
		//	-> *잘쓰면 좋다!
	}
}










