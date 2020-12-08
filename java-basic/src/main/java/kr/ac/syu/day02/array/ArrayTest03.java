package kr.ac.syu.day02.array;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		// 1차원 배열 : [가로]
		// 2차원 배열 : [세로][가로]
		// 3차원 배열 : [높이][세로][가로]
		//	-> 생성 시 크기와 접근할 인덱스 순서
		
		// 1차원 배열 int[] 들을 담을 수 있는 배열을 만들겠다!
		// int[] -> int[][] : 2차원 배열
		int[][] iArr = new int[2][3];
		/*
		 *  2차원 배열은 면의 형태로 생성!
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
		System.out.println(Arrays.toString(iArr[0])); // 세로 0번지 -> 첫 번째 줄 1차원 배열
		System.out.println(Arrays.toString(iArr[1])); // 세로 1번지 -> 두 번째 줄 1차원 배열
		
		// iArr : 2차원 배열 이름 -> 세로 기준!
		// iArr[0] : 1차원 배열 이름 -> 가로 기준!
		for(int i = 0; i < iArr.length; i++) { // 세로 순회
			for(int j = 0; j < iArr[i].length; j++) { // 가로 순회
				System.out.printf("iArr[%d][%d] : %d\n", i
													   , j
													   , iArr[i][j]);
			}
		}
		
		// 2차원 배열의 첫 줄 (1차원 배열)
		iArr[0] = new int[3]; // 길이 3의 빈 배열로 생성 및 대입
		iArr[1] = new int[2]; // 길이 2의 빈 배열로 생성 및 대입
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
		for(int[] arr : iArr) {	// 2차원 배열 순회
			for(int n : arr) {	// 1차원 배열 순회
				System.out.print(n + " ");
			}
			System.out.println("");
		}
	}
}









