package kr.ac.syu.day03.capsul;

public class Addition {
	private int addCnt; // 외부에서 addCnt 직접 접근 불가!
	
	Addition() {
		addCnt = 0;
	}
	
	// 접근자 메소드 (Access Method)
	int getAddCnt() { // 값만 확인하도록 getter 정의, default
		return addCnt;
	}
	
	// 실제 덧셈 기능을 수행하는 메소드
	int addTwoNumber(int num1, int num2) {
		addCnt++;
		return num1 + num2;
	}
}










