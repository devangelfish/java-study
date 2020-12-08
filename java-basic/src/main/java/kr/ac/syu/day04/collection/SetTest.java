package kr.ac.syu.day04.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 *  Set �ֿ� �޼ҵ�
 *  	add			: ������ �Է�
 *  	remove		: Ư�� ������ ����
 *  	clear		: ��� ������ ����
 *  	size		: ���� ��ü�� ũ�� ��ȯ
 *  	contains	: Ư�� ����� ���� ����
 *  	isEmpty		: ����ִ���
 *  	toArray		: �迭�� ��ȯ
 *  	iterator	: �ݺ���
 *  
 *  Set���� ��� ��Ҹ� ����ϴ� 3����
 *  	- foreach
 *  	- iterator
 *  	- toArray
 */

public class SetTest {
	public static void main(String[] args) {
		// #������ #��� �� ���� �ؽ��±׶�� ���� ����Ѵ�!
		//	-> �ؽ�(Hash)�� �ش� �����͸� ������ ã������ Ȱ���ϴ� ����!
		Set<String> set = new HashSet<>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		// 1. �ߺ��� ������� �ʴ´�.
		System.out.println("�Է� ���� : " + set.add("two"));
		System.out.println("�Է� ���� : " + set.add("six"));
		
		// 2. ���� ������ ����.
		// foreach ��ȸ
		for(String s : set)
			System.out.print(s + " ");
		System.out.println("");
		
		set = new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		// iterator ��ȸ
		// ������ ����
		Iterator<String> ite = set.iterator();
		while(ite.hasNext())
			System.out.print(ite.next() + " ");
		System.out.println("");
		
		// toArray ��ȸ
		Object[] obj = set.toArray();
		System.out.println(Arrays.toString(obj));
		
		// String[] Ÿ������ ���� ����ȯ�ص� ���� �߻�!
		//	-> ClassCastException
//		String[] strArr = (String[])set.toArray();
//		System.out.println(Arrays.toString(strArr));
	}
}










