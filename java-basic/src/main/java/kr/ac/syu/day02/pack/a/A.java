package kr.ac.syu.day02.pack.a;

// TestData�� ���� ��Ű���� �ִ� A Ŭ����
public class A {
	TestData td = new TestData();
	
	A() {
		System.out.println(td.name);
		System.out.println(td.id);
		System.out.println(td.addr);
//		System.out.println(td.money);
		// ���� ��Ű������, private �̱� ������ ���� �Ұ�!
	}
}
