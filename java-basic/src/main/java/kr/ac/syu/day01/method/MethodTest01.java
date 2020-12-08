package kr.ac.syu.day01.method;

public class MethodTest01 {
	/*
	 * 	�޼ҵ��� ����
	 *  [��ȯ��] [�޼ҵ� �̸�](�Ű�����) {
	 *  	[��ȯ�� ��];
	 *  }
	 *  ��ȯ�� : ��ȯ�� ���� ������ Ÿ��
	 *  �޼ҵ� �̸� : ����ϰ��� �� ����� �̸�, �ڽ��� �̸�
	 *  
	 *  �Ű����� (argument) - �޴� ����
	 *  	: �Է�(input)��ų ������ Ÿ�� �� ����, ���� ������� �޴´�!
	 *  ���� (parameter) - ���� ����
	 *  	: �޼ҵ带 ȣ���Ͽ� ��� �� ������ ������
	 *  *���� �������� �ʾƵ� �ȴ�. �� �˾Ƶ���!
	 */
	// 1. ��ȯ�� O, �Ű����� O
	public static int add(int a, int b) { // int a = 3, int b = 7
		// int a, int b -> ���� ���� �޾��ִ� �Ű�����!
		return a + b;
		// return : ���� ��ȯ�϶�.
	}
	
	// 2. ��ȯ�� O, �Ű����� X
	public static int getData() {
		return 10; // return Ű����� 10�� ��ȯ (output)
	}
	
	// 3. ��ȯ�� X, �Ű����� X
	public static void prnString() {
		// void : ��ȯ���� ������ �ǹ�
		System.out.println("Hello Mehtod !!!");
	}
	
	// 4. ��ȯ�� X, �Ű����� O
	// prnInfo("ī��", 7) ó�� ȣ��!
	public static void prnInfo(String name, int age) {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
	
	// return : ���� ��ȯ�ϰų� �޼ҵ带 ��� �����ϴ� Ű����
	//	-> 2���� �ǹ�?
	//	-> ���� ��ȯ�ϴ� �����ʴ�, ������ �޼ҵ� ����� �̾�����.
	public static void devide(int num1, int num2) {
		// num2�� 0�� ���޵Ǿ��� ���� ó���ϰ� �ʹ�!
		//	-> ���� ������ �����ϴ� ���� �����Ѵ�. ���� ó��!
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return; // �޼ҵ� ���� (Ż��)
			// �� �̻� �������� �ʰ�, �޼ҵ带 ��� ������.
		}
		System.out.println("������ ��� : " + (num1 / num2));
	}
	
	public static int test(int num) {
		System.out.println("num : " + num);
		// ���ǽ� ���ο����� return�� �����Ѵٸ�,
		// ���� ���� �ÿ��� ��ȯ�ǹǷ�, ��ȯ�� ���� ������ ����.
		// ������ true�� ���� ������ ������ �߻�!
//		if(true) {
		if(num > 10) {
			System.out.println("10���� Ů�ϴ�.");
			return 1;
		}
		System.out.println("10���� �۽��ϴ�.");
		return 0;
	}
	
	public static void main(String[] args) {
		// return Test
		test(20);
		
		// add(3, 7) �޼ҵ帣 ȣ��� ���ÿ� ���
		System.out.println("add(3, 7) : " + add(3, 7));
		// add(3, 7)	-> [�޼ҵ� �̸�]([����1], [����2])
		//				-> 3, 7�̶�� ��� ���ڸ� �����Ѵ�.
		
		getData(); // 10
		// getData() �޼ҵ� ȣ��, ȣ�� ����� 10
		System.out.println("getData() : " + getData());
		
		prnString();
		
		prnInfo("ī��", 7);
		prnInfo("��", 6);
		
		devide(8, 2);
		devide(4, 0);
	}
}









