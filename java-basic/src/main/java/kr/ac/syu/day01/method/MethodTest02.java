package kr.ac.syu.day01.method;

public class MethodTest02 {
	/*
	 *  재귀 메소드
	 *   - 메소드 자신 내부에서 자신을 다시 호출하는 형태
	 * 
	 *  메소드도 메모리를 사용한다. (박스를 사용한다!)
	 *  즉, 계속 호출하다보면 메모리가 넘치니 에러 발생!
	 *  	-> StackOverflow Error!
	 *  
	 *  재귀 메소드는 메모리를 사용한다. 쌓이는 형태! (메모리 시간에...)
	 *  	-> 순간적으로 메모리 사용량이 급증할 수 있다. (잘 쓰면 좋다...)
	 *  	-> DP(Dynamic Programming)의 형태로 대체해도 좋다!
	 */
	public static void foo() {
		System.out.println("foo() Method Called...");
		foo();
	}
	
	/*
	 *  반복되는 규칙을 찾아라!
	 *  5! = 5*4*3*2*1	5*4!
	 *  4! = 4*3*2*1 	4*3!
	 *  3! = 3*2*1		3*2!
	 *  2! = 2*1		2*1!
	 *  1! = 1			1
	 *  
	 *  ! -> factorial Method
	 */
	
	// factorial
	public static int factorial(int n) {
		if(n == 1) { // 탈출 조건 및 factorial 조건에 맞도록!
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	public static void main(String[] args) {
//		foo();
		
		System.out.println("5! = " + factorial(5));
		System.out.println("8! = " + factorial(8));
	}
}






