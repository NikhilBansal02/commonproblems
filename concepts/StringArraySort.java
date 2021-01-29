package concepts;

import java.util.Arrays;
import java.util.Collections;

public class StringArraySort {

	public static void main(String[] args) {
		String[] str = {"nikhil","Nikhil","Bansal","a","A","z","Z","1"};
		
		System.out.println("Original array :"+Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("Modifed array :"+Arrays.toString(str));
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println("Descending orde: "+Arrays.toString(str));
		
	}

}
