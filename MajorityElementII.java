//229. Majority Element II
/*Given an integer array of size n, find all elements that appear more than  n/3 times.

Note: The algorithm should run in linear time and in O(1) space.

Example 1:

Input: [3,2,3]
Output: [3]
Example 2:

Input: [1,1,1,3,3,2,2,2]
Output: [1,2]*/
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
	
	public static  List<Integer> majorityElement(int[] nums) {
		
		int majorityElement = nums.length/3;
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int num : nums) {
			if(hmap.containsKey(num)) {
				hmap.put(num,hmap.get(num) + 1);
			}else {
				hmap.put(num,1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			if(entry.getValue() > majorityElement)
				list.add(entry.getKey());
		}
		return list;
    }
	public static void main(String[] args) {
		
		int a[] = {1,1,1,3,3,2,2,2};
		
		System.out.println("Majority Elements are : "+majorityElement(a));
	}
}
	