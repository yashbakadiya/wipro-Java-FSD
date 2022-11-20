package exp.collectiondemos;

import java.util.*;

public class SetEx3 {

	public static void main(String[] args) {
		AgeComparator comparator=new AgeComparator();
		Set<Student> set = new TreeSet<>(comparator);
		Student student2 = new Student(2, "shivam", 22);
		set.add(student2);
		Student student1 = new Student(1, "repul", 21);
		set.add(student1);
		Student student3 = new Student(3, "anurag", 23);
		set.add(student3);
		for (Student iterated : set) {
			System.out.println("iterated=" + iterated.getName() + " " + iterated.getAge());
		}
	}

}
