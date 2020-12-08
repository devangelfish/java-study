package kr.ac.syu.day02.array;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		// 1���� �迭 : [����]
		// 2���� �迭 : [����][����]
		// 3���� �迭 : [����][����][����]
		//	-> ���� �� ũ��� ������ �ε��� ����
		
		// 1���� �迭 int[] ���� ���� �� �ִ� �迭�� ����ڴ�!
		// int[] -> int[][] : 2���� �迭
		int[][] iArr = new int[2][3];
		/*
		 *  2���� �迭�� ���� ���·� ����!
		 *  [ ] [ ] [ ]
		 *  [ ] [ ] [ ]
		 */
		iArr[0][0] = 10;
		iArr[0][1] = 20;
		iArr[0][2] = 30;
		iArr[1][0] = 40;
		iArr[1][1] = 50;
		iArr[1][2] = 60;
		/*
		 *  10 20 30
		 *  40 50 60
		 */
		System.out.println(Arrays.toString(iArr[0])); // ���� 0���� -> ù ��° �� 1���� �迭
		System.out.println(Arrays.toString(iArr[1])); // ���� 1���� -> �� ��° �� 1���� �迭
		
		// iArr : 2���� �迭 �̸� -> ���� ����!
		// iArr[0] : 1���� �迭 �̸� -> ���� ����!
		for(int i = 0; i < iArr.length; i++) { // ���� ��ȸ
			for(int j = 0; j < iArr[i].length; j++) { // ���� ��ȸ
				System.out.printf("iArr[%d][%d] : %d\n", i
													   , j
													   , iArr[i][j]);
			}
		}
		
		// 2���� �迭�� ù �� (1���� �迭)
		iArr[0] = new int[3]; // ���� 3�� �� �迭�� ���� �� ����
		iArr[1] = new int[2]; // ���� 2�� �� �迭�� ���� �� ����
		/*
		 *  [ ] [ ] [ ]
		 *  [ ] [ ]
		 */
		for(int i = 0; i < iArr.length; i++) {
			for(int n : iArr[i]) {
				System.out.print(n + " ");
			}
			System.out.println("");
		}		
		for(int[] arr : iArr) {	// 2���� �迭 ��ȸ
			for(int n : arr) {	// 1���� �迭 ��ȸ
				System.out.print(n + " ");
			}
			System.out.println("");
		}
	}
}









