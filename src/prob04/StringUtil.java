package prob04;

public class StringUtil {
	
	
    public static String concatenate(String[] str) {
    	
    	String resultStr=null;
    	
    	for(int i=0;i<str.length;i++)
    	{
    		resultStr+=str[i];
    	}
    	
		return resultStr;
    	//문자열을 결합하여 리턴 하는 메소드 구현
    }
}
