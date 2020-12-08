package kr.ac.syu.day01;

public class NamingTest {
	// Java Annotation
	//	-> @SuppressWarnings : 컴파일러야 해당 경로를 내뱉지 마라! (무시해라.)
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 키워드 (keyword, 예약어)
		//	-> 자바에서 이미 사용중인 단어들
		//	-> 컴파일러가 해당 단어에 대한 역할을 딱 정하고 있다!
		//	-> *키워드는 변수의 이름으로 사용할 수 없다.
//		int int = 10;
//		int static = 10;
		
		// 명명 규칙 (Rule)
//		int sumoftotalmoney;
		// 낙타의 등 (camelCase)
		//	단어의 의미ㅕ가 바뀌는 시점의 첫 문자를 대문자
		int sumOfTotalMoney;
		
//		int totalmoney;
		// 뱀이 기어가는 모양 (snake_case)
		//	_ 를 활용하여 단어의 의미를 구분
		int total_money;
		
//		int num;
		// 헝가리안식 표기법
		//  num이라는 변수는 다른 곳(다른 라인)에서는 자료형, 사용 목적 등을 모른다.
		//	데이터 타입의 약자를 접두어로 표시하는 방법. (그 외 방법도 존재)
		int iNum;
		
		/*
		 *  kebob-case
		 *  	'-' 를 활용하여 단어의 의미를 구분
		 *  	data-cb, my-board
		 *  	*HTML에서 속성의 이름을 지을 때 주로 사용!
		 *  단, 언어(컴파일러, 인터프리터)에서는 사용이 불가능!
		 *  '-'을 뺄셈으로 인식한다.
		 */
	}
}








