package kr.ac.syu.day04;

public class WrapperTest02 {
	public static void main(String[] args) {
		int i = Integer.parseInt("12345");
		// parseInt(...) : �ش� ������ Ÿ������ ��ȯ (�Ľ�)
		System.out.println(i);
		
		Integer i2 = Integer.parseInt("12345");
		String s = String.valueOf(i2);
		double d = Double.parseDouble("3.14");
		
		System.out.println(i2);
		System.out.println(s);
		System.out.println(d);
		
		// A:10, B:11, ... , F:15
		int num = Character.getNumericValue('A');
		System.out.println(num);
		
		// "f"�� 16���� ���ڷ� ǥ��
		int i3 = Integer.parseInt("f", 16);
//		int i3 = Integer.parseInt("f", 12);
		// NumberFormatException �߻�!
		System.out.println(i3);
		
		// 15�� 2���� ���ڿ��� ��ȯ
		String s2 = Integer.toBinaryString(15);
		System.out.println(s2);
		// Q. Ư�� ������ �Է¹޾� 2���� ���·� ��ȯ�ϴ� ���α׷��� �ۼ��ϼ���.
		
		// ��Ʈ ���� 1�� ����
		int bitCount = Integer.bitCount(15);
		System.out.println(bitCount);
		// Q. ������ ��ȯ�� 2������ ��Ʈ ���� 1�� ������ ���ϼ���.
		
		// 255�� 16���� ǥ��
		String hexStr = Integer.toHexString(255);
		System.out.println(hexStr);
	}
}













