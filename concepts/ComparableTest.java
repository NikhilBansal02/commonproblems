package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		
		List<Student1> list = new ArrayList<Student1>();
		
		list.add(new Student1("Nikhil",10,26));
		list.add(new Student1("varun",5,30));
		list.add(new Student1("vaibhav",2,25));
		
//		System.out.println("Sorted on Id using compareTo() of comparable Interface");
//		Collections.sort(list);
//		list.forEach( s -> System.out.println(s));
		
		sortStudentOnProperty("name",list);	
		sortStudentOnProperty("age",list);
		sortStudentOnProperty("id",list);	
	
	}
	
	public static void sortStudentOnProperty(String property, List<Student1> list) {
		
		if(property.equals("name")) {
			System.out.println("Sorted on Name using Comparator");
			Collections.sort(list, Student1.NameComparator);
			list.forEach(s -> System.out.println(s));
			
		}else if(property.equals("age")){
			
			System.out.println("Sorted on Age using Comparator");
			Collections.sort(list, Student1.AgeComparator);
			list.forEach(s -> System.out.println(s));
			
		}else if(property.equals("id")){
			
			System.out.println("Sorted on Id using Comparator");
			Collections.sort(list, Student1.IdComparator);
			list.forEach(s -> System.out.println(s));
			
		}else {
			System.out.println("Cannot Sort");
		}
		
	}	

}