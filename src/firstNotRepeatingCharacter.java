import java.util.HashMap;

public class firstNotRepeatingCharacter {

	char firstNotRepeatingCharateravlue(String s) {
		HashMap<Character,Integer> char_count=new HashMap();
		for (int i=0 ;i<s.length();i++) {
			char c =s.charAt(i);
			if(char_count.containsKey(c)) {
				char_count.put(c,char_count.get(c)+1);
				
			}else {
				char_count.put(c,1);
				
			}
		}
		for(int i=0;i<s.length() ;i++) {
			char c=s.charAt(i);
			if(char_count.get(c)==1) return c;
		}
		return '-';
	}
	public static void main(String s) {
		
		firstNotRepeatingCharacter c= new firstNotRepeatingCharacter();
		char s1= c.firstNotRepeatingCharateravlue("aaabcccde");
		System.out.println("the first occurance is ----"+s1);
	}
    	
	
}
