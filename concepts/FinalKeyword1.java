package concepts;

/*final*/ class DemoTest { // Class Declared with Final cannot be extended
	
	void test() {
		System.out.println("test - DemoTest");
	}
}

class DemoTest1 {
	
	/*final*/ void test() { //final method cannot be overidden but can be overloaded
		System.out.println("test - DemoTest1");
	}
}

public class FinalKeyword1 extends DemoTest1{

	public static void main(String[] args) {
		
		
	}
	
	void test(int a) {
		System.out.println("test - FinalKeyword1");
	}

}
