package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class PhoneList01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반 스트림(byte)
			FileInputStream fis = new FileInputStream("phone.txt");
				
			// 보조스트림(byte|byte|byte| -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			// 포조스트림2(char1|char2|char3|\n -> "char1char2char3")
			br = new BufferedReader(isr);
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");
				
				int index = 0;
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					
					if(index == 0)
						System.out.print(token + ":");
					else if(index == 1) // 전화번호1
						System.out.print(token + "-");
					else if(index == 2) // 전화번호2
						System.out.print(token + "-");
					else
						System.out.print(token);
					index++;
				}
				
				System.out.print("\n");
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
