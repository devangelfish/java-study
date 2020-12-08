package kr.ac.syu.day02.array;

import java.util.Arrays;

public class ArrayTest01 {
	public static void main(String[] args) {
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 3;
//		int num4 = 4;
//		int num5 = 5;
		// �ڵ尡 �ʹ� �������, ������ ��ƴ�.
		// ������ Ÿ���� ������ �ִ� �����͵��� ��� �����ϰڴ�. -> �迭
		
		int[] iArr; // ������ �����ϴ� �迭 iArr ����
		// int i; �� �����ϴ�!
		
		// new : Ư�� �޸�(������)�� �����ϱ� ���� Ű����
		iArr = new int[3]; // int���� ������ �迭 [][][] ����!
		// ������ �ϳ��� �޸�(������)�� ���������, �迭�� ���� ������ �ʿ��ϴ�.
		
		// [] : �ε��� ������
		// 	int num;
		//	iArr[0]�� ������ ������ ���� �ϳ��� ���� ����!
		//	�ε����� ���ؼ� Ư�� �������� ��ġ�� �����Ѵٸ�,
		//	�Ϲ� ����ó�� ���� �����ϰų� ����� �� �ִ�!
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		System.out.println("iArr[0] : " + iArr[0]);
		System.out.println("iArr[1] : " + iArr[1]);
		System.out.println("iArr[2] : " + iArr[2]);
		
		System.out.println("iArr ���� : " + iArr.length);
		System.out.println("iArr : " + iArr); // [I@15db9742 -> �ּ� ��
		// �迭 �̸� : �迭�� ù �������� �ּ�
		
		// �迭�� �����԰� ���ÿ� �ʱ�ȭ
		int[] iArr2 = { 1, 2, 3 }; // �迭�� ���̴� �ʱ�ȭ�� �������� ����
		System.out.println("iArr2�� ���� : " + iArr2.length);
		System.out.println("iArr2[0] : " + iArr2[0]);
		System.out.println("iArr2[1] : " + iArr2[1]);
		System.out.println("iArr2[2] : " + iArr2[2]);
//		System.out.println("iArr3[3] : " + iArr2[3]);
		// �������� ���� ������ ��ġ�� ����!
		//	-> ������ �Ѿ�� ��ġ�� Ȯ���ϰ��� �� �� ������ �߻�!
		//	-> ArrayIndexOutOfBoundsException
		
//		int[] iArr3; // iArr3 ������ �迭 ����
//		iArr3 = new int[] { 1, 2, 3 }; // new�� �̿��Ͽ� �迭 ���� �� �ʱ�ȭ
		int[] iArr3 = new int[] { 1, 2, 3 }; // ����� ���ÿ� �ʱ�ȭ
		
//		int myArr[];
//		int [] myArr2;
		
		// �ݺ����� Ȱ���Ͽ� �迭 �����͸� ��� ���
		for(int idx = 0; idx < iArr3.length; idx++) { // 0, 1, 2
			System.out.print(iArr[idx] + " ");
			// index(�ε���, ����, ��ġ)�� ��Ÿ���� �κп� ������ ���� ��� ����!
			//	-> ���� �������� ���굵 ����!
		}
		System.out.println("");
		
		// ���ڿ� 3���� ������ �� �ִ� �迭 ����
		String[] strArr = new String[3];
		strArr[0] = "Hello";
		strArr[1] = "Array";
		strArr[2] = "World";
		
		// index�� ���� ����
		int idx = 0;
		System.out.println(strArr[idx++]); // strArr[0]
		System.out.println(strArr[idx++]); // strArr[1]
		System.out.println(strArr[idx++]); // strArr[2]
		
		// foreach �ݺ���
		//	: �迭�� ���̸�ŭ ��� ��ȸ �Ѵ�.
		for(String str : strArr) {
			// strArr�� 0���� ���� ��ȸ�ϴµ�,
			// �������� str ������ �ش� �����͸� �޴´�.
//			strArr[0] = "Yo!!!";
			str = "Ooops!!!"; // �� ����
			System.out.print(str + " ");
		}
		System.out.println("");
		System.out.println("foreach ���� �� strArr[0] : " + strArr[0]);
		/*
		 *  foreach �ݺ����� ���ο���
		 *  	str = strArr[0] -> 1��° ����
		 *  	str = strArr[1] -> 2��° ����
		 *  	str = strArr[2] -> 3��° ����
		 *  ���� ó�� �����ϱ� ������ ����(Ȯ��)�� ���Ҹ� ������ �ִ�������...
		 *  (foreach�� Ȯ���� �뵵���� ���� �������� ���Ѵ�? �ƴϴ�!)
		 *  �迭�� �����͸� ��� ������ �ִ� �� �� ���� �迭 ������ ����� ������ ���� �� ���̴�!
		 */
		
		// �ϳ��� ���ڿ� ���·� ���� ���
		System.out.println(Arrays.toString(strArr));
	}
}












