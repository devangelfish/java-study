package kr.ac.syu.day02;

class Access {
	private String name;
	private int age;
	
	/*
	 *  Access Method (접근자 메소드)
	 *  	Getter, Setter
	 *  	외부에서 변수의 이름을 직접 접근하지 않고,
	 *  	간접적으로 값을 확인(get)하거나, 변경(set)하기 위해 활용
	 */
	public String getName() { // getter
		return name;
	}
	public void setName(String name) { // setter
		this.name = name;
	}
	public int getAge() { // getter
		return age;
	}
	public void setAge(int age) { // setter
		// 잘못된 데이터에 대한 처리
		if(age < 0) this.age = -1; // 잘못 입력 및 데이터 없음을 의미하도록!
		else this.age = age;
	}
}

public class AccessTest {
	public static void main(String[] args) {
		Access ac = new Access();
//		ac.name = "멍청이"; // private으로 접근을 막았다.
		// 외부에서 변수의 이름을 직접 접근하지 못하도록!
		
		ac.setName("카페");
		System.out.println(ac.getName());
		ac.setAge(7);
		System.out.println(ac.getAge());
		
		// setter를 활용한 예외 처리 (핸들링, handling)
		// 변수 이름 접근을 막더라도, setter를 사용 가능하다면?
		//	-> 이상한 데이터가 들어갈 수 있다.
		//	   age 변수는 0이상의 정수만 들어가야 한다!
//		ac.age = -7; // 본 코드처럼 직접 접근이 가능하다면 바로 값을 바꾸는 것은 막기 힘들다!
		// setter를 이용해 객체 내부(메소드 내부)에서 가공하여 값을 넣어주는 방법으로 활용!
		ac.setAge(-7);
		System.out.println("나이 음수입력 : " + ac.getAge());
		// 잘못된 데이터를 입력할 시에 대한 처리로 -1 출력
		//	-> *외부에서 전달(가공)된 데이터로 값이 저장되지 않도록!
		//	-> *나이는 무조건 0이상이라는 특징을 갖도록 처리해라.
	}
}








