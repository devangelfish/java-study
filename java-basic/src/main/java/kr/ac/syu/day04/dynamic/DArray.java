package kr.ac.syu.day04.dynamic;

// 제네릭 동적 배열
public class DArray<datatype> {
	Object[] buffer;	// Object 배열, 저장소
	int capacity;		// 저장소의 크기
	int usage;			// 보관 개수
	
	public DArray(int capacity) {
		this.capacity = capacity;
		buffer = new Object[capacity];
		usage = 0;
	}
	
	public boolean isFull() {
		return capacity == usage;
		// 저장소의 크기와 보관 개수가 같다면, 꽉 찼다면,
		// true 반환! 아니라면 false 반환!
	}
	
	public boolean add(datatype value) {
		if(isFull() /*== true*/) { // isFull()의 결과는 boolean
			capacity++; // 저장소 크기 증가
			Object[] temp = buffer; // 현재 공간의 주소를 임시 저장
			buffer = new Object[capacity]; // 증가된 크기만큼 새로운 배열 생성
			System.arraycopy(temp, 0, buffer, 0, usage); // 임시로 담아둔 temp를 복사
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
