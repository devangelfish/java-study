package object_practice;

public class RectTest {

	public static void main(String[] args) {
		Rect r = new Rect();
		System.out.println(r); // (16진수) 메모리 값을 4바이트 int로 hashing
		System.out.println(r.hashCode()); // (10진수)
	}

}
