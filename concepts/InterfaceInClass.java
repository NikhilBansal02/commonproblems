package concepts;

class AB{
	
	interface message{
		
		void msg();
	}
}

public class InterfaceInClass implements AB.message{

	public static void main(String[] args) {
	AB.message inst = new InterfaceInClass();
	
	inst.msg();
	
	}

	@Override
	public void msg() {
		System.out.println("Message");
	}

}
