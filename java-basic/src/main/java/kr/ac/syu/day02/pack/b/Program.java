package kr.ac.syu.day02.pack.b;

import kr.ac.syu.day02.pack.a.TestData;

//import kr.ac.syu.day02.pack.a.Pen;
// �ٸ� ��Ű���� default Ŭ���� import �Ұ�! (���� �Ұ�)

// TestData�� �ٸ� ��Ű���� �ִ� Program Ŭ����
//	-> ��Ű���� �ٸ���? ���丮 ��ΰ� �ٸ���!
public class Program {
	public static void main(String[] args) {
//		Pen pen;
		// �ٸ� ��Ű���� default class ���� �Ұ�!
		
//		new Pen();
		// default class�� public �����ڴ� ������ ��� �Ұ�!
		
		/*
		 *  TestData Ŭ������ ���� �����ڰ� public �̰�,
		 *  TestData �������� ���� �����ڰ� default ���,
		 *  ���� ������ ���� ���� �ϵ�, ������ ȣ���� �Ұ���!
		 *  
		 *  TestData td;	 // "Ŭ���� �̸�"�� ������ ���� ���� ����
		 *  // ����!
		 *  new TestData();	 // "������" ȣ��
		 *  // �Ұ���!
		 *  
		 *  �׷� ��� ��? �̹� �����Ǿ��ִ� TestData ��ü�� ��� ���� �뵵!
		 */
		
		TestData td = new TestData();
		System.out.println(td.name);
//		System.out.println(td.id);
		// protected, ��� ���谡 �ƴ϶� ���� �Ұ�
//		System.out.println(td.addr);
		// default, �ٸ� ��Ű������ ���� �Ұ�
//		System.out.println(td.money);
		// private, �ٸ� Ŭ�������� ���� �Ұ�
	}
}
