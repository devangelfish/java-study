package parksystem2;

public class ParkApp {

	public static void main(String[] args) {
		Car c = new Bus(); // 부모를 레퍼런싱 해야함.
		ParkSystem2.park(c);
		
		c = new SportsCar();
		ParkSystem2.park(c);
		
		c = new Taxi();
		ParkSystem2.park(c);
		
	}
}
