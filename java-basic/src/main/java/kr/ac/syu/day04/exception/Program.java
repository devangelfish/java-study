package kr.ac.syu.day04.exception;

import java.util.Random;

public class Program {
	public static void main(String[] args) {		
		Random r = new Random();
		int rNum = r.nextInt(100) + 1; // 1~100
		
		if(rNum % 2 == 0) { // 짝수라면,
			System.out.println("생성된 난수 " + rNum + "은 짝수입니다.");
		} else {
			try {
				String msg = "생성된 난수 " + rNum + " 은 홀수입니다.";
				throw new OddException(msg);
				// throw : 예외를 던져라! 발생 시켜라!
				//	-> 해당 예외 클래스를 생성과 동시에 예외로 발생. (catch가 잡도록)
			} catch(OddException oe) { // 사용자 정의 예외 클래스로 catch 
				// 1. 로그 남기기 (파일)
				
				// 2. 사과 (정상 종료)
				System.out.println("죄송합니다. 예기치 않은 문제로 프로그램을 종료합니다.");
				
				// 3. 위의 방법도 어렵다면,
				oe.printStackTrace();
				
//				return; // main도 메소드기 때문에 return 수행 시 main 메소드 종료
				System.exit(0); // 프로그램 종료
			} finally {
				// 1. 자원 정리 (resource)
				//	-> Scanner의 열린 통로를 닫아라.
			}
		}
	}
}












