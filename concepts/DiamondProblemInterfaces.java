package concepts;

interface test{
	
	public default void show() {
		System.out.println("Test show");
	}
}

interface test1 extends test{
	
	public default void show() {
		System.out.println("Test1 show");
	}
	
}

interface test2 extends test{
	public default void show() {
		System.out.println("Test2 show");
	}
}

public class DiamondProblemInterfaces  implements test2, test1{

	public static void main(String[] args) {
		
		DiamondProblemInterfaces d = new DiamondProblemInterfaces();
		d.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		test2.super.show();
		test1.super.show();
	}
}
