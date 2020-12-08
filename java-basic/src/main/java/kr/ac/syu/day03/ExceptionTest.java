package kr.ac.syu.day03;

import java.io.FileNotFoundException; // checked exception
import java.io.FileReader;
import java.util.Scanner;

//import java.lang.ArrayIndexOutOfBoundsException;
// ArrayIndexOutOfBoudsException 클래스는 java.lang에 존재!
//	-> import 하지 않아도 사용 가능!
//	-> 명시적으로 써주는 경우는 가독성 좋다.

public class ExceptionTest {
	public static void main(String[] args) {
		/*
		 *  try~catch
		 *  
		 *  [형태]
		 *  try {
		 *  	// 예외가 발생할 수 있는 영역
		 *  } catch() {
		 *  	// 예외가 발생하면 실행할 영역
		 *  }
		 */
		System.out.println("main start...");
		
		try {
			System.out.println(10/0); // 예외 발생 구문
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 예외에 대한 추적 정보 출력
		}
//		System.out.println(10/0); // unchecked exception
		// 무조건 예외가 발생하는 구문인데, try~catch 없이도 가능!
		// 단, *예외 처리를 생략 시 프로그램의 종료로 이어질 수 있다.
		
//		FileReader fr = new FileReader("abc.txt"); // checked exception
		// 예외 처리가 꼭 필요!
		
//		try {
//			FileReader fr = new FileReader("abc.txt");
//		} catch (FileNotFoundException fnfe) {
//			fnfe.printStackTrace();
//		}
		
		/*
		 *  try~catch~finally
		 *  [형태]
		 *  try {
		 *  } catch() {
		 *  } finally {
		 *  	// try 영역에 진입하면 무조건 실행되는 영역
		 *  	// 예외가 발생하던 하지 않던 마지막에 무조건 실행된다!
		 *  }
		 */
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3/0); // 예외 발생
			System.out.println(4);
		} catch(Exception e) {
			System.out.println(5);
		} finally {
			System.out.println(6);
		}
		System.out.println(7);
		
		// multi catch
		try {
			String str = "abc";
			System.out.println(str.charAt(1));
			
//			String[] strArr = { "A" };
//			System.out.println(strArr[1]); // (1). 예외 발생
			
			@SuppressWarnings({ "unused", "resource" })
			FileReader fr = new FileReader("abc.txt"); // (2). 예외 발생
		} catch (ArrayIndexOutOfBoundsException aie) { // (1). 예외 처리
			aie.printStackTrace();
		} catch (FileNotFoundException fnfe) { // (2). 예외 처리
			fnfe.printStackTrace();
		} catch (Exception e) { // Exception : 모든 예외 클래스의 상위 부모!
			e.printStackTrace();
		}
		// 전부 기억하거나 어떠한 예외가 발생할지 예측이 어려우니,
		// 부모인 Exception 클래스로 받아주겠다.
		// *단, 잡아줄 예외는 잡아주고 맨 마지막에 사용!
		
		// try( ... ) : try 영역에서 사용 객체의 resource(자원) 관리
//		Scanner s = new Scanner(System.in);
//		int input = s.nextInt();
//		s.close(); // resource 정리 -> 통로를 닫아라!
//		System.out.println(input);
		try (
				Scanner s = new Scanner(System.in);
				// resource 생성 (통로 생성)
				//	-> 따로 정리(close)를 하지 않아도 알아서 관리!
		) {
			int input = s.nextInt();
			System.out.println(input);
		} catch(Exception e) {
			// TODO
		}
		
		System.out.println("main end...");
	}
}








