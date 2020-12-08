package kr.ac.syu.day04.dynamic;

public class Program {
	public static void main(String[] args) {
		System.out.println("---------- Dynamic Array (int) ----------");
		IntDArray idarr = new IntDArray(3); // ���� 3���� ������ �� �ִ� �迭 ����
		idarr.arrInfo();
		idarr.add(3);
		idarr.arrInfo();
		idarr.add(5);
		idarr.arrInfo();
		idarr.add(7);
		idarr.arrInfo();
		
		// ����� ũ�⸦ �Ѿ �����͸� ����!
		//	-> 3�� ũ��� �����Ǿ��ֱ� ������ �� �̻� ������ �Ұ����� ����
		// Q. ���� �ڵ尡 ���������� ����� �� �ֵ��� IntDArray.java�� add()�� �����ϼ���.
		idarr.add(9);
		idarr.arrInfo();
		idarr.add(11);
		idarr.arrInfo();
		
		// ���׸� ���� �迭 Ȱ��
		System.out.println("---------- Dynamic Array (Generic) ----------");
		DArray<Integer> darr = new DArray<Integer>(3);
		darr.arrInfo();
		darr.add(3);
		darr.arrInfo();
		darr.add(5);
		darr.arrInfo();
		darr.add(7);
		darr.arrInfo();
		darr.add(9);
		darr.arrInfo();
		darr.add(11);
		darr.arrInfo();
		
		DArray<String> darr2 = new DArray<String>(3);
		darr2.arrInfo();
		darr2.add("one");
		darr2.arrInfo();
		darr2.add("two");
		darr2.arrInfo();
		darr2.add("three");
		darr2.arrInfo();
		darr2.add("four");
		darr2.arrInfo();
		darr2.add("five");
		darr2.arrInfo();
	}
}
















