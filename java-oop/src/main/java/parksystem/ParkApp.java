package parksystem;

public class ParkApp {

	public static void main(String[] args) {
		Bus c = new Bus();
		SportsCar c2 = new SportsCar();
		
		ParkSystem.park(c);
		ParkSystem.park(c2);
	}
}
