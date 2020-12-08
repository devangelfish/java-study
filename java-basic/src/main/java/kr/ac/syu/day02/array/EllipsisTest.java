package kr.ac.syu.day02.array;

import java.util.Arrays;

public class EllipsisTest {
	/*
	 *  ... : Ellipsis
	 *  ���� �Ű� ���� ���� ���
	 *  (int n1, int n2) -> �Ű����� 2��
	 *  ...
	 *  (int n1, int n2, int n3, ... , int n9, int n10) -> �Ű����� 10��
	 *  	-> �Ű� ������ ���� �� ó���� �� �ֵ��� �޼ҵ带 �����ڴ�,
	 *  	      �޼ҵ� ���ǰ� �ʹ� ��������.
	 *  	-> ���� ������ ��Ȳ�� ���� ��� �޼ҵ带 ����?
	 *  
	 *  ���� �迭 ������ �Ű����� ���� ���
	 *  (int... n) -> int[] n : ���� ���� ������ŭ �ڵ����� �迭�� ����!
	 */
	// ���޵Ǵ� ��� ���ڸ� ����ϴ� �޼ҵ�
	public static void prnInt(int... n) { // n -> int[]
		for(int i : n)
			System.out.print(i + " ");
		System.out.println("");
	}
	public static void prnString(String... sArr) { // sArr -> String[]
		for(String str : sArr)
			System.out.print(str + " ");
		System.out.println("");
	}
//	public static void print(String... addrs, int id) { // ������ ���ڷ� Ȱ��!
	public static void print(int id, String... addrs) {
		System.out.println("id : " + id);
		System.out.println("addrs : " + Arrays.toString(addrs));
	}
	public static void main(String[] args) {
		prnInt(1);
		prnInt(1, 2);
		prnInt(1, 2, 3);
		
		prnString("one");
		prnString("one", "two");
		prnString("one", "two", "three");
		
		System.out.printf("%d\n", 10);
		// printf(String foramt, Object... obj) { ... }
		
		print(1001, "õ�Ƚ� ���ϱ�", "������");
	}
}










