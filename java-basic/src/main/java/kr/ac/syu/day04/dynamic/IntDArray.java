package kr.ac.syu.day04.dynamic;

// ������ ���� �迭
public class IntDArray {
	int[] buffer;	// �����
	int capacity;	// ������� ũ��
	int usage;		// ���� ����
	
	public IntDArray(int capacity) {
		this.capacity = capacity;
		buffer = new int[capacity];
		usage = 0;
	}
	
	public boolean isFull() {
		return capacity == usage;
		// ������� ũ��� ���� ������ ���ٸ�, �� á�ٸ�,
		// true ��ȯ! �ƴ϶�� false ��ȯ!
	}
	
	public boolean add(int value) {
		if(isFull() /*== true*/) { // isFull()�� ����� boolean
			/*
			 *  Q. ���� �迭 �����
			 *  	���� �ڵ�� �����Ͱ� ��  á�� �� �� �̻� �߰����� �ʴ´�. (false ��ȯ)
			 *  	���� ����, �����Ͱ� �� ���ִ� ���¶� �����Ͱ� �� �� �ֵ���
			 *  	�������� ���� ������ �ø��� ���� �迭�� ���弼��.
			 */
			return false; // ���� ����
			// TODO
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
















