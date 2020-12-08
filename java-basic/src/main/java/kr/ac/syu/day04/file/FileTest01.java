package kr.ac.syu.day04.file;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileTest01 {
	public static void main(String[] args) {
		/*
		 *  1. 스트림을 연다.
		 *  2. 작업을 수행한다.
		 *  3. 스트림을 닫는다.
		 */
		/*
		// 1. 스트림을 연다.		
		InputStream is = System.in;		
		try {
			// 2. 작업을 수행한다.
			System.out.print("입력 : ");
			byte[] bytes = new byte[20];
			
			while(true) {
				// EOF (End Of File) : -1
				if(is.read(bytes) == -1) {
					// read(bytes) : InputStream을 읽어 들여 bytes에 저장!
					//	-> bytes에 읽어들여라!
					break;
				}
				for(byte b : bytes) {
					System.out.print((char)b); // %c
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림을 닫아라. (자원 정리)
			try {
				if(is != null) is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		*/
		
		// 한글을 입력받기 위해,
		// 문자 스트림을 바꾸기 위한 필터 클래스 (샤워헤드 처럼!)
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is); // 필터 클래스 장착!
		
		try {
			System.out.print("입력 : ");
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr != null) isr.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(is != null) is.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}











