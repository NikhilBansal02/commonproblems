package concepts;

interface testInterface{
	
	void abstract1();
	
	default void show() {
		
		System.out.println("Default Method - show testInterface");
	}
	
	static void display() {
		System.out.println("Static method  - display testInterface");
	}
	
}
public class DefaultAndStaticInInterface implements testInterface{
	
	public void abstract1() {
		
		System.out.println("Abstract Method");
		
	}

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		testInterface.super.show();
//	}
	
	static void display() {
		System.out.println("Static method  - display DefaultAndStaticInInterface");
	}

	public static void main(String[] args) {
		
			DefaultAndStaticInInterface t1 = new DefaultAndStaticInInterface();
		
			t1.abstract1();
			t1.show();
			testInterface.display();
			display();
	}

}
