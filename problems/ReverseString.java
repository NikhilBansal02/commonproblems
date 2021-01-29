package problems;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "nikhil";
		
		reverse1(str);
		reverse2(str);
	}

	private static void reverse1(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	
	private static void reverse2(String str) {
		
		String result="";
		int size= str.length();
		
		for(int i=size-1;i>=0;i--) {
			result = result +str.charAt(i);
		}
		System.out.println(result);
		
	}
}
