package kr.ac.syu.day03.abs;

// handler class
public class Menu {
	public void process(int num) {
		switch(num) {
		case 1:
			Cat cat = new Cat();
			cat.eat(); break;
		case 2:
			Dog dog = new Dog();
			dog.eat(); /*break;*/
		}
	}
}
