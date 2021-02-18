package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int rollNo, marks;
	String name;
	public Student(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Student s) {
		//return marks>s.marks?1:-1;
		//return name.length()>s.name.length()?1:-1;
		//return name.indexOf(0)>s.name.indexOf(0)?1:-1;
		return name.charAt(0)>s.name.charAt(0)?1:-1;
		
	}
	
}
public class ComparableEx {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(925,68,"Prasanna"));
		list.add(new Student(999,99,"Madhu"));
		list.add(new Student(925,88,"Arasann"));
		list.add(new Student(925,90,"Brasa"));
		list.add(new Student(925,66,"Dra"));
		list.add(new Student(925,75,"Cr"));
		Collections.sort(list);
		for(Student s:list)
			System.out.println(s);
	}

	
}
