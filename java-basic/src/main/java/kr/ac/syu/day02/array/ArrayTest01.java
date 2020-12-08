package kr.ac.syu.day02.array;

import java.util.Arrays;

public class ArrayTest01 {
	public static void main(String[] args) {
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 3;
//		int num4 = 4;
//		int num5 = 5;
		// 코드가 너무 길어지고, 관리가 어렵다.
		// 동일한 타입의 연관이 있는 데이터들을 묶어서 관리하겠다. -> 배열
		
		int[] iArr; // 정수를 저장하는 배열 iArr 선언
		// int i; 와 유사하다!
		
		// new : 특정 메모리(서랍장)을 생성하기 위한 키워드
		iArr = new int[3]; // int형을 저장할 배열 [][][] 생성!
		// 변수는 하나의 메모리(서랍장)을 사용하지만, 배열은 여러 공간이 필요하다.
		
		// [] : 인덱스 연산자
		// 	int num;
		//	iArr[0]은 위에서 선언한 정수 하나와 같은 개념!
		//	인덱스를 통해서 특정 서랍장을 위치를 지정한다면,
		//	일반 변수처럼 값을 저장하거나 사용할 수 있다!
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		System.out.println("iArr[0] : " + iArr[0]);
		System.out.println("iArr[1] : " + iArr[1]);
		System.out.println("iArr[2] : " + iArr[2]);
		
		System.out.println("iArr 길이 : " + iArr.length);
		System.out.println("iArr : " + iArr); // [I@15db9742 -> 주소 값
		// 배열 이름 : 배열의 첫 데이터의 주소
		
		// 배열을 선언함과 동시에 초기화
		int[] iArr2 = { 1, 2, 3 }; // 배열의 길이는 초기화된 데이터의 개수
		System.out.println("iArr2의 길이 : " + iArr2.length);
		System.out.println("iArr2[0] : " + iArr2[0]);
		System.out.println("iArr2[1] : " + iArr2[1]);
		System.out.println("iArr2[2] : " + iArr2[2]);
//		System.out.println("iArr3[3] : " + iArr2[3]);
		// 존재하지 않은 데이터 위치를 접근!
		//	-> 범위를 넘어서는 위치를 확인하고자 할 때 문제가 발생!
		//	-> ArrayIndexOutOfBoundsException
		
//		int[] iArr3; // iArr3 정수형 배열 선언
//		iArr3 = new int[] { 1, 2, 3 }; // new를 이용하여 배열 생성 및 초기화
		int[] iArr3 = new int[] { 1, 2, 3 }; // 선언과 동시에 초기화
		
//		int myArr[];
//		int [] myArr2;
		
		// 반복문을 활용하여 배열 데이터를 모두 출력
		for(int idx = 0; idx < iArr3.length; idx++) { // 0, 1, 2
			System.out.print(iArr[idx] + " ");
			// index(인덱스, 번지, 위치)를 나타내는 부분에 정수형 변수 사용 가능!
			//	-> 또한 정수형의 연산도 가능!
		}
		System.out.println("");
		
		// 문자열 3개를 저장할 수 있는 배열 생성
		String[] strArr = new String[3];
		strArr[0] = "Hello";
		strArr[1] = "Array";
		strArr[2] = "World";
		
		// index의 정수 연산
		int idx = 0;
		System.out.println(strArr[idx++]); // strArr[0]
		System.out.println(strArr[idx++]); // strArr[1]
		System.out.println(strArr[idx++]); // strArr[2]
		
		// foreach 반복문
		//	: 배열의 길이만큼 모두 순회 한다.
		for(String str : strArr) {
			// strArr를 0번지 부터 순회하는데,
			// 루프마다 str 변수가 해당 데이터를 받는다.
//			strArr[0] = "Yo!!!";
			str = "Ooops!!!"; // 값 변경
			System.out.print(str + " ");
		}
		System.out.println("");
		System.out.println("foreach 종료 후 strArr[0] : " + strArr[0]);
		/*
		 *  foreach 반복문은 내부에서
		 *  	str = strArr[0] -> 1번째 루프
		 *  	str = strArr[1] -> 2번째 루프
		 *  	str = strArr[2] -> 3번째 루프
		 *  형식 처럼 동작하기 때문에 참조(확인)의 역할만 가지고 있다하지만...
		 *  (foreach는 확인의 용도이지 값을 변경하지 못한다? 아니다!)
		 *  배열의 데이터를 잠시 가지고 있는 것 뿐 실제 배열 데이터 변경과 관련이 없는 것 뿐이다!
		 */
		
		// 하나의 문자열 형태로 묶어 출력
		System.out.println(Arrays.toString(strArr));
	}
}












