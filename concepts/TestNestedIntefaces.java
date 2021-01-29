package concepts;

interface outerOne{
	
	void showMethod();
	
	interface innerOne {
		void showMethod();
	}
	
}
  
public class TestNestedIntefaces  implements outerOne.innerOne{

	public static void main(String[] args) {
		
		outerOne.innerOne inst = new TestNestedIntefaces();
		inst.showMethod();
	}

	@Override
	public void showMethod() {
		System.out.println("Show of Nested Interface");
	}

}
