package kr.ac.syu.day03.abs;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal ani; // 참조 변수 선언 가능!
//		ani = new Animal(); // 인스턴스 생성 불가능!
		
		Scanner s = new Scanner(System.in);
		System.out.println("먹이를 줄 동물을 선택하세요.");
		System.out.println("[1]:고양이 [2]:강아지");
		int num = s.nextInt();
		
		// 프로그램 시작하는 영역에서,
		// 입력된 번호에 따른 경우가 눈에 보인다.
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









