package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	/* public static int singleNumber(int[] nums) {
		 
		 int times[] = new int[10];
		 int size = nums.length;
		 
		 for(int i=0;i<size;i++) {
			 times[nums[i]]++;
		 }
		 for(int i=0;i<10;i++) {
			 if(times[i] == 1) {
				 return i;
			 }
		 }
		 return 0;
	 // This is not working with negative values.       
	  }*/
	/*public static int singleNumber(int[] nums) {
		 // This will work with negative values. 
		
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		 int size = nums.length;
		 int val=0;
		 
		 for(int i=0;i<size;i++) {
			 hmap.put(nums[i],0);
		 }
		 
		 for(int i=0;i<size;i++) {
			 val = hmap.get(nums[i])+1;
			 hmap.put(nums[i],val);
		 }

		 for(int i=0;i<size;i++) {
			 if(hmap.get(nums[i]) == 1) {
				 return nums[i];
			 }
		 }
		 return 0;
	        
	  }*/
	
	public static int singleNumber(int nums[]) {
		int a = 0;
	    for (int i : nums) {
	      a ^= i;
	    }
	    return a;
	    
	    //this works for negative values, take O(n) times and no extra space as per the  requirement
	}
	public static void main(String[] args) {
		int a[] = {2,2,1,3,3,1,5};
		
		System.out.println("Element that appear only once is :" + singleNumber(a));
	}

}
