package prob2;

public class StringUtil {
    public static String concatenate(String[] str){
        String result = "";
        for(String concatenatedStr : str) {
        	result += concatenatedStr;
        }
        return result;
    }

    public static void main(String args[])  {         
        String[] strArr = {"SuperMan", "BatMan", "SpiderMan"}; 
        String resultStr = concatenate(strArr);
        System.out.println("결과 문자열 : " + resultStr); 
    }
}

