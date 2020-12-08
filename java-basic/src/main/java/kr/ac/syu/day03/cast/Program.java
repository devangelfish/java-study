package kr.ac.syu.day03.cast;

public class Program {
	/*
	 *  instanceof ������
	 *  [����] : A instanceof B
	 *  		A�� B�� �� ��ȯ�� ��������?
	 *  	- ����ȯ(�ν��Ͻ�)�� ���������� ���� ������
	 *  	- �����ϸ� true, �Ұ����ϸ� false
	 */
	static void info(Parent p) {	// �ڽ� ����, Parent p = c01
									// �ڵ� ����ȯ, Up Casting
		p.info(); // ***** ��� ���踦 �ִ� ���� ����!
		// �ڽ� Ŭ������ �þ���ص� �ڵ尡 ������� �ʴ´�. -> ����!
		// ��, �Ʒ��� instanceof �����ڴ� �ڽ� Ŭ�������� ������ �߰������� �ɾ���Ѵ�!
		
		// ���� ���� p�� �ڽ� ��ü�� �ּҸ� ���� �� �ִ� Ư¡!
		if(p instanceof Child01) {
			Child01 c = (Child01)p; // ���� ����ȯ, Down Casting
			// ��ü�� ���� �� �ִ� ���� ������ ����ȯ�̴�!
			//	-> ���ǹ��� true���, p�� ������ ������ �ִ� ����?
			//	      �ڽ��� Child01 c01 �̴�!
			c.study();
			c.sleep();
			
//			p.study(); // �Ұ�! �θ��� ����� �ƴϴ�.
			// �ڽ����� ���� ����ȯ �ϴ� ���
			//	-> �ڽ��� ���� �����θ� ȣ�� ������ ������ �޼ҵ尡 �����Ѵ�.
			//	      �ڽĸ��� ������ �ִ� �����! ( study(), sleep() )
//			c.info();
//			p.info();
			// ����ȯ ���� �ʰ� �ٷ� info() ȣ��!
			//	-> �ڽ��� info() �޼ҵ尡 ȣ��ȴ�.
			// *���� ���� p�� �ڽ��� ��� �ִ�!
			// *�θ� ���� ������ info() �̸��� ����ϵ�, (�θ� info()�� ���� �س��� ����)
			//	���� ��� ��ü�� �ڽ��̱⿡ �θ��� info()�� �������� �ڽ��� info()�� ȣ��ȴ�!
			//	��, ��� �ִ� �ڽ��� �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��!
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.soccer();
			c.drink();
//			c.info();
//			p.info();
		} else {
//			p.info();
		}
	}
	
	public static void main(String[] args) {
//		Parent p = new Parent();
		
		// �θ��� ���� ������ ������ �ڽ��� ��ƶ�.
//		Parent p = new Child01();
		// double = int �� ����
		//	-> ū �׸��� ���� �׸��� ��� ����
		// Child01 Ÿ���� Parent Ÿ������ �ڵ� ����ȯ!
		
		// �ڽ��� ���� ������ �θ� �����Ͽ� ��ƶ�.
//		Child01 c = new Parent(); 			// ������ ����!
//		Child01 c = (Child01)new Parent();	// ��Ÿ�� ����!
		// Parent Ÿ���� Child01 Ÿ������ ���� ����ȯ
		// ClassCastException �߻�! (��ȯ �Ұ�!)
		
//		Parent parent = new Parent();
//		info(parent);
		Child01 c01 = new Child01();
		info(c01);
		Child02 c02 = new Child02();
		info(c02);
		// info(Parent p) �޼ҵ��� �Ű� ������ �θ� Ÿ������,
		// �ڽ� Ÿ���� ���ڰ� ���޵� �� �ִ�.
	}
}











