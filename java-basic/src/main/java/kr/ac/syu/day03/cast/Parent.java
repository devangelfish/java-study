package kr.ac.syu.day03.cast;

// ���� Ŭ����
//public class Parent { // �Ϲ� Ŭ����
public abstract class Parent { // �߻� Ŭ����
	String name;
	int age;
	
	Parent() {
		name = "�θ�";
		age = 60;
	}
	
//	void info() { // �Ϲ� �޼ҵ�
//		System.out.println("Parent Class info() Method Called...");
//	}
	abstract void info(); // �߻� �޼ҵ�, ������ ���!
	// �θ��� ���� ���� ���·� info()�� �����ؾ� �ϴ�!
	// p.info() �� ����!
}
