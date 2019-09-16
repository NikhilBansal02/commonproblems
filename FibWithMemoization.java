//This is created using memoization technique.
//We store already calculated values in array and fetch them during run time.
//This prevents to recursively calculate values already calculated.
//Memoization technique is used to reduce Time Complexity of O(2^N) to O(N)

package commonproblems;

public class FibWithMemoization {
	
	static void allFib(int n){
		
		int memo[] = new int[n+1];
		for(int i = 0 ; i<=n;i++) {
			
			System.out.print(fib(i,memo) +" ");
		}
		
	}
	
	static int fib(int i , int memo[]) {
		
		if(i<=0) 
			return 0;
		else if(i==1) 
			return 1;
		else if(memo[i]>0) 
			return memo[i];
		
		memo[i] = fib(i-1,memo) + fib(i-2, memo);
		
		return memo[i];
		
	}

	public static void main(String[] args) {
		
		allFib(6);
		

	}

}
