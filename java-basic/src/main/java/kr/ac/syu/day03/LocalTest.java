package kr.ac.syu.day03;

interface Printable {
	void print();
}

class OuterClass {
	private String name;
	
	OuterClass(String name) {
		this.name = name;
	}
	
	// Local Class : �޼ҵ� ���ο� �����ϴ� ������ Ŭ����
	public Printable createLocalClassInst() {
		// �޼ҵ� ���� ������ ���� Ŭ������ ������� ������,
		// ��� ���! -> ������ �޼ҵ� �������� ��� ����!
		class Local implements Printable {
			@Override
			public void print() {
				System.out.println("name : " + name);
			}
		}
		return new Local();
		// Local�� Printable�� ���� Ŭ����(�ڽ�)�̱⿡ ��ȯ ����!
	}
	/*
	 *  ���� ���� : �޼ҵ峪 ���ó�� { } �������� �����ϴ� ����
	 *  	- Local Variable
	 *  	- �ش� ������ ���������� �Ҹ�!
	 *  	- �Ű� ������ �ش� �޼ҵ� ���� ���� ����!
	 *  ���� Ŭ���� (Local Class)
	 *  	- �ش� ���������� ��� ������ Ŭ����!
	 */
	
	// �͸��� Local Class�� Anonymous Class
	public Printable createLocalClassInst2(/*final*/ int id) {
//		id = 20; // ���� �ٲٴ� ������ �ϴ� ����! �Ϲ� ���� ������ ���!
		/*
		 *  [final ���� �� ������ ��]
		 *  �޼ҵ� ���ο��� �Ű� ���� id�� �����Ͽ� Ȱ��, ����(���� ó��) ����� ��,
		 *  id �Ű� ������ ������ �ٲ��.
		 *  	-> ��� ����� �ƴ� �Ϲ� ���� ������ ���!
		 */
		return new Printable() {
			// print() ��� �޼ҵ带 ���� �͸� Ŭ������ ����!
			//	-> Printable�� ��ӹ޴� ����
			@Override
			public void print() {
				System.out.print("name : " + name);
				System.out.println(", id : " + id);
				// ���� ������ ���� �޼ҵ��� �Ű� ������ ����� ��޵� ��!
				// return ����(����) �� �޼ҵ�(�Ű� ����)�� �޸𸮴� ����������,
				// id�� ����ִ� ����? -> ��� Ǯ! (Constant Pool)
			}
		};
	}
}

public class LocalTest {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass("ī��");
		Printable p = oc.createLocalClassInst();
		p.print();
		
		OuterClass oc2 = new OuterClass("��");
		Printable p2 = oc2.createLocalClassInst2(10);		
		p2.print();
	}
}












