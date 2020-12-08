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
			// 기반 스트림
			fr = new FileReader("./src/kr/ac/syu/day04/file/FileTest01.java");
			fw = new FileWriter("sample/FileTest01.java.txt");
			
			// 보조 스트림 (필터)
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			long sTime = System.nanoTime(); // 시작 시간
			while(true) {
				// 필터 클래스를 장착하지 않은 경우
//				int data = fr.read();
//				if(data == -1) break;
//				fw.write(data);
//				fw.flush();
				
				// 필터 클래스를 장착한 경우 (Buffer)
				String line = br.readLine();
				// readLine() : 개행 문자를 만날 때 까지 1라인을 읽어들인다.
				// 단, 개행문자까지 읽는건 아니기 때문에 개행에 대한 처리 필요!
				if(line == null) break;
//				bw.write(line + "\r\n"); // "\n" "\r"
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
			long eTime = System.nanoTime(); // 종료 시간
			System.out.println("복사 완료.");
			System.out.println("소요 시간 : " + (eTime - sTime) + "ns");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// TODO
		}
	}
}










