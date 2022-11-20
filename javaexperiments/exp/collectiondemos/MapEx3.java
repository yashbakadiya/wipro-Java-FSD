package exp.collectiondemos;

import java.util.*;

public class MapEx3 {

	public static void main(String[] args) {
		IdKeyComparator comparator = new IdKeyComparator();
		Map<Integer, Student> map = new TreeMap<>(comparator);
		Student student2 = new Student(2, "shivam", 22);
		map.put(2, student2);
		Student student1 = new Student(1, "repul", 21);
		map.put(1, student1);
		Student student3 = new Student(3, "anurag", 23);
		map.put(3, student3);

		for (Integer key : map.keySet()) {
			Student student = map.get(key);
			System.out.println("key=" + key + " value=" + student.getName());
		}
	}

}
