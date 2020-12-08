package kr.ac.syu.day01;

/*
 *  1. System.out.println() : print() + Line (개행문자)
 *  2. System.out.print(정수, 실수, 문자, 문장)
 *  3. System.out.printf()
 *  	-> 정해진 문서 양식(format)에 따라 원하는 방식으로 데이터를 출력
 */

public class PrintTest {
	public static void main(String[] args) {
		System.out.println(12);
		System.out.print(12.34);
		System.out.println('A');
		System.out.println("ABC"); // 문장(문자열)
		
		// 개행만을 목적으로 사용!
//		System.out.println();
		System.out.println(""); // 빈 문자열
		
		// %d, %c : 서식 문자
		// \n : 개행 문자
		System.out.printf("%d\n%c\n", 12, 'A');
		
		System.out.println("----------");
		/*
		 *  \r\n : 윈도우 출생
		 *  \n	 : 리눅스 출생
		 *  \r	 : 맥 출생
		 *  
		 *  %n : 해당 플랫폼에 줄 바꿈 문자 출력 (독립적)
		 *  \n : 플랫폼에 종속적인 줄 바꿈 문자 출력
		 *  독립적 - 이식성이 뛰어나다.
		 *  종속적 - 이식성이 떨어진다.
		 */
		System.out.printf("%d\r\n%c\n", 12, 'A');
		System.out.printf("%d\n%c\n", 12, 'A');
		System.out.printf("%d\r%c\n", 12, 'A');
		System.out.printf("%d%n%c\n", 12, 'A');
		
		System.out.println("----------");
		System.out.println(12 + ' ' + 12.34); // 단일문자 공백
		System.out.println(12 + " " + 12.34); // 문자열 공백
		// 자바는 유니코드 기반
		//	컴퓨터는 문자 자체를 인식할 수 없다! (멍청해서!)
		//	C언어의 아스키코드 -> 유니코드 (한글이나 기타 특수문자를 표현하기 위해 확장)
		//  즉, ' ' 공백 문자는 코드 값으로 인식! -> 공백은 32
		// ' ' : 단일 문자 -> char
		// " " : 문자열 (문장)
	}
}









