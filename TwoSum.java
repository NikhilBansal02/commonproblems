//Bruteforce method O(n^2)

package leetcode;

public class TwoSum {
	
	public static int[] twoSum(int a[],int target) {
		
		int len = a.length;
		int indices[] = new int[2];
		
		for(int i = 0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if((a[i]+a[j]) == target ) {
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		return indices;
	}

	public static void main(String[] args) {
		
		int a[] = {3,4,5,10,0,0};
		int target = 0;
		
		int indices[] = twoSum(a,target);
		
		if(indices[0]==0 && indices[1]==0) {
			System.out.println("No Indices are present to form target of "+target);
		}else {
			System.out.println("Indices are : "+indices[0] +" "+indices[1]);
		}
	}
}
