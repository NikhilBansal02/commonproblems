package problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		
		String str = "abcdbcdcdd";
		duplicateChar(str);
	}

	private static void duplicateChar(String str) {
		
		Map<Character, Integer> hmap = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		
		for(char c: ch) {
			hmap.put(c, 0);
		}
		
		for(char c:ch) {
			if(hmap.get(c) == 0) {
				hmap.put(c, 1);
			}else {
				hmap.put(c, hmap.get(c) +1);
			}
		}
		
		for(Map.Entry entry : hmap.entrySet()) {
			if((Integer) entry.getValue() > 1) {
				System.out.println( entry.getKey()+ " " + entry.getValue());
			}
		}
		
	}

}
