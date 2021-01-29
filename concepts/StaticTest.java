package concepts;

class A11{
	
	// static block 
    static { 
        System.out.println("Static block initialized.-A11"); 
       
    } 
    
    {
        System.out.println("Initializer block initialized.-A11"); 
    }
}
class B11 extends A11{
	
	 String test = "test";
	
	// static block 
    static { 
    	
        System.out.println("Static block initialized.-B11"); 
       
    } 
    
    {
        System.out.println("Initializer block initialized.-B11"); 
    }
    B11(){
    	System.out.println("Cons - B11");
    }
    static void m1() {
    	
            System.out.println("B11 - m1"); 
           
    }
    void m2() {
    	m1();
    }
}

public class StaticTest {
	
	static String t1="test";

    public static void main(String[] args) 
    { 
    
    	A11 a1;
    	B11 b1;
    	//a1 = new A11();
    	b1 = new B11();
       System.out.println("from main"); 
       B11.m1();
       b1.m1();
       b1.m2();
       System.out.println(b1.test);
       
      // System.out.println("Value of a : "+a); 
      // System.out.println("Value of	 b : "+b); 
    }

}
