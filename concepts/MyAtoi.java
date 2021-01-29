package concepts;
//Some issues are there
public class MyAtoi {
	
	 public static int myAtoi(String s) {
		 
		 String str = s.trim();
		 if(str.length() == 0)
			return 0;
		 
		  char[] ch = str.toCharArray();
		  
		  int value=0;
		  int sign =1;
		  int i=0;
		  if(ch[0] == '+' || ch[0] == '-') {
			  sign = (ch[0] == '-') ? -1 : 1;
			  i++;
		  }
			 
		  
		  
		  for(int j=i;j<ch.length;j++) {
			  
			  if(value > Integer.MAX_VALUE/10)
				  return Integer.MAX_VALUE;
			  	
			  if(ch[j] >='0' && ch[j]<='9') {
				  	value = value*10 + (ch[j] - '0');
			  }else {
				  break;
			  }
		  }
		  
		  return value * sign;
		  
	 }
	 
	public static void main(String[] args) {

		String str = "words";
		
		System.out.println("Result is :"+myAtoi(str));
		
//		String str1 = "  ";
//		System.out.println(str1.length());
//		String str2 = str1.trim();
//		System.out.println(str2.length());
	}

}
