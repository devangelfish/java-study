package kr.ac.syu.day03;

/*
 *  HAS-A 관계 (복합 관계)
 *  	모든 경찰은 총을 가집니까?
 *  	-> 경찰은 총을 가질 수도, 없을 수도 있다.
 *  
 *  직접적인 상속 관계가 아닌,
 *  한 클래스에서 다른 클래스를 참조하는 형태
 */

class Gun {
	int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	public void fire() {
		System.out.println("빵!");
		this.bullet--;
	}
	public void status() {
		System.out.println("남은 총알 : " + this.bullet);
	}
}
class Police /*extends Gun*/ { // 상속 관계라면, 경찰 생성 시 총도 무조건 생성된다!
	Gun gun; // 다른 클래스의 참조 변수 선언
	// Police에서 Gun을 사용하겠다.
	// 조건에 따라, 생성할 수도 생성하지 않을 수도 있다.
	
	public Police(int bullet) {
		if(bullet > 0) { // 총알을 1개 이상 가지고 생성된다면,
			gun = new Gun(bullet); // Gun 객체 생성
		} else { // 총알이 없다면,
			gun = null; // Gun을 생성하지 않겠다.
		}
	}	
	public void fire() {
		if(gun == null) { // Gun 객체가 없다면,
			System.out.println("저 총 없어요...");
		} else { // 생성된 Gun 객체를 가지고 있는 경우,
			System.out.println("사격 개시!");
			gun.fire();
			gun.status();
		}
	}
}

public class HasTest {
	public static void main(String[] args) {
		Police p = new Police(3);
		Police p2 = new Police(0);
		p.fire();
		p2.fire();
	}
}










