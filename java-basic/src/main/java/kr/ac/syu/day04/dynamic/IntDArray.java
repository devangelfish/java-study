package kr.ac.syu.day04.dynamic;

// 정수형 동적 배열
public class IntDArray {
	int[] buffer;	// 저장소
	int capacity;	// 저장소의 크기
	int usage;		// 보관 개수
	
	public IntDArray(int capacity) {
		this.capacity = capacity;
		buffer = new int[capacity];
		usage = 0;
	}
	
	public boolean isFull() {
		return capacity == usage;
		// 저장소의 크기와 보관 개수가 같다면, 꽉 찼다면,
		// true 반환! 아니라면 false 반환!
	}
	
	public boolean add(int value) {
		if(isFull() /*== true*/) { // isFull()의 결과는 boolean
			/*
			 *  Q. 동적 배열 만들기
			 *  	다음 코드는 데이터가 꽉  찼을 때 더 이상 추가하지 않는다. (false 반환)
			 *  	수정 통해, 데이터가 꽉 차있는 상태라도 데이터가 들어갈 수 있도록
			 *  	동적으로 저장 공간을 늘리는 동적 배열을 만드세요.
			 */
			return false; // 저장 실패
			// TODO
		}
		buffer[usage] = value;
		usage++;
		return true; // 저장 성공
	}
	
	// 배열 정보 출력
	public void arrInfo() {
		// 문자열 관련 메소드
		//	format(...) : printf와 같이 문서 양식에 맞게 데이터 매칭 후 문자열로 반환
		//		-> printf()는 문자열로 화면에 출력!
		//		-> format()은 문자열로 반환만!
		String str = String.format("저장소 크기 : %d, 보관 개수 : %d", capacity, usage);
		System.out.println(str);
		for(int i = 0; i < usage; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println("");
	}
}
















