package kr.ac.syu.day01;

// 주석 (Comment)
//	- 프로그램 실행에 영향을 미치지 않는다.
//	- 설명의 용도, 실행하지 않을 코드 라인을 설정하는 용도

// 단일 라인 주석 -> 한 라인을 주석처리할 때 활용
/* (시작점)
 *  다중 라인 주석
 *   - 여러 줄을 주석처리할 때 활용
 *   - 다중 라인 내부에 다중 라인은 불가능
 *   - 다중 라인 내부에 단일 라인은 가능
 *   
 *   // 단일 라인 주석입니다.
 *   왜 다중 라인 내부에 다중 라인은 불가능한가?
 *    -> 문서 상 시작점을 인식하면, 그 다음 끝점을 만날 때 까지 주석으로 본다.
 (끝점) */

/*
 *  클래스 : Hello, String, System
 *  메소드 : main, println
 *  변수 : args (매개 변수)
 *  상수 : "Hello Java !!!" (문자열 상수),
 *  	  out (public static final 형태의 참조 변수)
 */

public class Hello {
	// main : 프로그램의 시작점, 끝점 X
	//	-> JVM에 의해 호출되어 수행된다.
	//	-> main의 역할이 끝나더라도 프로그램의 종료로 이어지지 않을 수 있다.
	public static void main(String[] args) {
		// 코드 실행 순서 : 좌 -> 우, 상 -> 하
		//	; (세미콜론) : 실행 구문을 구분!
		System.out.println("Hello Java !!!"); // System.out.println("Coffee ~~~");
//		System.out.println("Hello Cafe");
	}
}






