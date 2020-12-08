package kr.ac.syu.day04.collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  Queue
 *  	FIFO (First In First Out)
 *  	LILO (Last In Last Out)
 *  	������ �ӽ� ����
 *  		: ��û �� ���� ���� ������ ���� ������.
 *  
 *  public void offer(Element data)		: ������ ����
 *  public Element poll()				: ���� ��ȯ (����)
 *  public Element peek()				: ���� ���� (Ȯ��)
 *  public boolean isEmpty()			: ����ִ��� üũ
 */

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("ī��");
		queue.offer("��");
		queue.offer("�Ƹ�");
		
		System.out.println(queue.peek());	// ī��
		System.out.println(queue.poll());	// ī�� 
		System.out.println(queue.poll());	// ��
		
		queue.offer("����");
		
		while(queue.isEmpty() == false)
			System.out.println(queue.poll()); // �Ƹ�, ����
		
		// ���� ť�� ���� -> ����ִ� ����
		System.out.println(queue.poll()); // null
		System.out.println(queue.peek()); // null
	}
}












