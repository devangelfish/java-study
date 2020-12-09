package practice02;

public class Prob04 {
	public static void main(String[] args) {
		CurrencyConverter.set(1084.52);
		
		double w1 = 100000;
		double d1 = CurrencyConverter.toDollar(w);
		
		System.out.println("");
		
		double d2 = 100;
		double w2 = CurrencyConverter.toKWR();
		System.out.println("");
	}
}
