package kr.ac.syu.day01;

/*
 *  �ݺ��� 3�� �ʼ� ���
 *  1. �ʱⰪ
 *  2. ���ǽ� (Ż�� ����, ���� ����)
 *  3. ������
 *  @. ���౸��
 */

public class ForTest {	
	public static void main(String[] args) {
		/*
		 *  for(�ʱⰪ; ���ǽ�; ������) { ���౸��; }
		 *  
		 *  �ʱⰪ; for( ; ���ǽ�; ������) { ���౸��; }
		 *  
		 *  for(�ʱⰪ1, �ʱⰪ2, ... ; ���ǽ�; ������1, ������2, ...) {
		 *  	���౸��;
		 *  }
		 *  
		 *  for(�ʱⰪ; ���ǽ�; ������); // ���౸���� ���� ���
		 *  
		 *  �ʱⰪ : �ݺ����� ������ ������ �Ǵ� ��
		 *  ���ǽ� : �������� ���� ����Ǵ� ������ Ż�� ����
		 */
		// Infinity Loop (���� ����)
//		for( ; ; ) {
//			System.out.println("Go!!!");
//		}
		// �ش� ��¹��� �������� ���Ѵٸ�, ������ ����!
//		System.out.println("Stop!!!");
		
		int i = 0;
		for( ; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("���� ���� �� i : " + i);
		
		for(int j = 0; j < 10; j++) {
			System.out.print(j + " ");
		}
		System.out.println("");
//		System.out.println("���� ���� �� j : " + j);
		// for �ݺ��� ������ ���� j�� ������ �� ����.
		
		// ������ ���ü� (Scope)
		//	{ } : Block Scope, ���� �Ǵ� ����
		int num = 10;
		boolean bool = false;
		if(num > 5) {
//			boolean bool = true;
			System.out.println(bool);
		}
//		System.out.println(bool);
		// ���ǹ� ���ο��� ���� ���� ��,
		// �ܺο����� �� �� ����. ������ �ʴ´�. �������� ���Ѵ�.
		// *�� �ȿ��� �ٱ� ��ġ ���°�? ���ƿ�!
		//  �� �ۿ��� ���� ���� ���°�? �����ƿ�!
		
		// �ݺ����� ��ø (������)
		for(int a = 2; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				System.out.println(a + " * " + b + " = " + (a * b));
			}
			System.out.println("");
		}
		
		// break : �ش� ������ ��� Ż��, ���� ���Ͷ�.
		// 1���� 100������ ���� �� 3�� 5�� �ּ� �����
		for(int a = 1; a <= 100; a++) {
			if(a % 3 == 0 && a % 5 == 0) { // 15
				System.out.println("�ּ� ����� : " + a);
				break;
			}
		}
		
		// continue : ���� ������ �� �̻� �������� ����, ���� ������ �Ѿ��.
		for(int a = 1; a <= 10; a++) {
			if(a % 2 == 0) { // ¦�����,
				continue;
			}
			System.out.print(a + " ");
		}
		System.out.println("");
		
		// label
		//	break�� ���� ���� �ϳ��� Ż��!
		//	��ø�� �ݺ����� �ѹ��� Ż���ϰ� ���� �� ���!
		java: for(int a = 0; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				System.out.print('*');
				if(b == 4) {
					break java;
				}
			}
			System.out.println("");
		}
		// C����� goto�� ó�� ���� �帧�� ������ �̵�!
		//	-> ���İ�Ƽ �ڵ尡 �� �� ������ �����Ѵ�����,
		//	-> *�߾��� ����!
	}
}










