//Printing fibonacci series using recursion by number of elements in series.
package commonproblems;

public class FibonacciWithRecursion {
	
	static int a = 0;
	static int b = 1;
	static int count= 20;
	static int next;
	
	public static void fib(int count) {
		
		if(count>0) {
			next = a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
		fib(--count);
		}
	}
	
	

	public static void main(String[] args) {
		System.out.print(a+" "+b);
		fib(count-2);
	}

}
