package practice02;

import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오 >>");
		String line = scanner.nextLine();
		String[] tokens = line.split(" ");

		int IValue = Integer.parseInt(tokens[0]);
		int rValue = Integer.parseInt(tokens[2]);
		String operator = tokens[1];

		switch (operator) {
		case "+": {
			System.out.println(IValue + rValue);
			break;
		}
		case "-": {
			System.out.println(IValue - rValue);
			break;
		}
		case "*": {
			System.out.println(IValue * rValue);
			break;
		}
		case "/": {
			System.out.println(IValue / rValue);
			break;
		}
		default: {
			System.out.println("지원하지 않는 계산입니다.");
		}
		}
		scanner.close();
	}
}
