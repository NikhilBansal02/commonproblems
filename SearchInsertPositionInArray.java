package leetcode;

public class SearchInsertPositionInArray {

	public static int searchInsert(int[] nums, int target) {
		
		int size = nums.length;
		int i=0;
		for(i=0;i<size;i++) {
			if(target == nums[i] || target < nums[i]) {
				break;
			}
		}
		return i;
    }
	public static void main(String[] args) {
		
		int a[] = {1,3,5,6,8};
		System.out.println("Position is :"+searchInsert(a,9));

	}

}
