package kr.ac.syu.day04.exception;

// ����� ���� ���� Ŭ����
@SuppressWarnings("serial")
public class OddException extends Exception {
	public OddException() {
		super();
	}
	public OddException(String msg) {
		super(msg); // �θ��� ������ ȣ��
		// "\ by zero" ó�� ���� �޽����� ����ϰڴ�.
	}
}
