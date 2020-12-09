package parksystem3;

public abstract class Car implements IParkable {
	private int accelate = 0;
	public void brake() {
		System.out.println("브레이크를 밞았습니다.");
	}
}
