package problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		String str = "aabcdefcdfgheh";//answer should be 'e'
		
		firstNonRepeatingChar(str);
	}

	private static void firstNonRepeatingChar(String str) {

		int count=1;
		int size = str.length();
		char temp=' ';
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		
		for(char c : ch) {
			map.put(c, 1);
		}
		
		for(int i=0;i<size;i++) {
			temp = str.charAt(i);
			count = 1;
			for(int j = i+1;j<size;j++) {
				if(str.charAt(j) == temp ) {
					count++;
				}
			}
			if(map.get(temp) == 1) {
				map.put(temp, count);
			}
			if(map.get(temp) == 1) {
				System.out.println("First Non-Repeating Letter is :" +temp);
				break;
			}
			
		}
	}

}
