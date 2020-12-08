package kr.ac.syu.day03;

import java.io.FileNotFoundException; // checked exception
import java.io.FileReader;
import java.util.Scanner;

//import java.lang.ArrayIndexOutOfBoundsException;
// ArrayIndexOutOfBoudsException Ŭ������ java.lang�� ����!
//	-> import ���� �ʾƵ� ��� ����!
//	-> ��������� ���ִ� ���� ������ ����.

public class ExceptionTest {
	public static void main(String[] args) {
		/*
		 *  try~catch
		 *  
		 *  [����]
		 *  try {
		 *  	// ���ܰ� �߻��� �� �ִ� ����
		 *  } catch() {
		 *  	// ���ܰ� �߻��ϸ� ������ ����
		 *  }
		 */
		System.out.println("main start...");
		
		try {
			System.out.println(10/0); // ���� �߻� ����
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // ���ܿ� ���� ���� ���� ���
		}
//		System.out.println(10/0); // unchecked exception
		// ������ ���ܰ� �߻��ϴ� �����ε�, try~catch ���̵� ����!
		// ��, *���� ó���� ���� �� ���α׷��� ����� �̾��� �� �ִ�.
		
//		FileReader fr = new FileReader("abc.txt"); // checked exception
		// ���� ó���� �� �ʿ�!
		
//		try {
//			FileReader fr = new FileReader("abc.txt");
//		} catch (FileNotFoundException fnfe) {
//			fnfe.printStackTrace();
//		}
		
		/*
		 *  try~catch~finally
		 *  [����]
		 *  try {
		 *  } catch() {
		 *  } finally {
		 *  	// try ������ �����ϸ� ������ ����Ǵ� ����
		 *  	// ���ܰ� �߻��ϴ� ���� �ʴ� �������� ������ ����ȴ�!
		 *  }
		 */
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3/0); // ���� �߻�
			System.out.println(4);
		} catch(Exception e) {
			System.out.println(5);
		} finally {
			System.out.println(6);
		}
		System.out.println(7);
		
		// multi catch
		try {
			String str = "abc";
			System.out.println(str.charAt(1));
			
//			String[] strArr = { "A" };
//			System.out.println(strArr[1]); // (1). ���� �߻�
			
			@SuppressWarnings({ "unused", "resource" })
			FileReader fr = new FileReader("abc.txt"); // (2). ���� �߻�
		} catch (ArrayIndexOutOfBoundsException aie) { // (1). ���� ó��
			aie.printStackTrace();
		} catch (FileNotFoundException fnfe) { // (2). ���� ó��
			fnfe.printStackTrace();
		} catch (Exception e) { // Exception : ��� ���� Ŭ������ ���� �θ�!
			e.printStackTrace();
		}
		// ���� ����ϰų� ��� ���ܰ� �߻����� ������ ������,
		// �θ��� Exception Ŭ������ �޾��ְڴ�.
		// *��, ����� ���ܴ� ����ְ� �� �������� ���!
		
		// try( ... ) : try �������� ��� ��ü�� resource(�ڿ�) ����
//		Scanner s = new Scanner(System.in);
//		int input = s.nextInt();
//		s.close(); // resource ���� -> ��θ� �ݾƶ�!
//		System.out.println(input);
		try (
				Scanner s = new Scanner(System.in);
				// resource ���� (��� ����)
				//	-> ���� ����(close)�� ���� �ʾƵ� �˾Ƽ� ����!
		) {
			int input = s.nextInt();
			System.out.println(input);
		} catch(Exception e) {
			// TODO
		}
		
		System.out.println("main end...");
	}
}








