package kr.ac.syu.day01;

public class WhileTest {
	public static void main(String[] args) {
		/*
		 *  while �ݺ���
		 *  [����]
		 *  �ʱⰪ;
		 *  while(���ǽ�) {
		 *  	���౸��;
		 *  	������;
		 *  }
		 *  
		 *  do~while �ݺ���
		 *  [����]
		 *  �ʱⰪ;
		 *  do {
		 *  	���౸��;
		 *  	������;
		 *  } while(���ǽ�);
		 *  
		 *  ���౸���� �������� ������ ��� ����.
		 *  ��, ������ ���� ���� ���̴� ���δ�.
		 *  	-> ���� �����ϰ� ������ ���̳�?
		 *  	-> ���� �����ϰ� ������ ���̳�?
		 */
		int n = 0; // �ʱⰪ
		while(n < 10) { // ���ǽ�
			System.out.print(n + " "); // ���౸��
			n++; // ������
		}
		System.out.println("");
		
		n = 0; // �ʱⰪ
		do {
			System.out.print(n + " "); // ���౸��
			n++; // ������
		} while(n < 10); // ���ǽ�
		System.out.println("");
		
		// ���ǽ��� ó������ ������ ���
		int i = 0;
		while (i < 0) {
			System.out.println("while"); // ��µ��� ����.
			i++;
		}
		i = 0;
		do {
			System.out.println("do~while"); // �� �� ���.
			i++;
		} while(i < 0);
		/*
		 *  while�� do~while�� ������
		 *   - ���ǽ��� ���� ��������, ���߿� ���������� ������
		 *   - while�� ���ǽ��� ���� ���� �� ���౸���� ����,
		 *     do~while�� ���౸���� ������ �� ���ǽ��� ����.
		 *  *�� �ݺ����� �ּ� ���� ȸ���� 0��, 1��
		 */
 	}
}








