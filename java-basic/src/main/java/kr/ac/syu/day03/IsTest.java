package kr.ac.syu.day03;

/*
 *  IS-A 관계 (상속 관계)
 *  	학생은 사람이다. (O)
 *  	사람은 학생이다. (X)
 */

class Person {
	private String name;
	// 상속받는 자식 클래스들이 공통적으로 가지고 있는 특징!
	// 학생, 회사원은 모두 이름을 가진다.
	//	-> 운동 선수, 음악가, 교사 등 각 클래스 마다 정의할 필요가 없다.
	
//	public Person() { }
	
	public Person(String name) { // Person() 기본 생성자가 없다.
		this.name = name;
	}
	public void info() {
		System.out.println("제 이름은 " + name + "입니다.");
	} 
}
class Student extends Person {
	private String university;
	private String major;
	
//	public Student() { super();	}
	// 자식의 생성자에는 부모의 생성자를 호출하는 코드가 무조건 들어가야 한다.
	// 기본 생성자인 경우 즉, (One, Two, Three)같은 경우는 자동으로 삽입해준 것 뿐!
	/*
	 *  부모의 생성자를 호출하지 않았을 시 컴파일 에러 발생!
	 *  부모는 디폴트 생성자가 아닌 매개 변수 생성자 단 하나만 가지고 있다.
	 *  (디폴트 생성자가 자동 삽입되지 않는다.)
	 *  즉, 자식의 생성자에서 부모가 생성되도록 부모의 생성자를 호출시켜야 한다!
	 */
	Student(String name, String university, String major) {
//		System.out.println("Ooops!!!");
		// 부모 생성자 호출 전 특정 로직이 있다면, 컴파일 에러!
		//	-> 자식의 생성자보다 부모 생성자가 먼저다.
		super(name);
		this.university = university;
		this.major = major;
	}
	
	public void info() {
		super.info(); // 부모의 메소드 호출 (공통)
		System.out.println("학교는 " + university + " 이고,");
		System.out.println("학과는 " + major + " 입니다.");
	}
}
class BusinessMan extends Person {
	private String company;
	private String position;
	
	BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	
	public void info() {
		super.info();
		System.out.println("회사는 " + company +" 이고,");
		System.out.println("위치는 " + position + " 입니다.");
	}
}

public class IsTest {
	public static void main(String[] args) {
		Student stu
			= new Student("카페", "삼육대", "컴퓨터공학과");
		BusinessMan bm
			= new BusinessMan("라떼", "삼성", "대리");
		stu.info();
		bm.info();
	}
}












