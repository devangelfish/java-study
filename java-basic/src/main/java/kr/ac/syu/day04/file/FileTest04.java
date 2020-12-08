package kr.ac.syu.day04.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 	Serialize
 *  ����ȭ	: ���Ͽ� ���� �۾�
 *  ������ȭ	: ���Ϸκ��� �д� �۾�
 */
@SuppressWarnings("serial")
class Member implements Serializable { // Member�� ���Ͽ� �� �� �ֵ��� ����ȭ!
	private String name;
	private int age;
	private transient String addr; // ����ȭ���� ����!
	// �ڵ� �ϼ� : alt + shfit + s ���� ��, ���ϴ� Generate ����!
	
	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}

public class FileTest04 {
	public static void write() {
		Member member = new Member("ī��", 7, "������");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("sample/object.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(member);
			
			System.out.println("���� �Ϸ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO
		}
	}
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("sample/object.txt");
			ois = new ObjectInputStream(fis);
			
			Member member = (Member)ois.readObject();
			
			System.out.println("�б� �Ϸ�.");
			System.out.println(member.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO
		}
	}
 	public static void main(String[] args) {
		write();
		read();
	}
}














