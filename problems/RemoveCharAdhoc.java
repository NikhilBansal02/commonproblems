package problems;

import java.util.ArrayList;
import java.util.List;

//How to remove characters from the first String which are present in the second String?
public class RemoveCharAdhoc {

	public static void main(String[] args) {
		
		String first = "India is great";
		String second = "in";
		
		removeChars(first,second);
	}

	private static void removeChars(String first, String second) {
		char ch1[] = first.toLowerCase().toCharArray();
		char ch2[] = second.toLowerCase().toCharArray();
		StringBuilder result = new StringBuilder();
		
		List<Character> list = new ArrayList<>();
		
		for(char c : ch1) {
			list.add(c);
		}
		for(Character c: ch2) {
			list.remove(c);
		}
		
		for(char c : list) {
			result.append(c);
		}
		System.out.println(result);
		
	}

}
