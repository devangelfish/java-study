package kr.ac.syu.day01;

public class SwitchTest {
	public static void main(String[] args) {
		/*
			switch([value]) {
			case 1: value�� 1�� �� ����Ǵ� ����
			case 2: value�� 2�� �� ����Ǵ� ����
			default: case�� ��ġ���� ���� ��� ����Ǵ� ����			
			}
		 */
		int num = 4;
		switch(num) {
		case 1: System.out.println("���ڴ� 1�Դϴ�."); break;
		case 2: System.out.println("���ڴ� 2�Դϴ�."); break;
		case 3: System.out.println("���ڴ� 3�Դϴ�."); break;
		default: System.out.println("default..."); break;
		
		// default ���Ŀ� case �ۼ��� ����!
		case 4: System.out.println("���ڴ� 4�Դϴ�."); break;
		case 5: System.out.println("���ڴ� 5�Դϴ�.");
		}
		// break : �ش� ������ Ż���ض�! �������Ͷ�.
		
		// ���� �� �� �Ǵ��ϱ�
		int month = 1;
		int days = 0;
		if(month == 1 || 
				month == 3 ||
				month == 5 ||
				month == 7 ||
				month == 8 ||
				month == 10 ||
				month == 12
				) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else {
			days = 30;
		}
		System.out.println(month + "���� " + days +"�� ���� �ֽ��ϴ�.");
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31; break;
		case 2: 
			days = 28; break;
		default:
			days = 30;
		}
		System.out.println(month + "���� " + days +"�� ���� �ֽ��ϴ�.");
	}
}








