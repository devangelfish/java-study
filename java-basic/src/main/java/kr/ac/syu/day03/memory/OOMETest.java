package kr.ac.syu.day03.memory;

public class OOMETest { // OutOfMemoryError
	public static void main(String[] args) {
		System.out.println("main start...");
		// Memory Leak (메모리 누수)
		//	: 필요하지 않은 메모리를 점유하는 상태
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
		//	: 더 이상 객체를 생성할 수 없는 경우 발생
		//	1. 메모리 크기 확인 (증강)
		//	2. 메모리 누수 확인
		//	3. ...		
		/*
		 *  메모리 관련 메소드
		 *  	totalMemory()	: JVM의 모든 메모리 크기 반환
		 *  	freeMemory()	: JVM내의 사용 가능한 메모리 크기 반환
		 *  	maxMemory()		: JVM이 사용한 가장 큰 메모리 크기 반환
		 */
		int cnt = 100;
		for(int i = 1; i <= 15; i++) {
			System.out.println("Free Memory : "
							+ Runtime.getRuntime().freeMemory() / (1024 * 1024)
							+ "MB");
			// 객체 생성 크기를 점차 늘리면서, 강제로 터트려보자!
			@SuppressWarnings("unused")
			int[] iArr = new int[cnt];
			cnt = cnt * 5;
		}
	}
}











 