package kr.ac.syu.day03;

interface Printable {
	void print();
}

class OuterClass {
	private String name;
	
	OuterClass(String name) {
		this.name = name;
	}
	
	// Local Class : 메소드 내부에 존재하는 형태의 클래스
	public Printable createLocalClassInst() {
		// 메소드 내에 정의한 로컬 클래스를 사용하지 않으면,
		// 경고 출력! -> 어차피 메소드 내에서만 사용 가능!
		class Local implements Printable {
			@Override
			public void print() {
				System.out.println("name : " + name);
			}
		}
		return new Local();
		// Local은 Printable의 구현 클래스(자식)이기에 반환 가능!
	}
	/*
	 *  지역 변수 : 메소드나 제어문처럼 { } 내에서만 존재하는 변수
	 *  	- Local Variable
	 *  	- 해당 영역을 빠져나오면 소멸!
	 *  	- 매개 변수도 해당 메소드 내의 지역 변수!
	 *  지역 클래스 (Local Class)
	 *  	- 해당 영역에서만 사용 가능한 클래스!
	 */
	
	// 익명의 Local Class인 Anonymous Class
	public Printable createLocalClassInst2(/*final*/ int id) {
//		id = 20; // 값을 바꾸는 동작을 하는 순간! 일반 지역 변수로 취급!
		/*
		 *  [final 생략 시 주의할 점]
		 *  메소드 내부에서 매개 변수 id를 접근하여 활용, 변경(변수 처럼) 사용할 시,
		 *  id 매개 변수의 형식이 바뀐다.
		 *  	-> 상수 취급이 아닌 일반 지역 변수로 취급!
		 */
		return new Printable() {
			// print() 멤버 메소드를 가진 익명 클래스가 존재!
			//	-> Printable을 상속받는 형태
			@Override
			public void print() {
				System.out.print("name : " + name);
				System.out.println(", id : " + id);
				// 접근 가능한 경우는 메소드의 매개 변수를 상수로 취급될 때!
				// return 수행(종료) 시 메소드(매개 변수)의 메모리는 해제되지만,
				// id가 살아있는 이유? -> 상수 풀! (Constant Pool)
			}
		};
	}
}

public class LocalTest {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass("카페");
		Printable p = oc.createLocalClassInst();
		p.print();
		
		OuterClass oc2 = new OuterClass("라떼");
		Printable p2 = oc2.createLocalClassInst2(10);		
		p2.print();
	}
}












