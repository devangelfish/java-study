package kr.ac.syu.day04.generic;

class AAA {
	@Override
	public String toString() { return "Class AAA"; }
}
class BBB {
	@Override
	public String toString() { return "Class BBB"; }
}

class InstInfo {
	// Generic Method (���׸� �޼ҵ�)
	public <T> void info(T inst) {
		System.out.println(inst);
		// inst -> inst.toString()
	}
	
	// 2�� �̻��� ���ڸ� ���׸� Ÿ������ ����
	public <T, U> void info(T inst1, U inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

public class MethodTest {
	public static void main(String[] args) {
		AAA a = new AAA();
		BBB b = new BBB();
		
		InstInfo i = new InstInfo();
		i.info(a);
		i.info(b);
		// info() �޼ҵ��� ���ڷ� � ��ü�� ���޵��� �𸥴�.
		
		// ���׸� �޼ҵ带 Ȱ����, ���޵Ǵ� ���ڸ� ����(����, ��ƼĿ)
		i.<AAA>info(a);
		i.<BBB>info(b);
//		i.<AAA>info(b); // ������ ����!
		// AAA ��ƼĿ�� ���̰� BBB Ÿ���� ���� ����
		
		i.<AAA, BBB>info(a, b);
//		i.<AAA, BBB>info(b, a); // ������ ��ġ, ������ ����!
	}
}









