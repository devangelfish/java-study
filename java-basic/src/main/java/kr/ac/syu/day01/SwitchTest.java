package kr.ac.syu.day01;

public class SwitchTest {
	public static void main(String[] args) {
		/*
			switch([value]) {
			case 1: value가 1일 때 수행되는 영역
			case 2: value가 2일 때 수행되는 영역
			default: case와 일치하지 않은 경우 수행되는 영역			
			}
		 */
		int num = 4;
		switch(num) {
		case 1: System.out.println("숫자는 1입니다."); break;
		case 2: System.out.println("숫자는 2입니다."); break;
		case 3: System.out.println("숫자는 3입니다."); break;
		default: System.out.println("default..."); break;
		
		// default 이후에 case 작성이 가능!
		case 4: System.out.println("숫자는 4입니다."); break;
		case 5: System.out.println("숫자는 5입니다.");
		}
		// break : 해당 영역을 탈출해라! 빠져나와라.
		
		// 월별 일 수 판단하기
		int month = 1;
		int days = 0;
		if(month == 1 || 
				month == 3 ||
				month == 5 ||
				month == 7 ||
				month == 8 ||
				month == 10 ||
				month == 12
				) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else {
			days = 30;
		}
		System.out.println(month + "월은 " + days +"일 까지 있습니다.");
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31; break;
		case 2: 
			days = 28; break;
		default:
			days = 30;
		}
		System.out.println(month + "월은 " + days +"일 까지 있습니다.");
	}
}








