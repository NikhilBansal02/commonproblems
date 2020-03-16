//13. Roman to Integer

package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
	
	 public static int romanToInt(String s) {
		 
		 int sum  = 0;
		 int temp = 0;
		 
		 Map<Character,Integer> hmap = new HashMap<Character,Integer>();
	     hmap.put('I', 1);
	     hmap.put('V', 5);
	     hmap.put('X', 10);
	     hmap.put('L', 50);
	     hmap.put('C', 100);
	     hmap.put('D', 500);
	     hmap.put('M', 1000);
	     
		int len = s.length();
		for(int i=0;i<len;i++) {
			if(s.charAt(i) == 'X') {
				if(i !=len-1) {
					if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')  {
						temp =hmap.get(s.charAt(i+1)) - 10;
						sum = sum+temp;
						i++;
					}
					else {
						sum = sum + hmap.get(s.charAt(i));
					}
				}else {
					sum = sum + hmap.get(s.charAt(i));
				}
				
			}
			else if(s.charAt(i) == 'I') {
					if(i !=len-1) {
						if(s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X') {
							temp =hmap.get(s.charAt(i+1)) - 1;
							sum = sum+temp;
							i++;
						}
						else {
							sum = sum + hmap.get(s.charAt(i));
						}
					}else {
							sum = sum + hmap.get(s.charAt(i));
						}
			}
			else if(s.charAt(i) == 'C') {
				if(i !=len-1) {
						if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M') {
							temp =hmap.get(s.charAt(i+1)) - 100;
							sum = sum+temp;
							i++;
						}
						else {
							sum = sum + hmap.get(s.charAt(i));
						}
				}else {
					sum = sum + hmap.get(s.charAt(i));
				}
			}
			else if(s.charAt(i) == 'V' || s.charAt(i) == 'L' || s.charAt(i) == 'D' || s.charAt(i) == 'M') {
				sum = sum + hmap.get(s.charAt(i));
			}
			else {
				System.out.println("Invalid Letter");
				return 0;
			}
		}
		
		 return sum;
	    }

	public static void main(String[] args) {
		
		String roman = "XIX";
		System.out.println("Integer Equivalent of roman "+roman +" number is :"+romanToInt(roman));
	}

}
