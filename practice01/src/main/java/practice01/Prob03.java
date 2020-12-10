package practice01;

public class Prob03 {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			String sNum = String.valueOf(i);
			String even = "";
			for(int j = 0; j < sNum.length(); j++) {			
				if(sNum.charAt(j) == '3' || sNum.charAt(j) == '6' || sNum.charAt(j) == '9') {
					even += "짝";
				} else
					continue;
			}
			if(!even.isEmpty())
				System.out.println(sNum + " " + even);
		}
	}
}
