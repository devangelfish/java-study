package kr.ac.syu.day03.override;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
//		Cat cat = new Cat();
//		cat.eat(); // 재정의된 메소드 호출
//		Dog dog = new Dog();
//		dog.eat();
//		Animal ani = new Animal();
//		ani.eat(); // 부모 메소드 호출
		
		
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









