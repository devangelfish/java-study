package kr.ac.syu.day03.capsul;

public class Addition {
	private int addCnt; // �ܺο��� addCnt ���� ���� �Ұ�!
	
	Addition() {
		addCnt = 0;
	}
	
	// ������ �޼ҵ� (Access Method)
	int getAddCnt() { // ���� Ȯ���ϵ��� getter ����, default
		return addCnt;
	}
	
	// ���� ���� ����� �����ϴ� �޼ҵ�
	int addTwoNumber(int num1, int num2) {
		addCnt++;
		return num1 + num2;
	}
}










