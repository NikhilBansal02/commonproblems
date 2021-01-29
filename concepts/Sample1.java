package concepts;

public class Sample1 {
	
	int x;
	{
		x = 10;
	}
	
	public static void main(String[] args) {
		
		Sample1 s = new Sample1();
		System.out.println(s.x);
	}

}
//The flow is like first  default constructor is called then from there block will call which sets x to 10 then control will be transferred 
//back to default constructor.
