package kr.ac.syu.day03.capsul;

public class Division {
	private int divCnt;
	
	Division() { divCnt = 0; }	
	int getDivCnt() { return divCnt; }
	int divTwoNumber(int num1, int num2) {
		divCnt++;
		return num1 / num2;
	}
}
