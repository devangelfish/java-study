package kr.ac.syu.day04.file;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileTest01 {
	public static void main(String[] args) {
		/*
		 *  1. ��Ʈ���� ����.
		 *  2. �۾��� �����Ѵ�.
		 *  3. ��Ʈ���� �ݴ´�.
		 */
		/*
		// 1. ��Ʈ���� ����.		
		InputStream is = System.in;		
		try {
			// 2. �۾��� �����Ѵ�.
			System.out.print("�Է� : ");
			byte[] bytes = new byte[20];
			
			while(true) {
				// EOF (End Of File) : -1
				if(is.read(bytes) == -1) {
					// read(bytes) : InputStream�� �о� �鿩 bytes�� ����!
					//	-> bytes�� �о�鿩��!
					break;
				}
				for(byte b : bytes) {
					System.out.print((char)b); // %c
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3. ��Ʈ���� �ݾƶ�. (�ڿ� ����)
			try {
				if(is != null) is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		*/
		
		// �ѱ��� �Է¹ޱ� ����,
		// ���� ��Ʈ���� �ٲٱ� ���� ���� Ŭ���� (������� ó��!)
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is); // ���� Ŭ���� ����!
		
		try {
			System.out.print("�Է� : ");
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











