package kr.ac.syu.day02;

/*
 *  ���� ������ (���� ������, ���� ������)
 *   : Ŭ����(class)���� �ʵ� ���� ������ �����ϴ� �뵵(����)
 *   
 *  public		: ��𼭳� ���� ���� (���� ���� X)
 *  private		: Ŭ���� ���ο����� ���� ����
 *  (default)	: ���� ��Ű�� �������� ���� ����
 *  			  (���� �����ڸ� �������� ���� ���)
 *  protected	: ��� ���迡�� ���� ����
 *  
 *  private < default < protected < public
 */

class Dog {
	public	String name;	// public
			int age;		// default
	@SuppressWarnings("unused")
	private double weight;	// private
	
	Dog() {
		// ���� Ŭ����(Dog) �����̱⿡ ��� ���� ����
		name = "�Ƹ�";
		age = 3;
		weight = 3.6;
	}
}

class Cat {
	public String name;
	Dog dog; // �ٸ� Ŭ������ �ν��Ͻ� ���� ���� �� ������ ����
	
	Cat() {
		name = "ī��";
		dog = new Dog(); // Dog �ν��Ͻ� ����
		// �ٸ� Ŭ����(Dog)�� ��� ����
		dog.name = "�Ƹ�";
		dog.age = 3;
//		dog.weight = 3.6;
		// private �������̱� ������ ���� �Ұ�
	}
}

// public class�� ������ ��ǥ�ϴ� Ŭ������, �� �ϳ��� ������ �� �ִ�!
//public class Panda { }

// PublicTest.java ������ ��ǥ�ϴ� PublicTest Ŭ����
//	-> ��ǥ Ŭ������ ���ϸ�� Ŭ�������� ��ġ!
public class PublicTest {
	// main(...) Method : ���α׷� ���� �� JVM�� ���� ȣ��Ǿ� ���!
	// Q. ���� �޼ҵ忡 public ���� �����ڰ� �پ�� �ϴ� ����?
	//	-> JVM�� ȣ���ϱ� ���ؼ�, �ܺο��� ȣ�� ���� �ϵ���! (public)
	public static void main(String[] args) {
		System.out.println("main(...) Method Called...");
		
		Dog dog = new Dog();
		dog.name = "�Ƹ�";
		dog.age = 3;
//		dog.weight = 3.6;
		// private �������̱� ������ ���� �Ұ�
	}
}




