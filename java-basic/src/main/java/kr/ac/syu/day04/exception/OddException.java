package kr.ac.syu.day04.exception;

// 사용자 정의 예외 클래스
@SuppressWarnings("serial")
public class OddException extends Exception {
	public OddException() {
		super();
	}
	public OddException(String msg) {
		super(msg); // 부모의 생성자 호출
		// "\ by zero" 처럼 예외 메시지를 출력하겠다.
	}
}
