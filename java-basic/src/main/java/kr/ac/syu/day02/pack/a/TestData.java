package kr.ac.syu.day02.pack.a;

// *�����̶�� ���� Ŭ������, �����ڸ�, �ʵ���� �ٸ� ������ ����ϴ� ��!
// default class
class Pen { // ���� �����ڰ� �����Ǿ� �ִ� ����
	int length;
//	Pen() { }			// default Ŭ����, default ������
	public Pen() { }	// default Ŭ����, public  ������
	
	/*
	 *  JVM�� ���� �����Ǵ� �⺻ �������� ���� �����ڴ�?
	 *  	-> class ���� �����ڿ� ���� �����ȴ�.
	 *  	-> �����ڸ� ���� public���� �� �������ִ� ���µ� �����ϴµ�,
	 *  	      ������ class�� ���� ���� ���¿� ���� ���� ������ ��������.
	 */
}

//private class Phone { } // ������ ����!
// Phone �̸� �����ؾ� class�� ����� �� �ִµ�?
// private �����Ѵ�? ���� �ȵȴ�!
class Phone {
	@SuppressWarnings("unused")
	private class Address { // ���� Ŭ���� ����!
		// Phone Ŭ���� �������� ����� ���� Ŭ���� ����.
	}
	// ��? Address�� ����� ģ���� �ִ�! Phone Ŭ����
}

public class TestData {
	public		String	name;
	protected	String	id;
				String	addr;
	@SuppressWarnings("unused")
	private		int 	money;
	
	public TestData() {
		// Ŭ���� ���ο����� ��� ���� ����!
		name = "ī��";
		id = "e-1001";
		addr = "Seoul";
		money = 3000;
	}
}
