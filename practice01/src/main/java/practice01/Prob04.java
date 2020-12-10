package practice01;

import java.util.Scanner;

public class Prob04 {
	public static void main(String[] args) {
		int i = 1;
		int randNum = 0;
		int rightAnswer;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			if (randNum == 0) {
				randNum = (int) (Math.random() * 100) + 1;
				System.out.println("수를 결정하였습니다. 맞추어보세요\n1-100");
			}
			
			System.out.print(i + ">>");
			rightAnswer = scanner.nextInt();
			
			if(randNum > rightAnswer) {
				System.out.println("더 높게");
			} else if(randNum < rightAnswer) {
				System.out.println("더 낮게");
			} else {
				scanner.nextLine();
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까?(y/n)>>");
				String again = scanner.nextLine();
					if(again.equals("y")) {
						randNum = 0;
					} else break;
			}
		}
	}
}
