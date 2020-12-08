package kr.ac.syu.day03.memory;

public class StrCmpTest {
	public static void main(String[] args) {
//		String str = new String("Hello");
		// str : "Hello"를 가진 String 객체의 참조 정보!
		//	-> Constant Pool에 저장되어있는 "Hello"의 위치 정보가 아니다!
		String str = "Hello"; // 직접 대입하는 형태!
		
//		if("Hello" == "Hello") { }
//		else {
//			// DEAD CODE
//		}		
		/*
		 *  ==			: 두 객체의 동일성 (참조 비교)
		 *  equals()	: 두 객체의 동등성 (내용 비교)
		 */
		// 참조(주소) 비교
		if(str == "Hello")
			System.out.println("str == Hello");
		else
			System.out.println("str != Hello");
		// 내용(값) 비교
		if(str.equals("Hello"))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}






