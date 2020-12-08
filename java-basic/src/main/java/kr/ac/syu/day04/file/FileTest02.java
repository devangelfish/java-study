package kr.ac.syu.day04.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) {
		// file copy (���� ����)
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("sample/cat.jpg");
			fos = new FileOutputStream("sample/cat_copy.jpg");
			
			int data = -1; // EOF
			while((data = fis.read()) != -1) // �о���̰�,
				fos.write(data); // ���.
			System.out.println("���� �Ϸ�.");
		} catch(FileNotFoundException e) { // ��Ʈ���� �� ��!
			System.out.println("error : " + e);
		} catch(IOException ex) { // �۾��� ������ ��!
			System.out.println("error : " + ex);
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}














