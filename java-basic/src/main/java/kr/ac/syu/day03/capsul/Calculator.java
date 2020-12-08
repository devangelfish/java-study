package kr.ac.syu.day03.capsul;

public class Calculator {
	// �� ����� ���� ������ private���� ����
	private Addition add;
	private Subtraction sub;
	private Division div;
	
	public Calculator() {
		add = new Addition();
		sub = new Subtraction();
		div = new Division();
	}
	
	public int addTwoNumber(int num1, int num2) {
		return add.addTwoNumber(num1, num2);
	}
	public int subTwoNumber(int num1, int num2) {
		return sub.subTwoNumber(num1, num2);
	}
	public int divTwoNumber(int num1, int num2) {
		// �߸��� ���� ���޵� �� (num2�� 0�� ��)�� ���� ó��!
		if(num2 == 0)
			return -1; // �߸� ��������� �ǹ��ϴ� ��
		else
			return div.divTwoNumber(num1, num2);
	}
	
	public void prnCnt() {
		System.out.println("���� �� : " + add.getAddCnt());
		System.out.println("���� �� : " + sub.getSubCnt());
	}
}













