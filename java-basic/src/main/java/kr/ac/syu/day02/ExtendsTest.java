package kr.ac.syu.day02;

/*
 *  ��� : �θ�-�ڽ� ���� ���·� Ŭ���� ���踦 �ִ� ���
 *  	-> ��, "������"�� �����޴� ������ ��� ����!
 *  		�θ��� Ű�� ũ�ٴ� Ư¡�� �ڽ��� �����޾Ҵٰ� �ؼ�,
 *  		�θ��� Ű�� ū Ư¡�� ������� �ʴ´�.
 *  	 	�ݸ�, "���"�� �����شٸ�
 *  		�θ�� �� �̻� �� ����� ������ ���� �ʰ� �ȴ�.
 *  
 *  [����]
 *  class [�ڽ� Ŭ����] extends [�θ� Ŭ����] { }
 *  
 *  One : �θ� Ŭ����, ���� Ŭ����, ��� Ŭ����, *���� Ŭ����
 *  Two : �ڽ� Ŭ����, ���� Ŭ����, �Ļ� Ŭ����, *���� Ŭ����
 *  	-> ���� Ŭ���� : Ư�� Ŭ�������� ����� �ްԲ� �Ѵ�.
 */
class One { // �θ� Ŭ����
	String bloodType = "A";
	
	@SuppressWarnings("unused")
	private int value = 10; 		// �θ��� private �ʵ�
	protected int password = 20;	// �θ��� protected �ʵ�
	
	One() {
		System.out.println("Constructor One() Called...");
		System.out.println(bloodType);
	}
}
class Two extends One { // �ڽ� Ŭ����
	String height = "Parent height Field...";
	
	Two() {
		System.out.println("Constructor Two() Called...");
		bloodType = "O";
		System.out.println(bloodType);
		// �θ� One Ŭ�������� ��ӹ��� �ʵ� bloodType
		
//		System.out.println(value);		// �θ��� private �ʵ� ���� �Ұ�!
//		System.out.println(password);	// �θ��� protected �ʵ� ���� ����!
	}
}
class Three extends Two {
	String height = "Child height Field...";
	
	Three(/*String height*/) {
		System.out.println("Constructor Three() Called...");
//		System.out.println(height);
		// �� ������ �Ű����� Ȥ�� ���������� �����Ѵٸ�,
		// ������ Ž���� ���� �ڽ��� ���� ���� ����! (�ڽ��� ����, { })
		
		System.out.println(this.height);
		// ���� ���� height �ʵ尡 ���ٸ�,
		// this Ű����� �θ��� height �ʵ带 ����!
		
		System.out.println(super.height); // super -> Two Ŭ������ �ǹ�!
		// super : �θ� �ǹ�
		//	-> �θ� ���� height�� �����Ͽ� ���!
		
		
		System.out.println(password);
		// One - Two - Three �� ��� ���迡 ����,
		// Three���� One�� �ʵ忡 ������ ����!
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
//		One one = new One();
//		Two two = new Two();
		// �ڽ��� �����ϱ� ���ؼ��� �θ� �־�� �Ѵ�.
		// ��, �ڽ��� �����ϴ��� �θ� ���� ������ �Ŀ� �ڽ� ����!
		
		@SuppressWarnings("unused")
		Three three = new Three();
		// One() -> Two() -> Three()
	}
}








