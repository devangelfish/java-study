package kr.ac.syu.day01;

import java.util.Scanner;

public class IFTest {
	public static void main(String[] args) {
		/*
			{ } (Block Scope) : ������ �����ϴ� Ư������
			
			if(���ǽ�) {
				// ���ǽ��� true�� �� ����Ǵ� ����
			}
			// ���ǽ��� false�� �� ��� ����
			// true �� ���ǹ� ���θ� ������ �Ŀ� ���� ������ ����
			
			if(���ǽ�) {
				// true �� ����Ǵ� ����
			} else {
				// false �� ����Ǵ� ����
			}
		 */
		// �ڵ� import : Ctrl + Shift + o
		//	-> �ڵ� ����!
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("��ü �ݾ� �Է� : ");
		int money = s.nextInt();
		System.out.println("�Էµ� �ݾ� : " + money);
		
		if(money > 20000) { // �Էµ� �ݾ��� 20000 �ʰ����,
			System.out.println("��ü �ѵ��� �Ѿ���ϴ�.");
		} else { // �ƴ϶��,
			System.out.println("���������� ��ü�� �Ϸ�Ǿ����ϴ�.");
		}
		System.out.println("���� �Ϸ�.");
		
		// ���ǹ��� ��ø
		int num = 10;
		System.out.print("���� num�� ");
		if(num < 0) { // num�� 0�̸��̶��,
			System.out.println("0�̸�");
		} else { // �ƴ϶��,
//			System.out.println("0�̻�");
			if(num < 100) {
				System.out.println("0�̻� 100�̸�");
			} else {
				System.out.println("100�̻�");
			}
		}
		
		// ���ǹ��� ���� �� (if ~ else if ~ ... ~ else if ~ else)
		num = 15;
		if(num < 10) {
			System.out.println("0�̸�");
		} else if(num < 20) {
			System.out.println("10�̻� 20�̸�");
		} else if(num < 30) {
			System.out.println("20�̻� 30�̸�");
		} else {
			System.out.println("30�̻�");
		}
		
//		if(true) {
//			System.out.println("������ ����");
//		} else {
//			// ���ǽ��� ������ ���̱⿡ ������� ���� ����!
//			// Dead Code
//		}
	}
}









