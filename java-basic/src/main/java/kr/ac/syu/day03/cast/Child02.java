package kr.ac.syu.day03.cast;

public class Child02 extends Parent {
	public Child02() {
		name = "�� ��° �ڽ�";
	}
	
	void soccer() {
		System.out.println("���̺� !!!");
	}
	void drink() {
		System.out.println("���� ���߾�~ º!");
	}
	
	@Override
	void info() {
		System.out.println(name + "���� �����ǵ� info() Method Called...");
	}
}








