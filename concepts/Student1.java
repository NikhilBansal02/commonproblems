package concepts;

import java.util.Comparator;

public class Student1 implements Comparable<Student1>{
	
	private String name;
	private int Id;
	private int age;
	
	public Student1(String name, int Id, int age) {
		super();
		this.name = name;
		this.Id = Id;
		this.age = age;
	}

	@Override
	public int compareTo(Student1 student) {
		
		return this.Id - student.Id;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", Id=" + Id + ", age=" + age + "]";
	}
	
	public static Comparator<Student1> NameComparator = new Comparator<Student1>(){

		@Override
		public int compare(Student1 s1, Student1 s2) {
			
			return s1.name.compareTo(s2.name);
		}
		
	};
	
	public static Comparator<Student1> IdComparator = new Comparator<Student1>(){

		@Override
		public int compare(Student1 s1, Student1 s2) {
			
			return s1.Id - s2.Id;
		}
	};
	
	public static Comparator<Student1> AgeComparator = new Comparator<Student1>(){

		@Override
		public int compare(Student1 s1, Student1 s2) {
			
			return s1.age - s2.age;
		}
	};
	
 }
