package kr.ac.syu.day04.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest03 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			// ��� ��Ʈ��
			fr = new FileReader("./src/kr/ac/syu/day04/file/FileTest01.java");
			fw = new FileWriter("sample/FileTest01.java.txt");
			
			// ���� ��Ʈ�� (����)
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			long sTime = System.nanoTime(); // ���� �ð�
			while(true) {
				// ���� Ŭ������ �������� ���� ���
//				int data = fr.read();
//				if(data == -1) break;
//				fw.write(data);
//				fw.flush();
				
				// ���� Ŭ������ ������ ��� (Buffer)
				String line = br.readLine();
				// readLine() : ���� ���ڸ� ���� �� ���� 1������ �о���δ�.
				// ��, ���๮�ڱ��� �д°� �ƴϱ� ������ ���࿡ ���� ó�� �ʿ�!
				if(line == null) break;
//				bw.write(line + "\r\n"); // "\n" "\r"
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
			long eTime = System.nanoTime(); // ���� �ð�
			System.out.println("���� �Ϸ�.");
			System.out.println("�ҿ� �ð� : " + (eTime - sTime) + "ns");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// TODO
		}
	}
}










