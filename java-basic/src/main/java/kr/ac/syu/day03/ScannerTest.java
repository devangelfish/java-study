package kr.ac.syu.day03;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int iNum = s.nextInt();
		System.out.println("정수 : " + iNum);
		
		System.out.print("실수 입력 : ");
		double dNum = s.nextDouble();
		System.out.println("실수 : " + dNum);
		
		s.nextLine(); // 입력 버퍼를 비우는 용도
		// "3.14\n"이 입력 되고, nextDouble()을 통해 3.14는 꺼내오지만,
		// "\n"이 남아있다!
		// s.nextLine().charAt(0);
		//	-> nextLine() : 개행 문자를 만날 때 까지 꺼내라.
		//		"\n"뿐이 없으니, 꺼낸 데이터가 없다!
		//		[][][][] 버퍼는 빈 상태!
		//		빈 상태에서 첫 번째 문자를 꺼내는 chatAt(0)에서
		//		0번지를 참조할 수 없다는 StringIndexOutOfBoundsException 발생!
		//	*실제 제공되는 메소드가 어떻게 동작하는지도 중요하다!
		
		System.out.print("문자 입력 : ");
		char c = s.nextLine().charAt(0);
		System.out.println("문자 : " + c);
		
		System.out.print("문자열 입력 : ");
		String str = s.next();
		// 문자열 입력 시 공백을 포함하지 않고, 한 단어 기준으로 입력
		//	-> 공백문자 " "를 만날 때 까지 읽어라.
		System.out.println("문자열 : " + str);
		
		s.nextLine();
		
		System.out.print("문자열 입력 : ");
		String str2 = s.nextLine();
		// 문자열 입력 시 공백을 포함하여 입력 (문장)
		//	-> 개행문자 "\n"를 만날 때 까지 읽어라.
		System.out.println("문자열 : " + str2);
		
		s.close();
	} 
}













