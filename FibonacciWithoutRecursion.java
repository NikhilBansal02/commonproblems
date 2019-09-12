//This program prints the Fibonacci series up to a given count.

package commonproblems;

public class FibonacciWithoutRecursion {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int count = 20;
		System.out.print(a+" "+b);
		int next;
		
		for (int i = 1;i<=count;i++) {
			next = a+b;
			   a = b;
			   b = next;
			System.out.print(" "+next);
		}
	}

}
