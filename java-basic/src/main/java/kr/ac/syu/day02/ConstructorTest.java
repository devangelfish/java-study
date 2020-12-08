package kr.ac.syu.day02;

/*
 *  �������� Ư¡
 *  1. Ŭ���� �̸��� ����
 *  2. ��ȯ���� �������� ����
 *  3. JVM�� ����Ʈ ������ �ڵ� ����(����)
 *  (��, Ŭ���� ���� �����ڰ� ���ǵǾ� ���� ���� ���)
 *  4. �����ε� ����
 *  5. ��ü�� �ʱ�ȭ ���
 *  
 *  �ڹٴ� Overloading(��������) ����
 *   : �޼ҵ��� �̸��� ������,
 *     �Ű������� ������ ������ Ÿ�Կ� ���� ���̸� �δ� ���
 *     -> ������ �̸����� �ϳ� �̻��� ���� �� �ִ�!
 *     -> �޼ҵ���� �����ϴ��� ó���� �� �ִ�! 
 */

class Member { // Ŭ���� �̸��� ù ���ڸ� �빮�ڷ�!
	// �ʵ� (������), ��� ����
	String name;
	
	// ������ (Constructor)
	Member() {
		System.out.println("default Constructor Member() Called...");
	}
//	Member(String _name) {	// '_' �� Ȱ���� ���� ���
	Member(String name) {	// this�� Ȱ���� ���� ���
		// �Ű����� name�� �޼ҵ�  ���� �������� ��� ������ ���� ����!
//		name = _name;
		// �ʵ� �̸��� �Ű������� �̸��� �Ȱ��� ������ ���!
		// *������ Ž�� : �ڱ� �ڽ��� ������ �ִ� �ͺ��� �ν�!
		//		-> �ش� �̸����� ���� ������ ���� �ڽ� ������ ���ٸ�, �� ���� ������ ã�´�.
		this.name = name;
		// Member.name = name;
		// this : �� �ڽ��� �ǹ�
		//	-> ���� ����(class)�� �ʵ带 �����ϱ� ���� Ű����
	}
	
	// ��� �޼ҵ�
	void info() {
		System.out.println("void info() Method Called...");
	}
	void info(int a) {
		System.out.println("void info(int a) Method Called...");
	}
	void info(double b) {
		System.out.println("void info(double b) Method Called...");
	}
//	int info(double b) {	// �̸��� �ش� �����͸� ã��(�ĺ�) ���� ���!
//							// ��ȯ���� �޶� �̸��� ������ ��� �Ұ���!
//		System.out.println("int info(double b) Method Called...");
//		return 1;
//	}
	
	// ������ �̸��� �����ϵ� ��ȯ���� �����Ѵٸ�,
	// �޼ҵ�� ���! -> ���� X
//	void Member() {
//		System.out.println("void Member() Method Called...");
//	}
}

class Person {
	String name;
	int age;
	// ���̴� Ư¡�� 0 ���� �ǹ� �ִ� ��!
	//	�ڵ� �ʱ�ȭ�Ǵ� ������ Ȱ�����ڴ�, �ָ��ϴ�.
	//  ���� 0�̻��� �ǹ��ִ� �����Ϳ� ���� ������ ǥ���� ����, -1 �� �ʱ�ȭ!
	double height;
	
	// ��� �ʵ�
//	final String ID = "e-1001"; // ����� ���ÿ� �ʱ�ȭ
	final String ID; // ����!
	// ��ü ���� �� ��ü�� �����͸� �ǹ��ϴ� �ʵ�
	//	-> ��� �ʵ�� ������ �ʱ�ȭ�� �Ǿ���Ѵ�!
	
	Person() {
//		this.name = "�̸�����";
//		this.age = -1;
//		this.height = -1.0;
		// ��� ����� �����ڿ� ���� �ڵ带 �ۼ�?
		
		this("�̸�����");		// �� �ڽ��� �����ڸ� ȣ���ϴ� ���!
//		Person("�̸�����");	// �� ���� ����! (��, �޼ҵ� ȣ�� ����̹Ƿ� ��� �Ұ�!)
		// Person(String name) ȣ��!
		//	this -> Person
	}
	Person(String name) {
//		this.name = name;
//		this.age = -1;
//		this.height = -1.0;
		this(name, -1);
	}
	Person(String name, int age) {
		this(name, age, -1.0);
	}
	Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		
		this.ID = "e-1001";
		// ��ü ���� �� �� ����(������)�� ������ ����ǹǷ�,
		// ��� �ʵ带 ���� �� �Ŀ� �����ڿ��� �ʱ�ȭ ����!
		// �ٸ� �����ڸ� �����߾ �� ������ �����Ѵٶ�� ������ �ִٸ�,
		// ������ ������ �߻����� �ʴ´�.
		
		// *��� �ʵ�� ��ü ���� �� ������ �ʱ�ȭ�Ǿ�� �Ѵ�!
		//	1. �ʵ� ����� ���ÿ� �ʱ�ȭ
		//	2. �����ڿ��� �ʱ�ȭ
	}
	
	void info() {
		System.out.println("name : " + name
						 + ", age : " + age
						 + ", height : " + height);
	}
}

public class ConstructorTest {
	public static void constantTest(final int value) {
//		value = 10; // �Ű����� value �� ���ȭ! -> ������ �Ұ���!
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		constantTest(20);
		
		// ������ : ��ü ���� �� ����(�� �ѹ�) ȣ��!
		//	-> �����ڵ� �޼ҵ�
		Member m = new Member(); // Member ��ü ����
		/*
		 *  new Member();
		 *  new : �޸𸮸�  ����(�Ҵ�)�ϱ� ���� Ű����
		 *  Member() : ������ ȣ�⹮
		 */
//		Member m = new Member("ī��");
		// �����ڵ� �޼ҵ��̱� ������, ���� ������ ����!
		
		// �����ε��� �޼ҵ� ȣ��
		m.info();
		m.info(7);
		m.info(3.14);
		
		// ������ �̸��� ������ �޼ҵ� ȣ��
//		m.Member();
		
		Member member = new Member("��");
//		member.name = "��";
		System.out.println(member.name);
		// �׳� member.name ó�� "����"�ؼ� ����ϸ� ���� �ʳ�?
		
		Member member2 = new Member(); // �⺻ ������ ȣ��� �ʱ�ȭ ���� X
		System.out.println(member2.name);
		// null : �ƹ��͵� ������ �ǹ�
		// member2.name�� �ʱ�ȭ���� �ʾ��� �� null �� ���
		//	new�� �̿��� �����ϸ� �ڵ� �ʱ�ȭ?
		//	��ü �Ǵ� String -> null �ʱ�ȭ (String�� ��ü!)
		//	�⺻ ������ Ÿ�� -> 0, 0.0, ...
		
		Person person = new Person();
		// �ʱ�ȭ���� ���� �ʵ� ��� -> �ڵ� �ʱ�ȭ!
		System.out.println(person.name);	// null
		System.out.println(person.age);		// 0
		System.out.println(person.height);	// 0.0
		
		Person p = new Person("������", 28, 162.1);
		p.info();
		Person p2 = new Person("������", 28);
		p2.info();
		Person p3 = new Person("������");
		p3.info();
		Person p4 = new Person();
		p4.info();
	}
}










