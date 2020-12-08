package kr.ac.syu.day01;

/*
 *  형 변환 (Casting)
 *  	= 대입 연산자, + - * / 산술 연산자를 기준으로,
 *  	좌항과 우항의 자료형(DataType)이 다른 경우
 *  
 *  	[좌항] = [우항]
 *  [l-value] = [r-value]
 *  		i = 10
 *  
 *  byte < short < int < long < float < double
 *  	   char
 *  
 *  implicity : 자동 형변환, 묵시적 형변환, 암시적 형변환
 *  	- 큰 그릇에 작은 그릇을 담는 형태
 *  explicity : 강제 형변환, 명시적 형변환
 *  	- 작은 그릇에 큰 그릇을 담는 형태
 *  	- *큰 그릇을 부셔 작은 그릇에 담는다면,
 *  	     원래의 형태가 유지되지 않는다. (데이터 손실)
 */

public class CastTest {
	public static void main(String[] args) {
		int a = 10;
		double b;
		b = a; // 자동 형변환 (int -> double)
		System.out.println(b);
		
		double c = 3.14;
		int d;
		d = (int)c; // 강제 형변환 (double -> int)
		// "Type mismatch" Error 발생!
		//		-> 좌항과 우항의 데이터 타입이 다를 때
		//		-> 자동 형변환이 불가능하여 대입 연산을 수행할 수 없을 때
		System.out.println(d);
		// 데이터의 손실, 유저(개발자) 책임!
		
//		byte bNum = 127; // 자동 형변환 (int -> byte)
		byte bNum = (byte)256; // 강제 형변환
		System.out.println(bNum);
		// 0000 0001 0000 0000 -> 256
		// xxxx xxxx 0000 0000 -> 0
		// 0000 0001 0000 0001 -> 257
		// xxxx xxxx 0000 0001 -> 1
	}
}









