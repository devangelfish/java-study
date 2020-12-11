package prob2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Prob2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		int num = 0;
		
		try {  
			br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));// 자바IO 사용해보기
			System.out.print("금액: ");
			num = Integer.parseInt(br.readLine());
		} catch (UnsupportedEncodingException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
		if(num > 50000) {
			System.out.println("오만 원권: " + num / 50000 + "매" );
			num -= 50000 * (num / 50000); 
		} if(num > 10000) {
			System.out.println("만 원권: " + num / 10000 + "매" );
			num -= 10000 * (num / 10000);
		} if(num > 5000) {
			System.out.println("오천 원권: " + num / 5000 + "매" );
			num -= 5000 * (num / 5000);
		} if(num > 1000) {
			System.out.println("천 원권: " + num / 1000 + "매" );
			num -= 1000 * (num / 1000);
		} if(num > 500) {
			System.out.println("500원 동전: " + num / 500 + "개" );
			num -= 500 * (num / 500);
		} if(num > 100) {
			System.out.println("100원 동전: " + num / 100 + "개" );
			num -= 100 * (num / 100);
		} if(num > 50) {
			System.out.println("50원 동전: " + num / 50 + "개" );
			num -= 50 * (num / 50);
		} if(num > 10) {
			System.out.println("10원 동전: " + num / 10 + "개" );
			num -= 10 * (num / 10);
		} if(num > 1) {
			System.out.println("1원 동전: " + num / 1 + "개" );
			num -= 1 * (num / 1);
		}	
	}
}

