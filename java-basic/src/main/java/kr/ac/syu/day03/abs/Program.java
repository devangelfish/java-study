package kr.ac.syu.day03.abs;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal ani; // ���� ���� ���� ����!
//		ani = new Animal(); // �ν��Ͻ� ���� �Ұ���!
		
		Scanner s = new Scanner(System.in);
		System.out.println("���̸� �� ������ �����ϼ���.");
		System.out.println("[1]:����� [2]:������");
		int num = s.nextInt();
		
		// ���α׷� �����ϴ� ��������,
		// �Էµ� ��ȣ�� ���� ��찡 ���� ���δ�.
//		switch(num) {
//		case 1:
//			Cat cat = new Cat();
//			cat.eat(); break;
//		case 2:
//			Dog dog = new Dog();
//			dog.eat(); /*break;*/
//		}
		
		Menu menu = new Menu();
		menu.process(num);
		
		s.close();
	}
}









