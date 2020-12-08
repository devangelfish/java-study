package kr.ac.syu.day04.collection;

import java.util.Stack;

/*
 *  Stack Class
 *  	LIFO (Last In First Out)
 *  	FILO (First In Last Out)
 *  	������ �ӽ� ����
 *  		: ���ۿ� �ӽ÷� �����͸� �����Ͽ��ٰ� �ʿ��� �� ���� ���.
 *  		: ��û �� ���� �ֱٿ� ������ �����ͺ��� ������.
 *  
 *  public void push(Element data)		: ���� ����
 *  public Element pop()				: ���� ��ȯ (����)
 *  public Element peek()				: ���� ���� (Ȯ��)
 *  public boolean empty(), isEmpty()	: ����ִ��� üũ
 *  public int search(Element data)		: Ư�� ������ ��ġ
 */

public class StackTest {
	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<Integer>();
//		Stack stack = new Stack();
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3); // 3
		stack.push(5); // 3, 5
		stack.push(7); // 3, 5, 7
		System.out.println(stack.pop()); // 7
		System.out.println(stack.pop()); // 5
		
		stack.push(9);
		stack.push(11);
		System.out.println(stack.peek());	// 11
		System.out.println(stack.pop());	// 11
		
		// ���� ������ ���� : 3, 9
		System.out.println(stack.search(3)); // 2��°
		System.out.println(stack.search(9)); // 1��°
		
		while(!stack.isEmpty()/* == false*/)
			System.out.println(stack.pop());
		
		// ���� ������ ���� -> ����ִ� ����
		System.out.println(stack.pop());
		// EmptyStackException �߻�!
	}
}












