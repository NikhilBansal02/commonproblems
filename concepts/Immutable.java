package concepts;

import java.util.HashMap;

final class ImmutableTest{
	
	void Test() {
		System.out.println("Test");
	}
	
}
public class Immutable {

	public static void main(String[] args) {
		
		ImmutableTest t1 = new ImmutableTest();
		t1.Test();
		
		Object o1 = new Object();
		o1.hashCode();
	}
}
