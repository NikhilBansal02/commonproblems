package concepts;

interface myInterface{
	
	public default  void show() {
		System.out.println("Interface default method");
	}
}

class myClass{
	
	public void show() {
		System.out.println("show from class");
	}
}
public class Inheritance1 extends myClass implements myInterface {

	public static void main(String[] args) {
		
		Inheritance1 inst = new Inheritance1();
		inst.show();
	}

}
