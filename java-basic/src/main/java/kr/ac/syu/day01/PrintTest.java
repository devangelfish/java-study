package kr.ac.syu.day01;

/*
 *  1. System.out.println() : print() + Line (���๮��)
 *  2. System.out.print(����, �Ǽ�, ����, ����)
 *  3. System.out.printf()
 *  	-> ������ ���� ���(format)�� ���� ���ϴ� ������� �����͸� ���
 */

public class PrintTest {
	public static void main(String[] args) {
		System.out.println(12);
		System.out.print(12.34);
		System.out.println('A');
		System.out.println("ABC"); // ����(���ڿ�)
		
		// ���ุ�� �������� ���!
//		System.out.println();
		System.out.println(""); // �� ���ڿ�
		
		// %d, %c : ���� ����
		// \n : ���� ����
		System.out.printf("%d\n%c\n", 12, 'A');
		
		System.out.println("----------");
		/*
		 *  \r\n : ������ ���
		 *  \n	 : ������ ���
		 *  \r	 : �� ���
		 *  
		 *  %n : �ش� �÷����� �� �ٲ� ���� ��� (������)
		 *  \n : �÷����� �������� �� �ٲ� ���� ���
		 *  ������ - �̽ļ��� �پ��.
		 *  ������ - �̽ļ��� ��������.
		 */
		System.out.printf("%d\r\n%c\n", 12, 'A');
		System.out.printf("%d\n%c\n", 12, 'A');
		System.out.printf("%d\r%c\n", 12, 'A');
		System.out.printf("%d%n%c\n", 12, 'A');
		
		System.out.println("----------");
		System.out.println(12 + ' ' + 12.34); // ���Ϲ��� ����
		System.out.println(12 + " " + 12.34); // ���ڿ� ����
		// �ڹٴ� �����ڵ� ���
		//	��ǻ�ʹ� ���� ��ü�� �ν��� �� ����! (��û�ؼ�!)
		//	C����� �ƽ�Ű�ڵ� -> �����ڵ� (�ѱ��̳� ��Ÿ Ư�����ڸ� ǥ���ϱ� ���� Ȯ��)
		//  ��, ' ' ���� ���ڴ� �ڵ� ������ �ν�! -> ������ 32
		// ' ' : ���� ���� -> char
		// " " : ���ڿ� (����)
	}
}









