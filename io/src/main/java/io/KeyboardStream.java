package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardStream {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반 스트림(System.in, 표준입력, stdin)
			
			// 보조스트림(byte|byte|byte| -> char)
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			
			// 포조스트림2(char1|char2|char3|\n -> "char1char2char3")
			br = new BufferedReader(isr);
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				if("exit".equals(line)) {
					break;
				}
				
				System.out.println(line);
			}
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("error:" + e);
		} catch(IOException ex) {
			System.out.println("error:" + ex);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("error:" + e);
			}
		}
	}
}
