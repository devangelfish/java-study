package kr.ac.syu.day03;

//import java.lang.Object;
// java.lang.Object�� import���� �ʾƵ�,
// ��� ���谡 �ȴ�?
//	-> java.lang.* ��Ű���� �ڵ����� ���ԵǾ� �ִ�!

class AAA /*extends Object*/ { // ������ ��!
	// *��� Ŭ������ �ֻ��� Ŭ���� Object�� ����Ѵ�.
	//	-> ������ ���� �ʰ�, toString() ȣ�� ����! �θ��� toString() ȣ��!
	@Override
	public String toString() {
		return "AAA Class...";
	}
}

public class ObjectTest {
	public static void main(String[] args) {
		AAA a = new AAA();
		System.out.println(a.toString());
		System.out.println(a); // toString() �ڵ� ȣ��!
	}
}







