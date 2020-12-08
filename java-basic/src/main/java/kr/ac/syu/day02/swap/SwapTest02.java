package kr.ac.syu.day02.swap;

class Value {
	private int value;
	public int getValue() { return value; }
	public void setValue(int value) { this.value = value; }
}

public class SwapTest02 {
	/*
	 *  Call By Reference : 참조에 의한 호출
	 *  단순히 값이 아닌, 해당 값이 존재하는 참조 정보(주소 정보)를 전달!
	 *  객체를 담는 참조 변수는 주소 정보를 가진다.
	 *  주소를 활용할 수 있는 객체를 사용하겠다!
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











