package prob1;
import java.util.Scanner;


public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		
		String s = scanner.nextLine().toUpperCase();
		
		String scanString = "";
		for(int i = 0; i < s.length(); i++) {
			scanString += s.charAt(i);
			System.out.println(scanString);
		}
		scanner.close();
	}
}
