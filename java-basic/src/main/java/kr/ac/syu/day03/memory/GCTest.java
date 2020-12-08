package kr.ac.syu.day03.memory;

/*
 *  System Ŭ������ ������ ���� ���� �޼ҵ�
 *  1. public static void gc()
 *  	: ������ ������ ����
 *  2. public static void runFinalization()
 *  	: ������ ����
 *  3. public static void runFinalizersOnExit(boolean value)
 *  	: ���α׷�(���μ���) ���� �� ��� ��ü�� ����
 */

class Coffee {
	private int no;
	
	public Coffee(int no) {
		this.no = no;
		System.out.println("Ŀ�� ���� : " + no);
	}
	public int getNo() {
		return no;
	}
	@Override
	protected void finalize() { // �Ҹ�(����) �� ȣ��Ǵ� �޼ҵ�!
		System.out.println(no + "�� ��ü ����!");
	}
}

public class GCTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Coffee c = new Coffee(1);
		Coffee c2 = new Coffee(2);
		Coffee c3 = new Coffee(3);
		
//		System.runFinalizersOnExit(true);
		
		c2 = null;
		System.gc();
		// ȣ���ϴ� ������ �����⿡ �ش�Ǵ� �͵��� Ȯ��
		// ������ ���ſ� �ش�Ǵ� finalize() ȣ��
		
//		System.out.println(c2.getNo());
		// ***** NullPointerException *****
		//		-> null�� �����Ϸ� �� �� �߻�!
		//		-> getNo()�� ������ �ƴϴ�! -> c2�� null�̴�!
		
		c2 = new Coffee(4); // 4�� ��ü�� ���Ӱ� �����ؼ�, c2�� ��� ��! 
	}
}












