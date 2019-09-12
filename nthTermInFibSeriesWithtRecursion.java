//Finding nth term in Fibonacci series with Recursion.
package commonproblems;

public class nthTermInFibSeriesWithtRecursion {

	static int a = 0;
	static int b = 1;
	static int count= 10;
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
		System.out.println();
		System.out.println(count +"th term in fibonacci series is "+next);
	}

}
