package concepts;

import concepts.TailCalls;;
public class FactorialTailRecursion {

	public static void main(String[] args) {
		System.out.println(FactorialTailRecursion.factorialTailRec(1, 6).invoke());
	}
	
	 public static TailCall factorialTailRec(final int factorial, final int number) {
	        if (number == 1)
	            return TailCalls.done(factorial);
	        else
	            return TailCalls.call(() -> factorialTailRec(factorial * number, number - 1));
	    }

}
