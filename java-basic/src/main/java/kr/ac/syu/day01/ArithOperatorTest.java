package kr.ac.syu.day01;

public class ArithOperatorTest {
	public static void main(String[] args) {
		// 산술 연산자
		int n1 = 7;
		int n2 = 3;
		int result = n1 + n2;
		System.out.println("덧셈 결과 : " + result);
		
		result = n1 - n2;
		System.out.println("뺼셈 결과 : " + result);
		
		System.out.println("곱셈 결과 : " + n1 * n2);
		System.out.println("나눈 몫 결과 : " + n1 / n2);
		System.out.println("나눈 나머지 결과 : " + n1 % n2);
		
		// 나누기 연산
		System.out.println(10 / 3);
		System.out.println(10. / 3.);
		System.out.println(10. / 3);
		
		// 대입 연산자
		//	-> 연산자 기준으로 우항을 좌항에 저장 (대입)
		// 복합 대입 연산자
		//	-> 두 항을 기준으로 수행하는 연산자와
		//		대입 연산자가 복합적으로 활용되는 형태
		int i = 10; // 대입 연산자
		i += 5; // i = i + 5;
		// 기존 값과 우항의 값의 연산 결과를 다시 기존 값에 대입하는 형태
		System.out.println(i); // 15
		
		// 관계 연산자 (비교 연산자)
		int a = 10, b = 20;
		// 동일한 타입의 여러 변수를 선언과 동시에 초기화
//		System.out.println("a > b : " + a > b);
		// " " -> 문자열도 타입! (객체 타입)
		// "a > b : " + a -> 정상 수행! 결과는 문자열(String)
		// + 연산 후 결과는 문자열(String) 이후에 b(int)과 크기 비교 연산 수행!
		//		-> Error!
		System.out.println("a > b : " + (a > b));
		// 비교 연산을 먼저 수행하도록 우선순위를 변경
		
//		System.out.println("Hello" + "Java");
		// "Hello" + "Java" -> 문자열간의 연산!
		//	-> 두 문자열이 연결된다.
		
		System.out.println("a < b : " + (a < b));	// 작냐?
		System.out.println("a >= b : " + (a >= b));	// 크거나 같으냐?
		System.out.println("a <= b : " + (a <= b));	// 작거나 같으냐?
		System.out.println("a == b : " + (a == b));	// 같으냐?
		System.out.println("a != b : " + (a != b));	// 다르냐?
		
		// 문자열
		String str = "Hello"; // str : 문자열을 담을 수 있는 변수
		System.out.println(str + "10"); // 문자열 + 문자열
		System.out.println(str + 10);	// 문자열 + 정수
		
		int iNum = 10;
		double dNum = 3.14;
		System.out.println(iNum + dNum); // 자동 형변환
		// *연산은 서로의 타입이 일치하여야 수행된다.
		System.out.println((double)iNum + dNum);
		// 자동 형변환이 되지만, 명시적으로 써주는 경우
		// 단순 표시의 용도!
		
		/*
		 *  논리 연산자
		 *   && : A && B, (A수식) && (B수식), AND 논리
		 *   		A와 B 모두 true이면, 연산 결과는 true
		 *   		A와 B 둘 중 하나라도 false라면 연산 결과는 false
		 *   || : A || B, (A수식) || (B수식), OR 논리
		 *   		A와 B 둘 중 하나라도 ture라면, 연산 결과는 true
		 *   		A와 B 모두 false면, 연산 결과는 false
		 *   !  : !A, !(A수식), NOT 논리
		 *   		A의 연산 결과가 true면, false
		 *   		    		false면, true
		 */
		int num1 = 10, num2 = 20;
		boolean re1 = (num1 != 10) && (num2 == 20);
		boolean re2 = (num1 <= 12) || (num2 >= 30);
		System.out.println(re1); // false
		System.out.println(re2); // true
		
		/*
		 *  SCE (Short-Circuit Evaluation)
		 *   - A수식의 연산결과가 논리 연산의 결과로 결정된다면,
		 *     B수식을 수행하지 않는다.
		 */
		int value = 10;
		boolean re3 = (num1 > 0) || ((value = 20) > num2);
		System.out.println(re3);	// true
		System.out.println(value);	// 10
		// SCE에 의해 뒤의 수식은 수행되지 않기에 20이 대입되지 않는다.
		
		/*
		 *  증감 연산자
		 *   값을 1 증가하거나 1 감소하기 위한 연산자
		 *   ++ : val = ++n; / val = n++;
		 *   -- : val = --n; / val = n--;
		 *    <전위 증감 연산자> / <후위 증감 연산자>
		 *   
		 *   전위 : 해당 연산(구문)을 수행하기 전 증감
		 *   후위 : 해당 연산(구문)을 수행한 후 증감
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
		 *  비트 논리 연산자 (비트 단위)
		 *   비트 단위(2진수)로 각 자리수끼리 논리 연산을 수행
		 *   true(1), false(0)
		 *   
		 *   & : 비트 단위 AND 논리
		 *   | : 비트 단위 OR 논리
		 *   ^ : 비트 단위 XOR 논리
		 *   	-> 두 논리가 같으면 거짓, 다르면 참
		 *   ~ : 비트 단위 NOT 논리
		 *   	-> 논리가 참이면 거짓, 거짓이면 참
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
		
		// 임시 저장공간을 활용한 Swap
//		t = x;
//		x = y;
//		y = t;
		
		// XOR 연산자를 활용한 Swap
		x ^= y;
		y ^= x;
		x ^= y;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// 대소문자 변환
		char c1 = 'A'; // 65
		char c2 = 'a'; // 97
		System.out.printf("%c\n", c1 + 32);
		System.out.printf("%c\n", c2 - 32);
		// 대문자 인지 소문자 인지 알아야 변환이 가능!
		//	-> 대문자라면 +32, 소문자라면 -32
		
		// 대소문자를 구분하지 않고, 모두 동일한 XOR 연산
		System.out.printf("%c\n", c1 ^ 32);
		System.out.printf("%c\n", c2 ^ 32);
		
		// 비트 이동 연산자 (비트 쉬프트)
		//	: 2의 제곱 수 (이동 수)만큼 곱하거나, 나눌 때 활용
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
		System.out.println(iNum1 + iNum2); // 표현 범위 (32자리)만 출력!
		System.out.println((iNum1 + iNum2) / 2);
		// 합계인 4150000000은 서랍장(메모리)에 존재하지만,
		// 두 개의 합계인 정수(int)와 정수(int)의 합계 연산 시에도 결과는 32자리!
		// 2로 나누는 정수(int)와 정수(int) 연산 시 32자리만 가지고 연산을 수행!
		//	-> *33번째 자리에 데이터는 존재하는 상태
		
		// 비트 이동 연산자 활용
		System.out.println((iNum1 + iNum2) >>> 1);
		
		// int 형 정수 표현의 최대 값
		System.out.println("-1 >>> 1 : " + (-1 >>> 1));
	}
}







