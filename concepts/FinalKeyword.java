package concepts;

public class FinalKeyword {

	public static void main(String[] args) {

		final StringBuilder sb = new StringBuilder("Hello - ");
		System.out.println(sb);
		sb.append("StringBuilder");
		System.out.println(sb);
		System.out.println();
		
		final StringBuffer sb1 = new StringBuffer("Hello - ");
		System.out.println(sb1);
		sb1.append("StringBuffer");
		System.out.println(sb1);
		System.out.println();
		
		/*final*/ String sb2 = new String("Hello - ");
		System.out.println(sb2);
		sb2 = sb2 +" String";
		System.out.println(sb2);
		System.out.println();
		
	}

}
