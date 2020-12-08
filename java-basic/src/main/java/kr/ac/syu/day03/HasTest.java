package kr.ac.syu.day03;

/*
 *  HAS-A ���� (���� ����)
 *  	��� ������ ���� �����ϱ�?
 *  	-> ������ ���� ���� ����, ���� ���� �ִ�.
 *  
 *  �������� ��� ���谡 �ƴ�,
 *  �� Ŭ�������� �ٸ� Ŭ������ �����ϴ� ����
 */

class Gun {
	int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	public void fire() {
		System.out.println("��!");
		this.bullet--;
	}
	public void status() {
		System.out.println("���� �Ѿ� : " + this.bullet);
	}
}
class Police /*extends Gun*/ { // ��� ������, ���� ���� �� �ѵ� ������ �����ȴ�!
	Gun gun; // �ٸ� Ŭ������ ���� ���� ����
	// Police���� Gun�� ����ϰڴ�.
	// ���ǿ� ����, ������ ���� �������� ���� ���� �ִ�.
	
	public Police(int bullet) {
		if(bullet > 0) { // �Ѿ��� 1�� �̻� ������ �����ȴٸ�,
			gun = new Gun(bullet); // Gun ��ü ����
		} else { // �Ѿ��� ���ٸ�,
			gun = null; // Gun�� �������� �ʰڴ�.
		}
	}	
	public void fire() {
		if(gun == null) { // Gun ��ü�� ���ٸ�,
			System.out.println("�� �� �����...");
		} else { // ������ Gun ��ü�� ������ �ִ� ���,
			System.out.println("��� ����!");
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










