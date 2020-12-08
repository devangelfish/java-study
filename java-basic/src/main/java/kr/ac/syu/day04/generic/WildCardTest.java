package kr.ac.syu.day04.generic;

class Animal {
	public void eat() { }
}
class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("�ɳɳ�~");
	}
}
class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("�ͱ��ͱ�!");
	}
}

class House<datatype> {
	datatype animal;
	public void store(datatype animal) { // Setter
		this.animal = animal;
	}
	public datatype pullOut() { // Getter
		return animal;
	}
}

// WildCard (���ϵ� ī��) : ������ ������ ������, ��� �޾��ִ� ����!
//	-> ���� ? �� Ȱ���Ͽ� ǥ��
public class WildCardTest {
	// Animal�� �����ϰ�, ��ӹ޴� ��� �ڽ��� ��ƼĿ�� ���̰ڴ�. (Animal, Cat, Dog)
//	public static void open(House<? extends Animal> house) {
//		Animal animal = house.pullOut();
//		animal.eat();
//	}
	
	// Cat�� �����ϰ�, ����ϴ� �θ� ��ƼĿ�� ���̰ڴ�. (Cat, Animal)
	public static void open(House<? super Cat> house) {
		Animal animal = (Animal)house.pullOut();
		animal.eat();
	}
	
	public static void main(String[] args) {
		House<Animal> h = new House<Animal>();
		House<Cat> c = new House<Cat>();
		House<Dog> d = new House<Dog>();
		h.store(new Cat());
		h.store(new Dog());
		
		c.store(new Cat());
		d.store(new Dog());
//		d.store(new Cat()); // ������ ����!
		
		open(h);
		open(c);
//		open(d);
	}
}












