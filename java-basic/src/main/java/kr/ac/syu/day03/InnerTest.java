package kr.ac.syu.day03;

/*
 *  Inner Class
 *   : Ŭ���� ���ο� Ŭ������ �����ϴ� ���� (���� Ŭ����)
 *   
 *  [����]
 *  class OuterClass {
 *  	class InnerClass {
 *  
 *  	}
 *  	static class NestedClass {
 *  
 *  	}
 *  }
 */

class Outer {
	Outer() {
		// Ŭ���� ���ο����� ���� ���� ����!
//		Nested nst = new Nested();
//		nst.goo();
		
		Nested.goo(); // static �޼ҵ�� Ŭ���� �̸����� ����!
	}
	class Inner {
		public void foo() {
			System.out.println("Inner Class foo() Method Called...");
		}
	}
	static class Nested {
		Nested() {
			System.out.println("Nested Class Constructor Nested() Called...");
		}
		
//		public void goo() { // �Ϲ� �޼ҵ�
		public static void goo() { // ����ƽ �޼ҵ�
			System.out.println("Nested Class goo() Method Called...");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		// �Ϲ� ���� Ŭ���� ���� ���
		Outer out = new Outer(); // Outer ���� ����!
		Outer.Inner oi = out.new Inner();
		// Outer.Inner : Outer Ŭ������ �����! -> ���� ������
		//	-> ���� Ŭ���� �̸� (Ÿ��)
		// out.new Inner() : ������ Outer�� ���� Innter�� �����Ͽ� ����!
		oi.foo();
		
		Outer.Inner oi2 = new Outer().new Inner();
		oi2.foo();
		
		// static ���� Ŭ���� ���� ���
//		Outer.Nested on = new Outer.Nested();
//		Outer.Nested on = new Outer.new Nested(); // ����ƽ �����! �Ұ�!
//		on.goo();
		
		new LOL().process();
		// ������ ���ÿ� �޼ҵ� ȣ��!
		// ������ LOL ��ü�� ����ϴ� ���� ������ �������� �ʴ´�.
		//	-> ��ȸ�뼺, ������ ��ü�� �� ����� �� ����.
		
		// Game �������̽��� ��� �޴� �͸� Ŭ����
		Game g = new Game() {
			@Override
			public void process() {
				System.out.println("��ȯ���� ��� ���� ���� ȯ���մϴ�.");
			}
		};
		g.process();
		
		new Game() {
			 @Override
			 public void process() {
				 System.out.println("��ȯ���� ��� ���� ���� ȯ���մϴ�.");
			 }
		}.process(); // ��ȸ�뼺
		// Game �������̽��� ��ӹ޴� �͸� Ŭ���� ���� ���ÿ� �޼ҵ� ȣ��!		
	}
}

interface Game {
	void process();
}
class LOL implements Game {
	@Override
	public void process() {
		System.out.println("��ȯ���� ��� ���� ���� ȯ���մϴ�.");
	}
}








