package kr.ac.syu.day02;

class Access {
	private String name;
	private int age;
	
	/*
	 *  Access Method (������ �޼ҵ�)
	 *  	Getter, Setter
	 *  	�ܺο��� ������ �̸��� ���� �������� �ʰ�,
	 *  	���������� ���� Ȯ��(get)�ϰų�, ����(set)�ϱ� ���� Ȱ��
	 */
	public String getName() { // getter
		return name;
	}
	public void setName(String name) { // setter
		this.name = name;
	}
	public int getAge() { // getter
		return age;
	}
	public void setAge(int age) { // setter
		// �߸��� �����Ϳ� ���� ó��
		if(age < 0) this.age = -1; // �߸� �Է� �� ������ ������ �ǹ��ϵ���!
		else this.age = age;
	}
}

public class AccessTest {
	public static void main(String[] args) {
		Access ac = new Access();
//		ac.name = "��û��"; // private���� ������ ���Ҵ�.
		// �ܺο��� ������ �̸��� ���� �������� ���ϵ���!
		
		ac.setName("ī��");
		System.out.println(ac.getName());
		ac.setAge(7);
		System.out.println(ac.getAge());
		
		// setter�� Ȱ���� ���� ó�� (�ڵ鸵, handling)
		// ���� �̸� ������ ������, setter�� ��� �����ϴٸ�?
		//	-> �̻��� �����Ͱ� �� �� �ִ�.
		//	   age ������ 0�̻��� ������ ���� �Ѵ�!
//		ac.age = -7; // �� �ڵ�ó�� ���� ������ �����ϴٸ� �ٷ� ���� �ٲٴ� ���� ���� �����!
		// setter�� �̿��� ��ü ����(�޼ҵ� ����)���� �����Ͽ� ���� �־��ִ� ������� Ȱ��!
		ac.setAge(-7);
		System.out.println("���� �����Է� : " + ac.getAge());
		// �߸��� �����͸� �Է��� �ÿ� ���� ó���� -1 ���
		//	-> *�ܺο��� ����(����)�� �����ͷ� ���� ������� �ʵ���!
		//	-> *���̴� ������ 0�̻��̶�� Ư¡�� ������ ó���ض�.
	}
}








