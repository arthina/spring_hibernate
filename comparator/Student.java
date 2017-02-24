package comparator;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
	private String name;
	private long id=0;
	private double gpa=0.0;
	public Student(String name, long id, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	public String getName() {
		return this.name;
	}
	public long getId() {
		return this.id;
	}
	public double getGpa() {
		return this.gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}
	public static void main(String[] args){
		Set<Student> s=new TreeSet<>();
		s.add(new Student("raj",323232,8.9));
		s.add(new Student("kamal",5464,6.9));
		s.add(new Student("ravi",326532,5.9));
		for(Student s1 :s) System.out.println(s1);
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return (int)(o.id-this.id);
	}
	

}
