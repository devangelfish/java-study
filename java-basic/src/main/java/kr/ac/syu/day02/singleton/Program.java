package kr.ac.syu.day02.singleton;

public class Program {
	public static void main(String[] args) {
//		Calendar c; // public class
		// ���� ���� ���� ����! (Ŭ���� �̸� ����)
//		c = new Calendar(); // private Constructor
		// ������ ȣ�� �Ұ���!
		
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		System.out.println("Calendar 1 : " + c);
		System.out.println("Calendar 2 : " + c2);
	}
}
