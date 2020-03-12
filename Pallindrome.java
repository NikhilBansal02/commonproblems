package leetcode;

public class Pallindrome {
	
	 public static boolean isPalindrome(int x) {
		 
		 int num = x;
		 int temp=0;
		 
		 while(x>0) {
			 temp = temp *10 + (x%10);
			 x = x/10;
		 }
		 return temp == num;
	 }
	 
	public static void main(String[] args) {
		
		int num = -12345;
		System.out.println("Entered number "+num + " is pallindrome :"+isPalindrome(num));
		
	}

}
