package kr.ac.syu.day01.method;

public class MethodTest02 {
	/*
	 *  ��� �޼ҵ�
	 *   - �޼ҵ� �ڽ� ���ο��� �ڽ��� �ٽ� ȣ���ϴ� ����
	 * 
	 *  �޼ҵ嵵 �޸𸮸� ����Ѵ�. (�ڽ��� ����Ѵ�!)
	 *  ��, ��� ȣ���ϴٺ��� �޸𸮰� ��ġ�� ���� �߻�!
	 *  	-> StackOverflow Error!
	 *  
	 *  ��� �޼ҵ�� �޸𸮸� ����Ѵ�. ���̴� ����! (�޸� �ð���...)
	 *  	-> ���������� �޸� ��뷮�� ������ �� �ִ�. (�� ���� ����...)
	 *  	-> DP(Dynamic Programming)�� ���·� ��ü�ص� ����!
	 */
	public static void foo() {
		System.out.println("foo() Method Called...");
		foo();
	}
	
	/*
	 *  �ݺ��Ǵ� ��Ģ�� ã�ƶ�!
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
		if(n == 1) { // Ż�� ���� �� factorial ���ǿ� �µ���!
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






