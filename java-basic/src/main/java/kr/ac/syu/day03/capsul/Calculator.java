package kr.ac.syu.day03.capsul;

public class Calculator {
	// 각 기능의 참조 변수를 private으로 선언
	private Addition add;
	private Subtraction sub;
	private Division div;
	
	public Calculator() {
		add = new Addition();
		sub = new Subtraction();
		div = new Division();
	}
	
	public int addTwoNumber(int num1, int num2) {
		return add.addTwoNumber(num1, num2);
	}
	public int subTwoNumber(int num1, int num2) {
		return sub.subTwoNumber(num1, num2);
	}
	public int divTwoNumber(int num1, int num2) {
		// 잘못된 값이 전달될 시 (num2가 0일 때)에 대한 처리!
		if(num2 == 0)
			return -1; // 잘못 연산됐음을 의미하는 값
		else
			return div.divTwoNumber(num1, num2);
	}
	
	public void prnCnt() {
		System.out.println("덧셈 수 : " + add.getAddCnt());
		System.out.println("뺄셈 수 : " + sub.getSubCnt());
	}
}













