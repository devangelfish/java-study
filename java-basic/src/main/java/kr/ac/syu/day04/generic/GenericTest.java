package kr.ac.syu.day04.generic;

class Banana {
	String size;
	public Banana(String size) {
		this.size = size;
	}
	public void info() {
		System.out.println("ũ�� : " + size);
	}
}
class Apple {
	int sugar;
	public Apple(int sugar) {
		this.sugar = sugar;
	}
	public void info() {
		System.out.println("�絵 : " + sugar);
	}
}
// ��ü�� ������ Ÿ�Կ� �����ϴ�.
//	-> ���� �������� ��� Ŭ������ ����? ����� ���� ���.
class BananaBox { Banana banana; }
class AppleBox { Apple apple; }

/*
 *  �Ϲ����� Ÿ�� ����
 *  T - DataType (U, ...)
 *  K - Key
 *  V - Value
 *  E - Element
 *  N - Numeric, Number
 */

// Generic(���׸�) �̶�?
//	-> ���� ���ϴ� ������ �����ϰڴٶ�� ����!
//	-> �ڽ����� ���� ��ƼĿ�� ���� ��ü�� ���� �� �ֵ���!
// datatype : ���� ���Ƿ� ���� �̸�
// Generic Class (���׸� Ŭ����)
class Box<datatype> {
	// �ڷ����� �������� �ʴ�.
//	Object obj; // ������ �ʴ� ��ü�� ��� �� �ִ�.
	
	private datatype item;
	
	public void store(datatype item) { // Setter
		this.item = item;
	}
	public datatype pullOut() { // Getter
		return item;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		Box<Banana> bBox = new Box<Banana>();
		bBox.store(new Banana("15"));	// �ٳ����� �����Ͽ� ���� ��,
//		bBox.store(new Apple(5)); // ������ ����!
		Banana banana = bBox.pullOut();	// ���ڿ��� �ٳ����� ������,
		banana.info();					// ������ Ȯ���ض�.
		
		Box<Apple> aBox = new Box<Apple>();
		aBox.store(new Apple(10));
		Apple apple = aBox.pullOut();
		apple.info();
	}
}









