package problems;

public class AreTwoStringsEqual {

	public static void main(String[] args) {
		
		String first = "ABCDEFA";
		String second = "FEDCBAA";
		
		checkifEqual(first,second);
		
	}

	private static void checkifEqual(String first, String second) {
		
		if(first.length()!= second.length()) {
			System.out.println("Not Equal");
			return;
		}
		
		StringBuilder str = new StringBuilder(first);
		str.reverse();
		String firstReversed = str.toString();
		
		if(firstReversed.equals(second)) {
			System.out.println(first +" or "+ firstReversed + " equals "+second);
		}else {
			System.out.println(first +" or "+ firstReversed + " unequals "+second);
		}
		
	}

}
