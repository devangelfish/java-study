package kr.ac.syu.day03.capsul;

public class Subtraction {
	private int subCnt;
	
	Subtraction() {
		subCnt = 0;
	}
	
	int getSubCnt() { return subCnt; }
	
	int subTwoNumber(int num1, int num2) {
		subCnt++;
		return num1 - num2;
	}
}
