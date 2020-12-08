package kr.ac.syu.day04.dynamic;

public class Program {
	public static void main(String[] args) {
		System.out.println("---------- Dynamic Array (int) ----------");
		IntDArray idarr = new IntDArray(3); // 정수 3개를 저장할 수 있는 배열 생성
		idarr.arrInfo();
		idarr.add(3);
		idarr.arrInfo();
		idarr.add(5);
		idarr.arrInfo();
		idarr.add(7);
		idarr.arrInfo();
		
		// 저장소 크기를 넘어서 데이터를 저장!
		//	-> 3의 크기로 고정되어있기 때문에 더 이상 저장이 불가능한 상태
		// Q. 다음 코드가 정상적으로 수행될 수 있도록 IntDArray.java의 add()를 구현하세요.
		idarr.add(9);
		idarr.arrInfo();
		idarr.add(11);
		idarr.arrInfo();
		
		// 제네릭 동적 배열 활용
		System.out.println("---------- Dynamic Array (Generic) ----------");
		DArray<Integer> darr = new DArray<Integer>(3);
		darr.arrInfo();
		darr.add(3);
		darr.arrInfo();
		darr.add(5);
		darr.arrInfo();
		darr.add(7);
		darr.arrInfo();
		darr.add(9);
		darr.arrInfo();
		darr.add(11);
		darr.arrInfo();
		
		DArray<String> darr2 = new DArray<String>(3);
		darr2.arrInfo();
		darr2.add("one");
		darr2.arrInfo();
		darr2.add("two");
		darr2.arrInfo();
		darr2.add("three");
		darr2.arrInfo();
		darr2.add("four");
		darr2.arrInfo();
		darr2.add("five");
		darr2.arrInfo();
	}
}
















