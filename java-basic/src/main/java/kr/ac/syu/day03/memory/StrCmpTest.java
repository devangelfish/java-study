package kr.ac.syu.day03.memory;

public class StrCmpTest {
	public static void main(String[] args) {
//		String str = new String("Hello");
		// str : "Hello"�� ���� String ��ü�� ���� ����!
		//	-> Constant Pool�� ����Ǿ��ִ� "Hello"�� ��ġ ������ �ƴϴ�!
		String str = "Hello"; // ���� �����ϴ� ����!
		
//		if("Hello" == "Hello") { }
//		else {
//			// DEAD CODE
//		}		
		/*
		 *  ==			: �� ��ü�� ���ϼ� (���� ��)
		 *  equals()	: �� ��ü�� ��� (���� ��)
		 */
		// ����(�ּ�) ��
		if(str == "Hello")
			System.out.println("str == Hello");
		else
			System.out.println("str != Hello");
		// ����(��) ��
		if(str.equals("Hello"))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}






