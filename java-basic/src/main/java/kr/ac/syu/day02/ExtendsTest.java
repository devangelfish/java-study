package kr.ac.syu.day02;

/*
 *  상속 : 부모-자식 간의 형태로 클래스 관계를 주는 방법
 *  	-> 단, "유전자"를 물려받는 형태의 상속 개념!
 *  		부모의 키가 크다는 특징을 자식이 물려받았다고 해서,
 *  		부모의 키가 큰 특징이 사라지지 않는다.
 *  	 	반면, "재산"을 물려준다면
 *  		부모는 더 이상 그 재산을 가지고 있지 않게 된다.
 *  
 *  [형태]
 *  class [자식 클래스] extends [부모 클래스] { }
 *  
 *  One : 부모 클래스, 상위 클래스, 기반 클래스, *수퍼 클래스
 *  Two : 자식 클래스, 하위 클래스, 파생 클래스, *서브 클래스
 *  	-> 서브 클래싱 : 특정 클래스에게 상속을 받게끔 한다.
 */
class One { // 부모 클래스
	String bloodType = "A";
	
	@SuppressWarnings("unused")
	private int value = 10; 		// 부모의 private 필드
	protected int password = 20;	// 부모의 protected 필드
	
	One() {
		System.out.println("Constructor One() Called...");
		System.out.println(bloodType);
	}
}
class Two extends One { // 자식 클래스
	String height = "Parent height Field...";
	
	Two() {
		System.out.println("Constructor Two() Called...");
		bloodType = "O";
		System.out.println(bloodType);
		// 부모 One 클래스에서 상속받은 필드 bloodType
		
//		System.out.println(value);		// 부모의 private 필드 접근 불가!
//		System.out.println(password);	// 부모의 protected 필드 접근 가능!
	}
}
class Three extends Two {
	String height = "Child height Field...";
	
	Three(/*String height*/) {
		System.out.println("Constructor Three() Called...");
//		System.out.println(height);
		// 본 영역에 매개변수 혹은 지역변수가 존재한다면,
		// 스코프 탐색에 의해 자신의 것을 먼저 본다! (자신의 영역, { })
		
		System.out.println(this.height);
		// 내가 가진 height 필드가 없다면,
		// this 키워드는 부모의 height 필드를 접근!
		
		System.out.println(super.height); // super -> Two 클래스를 의미!
		// super : 부모를 의미
		//	-> 부모가 가진 height를 접근하여 출력!
		
		
		System.out.println(password);
		// One - Two - Three 의 상속 관계에 의해,
		// Three에서 One의 필드에 접근이 가능!
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
//		One one = new One();
//		Two two = new Two();
		// 자식이 존재하기 위해서는 부모가 있어야 한다.
		// 즉, 자식을 생성하더라도 부모가 먼저 생성된 후에 자식 생성!
		
		@SuppressWarnings("unused")
		Three three = new Three();
		// One() -> Two() -> Three()
	}
}








