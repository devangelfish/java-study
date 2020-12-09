package object_practice;

public class Ex01 {
	public static void main(String[] args) {
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		
		System.out.println(s1 == s2);	//객체의 동일성
		System.out.println(s1.equals(s2));
		
		System.out.println("======================================");
		
		String s3 = "Hello";
		String s4 = "Hello";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}
}
