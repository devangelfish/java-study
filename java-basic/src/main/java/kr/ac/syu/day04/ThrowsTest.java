package kr.ac.syu.day04;

import java.io.FileReader;

public class ThrowsTest {
	// throws : ���� ȣ���� ������ ���� ó���� �Ѱܶ�!
	static void foo() throws Exception {
		@SuppressWarnings({"unused", "resource"})
		FileReader fr = new FileReader("abc.txt");		
	}
	static void goo() throws Exception {
		foo();
	}
	public static void main(String[] args) {
		System.out.println("main start...");
		
//		foo(); // checked exception�� ���Ե� foo() ȣ��
//		try { foo(); } catch(Exception e) { }
		
//		goo();
		try {
			goo();
		} catch(Exception e) {
			System.out.println(e.getMessage()); // ���� �޽����� Ȯ��!
			e.printStackTrace();
			// ������ ���� �帧�� �����ִ� �޼ҵ� (ȣ�� ����)
			// *���� �߻� ��, ���� �߻��� �帧�� �����϶�!
		}
		
		System.out.println("main end...");
	}
}






