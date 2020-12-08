package kr.ac.syu.day01;

public class ArithOperatorTest {
	public static void main(String[] args) {
		// ��� ������
		int n1 = 7;
		int n2 = 3;
		int result = n1 + n2;
		System.out.println("���� ��� : " + result);
		
		result = n1 - n2;
		System.out.println("�E�� ��� : " + result);
		
		System.out.println("���� ��� : " + n1 * n2);
		System.out.println("���� �� ��� : " + n1 / n2);
		System.out.println("���� ������ ��� : " + n1 % n2);
		
		// ������ ����
		System.out.println(10 / 3);
		System.out.println(10. / 3.);
		System.out.println(10. / 3);
		
		// ���� ������
		//	-> ������ �������� ������ ���׿� ���� (����)
		// ���� ���� ������
		//	-> �� ���� �������� �����ϴ� �����ڿ�
		//		���� �����ڰ� ���������� Ȱ��Ǵ� ����
		int i = 10; // ���� ������
		i += 5; // i = i + 5;
		// ���� ���� ������ ���� ���� ����� �ٽ� ���� ���� �����ϴ� ����
		System.out.println(i); // 15
		
		// ���� ������ (�� ������)
		int a = 10, b = 20;
		// ������ Ÿ���� ���� ������ ����� ���ÿ� �ʱ�ȭ
//		System.out.println("a > b : " + a > b);
		// " " -> ���ڿ��� Ÿ��! (��ü Ÿ��)
		// "a > b : " + a -> ���� ����! ����� ���ڿ�(String)
		// + ���� �� ����� ���ڿ�(String) ���Ŀ� b(int)�� ũ�� �� ���� ����!
		//		-> Error!
		System.out.println("a > b : " + (a > b));
		// �� ������ ���� �����ϵ��� �켱������ ����
		
//		System.out.println("Hello" + "Java");
		// "Hello" + "Java" -> ���ڿ����� ����!
		//	-> �� ���ڿ��� ����ȴ�.
		
		System.out.println("a < b : " + (a < b));	// �۳�?
		System.out.println("a >= b : " + (a >= b));	// ũ�ų� ������?
		System.out.println("a <= b : " + (a <= b));	// �۰ų� ������?
		System.out.println("a == b : " + (a == b));	// ������?
		System.out.println("a != b : " + (a != b));	// �ٸ���?
		
		// ���ڿ�
		String str = "Hello"; // str : ���ڿ��� ���� �� �ִ� ����
		System.out.println(str + "10"); // ���ڿ� + ���ڿ�
		System.out.println(str + 10);	// ���ڿ� + ����
		
		int iNum = 10;
		double dNum = 3.14;
		System.out.println(iNum + dNum); // �ڵ� ����ȯ
		// *������ ������ Ÿ���� ��ġ�Ͽ��� ����ȴ�.
		System.out.println((double)iNum + dNum);
		// �ڵ� ����ȯ�� ������, ��������� ���ִ� ���
		// �ܼ� ǥ���� �뵵!
		
		/*
		 *  �� ������
		 *   && : A && B, (A����) && (B����), AND ��
		 *   		A�� B ��� true�̸�, ���� ����� true
		 *   		A�� B �� �� �ϳ��� false��� ���� ����� false
		 *   || : A || B, (A����) || (B����), OR ��
		 *   		A�� B �� �� �ϳ��� ture���, ���� ����� true
		 *   		A�� B ��� false��, ���� ����� false
		 *   !  : !A, !(A����), NOT ��
		 *   		A�� ���� ����� true��, false
		 *   		    		false��, true
		 */
		int num1 = 10, num2 = 20;
		boolean re1 = (num1 != 10) && (num2 == 20);
		boolean re2 = (num1 <= 12) || (num2 >= 30);
		System.out.println(re1); // false
		System.out.println(re2); // true
		
		/*
		 *  SCE (Short-Circuit Evaluation)
		 *   - A������ �������� �� ������ ����� �����ȴٸ�,
		 *     B������ �������� �ʴ´�.
		 */
		int value = 10;
		boolean re3 = (num1 > 0) || ((value = 20) > num2);
		System.out.println(re3);	// true
		System.out.println(value);	// 10
		// SCE�� ���� ���� ������ ������� �ʱ⿡ 20�� ���Ե��� �ʴ´�.
		
		/*
		 *  ���� ������
		 *   ���� 1 �����ϰų� 1 �����ϱ� ���� ������
		 *   ++ : val = ++n; / val = n++;
		 *   -- : val = --n; / val = n--;
		 *    <���� ���� ������> / <���� ���� ������>
		 *   
		 *   ���� : �ش� ����(����)�� �����ϱ� �� ����
		 *   ���� : �ش� ����(����)�� ������ �� ����
		 */
		int num = 7;
		int temp;
		System.out.println(num++);			// 7
		System.out.println(temp = --num);	// 7
		System.out.println(--temp);			// 6
		System.out.println(temp + num);		// 13
		System.out.println(temp-- + 1);		// 7
		System.out.println(num--);			// 7
		System.out.println(num);			// 6
		System.out.println(temp);			// 5
		
		/*
		 *  ��Ʈ �� ������ (��Ʈ ����)
		 *   ��Ʈ ����(2����)�� �� �ڸ������� �� ������ ����
		 *   true(1), false(0)
		 *   
		 *   & : ��Ʈ ���� AND ��
		 *   | : ��Ʈ ���� OR ��
		 *   ^ : ��Ʈ ���� XOR ��
		 *   	-> �� ���� ������ ����, �ٸ��� ��
		 *   ~ : ��Ʈ ���� NOT ��
		 *   	-> ���� ���̸� ����, �����̸� ��
		 */
		int n_1 = 5;
		int n_2 = 3;
		int n_3 = -1;
		System.out.println(n_1 & n_2);	// 1
		System.out.println(n_1 | n_2);	// 7
		System.out.println(~n_3);		// 0
		
		int x = 10, y = 6;
//		int t;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// �ӽ� ��������� Ȱ���� Swap
//		t = x;
//		x = y;
//		y = t;
		
		// XOR �����ڸ� Ȱ���� Swap
		x ^= y;
		y ^= x;
		x ^= y;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// ��ҹ��� ��ȯ
		char c1 = 'A'; // 65
		char c2 = 'a'; // 97
		System.out.printf("%c\n", c1 + 32);
		System.out.printf("%c\n", c2 - 32);
		// �빮�� ���� �ҹ��� ���� �˾ƾ� ��ȯ�� ����!
		//	-> �빮�ڶ�� +32, �ҹ��ڶ�� -32
		
		// ��ҹ��ڸ� �������� �ʰ�, ��� ������ XOR ����
		System.out.printf("%c\n", c1 ^ 32);
		System.out.printf("%c\n", c2 ^ 32);
		
		// ��Ʈ �̵� ������ (��Ʈ ����Ʈ)
		//	: 2�� ���� �� (�̵� ��)��ŭ ���ϰų�, ���� �� Ȱ��
		int val = 3;
		int re = val << 4;
		System.out.println("val : " + val);
		System.out.println("re : " + re);
		
		System.out.println("48 >> 4 : " + (48 >> 4));
		System.out.println("48 >>> 4 : " + (48 >>> 4));
		System.out.println("-48 >> 4 : " + (-48 >> 4));
		System.out.println("-48 >>> 4 : " + (-48 >>> 4));
		
		int iNum1 = 2100000000;
		int iNum2 = 2050000000;
		System.out.println(iNum1 + iNum2); // ǥ�� ���� (32�ڸ�)�� ���!
		System.out.println((iNum1 + iNum2) / 2);
		// �հ��� 4150000000�� ������(�޸�)�� ����������,
		// �� ���� �հ��� ����(int)�� ����(int)�� �հ� ���� �ÿ��� ����� 32�ڸ�!
		// 2�� ������ ����(int)�� ����(int) ���� �� 32�ڸ��� ������ ������ ����!
		//	-> *33��° �ڸ��� �����ʹ� �����ϴ� ����
		
		// ��Ʈ �̵� ������ Ȱ��
		System.out.println((iNum1 + iNum2) >>> 1);
		
		// int �� ���� ǥ���� �ִ� ��
		System.out.println("-1 >>> 1 : " + (-1 >>> 1));
	}
}







