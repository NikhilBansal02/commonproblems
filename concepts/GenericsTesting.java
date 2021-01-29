package concepts;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	
	abstract void draw();
}

class Rectangle extends Shape{

	@Override
	public void draw() {
		
		System.out.println("Rectangle");
	}
}

class Circle extends Shape{

	@Override
	public void draw() {
		
		System.out.println("Circle");
	}
}

public class GenericsTesting {
	
	public static void drawShapes(List<? extends Shape> list) {
		
		list.stream()
		.forEach(s -> s.draw());
		
	}

	public static void main(String[] args) {
		
		List<Rectangle> l1 = new ArrayList<Rectangle>();
		l1.add(new Rectangle());
		drawShapes(l1);
		
		List<Circle> l2 = new ArrayList<Circle>();
		l2.add(new Circle());
		drawShapes(l2);
		
	}

}
















