package problems;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		
		String str = "abcdbcdcddef";
		removeDuplicate(str);
		
	}
	
	private static void removeDuplicate(String str) {
		
		StringBuilder result = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		int size = str.length();
		
		for(int i = 0;i<size;i++) {
			set.add(str.charAt(i));
		}
		
		Iterator<Character> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(result);
			result.append(itr.next());
		}
		
		System.out.println(result);
	}
}
