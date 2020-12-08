package kr.ac.syu.day03.abs;

/*
 *  Override (재정의)
 *  	부모 클래스에 정의된 메소드의
 *  	메소드 이름, 반환형, 매개 변수의 타입과  개수까지
 *  	완전히 동일한 메소드를 다시 정의하는 것!
 */

public class Cat extends Animal {
	@Override // 해당 메소드가 오버라이드된 것임을 표시!
	public void eat() {
		System.out.println("냥냥냥~");
	}
	
	// 어노테이션 생략 시 재정의에 대한 실수를 야기할 수 있다.
	// 명시해준다면, 컴파일 에러를 통해 확인이 가능!
//	@Override
//	public void ear() { } // 재정의할 것 이지만 오타 발생! -> 컴파일 에러
//	public void eay() { } // Cat에서 자체 정의된 메소드로 취급!
}








