/*Given an array of size n, find the majority element. The majority element is the element that appears more than n/2  times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2*/

package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
        
		int freq = nums.length/2;
		
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int num : nums) {
			if(hmap.containsKey(num)) {
				hmap.put(num,hmap.get(num) + 1);
			}else {
				hmap.put(num,1);
			}
			
		}
		for(int num : nums) {
			if(hmap.get(num) > freq)
				return num;
		}
 		return 0;
    }
	public static void main(String[] args) {
		int a[] = {2,2,1,1,1,2,2};
		System.out.println("Major Element is :"+majorityElement(a));
	}

}
	