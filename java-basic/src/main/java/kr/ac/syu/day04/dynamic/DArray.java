package kr.ac.syu.day04.dynamic;

// ���׸� ���� �迭
public class DArray<datatype> {
	Object[] buffer;	// Object �迭, �����
	int capacity;		// ������� ũ��
	int usage;			// ���� ����
	
	public DArray(int capacity) {
		this.capacity = capacity;
		buffer = new Object[capacity];
		usage = 0;
	}
	
	public boolean isFull() {
		return capacity == usage;
		// ������� ũ��� ���� ������ ���ٸ�, �� á�ٸ�,
		// true ��ȯ! �ƴ϶�� false ��ȯ!
	}
	
	public boolean add(datatype value) {
		if(isFull() /*== true*/) { // isFull()�� ����� boolean
			capacity++; // ����� ũ�� ����
			Object[] temp = buffer; // ���� ������ �ּҸ� �ӽ� ����
			buffer = new Object[capacity]; // ������ ũ�⸸ŭ ���ο� �迭 ����
			System.arraycopy(temp, 0, buffer, 0, usage); // �ӽ÷� ��Ƶ� temp�� ����
		}
		buffer[usage] = value;
		usage++;
		return true; // ���� ����
	}
	
	// �迭 ���� ���
	public void arrInfo() {
		// ���ڿ� ���� �޼ҵ�
		//	format(...) : printf�� ���� ���� ��Ŀ� �°� ������ ��Ī �� ���ڿ��� ��ȯ
		//		-> printf()�� ���ڿ��� ȭ�鿡 ���!
		//		-> format()�� ���ڿ��� ��ȯ��!
		String str = String.format("����� ũ�� : %d, ���� ���� : %d", capacity, usage);
		System.out.println(str);
		for(int i = 0; i < usage; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println("");
	}
}
