package leetcode;

public class AddBinary {
	
	public static String addBinary(String a, String b) {
		
		int lenA = a.length();
		int lenB = b.length();
		
		String temp="";
		String carry="0";
		String result = "";
		int i = 0;
		int j = 0;
		
		for( i=lenA - 1, j=lenB-1;i>=0 && j>=0;i--,j--) {
			
			if(a.charAt(i) + b.charAt(j) == 98 && carry.equals("0")) {
				temp = "0";
				carry = "1";
			}
			else if(a.charAt(i) + b.charAt(j) == 98 && carry.equals("1")) {
				temp = "1";
				carry = "1";
			}
			else if(a.charAt(i) + b.charAt(j) == 97 && carry.equals("1")) {
				temp = "0";
				carry = "1"; 
			}
			
			else if(a.charAt(i) + b.charAt(j) == 97 && carry.equals("0")) {
				temp = "1";
				carry = "0"; 
			}
			
			else if(a.charAt(i) + b.charAt(j) == 96 && carry.equals("1")) {
				temp = "1";
				carry="0";
			}
			
			else if(a.charAt(i) + b.charAt(j) == 96 && carry.equals("0")) {
				temp = "0";
				carry="0";
			}
			result = temp + result; 
		}
		while(i!= -1) {
			
			if(a.charAt(i)+carry.charAt(0) == 98) {
				temp = "0";
				carry = "1";
			}
			else if(a.charAt(i)+carry.charAt(0) == 97) {
				temp = "1";
				carry = "0";
			}
			else if(a.charAt(i)+carry.charAt(0) == 96) {
				temp = "0";
				carry = "0";
			}
			i--;
			result = temp + result;
		}
		while(j!= -1) {
			
			if(b.charAt(j)+carry.charAt(0) == 98) {
				temp = "0";
				carry = "1";
			}
			else if(b.charAt(j)+carry.charAt(0) == 97) {
				temp = "1";
				carry = "0";
			}
			else if(b.charAt(j)+carry.charAt(0) == 96) {
				temp = "0";
				carry = "0";
			}
			j--;
			result = temp + result;
		}
		
		if(carry.equals("1"))
			return "1"+result;
		return result;
    }

	public static void main(String[] args) {

		String a =  "1010";
		String b =  "1011";
		//System.out.println(b.charAt(0));
		System.out.println("Sum is : "+addBinary(a, b));
	}

}
