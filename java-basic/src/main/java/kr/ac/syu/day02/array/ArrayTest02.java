package kr.ac.syu.day02.array;

import java.util.Arrays;

public class ArrayTest02 {
	public static void arrInfo(int[] arr) { // ������ �迭 Ÿ���� ���ڸ� �ްڴ�.
		for(int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// �迭 ����
		int[] org = { 10, 20, 30, 40, 50 };
		int[] cpy = new int[5]; // ���� 5�� ������ �� �迭 ����
		
		arrInfo(org); // �迭 �̸�(���� �̸�ó��) org�� ���ڷ� ����!
		
//		for(int i = 0; i < org.length; i++) {
//			cpy[i] = org[i];
//		}
//		arrInfo(cpy);
		
		// org 0���� ������ �����͸� cpy 0���� ���� org.length ���̸�ŭ ����!
//		System.arraycopy(org, 0, cpy, 0, org.length);
//		System.out.println(Arrays.toString(cpy));
		
		// org 3���� ������ �����͸� cpy�� 1�������� 2(����)�� ��ŭ ����!
		System.arraycopy(org, 3, cpy, 1, 2);
		System.out.println(Arrays.toString(cpy));
		
		// ������� ���� �ڸ��� 0���� �Ǿ��ִ�.
		// new�� �̿��� �迭 ���� �� �ʱ�ȭ���� ������ �ڵ����� 0���� �ʱ�ȭ!
		//	-> ���� cpy �迭�� ��� 0�� ����ִ� �迭!
		
//		int value; // ���� ����
//		System.out.println(value); // �ʱ�ȭ���� ���� ����
		// ������ ����!
		
//		int[] arr;
//		System.out.println(arr[0]); // �ʱ�ȭ���� ���� �迭
		// ������ ����!
	}
}














