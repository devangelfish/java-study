package kr.ac.syu.day04.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 *  Map �ֿ� �޼ҵ�			K : Key Ÿ��, V : Value Ÿ��
 *  
 *  	- V put(K key, V value)		: ������ �Է�
 *  	- V get(K key)				: Ư�� key�� ���� value ����
 *  	- V remove(Object key)		: Ư�� key�� ���� Map ��� ����
 */

public class MapTest {
	public static void main(String[] args) {
		/*
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "a123");
		map.put("bbb", "b456");
		map.put("ccc", "c789");
		
		// key �����͵��� Set ����! -> keySet()
		//	-> key�� �ߺ��� ������� �ʴ´�.
		//	-> ������, ���� Ű�� ���� �Է��� ������Ʈ!
		map.put("ccc", "a123"); // value�� �ߺ� ����!
		System.out.println("aaa key�� ���� value : " + map.get("aaa"));
		System.out.println("bbb key�� ���� value : " + map.get("bbb"));
		System.out.println("ccc key�� ���� value : " + map.get("ccc"));
		
		// ��й�ȣ ����
		Scanner s = new Scanner(System.in);
		System.out.println("ID �Է� : ");
		String id = s.nextLine();
		
		// key
		if(map.containsKey(id)) { // �ش� key�� �����ϴ���
			System.out.println("ID : [" + id + "]");
		} else {
			System.out.println("�ش� ID�� �������� �ʽ��ϴ�.");
			System.out.println("[System] : ���α׷� ����");
			System.exit(0);
		}
		
		// value
		System.out.print("���� PASSWORD �Է� : ");
		String pw = s.nextLine();
		
		// �Ѿ�� key�� ���� password�� map ����� value�� ��ġ�ϴ���
		if(map.get(id).equals(pw)) {
			System.out.println("[System] : ��ġ�մϴ�.");
			System.out.print("������ PASSWORD �Է� : ");
			String newPw = s.nextLine();
			map.put(id, newPw); // ������Ʈ (����)
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			System.out.println("[System] : ���α׷� ����");
			System.exit(0); // ���α׷� ����
		}
		System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
		
		// keySet() : map ����� key���� Set���� ��ȯ
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next(); // ����
			System.out.println(key + " " + map.get(key));
//			System.out.println(keys.next() + " " + map.get(keys.next()));
			// next() : �����͸� ������!
			//	-> NoSuchElementException : �� �̻� ã�� ��Ұ� ����.
		}
		
		// entrySet()
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println("ID : " + e.getKey()
							 + ", PW : " + e.getValue());
		}
		*/
		
		// Hashtable -> ������ ����!
//		Map<String, Integer> myMap = new Hashtable<String, Integer>();
//		myMap.put("one", new Integer(1)); // boxing
//		myMap.put("two", 2); // auto boxing
//		myMap.put("three", 3);
//		Integer iVal = myMap.get("two");
//		System.out.println(iVal);
				
		// �����ϴ� �޼ҵ��� ����ȭ ����
//		Map<String, String> map = new Hashtable<String, String>();
		// null�� ������� �ʴ´�. ����ȭ�� �Ǿ�����.
//		Map<String, String> map = new HashMap<String, String>();
		// null ����Ѵ�. ����ȭ ���� ����.
		//	-> �ڿ� ������ ������, ��Ƽ ������ ȯ�濡�� ����!
		Map<String, String> map = new LinkedHashMap<String, String>();
		// LinkedHashMap -> ���� ������ �����ϰ� ���� ��!
		// *�����͸� �����ϱ� ���ؼ��� key�� Ȱ���ϱ� ������ ���� ������ ������ ����.
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", null);
		map.put("four", null);
		map.put("five", null);
		map.put("six", null);
		map.put("seven", null);
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " " + map.get(key));
		}
	}
}












