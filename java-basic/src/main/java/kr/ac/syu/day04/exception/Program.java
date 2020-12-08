package kr.ac.syu.day04.exception;

import java.util.Random;

public class Program {
	public static void main(String[] args) {		
		Random r = new Random();
		int rNum = r.nextInt(100) + 1; // 1~100
		
		if(rNum % 2 == 0) { // ¦�����,
			System.out.println("������ ���� " + rNum + "�� ¦���Դϴ�.");
		} else {
			try {
				String msg = "������ ���� " + rNum + " �� Ȧ���Դϴ�.";
				throw new OddException(msg);
				// throw : ���ܸ� ������! �߻� ���Ѷ�!
				//	-> �ش� ���� Ŭ������ ������ ���ÿ� ���ܷ� �߻�. (catch�� �⵵��)
			} catch(OddException oe) { // ����� ���� ���� Ŭ������ catch 
				// 1. �α� ����� (����)
				
				// 2. ��� (���� ����)
				System.out.println("�˼��մϴ�. ����ġ ���� ������ ���α׷��� �����մϴ�.");
				
				// 3. ���� ����� ��ƴٸ�,
				oe.printStackTrace();
				
//				return; // main�� �޼ҵ�� ������ return ���� �� main �޼ҵ� ����
				System.exit(0); // ���α׷� ����
			} finally {
				// 1. �ڿ� ���� (resource)
				//	-> Scanner�� ���� ��θ� �ݾƶ�.
			}
		}
	}
}












