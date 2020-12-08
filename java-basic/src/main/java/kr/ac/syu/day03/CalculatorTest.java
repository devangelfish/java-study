package kr.ac.syu.day03;

import kr.ac.syu.day03.capsul.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		// 캡슐화 외부시점
//		Addition add = new Addtion(); // 사용 불가!
		
		Calculator c = new Calculator();
		System.out.println("3 + 8 = " + c.addTwoNumber(3, 8));
		System.out.println("2 + 3 = " + c.addTwoNumber(2, 3));
		System.out.println("9 - 2 = " + c.subTwoNumber(9, 2));
		c.prnCnt();
		
		System.out.println("8 / 2 = " + c.divTwoNumber(8, 2));
		System.out.println("4 / 0 = " + c.divTwoNumber(4, 0));
	}
}







