package concepts;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {

		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
		int[] arr1 = {13, 7, 6, 45, 21, 9, 101, 102};
		Integer[] arr2 = {13, 7, 6, 45, 21, 9, 101, 102};

		Arrays.sort(arr); // Sorting full array

		System.out.println("Modified arr[] :"+
				Arrays.toString(arr));

		System.out.println("Original arr1[] :"+
				Arrays.toString(arr1));

		System.out.println("Sorting Sub-array");

		Arrays.sort(arr1, 1,5);// Sorting a Sub-array

		System.out.println("Modified arr1[] :"+
				Arrays.toString(arr1));
		
		Arrays.sort(arr2,Collections.reverseOrder());
		
		System.out.println("Array Sorted in Descending order : "+
				Arrays.toString(arr2));

	}

}
