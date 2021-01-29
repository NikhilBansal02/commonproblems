package concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student{
	
	int id;
	String name;
	
	Student(int id, String name){
		this.id= id;
		this.name= name;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (!(obj instanceof Student))
	        return false;
	    if (obj == this)
	        return true;
	    return this.getId() == ((Student) obj).getId();
	}
	
	@Override
	public int hashCode() {
	    return id;
	}
}

public class TestEqualsHashcode {

	public static void main(String[] args) {

		Student s1 = new Student(1,"alex");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		//Student s2 = new Student(1,"alex");
		//System.out.println(s1==s2);
		//System.out.println("alex1 hashcode = " + s1.hashCode());
        //System.out.println("alex2 hashcode = " + s2.hashCode());
		//System.out.println(s1.equals(s2));
		System.out.println("List size = " + list.size());
		System.out.println(list.contains(new Student(1,"Alex")));
		
		Student s2 = new Student(1,"alex");
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		
		System.out.println("HashSet size = " + set.size());
        System.out.println("HashSet contains Alex = " + set.contains(new Student(1, "Alex")));
        System.out.println(s1.equals(s2));
	}

}
