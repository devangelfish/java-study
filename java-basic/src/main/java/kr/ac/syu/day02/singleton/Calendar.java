package kr.ac.syu.day02.singleton;

/*
 *  �̱��� ���� (����ü ����, Singleton pattern)
 *   : ��ü�� �� �ϳ��� ����(���)�ϰ� ���� ��
 */

public class Calendar { // �ܺο��� ���� �����ϵ��� public class
	String name;
	
	// �ܺ� ������ �Ұ����ϵ��� private
//	private static Calendar obj;
	
	// Ȯ���� �ν��Ͻ��� ������ ���ȭ, ����� ���ÿ� �ʱ�ȭ
	private final static Calendar obj = new Calendar();
	// ���α׷� ���� �� Calendar ��ü ����!
	
	// �ܺο��� �����ڸ� ȣ������ ���ϵ��� private
	private Calendar() { }
	
	// getter
	public static Calendar getInstance() {
		// ���� getInstance() ȣ�� �� Calendar ��ü ����!
//		if(obj == null) { // obj�� Calendar�� ��� ���� �ʴٸ�,
//			obj = new Calendar(); // Calendar�� �����Ͽ� ��ƶ�.
//		}
		return obj;
	}
}










