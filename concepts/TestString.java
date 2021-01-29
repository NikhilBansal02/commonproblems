package concepts;

public class TestString {

	public static void main(String[] args) {
		
		
		String s1 = "nikhil";
		
		String s2 = new String("nikhil");
	
		
		if(s1.intern() == s2.intern())
			System.out.println("true");
		else
			System.out.println("false");
	}

}
