package kr.ac.syu.day02.pack.b;

//import kr.ac.syu.day02.pack.a.TestData;
// import ���� �� ���� B.java ���� ������ TestData ��� ����!

// TestData�� �ٸ� ��Ű�������� ��� ������ B Ŭ����
public class B extends kr.ac.syu.day02.pack.a.TestData {
	kr.ac.syu.day02.pack.a.TestData td 
		= new kr.ac.syu.day02.pack.a.TestData();
	// �ٸ� ��Ű�� -> ���丮 ��ΰ� �ٸ� ���� �ִ� Ŭ����!
	// ����ϱ� ���ؼ� ��θ� �˷���� �Ѵ�. �����ؾ� �Ѵ�. (import)
	//	-> Ư�� �κп����� ��� �������� �ۼ��Ͽ� ��� ����!
	
	B b = new B();
	
	B() {
		System.out.println(td.name);	// public
//		System.out.println(td.id);		// protected
		System.out.println(b.id);
		// protected �ʵ� ���� �����
		// ����� �ִ� TestData�� �ƴ϶�,
		// ����� �޴� B�� Ȱ��!
		//	-> �ٸ� ��Ű���� ��� ������, ���� ����!
//		System.out.println(td.addr);	// default
//		System.out.println(td.money);	// private
	}
}
