package kr.ac.syu.day03;

import java.util.Random;

/*
 *  final Ű����
 *  	���ȭ Ű����!
 *  	Ȯ����Ű�ڴ�. ������ �Ұ����ϵ��� ���ڴ�!
 */

// final class : ����ϴ� ���� ������� �ʰڴ�.
/*final*/ class FinalSuper {
	// final method
	//	: Override(������)�� ������� �ʰڴ�.
	//	   ��, final class �� �ƴ϶�� ����� ���ȴ�!
	final void foo() {
		// TODO
	}
}
class FinalSub extends FinalSuper {
//	@Override
//	void foo() { // �������̵� �Ұ���!
//		// TODO
//	}
}

@SuppressWarnings("serial")
class MyRandom extends Random {
	// �θ� Ŭ���� Random�� nextInt() �޼ҵ� ������!
	@Override
	public int nextInt(int max) {
		return super.nextInt(max) + 1;
		// ���� ���� ��ɱ��� �����ϱ�� ������,
		// �θ��� ����� ������ ����� �ٲ�(���� �Ͽ�) ��ȯ�ϰڴ�.
	}
}

// String class�� final class �̱⿡ ��� �Ұ�!
//class MyString extends String { }

public class FinalTest {
	public static void main(String[] args) {
		Random r = new Random(); // ���� ���� ��� ����
		int rNum = r.nextInt(2); // 0~1
		// nextInt(int bound)
		//	: �� ������ ������ŭ ���� ����, ������ 0����
		System.out.println(rNum);
		
		rNum = r.nextInt(2) + 1; // 1~2
		System.out.println(rNum);
		
		MyRandom mr = new MyRandom();
		rNum = mr.nextInt(2); // 1~2
		System.out.println(rNum);
	}
}









