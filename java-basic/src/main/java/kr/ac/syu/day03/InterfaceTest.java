package kr.ac.syu.day03;

// 1. �ڹٴ� ���� ����� �������� �ʴ´�.
//class AA extends BB, CC { }
//class BB { }
//class CC { }

// �ٸ�, interface�� Ȱ���� ���� ����� ���´� ����
interface AA { }
interface BB { }
class MyClass implements AA, BB { }

// �� �ϳ��� class�� ���� interface ��� ����
class CC { }
class MyClass02 extends CC implements AA, BB { }

// interface ������ ����� extends Ȱ��
interface MyInterface extends AA, BB { }

// 2. interface�� Ȱ���� ��� ������ ����
//	-> ���Ͽ� ���� ������ ���(����)�� ǥ���ϰڴ�.
class Cweek {
	public static final int MON = 1;
	// ...
	public static final int SUN = 7;
} // �������̽��� ��� ǥ���� �Ѵٸ�,
interface Iweek {
	// �������̽��� �ʵ�� ������ ������ ����!
	/*public static final*/ int VALUE = 0;
	int MON = 1, /* ... */ SUN = 7;
}

// 3. ������ �����Ѱ��� ǥ���ϴ� �뵵 (Ŭ������ Ư�� ǥ��)
//	-> ~able �� ������ interface �̸��� ���, ~�����ϴ�.
interface UpperCasePrintable { // �빮�ڷ� ��� �����ϴ�.
	/*public abstract*/ void toUpperCasePrint();
}
class Printer implements UpperCasePrintable {
	// interface ��� ��, interface�� �߻� �޼ҵ��
	// ���� Ŭ�������� ������ ������(Override) �ؾ� �Ѵ�.
	//	-> Printer�� "�빮�� ���"�̶�� Ư¡�� ������ ���� �ȴ�.
	@Override
	public void toUpperCasePrint() {
		// TODO
	}
	
	void print() { }		// default
//	public void print() { }	// public
}
class PrinterSub extends Printer {
	@Override
//	void print() { }		// default
	public void print() { }	// public
	/*
	 *  Override�� �޼ҵ��� ���� �����ڴ�,
	 *  �θ��� ���� �����ں��� ������ �� ����.
	 *  ��, �θ��� ���� �����ں��� Ȯ���� ����!
	 *  	-> ����� �޴´�? *Ŭ������ Ȯ���Ѵ�!
	 */
}

public class InterfaceTest {
	public static void main(String[] args) {
		// �������̽� ��� -> ���� ��� ����! (static)
		System.out.println(Iweek.MON);
		System.out.println(Cweek.MON);
	}
}

interface ColorPrintable {
	void print();
	void prnRED();
	void prnBLUE();
	// ...
}
abstract class ColorPrint {
	abstract void print();
	void prnRED() { }
	void prnBLUE() { }
	// ...
}

class MyPrinter /*implements ColorPrintable*/ extends ColorPrint {
	// interface ��� �� ��� �޼ҵ带 ������!
	//	-> ��� ���, ������ ���, �Ķ��� ���
	@Override
	public void print() { }
	
	// abstract ��� �� �߻� �޼ҵ常 ������!
	//	-> ��� ����� ������ ����, ���� ����� �ʿ信 ���� ������
//	@Override
//	public void prnRED() { }
//	@Override
//	public void prnBLUE() { }
}











