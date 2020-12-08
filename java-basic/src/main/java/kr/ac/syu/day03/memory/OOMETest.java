package kr.ac.syu.day03.memory;

public class OOMETest { // OutOfMemoryError
	public static void main(String[] args) {
		System.out.println("main start...");
		// Memory Leak (�޸� ����)
		//	: �ʿ����� ���� �޸𸮸� �����ϴ� ����
		// OutOfMemoryError : GC Overhead limit exceeded
//		Random random = new Random();
//		Map<Integer, String> map = new HashMap<>();
//		int n = 1;
//		while(n > 0) {
//			int rValue = random.nextInt();
//			map.put(rValue, String.valueOf(rValue));
//		}
		
		// OutOfMemoryError : Requested array size exceeds VM limit
//		int[] arr = new int[Integer.MAX_VALUE];
		
		// OutOfMemoryError : Java heap space
		//	: �� �̻� ��ü�� ������ �� ���� ��� �߻�
		//	1. �޸� ũ�� Ȯ�� (����)
		//	2. �޸� ���� Ȯ��
		//	3. ...		
		/*
		 *  �޸� ���� �޼ҵ�
		 *  	totalMemory()	: JVM�� ��� �޸� ũ�� ��ȯ
		 *  	freeMemory()	: JVM���� ��� ������ �޸� ũ�� ��ȯ
		 *  	maxMemory()		: JVM�� ����� ���� ū �޸� ũ�� ��ȯ
		 */
		int cnt = 100;
		for(int i = 1; i <= 15; i++) {
			System.out.println("Free Memory : "
							+ Runtime.getRuntime().freeMemory() / (1024 * 1024)
							+ "MB");
			// ��ü ���� ũ�⸦ ���� �ø��鼭, ������ ��Ʈ������!
			@SuppressWarnings("unused")
			int[] iArr = new int[cnt];
			cnt = cnt * 5;
		}
	}
}











 