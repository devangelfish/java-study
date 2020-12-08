package kr.ac.syu.day04;

import java.math.BigDecimal;

public class WrapperTest01 {
	public static void main(String[] args) {
		/*
		 *  Wrapper Class
		 *  Integer
		 *  Double
		 *  ...
		 *  	-> �⺻ ������ Ÿ���� ��ü�� ����ϰ� ���� ��!
		 *  
		 *  int
		 *  double
		 *  ...
		 *  	-> �⺻ ������ Ÿ������ ��ü�� �ƴϴ�!
		 *  
		 *  Boxing		: �⺻ ������ Ÿ���� ��ü��
		 *  UnBoxing	: ��ü�� �⺻ ������ Ÿ������
		 */
		Integer iVal = new Integer(10);
		// int�� ���ͷ� ��� 10�� Interger Ŭ������ ���ڷ� ����!
		//	-> ������ Swap �������� �� Value Ŭ������ ����!
		// int�� ��� 10�� Interger�� Boxing
		System.out.println(iVal);
		
		double dNum = 3.14; // �⺻ ������ Ÿ��
		Double dVal = new Double(dNum);
		// doube�� ���� dNum�� Double�� Boxing
		System.out.println(dVal);
		
		double subNum = dVal.doubleValue(); // UnBoxing
		System.out.println(subNum);
		
		Integer num1 = 10; // ���ͷ� ��� 10�� Ŭ���� Ÿ�� Integer�� ����!
		Integer num2 = 20; // Auto-Boxing : �ڵ����� ��ü Ÿ������ ���Ѵ�.
		num1++; // 1. Auto-UnBoxing -> 2. Auto-Boxing
		num2++; // num1 = new Integer(num1.intValue() + 1);
		// num1.intValue()	: UnBoxing
		// new Integer(...)	: Boxing
		System.out.println(num1);
		System.out.println(num2);
		
		// �Ǽ��� ������ ����
		double d1 = 1.6;
		double d2 = 0.1;
		System.out.println(d1 + d2); // 1.7000000000000002
		
		// �⺻ ������ Ÿ���� �������ִ�?
		//	-> ������ ������ ���ڿ� ���·�!
		BigDecimal e1 = new BigDecimal("1.6");
		BigDecimal e2 = new BigDecimal("0.1");
		System.out.println(e1.add(e2));
		
		BigDecimal e3 = new BigDecimal(1.6);
		BigDecimal e4 = new BigDecimal(0.1);
		System.out.println(e3.add(e4));
		
		@SuppressWarnings("unused")
		BigDecimal e5 = new BigDecimal("1.6.1");
		// �Ǽ� ������ �ƴ� �̻��� ������ �����ϸ�,
		//	-> NumberFormatException �߻�!
	}
}











