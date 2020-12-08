package kr.ac.syu.day04.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  List �ֿ� �޼ҵ�
 *  	add				: ������ �Է�
 *  	addAll			: ���� ����� ���� ��ü�� ������ �Է�
 *  	get				: ������ ���� (Ȯ��)
 *  	size			: �Էµ� �������� ���� ��ȯ
 *  	remove			: Ư�� ������ ����
 *  	clear			: ��� ������ ����
 *  	contains		: Ư�� �������� ���� ���� ��ȯ
 *  	isEmpty			: ����ִ��� üũ
 *  
 *  iterator
 *  	�������̽� ��ü ��ȯ ���� (�ݺ���)
 *  	�÷��Ǹ��� ������ ���� �� ���� ����� �ٸ��� ������,
 *  	������ ������� ��ȸ�� �� �ִ� �ݺ��� ����.
 *  
 *  	hasNext()	: ���(Element)�� ���� ���� �Ǵ�
 *  	next()		: ��� ����
 *  	remove()	: ��� ���� (��ȯ)
 */

public class ListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
			
		// index ��ȸ
		for(int idx = 0; idx < list.size(); idx++) {
			System.out.print(list.get(idx) + " ");
		}
		System.out.println("");
		
		// foreach ��ȸ
		for(String data : list) {
			System.out.print(data + " ");
		}
		System.out.println("");
		
		System.out.println("����Ʈ ũ�� : " + list.size());
//		list.remove(2);
		System.out.println(list.remove("three")); // ���� ���� �� ���� ����
//		list.clear();
		System.out.println("����Ʈ ���� �� ũ�� : " + list.size());
		
		// iterator ��ȸ
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) { // ���� ��Ұ� �����Ѵٸ�,
			System.out.print(ite.next() + " ");
		}
		System.out.println("");
	}
}











