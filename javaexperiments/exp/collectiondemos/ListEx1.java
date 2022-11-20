package exp.collectiondemos;

import java.util.*;

public class ListEx1 {

	public static void main(String[] args) {
		ListEx1 demo = new ListEx1();
		List<String> list1 = new ArrayList<>();
		list1.add("mango");
		list1.add("banana");
		list1.add("apple");
		list1.add("orange");
		String elementAtZeroIndex = list1.get(0);
		System.out.println("element at zero index=" + elementAtZeroIndex);
		int size = list1.size();
		System.out.println("list size befoe grapes add=" + size);
		list1.add(0, "grapes");
		size = list1.size();
		System.out.println("list size after grapes add=" + size);
		System.out.println("iterating on all elements on list");
		demo.display(list1);
		list1.remove("apple");
		System.out.println("iterating on all elements on list after removing apple");
		demo.display(list1);

		list1.remove(1);
		System.out.println("iterating on all elements on list after removing element at index 1");
		demo.display(list1);
	}

	void display(List<String> list) {
		for (String iterated : list) {
			System.out.println("iterated element=" + iterated);
		}

	}

}
