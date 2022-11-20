package exp.collectiondemos;
import java.util.*;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	 int comparison=o1.getAge()-o2.getAge();
	 return comparison;

	}

}
