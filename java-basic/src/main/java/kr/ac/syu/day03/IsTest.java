package kr.ac.syu.day03;

/*
 *  IS-A ���� (��� ����)
 *  	�л��� ����̴�. (O)
 *  	����� �л��̴�. (X)
 */

class Person {
	private String name;
	// ��ӹ޴� �ڽ� Ŭ�������� ���������� ������ �ִ� Ư¡!
	// �л�, ȸ����� ��� �̸��� ������.
	//	-> � ����, ���ǰ�, ���� �� �� Ŭ���� ���� ������ �ʿ䰡 ����.
	
//	public Person() { }
	
	public Person(String name) { // Person() �⺻ �����ڰ� ����.
		this.name = name;
	}
	public void info() {
		System.out.println("�� �̸��� " + name + "�Դϴ�.");
	} 
}
class Student extends Person {
	private String university;
	private String major;
	
//	public Student() { super();	}
	// �ڽ��� �����ڿ��� �θ��� �����ڸ� ȣ���ϴ� �ڵ尡 ������ ���� �Ѵ�.
	// �⺻ �������� ��� ��, (One, Two, Three)���� ���� �ڵ����� �������� �� ��!
	/*
	 *  �θ��� �����ڸ� ȣ������ �ʾ��� �� ������ ���� �߻�!
	 *  �θ�� ����Ʈ �����ڰ� �ƴ� �Ű� ���� ������ �� �ϳ��� ������ �ִ�.
	 *  (����Ʈ �����ڰ� �ڵ� ���Ե��� �ʴ´�.)
	 *  ��, �ڽ��� �����ڿ��� �θ� �����ǵ��� �θ��� �����ڸ� ȣ����Ѿ� �Ѵ�!
	 */
	Student(String name, String university, String major) {
//		System.out.println("Ooops!!!");
		// �θ� ������ ȣ�� �� Ư�� ������ �ִٸ�, ������ ����!
		//	-> �ڽ��� �����ں��� �θ� �����ڰ� ������.
		super(name);
		this.university = university;
		this.major = major;
	}
	
	public void info() {
		super.info(); // �θ��� �޼ҵ� ȣ�� (����)
		System.out.println("�б��� " + university + " �̰�,");
		System.out.println("�а��� " + major + " �Դϴ�.");
	}
}
class BusinessMan extends Person {
	private String company;
	private String position;
	
	BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	
	public void info() {
		super.info();
		System.out.println("ȸ��� " + company +" �̰�,");
		System.out.println("��ġ�� " + position + " �Դϴ�.");
	}
}

public class IsTest {
	public static void main(String[] args) {
		Student stu
			= new Student("ī��", "������", "��ǻ�Ͱ��а�");
		BusinessMan bm
			= new BusinessMan("��", "�Ｚ", "�븮");
		stu.info();
		bm.info();
	}
}












