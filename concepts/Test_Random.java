package concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test_Random {

	public static void main(String[] args) {

		 Integer a[] = {12,45,67,89,90};
		 List<Integer> list = Arrays.asList(a);
		 
		 Collections.sort(list);
		 int rank[] = new int[a.length];
		 for(int i=0,j=1;i<a.length;i++,j++) {
			 
			 rank[i] = j;
			// System.out.println(rank[i]);
		 }
		 
		 Double res = list.stream()
		 .filter(i -> i%2==0)
		 .mapToInt(Integer::intValue)
		 .average()
		 .getAsDouble();
		 
		 //System.out.println(res);
		 
		 
		 String  s1 = "abc";
		 String  s2 = new String("abc");
		// System.out.println(s2);
		//if())
			System.out.println(s1==s2.intern());
		
	}

}
