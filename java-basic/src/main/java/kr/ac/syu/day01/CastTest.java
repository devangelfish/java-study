package kr.ac.syu.day01;

/*
 *  �� ��ȯ (Casting)
 *  	= ���� ������, + - * / ��� �����ڸ� ��������,
 *  	���װ� ������ �ڷ���(DataType)�� �ٸ� ���
 *  
 *  	[����] = [����]
 *  [l-value] = [r-value]
 *  		i = 10
 *  
 *  byte < short < int < long < float < double
 *  	   char
 *  
 *  implicity : �ڵ� ����ȯ, ������ ����ȯ, �Ͻ��� ����ȯ
 *  	- ū �׸��� ���� �׸��� ��� ����
 *  explicity : ���� ����ȯ, ����� ����ȯ
 *  	- ���� �׸��� ū �׸��� ��� ����
 *  	- *ū �׸��� �μ� ���� �׸��� ��´ٸ�,
 *  	     ������ ���°� �������� �ʴ´�. (������ �ս�)
 */

public class CastTest {
	public static void main(String[] args) {
		int a = 10;
		double b;
		b = a; // �ڵ� ����ȯ (int -> double)
		System.out.println(b);
		
		double c = 3.14;
		int d;
		d = (int)c; // ���� ����ȯ (double -> int)
		// "Type mismatch" Error �߻�!
		//		-> ���װ� ������ ������ Ÿ���� �ٸ� ��
		//		-> �ڵ� ����ȯ�� �Ұ����Ͽ� ���� ������ ������ �� ���� ��
		System.out.println(d);
		// �������� �ս�, ����(������) å��!
		
//		byte bNum = 127; // �ڵ� ����ȯ (int -> byte)
		byte bNum = (byte)256; // ���� ����ȯ
		System.out.println(bNum);
		// 0000 0001 0000 0000 -> 256
		// xxxx xxxx 0000 0000 -> 0
		// 0000 0001 0000 0001 -> 257
		// xxxx xxxx 0000 0001 -> 1
	}
}









