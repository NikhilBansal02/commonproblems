package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumOccurringCharacter {

	public static void main(String[] args) {
		
		String str = "aaab";
		
		//Below two does same function.
		mostFrequentChar(str); // O(n^2)
		mostFreq(str); //O(n)

	}

	private static void mostFrequentChar(String str) {
			
		char ch[] = str.toCharArray();
		int size = ch.length;
		
		Set<Character> charSet = new HashSet<Character>();
		
		int max=0;
		char result =' ';
		int count = 0;
		
		for(int i=0;i<size;i++) {
			if(!charSet.contains(ch[i])){
				count = 0;
				for(int j=i;j<size;j++) {
					if(ch[i] ==ch[j]) {
						count++;
					}
				}
				if(count > max) {
					max = count;
					result = ch[i];
				}
				charSet.add(ch[i]);
				
			}
			
		}
		System.out.println(result);
		
	}
	
	private static void mostFreq(String str) {
		
		int max = 0;
		char result=' ';
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		
		for(char c : ch) {
			hmap.put(c, 0);
		}
		
		for(char c : ch) {
			
			int temp = hmap.get(c)!=null ? hmap.put(c, hmap.get(c) + 1) : hmap.put(c, 1); 
		}
		
		for(Map.Entry entry : hmap.entrySet() ) {
			int value = (Integer) entry.getValue();
			if(value > max ) {
				max = value;
				result = (char) entry.getKey();
			}
		}
		System.out.println(result);
		
	}

}
