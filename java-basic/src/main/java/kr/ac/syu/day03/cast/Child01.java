package kr.ac.syu.day03.cast;

// ���� Ŭ����
//	-> �߻� Ŭ������ ��� �޾�, ��ü�� ������ ���� info() �޼ҵ带 ������!
//	   (��ü, Body�� �����Բ� �ߴ�. ��üȭ!) *���� Ŭ����
public class Child01 extends Parent {
	public Child01() {
		name = "ù ��° �ڽ�";
	}
	
	void study() {
		System.out.println("����ִ� �ڹ� ���α׷���!");
	}
	void sleep() {
		System.out.println("�ھߵǴµ� �ڲ� ���װ� ������...");
	}
	
	@Override
	public void info() { // �θ� �޼ҵ带 �������� �޼ҵ�, ��ü(Body, { })�� �����Բ�!
		System.out.println(name + "���� �����ǵ� info() Method Called...");
	}
}







