package kr.ac.syu.day01;

public class TypeTest {
	public static void main(String[] args) {
		// true, false�� ������ �� �ִ� ������ Ÿ��
		boolean bool = true;
		System.out.println(bool);
		
		// ���� �ϳ��� ������ �� �ִ� ������ Ÿ��
		char c = 'A'; // �����ϴ� '' ǥ��
		System.out.println(c);
		
		Byte b = 10;
		System.out.println(b);
		System.out.println(Byte.SIZE);
		
		short s = 20;
		System.out.println(s);
		System.out.println(Short.SIZE);
		
		int i = 10;
		System.out.println(i);
		System.out.println(Integer.SIZE);
		
		long l = 10;
		System.out.println(l);
		System.out.println(Long.SIZE);
		
		float f = 3.5f;
//		float f = 3.5; // ���� �Ұ�!
		// 3.5 ��� �͵� ������! ��򰡿� �������� �����Ѵ�.
		//	- �̸����� ��� (���ͷ� ���)
		//	- ������ Ÿ���� ��ġ�ؾ߸� ���� ���� ����!
		//	- 3.5�� �⺻������ double ����! flaot�� ������ �� ����.
		//	- 3.5f -> ���̻� -> double�� float���� �ٲٱ� ���� Ȱ��!
		//	  (3.5�� float ������ �Ǽ��� ������.)
		System.out.println(f);
		System.out.println(Float.SIZE);
		
		double d = 3.14;
		System.out.println(d);
		System.out.println(Double.SIZE);
	}
}










