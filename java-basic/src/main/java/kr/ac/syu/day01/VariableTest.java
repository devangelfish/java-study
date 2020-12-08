package kr.ac.syu.day01;

public class VariableTest {
	// main 생성 이클립스 단축키 : ma 누른 후 Ctrl + Space 후 선택
	public static void main(String[] args) {
		// 변수 : 무언가를 담는 서랍장
		//	양말을 서랍장에 담아두고 사용하는 것과
		//	양말이 필요할 때마다 만드는 것의 차이!
//		int num;	// num이라는 이름의 서랍장을 생성, int(정수)만 담겠다!
		// 변수를 선언 (서랍장의 종류와 이름)
//		num = 10;	// num이라는 이름의 서랍장에 10(정수)을 담아라!
		// 변수를 초기화 (서랍장에 원하는 것을 담는 작업, 대입)
		
		int	num = 10; // 변수를 선언함과 동시에 초기화
		/*
		 *  14번 라인의 수행 순서?
		 *  	1. 서랍장을 만들고,	-> int
		 *  	2. 이름을 붙이고,	-> num
		 *  	3. 양말을 사와서,	-> 10
		 *  	4. 서랍장에 담아라!	-> =
		 */
		// 변수 : 변할 수 있는 수, *확정되지 않은 수
		System.out.println(num); // 10
		num = 20; // 값을 변경
		System.out.println(num); // 20
	}
}







