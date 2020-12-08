package kr.ac.syu.day02.swap;

class Value {
	private int value;
	public int getValue() { return value; }
	public void setValue(int value) { this.value = value; }
}

public class SwapTest02 {
	/*
	 *  Call By Reference : ������ ���� ȣ��
	 *  �ܼ��� ���� �ƴ�, �ش� ���� �����ϴ� ���� ����(�ּ� ����)�� ����!
	 *  ��ü�� ��� ���� ������ �ּ� ������ ������.
	 *  �ּҸ� Ȱ���� �� �ִ� ��ü�� ����ϰڴ�!
	 */
	public static void swap(Value a, Value b) {
//		int temp = a.value;
//		a.value = b.value;
//		b.value = temp;
		
		int temp = a.getValue();	// temp = a
		a.setValue(b.getValue());	// a = b
		b.setValue(temp);			// b = temp
	}
	
	public static void main(String[] args) {
		Value a = new Value();
//		a.value = 7;
		a.setValue(7);
		Value b = new Value();
//		b.value = 3;
		b.setValue(3);
		
//		System.out.println("a : " + a.value
//						 + ", b : " + b.value);
		System.out.println("a : " + a.getValue()
						 + ", b : " + b.getValue());
		
		swap(a, b);
		
//		System.out.println("a : " + a.value
//				 + ", b : " + b.value);
		System.out.println("a : " + a.getValue()
		 				 + ", b : " + b.getValue());
	}
}











