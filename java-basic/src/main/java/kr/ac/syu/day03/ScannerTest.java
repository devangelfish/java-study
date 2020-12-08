package kr.ac.syu.day03;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int iNum = s.nextInt();
		System.out.println("���� : " + iNum);
		
		System.out.print("�Ǽ� �Է� : ");
		double dNum = s.nextDouble();
		System.out.println("�Ǽ� : " + dNum);
		
		s.nextLine(); // �Է� ���۸� ���� �뵵
		// "3.14\n"�� �Է� �ǰ�, nextDouble()�� ���� 3.14�� ����������,
		// "\n"�� �����ִ�!
		// s.nextLine().charAt(0);
		//	-> nextLine() : ���� ���ڸ� ���� �� ���� ������.
		//		"\n"���� ������, ���� �����Ͱ� ����!
		//		[][][][] ���۴� �� ����!
		//		�� ���¿��� ù ��° ���ڸ� ������ chatAt(0)����
		//		0������ ������ �� ���ٴ� StringIndexOutOfBoundsException �߻�!
		//	*���� �����Ǵ� �޼ҵ尡 ��� �����ϴ����� �߿��ϴ�!
		
		System.out.print("���� �Է� : ");
		char c = s.nextLine().charAt(0);
		System.out.println("���� : " + c);
		
		System.out.print("���ڿ� �Է� : ");
		String str = s.next();
		// ���ڿ� �Է� �� ������ �������� �ʰ�, �� �ܾ� �������� �Է�
		//	-> ���鹮�� " "�� ���� �� ���� �о��.
		System.out.println("���ڿ� : " + str);
		
		s.nextLine();
		
		System.out.print("���ڿ� �Է� : ");
		String str2 = s.nextLine();
		// ���ڿ� �Է� �� ������ �����Ͽ� �Է� (����)
		//	-> ���๮�� "\n"�� ���� �� ���� �о��.
		System.out.println("���ڿ� : " + str2);
		
		s.close();
	} 
}













