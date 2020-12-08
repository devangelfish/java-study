package kr.ac.syu.day02.swap;

public class SwapTest01 {
	/*
	 *  Call By Value : ���� ���� ȣ��
	 *  �ܼ��� ���� �޾ƿ��⿡,
	 *  main�� swap�� a, b�� ���� �ٸ� ����!
	 *  	-> ���� ���� : main a ���� swap a �� ���ԵǴ� ����!
	 */
	public static void swap(int a, int b) { // "int a = [���޵� ���� ��]"�� ���� ���ԵǴ� ����!
		// swap �޼ҵ� ������ �Ű����� a, b
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		// main �޼ҵ� ������ �������� a, b
		int a = 7;
		int b = 3;
		System.out.println("a : " + a + ", b : " + b);
		
//		int temp = a;
//		a = b;
//		b = temp;
		swap(a, b);
		
		System.out.println("a : " + a + ", b : " + b);
	}
}
