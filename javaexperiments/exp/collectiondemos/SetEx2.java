package exp.collectiondemos;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		SetEx2 demo = new SetEx2();
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		int size = fruits.size();
		System.out.println(" size =" + size);
	
		System.out.println("iterating on all elements");
		demo.display(fruits);
		fruits.remove("apple");
		System.out.println("iterating on all elements  after removing apple");
		demo.display(fruits);

	}

	void display(Set<String> set) {
		for (String iterated : set) {
			System.out.println("iterated element=" + iterated);
		}

	}

}
