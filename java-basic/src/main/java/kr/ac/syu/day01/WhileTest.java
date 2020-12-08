package kr.ac.syu.day01;

public class WhileTest {
	public static void main(String[] args) {
		/*
		 *  while 반복문
		 *  [형태]
		 *  초기값;
		 *  while(조건식) {
		 *  	실행구문;
		 *  	증감식;
		 *  }
		 *  
		 *  do~while 반복문
		 *  [형태]
		 *  초기값;
		 *  do {
		 *  	실행구문;
		 *  	증감식;
		 *  } while(조건식);
		 *  
		 *  실행구문과 증감식의 순서는 상관 없다.
		 *  단, 순서에 따라 동작 차이는 보인다.
		 *  	-> 먼저 증감하고 수행할 것이냐?
		 *  	-> 먼저 수행하고 증감할 것이냐?
		 */
		int n = 0; // 초기값
		while(n < 10) { // 조건식
			System.out.print(n + " "); // 실행구문
			n++; // 증감식
		}
		System.out.println("");
		
		n = 0; // 초기값
		do {
			System.out.print(n + " "); // 실행구문
			n++; // 증감식
		} while(n < 10); // 조건식
		System.out.println("");
		
		// 조건식이 처음부터 거짓일 경우
		int i = 0;
		while (i < 0) {
			System.out.println("while"); // 출력되지 않음.
			i++;
		}
		i = 0;
		do {
			System.out.println("do~while"); // 한 번 출력.
			i++;
		} while(i < 0);
		/*
		 *  while과 do~while의 차이점
		 *   - 조건식을 먼저 만나느냐, 나중에 만나느냐의 차이점
		 *   - while은 조건식을 먼저 수행 후 실행구문을 수행,
		 *     do~while은 실행구문을 수행한 후 조건식을 수행.
		 *  *두 반복문의 최소 실행 회수는 0번, 1번
		 */
 	}
}








