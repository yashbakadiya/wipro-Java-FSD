package exp.collectiondemos;

import java.util.*;

public class ListEx3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student student2 = new Student(2, "shivam", 22);
		list.add(student2);
		Student student1 = new Student(1, "repul", 21);
		list.add(student1);
		Student student3 = new Student(3, "anurag", 23);
		list.add(student3);
		AgeComparator comparator = new AgeComparator();
		list.sort(comparator);
		for (Student iterated : list) {
			System.out.println("iterated=" + iterated.getName() + " " + iterated.getAge());
		}
	}

}
