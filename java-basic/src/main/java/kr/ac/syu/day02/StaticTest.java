package kr.ac.syu.day02;

class StaticSub {
	String name;
	static int sCnt;
	int iCnt;
	
	StaticSub() {
		sCnt++;
		iCnt++;
	}
	StaticSub(String name) {
		this.name = name;
		sCnt++;
		iCnt++;
	}
	// *�޸� �Ҵ� ������ ����غ���!
	void prnCnt() { // �Ϲ� �޼ҵ�
		System.out.println("static int sCnt : " + sCnt);
		// �Ϲ� �޼ҵ� ���ο��� static ��� ���� ��� ����!
		
		System.out.println("int iCnt : " + iCnt); // ��� ����!
	}
	static void prnInfo() { // ����ƽ �޼ҵ�
		System.out.println("static void prnInfo() Method Called...");
		
//		System.out.println("int iCnt : " + iCnt);
		// ����ƽ �޼ҵ� ���ο��� �Ϲ� ��� ����� �Ұ���!
		//	-> prnInfo() �޼ҵ��� �޸� �Ҵ� �� (���α׷� ���� ��)
		//	     �Ϲ� ��� iCnt�� �޸𸮿� �������� �ʴ´�.
		// *iCnt�� ���α׷� ���� �� ���� �Ҵ�Ǿ� ���Ǵ� �Ϲ� ���
		
//		System.out.println("static int sCnt : " + sCnt);
		// prnInfo() �޼ҵ� �޸� �Ҵ� �� (���α׷� ���� ��)
		// *sCnt�� �޸𸮿� �����Ѵ�. (static)
	}
}

public class StaticTest {
	public static void print() { // ����ƽ ��� �޼ҵ�
		System.out.println("print() Method Called...");
	}
	public void print(int a) { // �Ϲ� ��� �޼ҵ�
		System.out.println("print(int a) Method Called...");
	}
	
	// Q. ���� �޼ҵ忡 static Ű���尡 �پ�� �ϴ� ����?
	//	-> main�� �޼ҵ��! �޸𸮿� �����ؾ߸� ȣ���ؼ� ��� ����!
	public static void main(String[] args) {
		print(); // ������ Ŭ���� ���� ���� �ֱ� ������ �ٷ� ȣ�� ����!
		System.out.println(StaticSub.sCnt); // �ٸ� Ŭ���� ����ƽ ��� ����
		
		StaticTest.print();
		// ����ƽ ��� ���� ���
		// [Ŭ���� �̸�].[�ʵ�] �� ����!
		//	-> ��ü�� �������� �ʰ�, Ŭ���� �̸����� �ٷ� �����Ͽ� ȣ��!
				
		// print(int a) -> StaticTest Ŭ������ �Ϲ� ��� �޼ҵ�
		//					��ü ���� �Ŀ��� Ȱ�� ����! �޸� �Ҵ��� �ؾ� ����� �� �ִ�.
		StaticTest st = new StaticTest();
		st.print(10);
//		st.print(); // ���� ������ ����ƽ ��� ȣ��? �����ϴ�! -> ���� X
		
		// JVM�� ���α׷��� �����ϱ� ����, �����ϵ� ����(.class)��
		// �о���δ�. *Ŭ���� ������ �о���δ�.
		// JVM ���� Ŭ���� ������ �о���̴� Class Loader�� ����!
		/*
		 *  static ���(�ʵ�, �޼ҵ�)�� Ŭ���� �ε� ������ �޸𸮸� �Ҵ�!
		 *  
		 *  JVM�� class ������ �о�鿩 ���α׷� ���� �غ�.
		 *  Ŭ������ �о�鿴�� �� �ʿ��� �޸� ������ �����. (�����Ѵ�.)
		 *  
		 *  new		: ���� �޸� �Ҵ�
		 *  	-> �ش� ������ ������ �� �� ������ �޸𸮸� �Ҵ�
		 *  static	: ���� �޸� �Ҵ�
		 *  	-> ���α׷� ���� �� �޸𸮸� �Ҵ�
		 *  
		 *  static ���� (class ����)
		 *  	StaticSub�� static ������,
		 *  	StaticSub Class ������ ������,
		 *  	�ش� Ŭ������ ������ ��ü�� ��� �����ϰ� ����Ѵ�.
		 *  
		 *  ���� ���� (Global) -> ��� �������� ���� ����
		 *  ���� ���� (Local)	-> Ư�� ���� �������� ���� ����
		 *  	static ������ ��� ��ü(������ Ŭ����)�� �����Ͽ� ����ϴ� ���̴�,
		 *  	���� ������? �ƴϴ�!
		 *  	����, ���� ������ ����ó�� ���� ��! *Ŭ���� ���� (Class)
		 */
		StaticSub ss = new StaticSub();
		ss.prnCnt();
		StaticSub ss2 = new StaticSub("ī��");
		ss2.prnCnt();
		StaticSub ss3 = new StaticSub("��");
		ss3.prnCnt();
		// static ����� �̸� ������� �ִ� �޸� ������ ����ϹǷ�,
		// ������ ��ü ���� �� 1�� �����Ѵ�. -> �� ������ �����Ѵ�.
		// �Ϲ� ����� ���� �� ������ �޸� ������ ����ϹǷ�,
		// ss, ss2, ss3�� ���� 1 ������ ����� �����Ѵ�.
		
		StaticSub.prnInfo();
	}
}













