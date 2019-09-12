package commonproblems;

public class nthTermInFibSeriesWithoutRecursion {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int count = 10;
		System.out.print(a+" "+b);
		int next=0;
		
		for (int i = 1;i<=count-2;i++) {
			next = a+b;
			   a = b;
			   b = next;
			   System.out.print(" "+next);
		}
		System.out.println();
		System.out.println(count+"th term in fibonacci series is "+next);
	}

}
