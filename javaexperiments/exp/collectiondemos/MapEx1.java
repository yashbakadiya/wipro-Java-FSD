package exp.collectiondemos;

import java.util.*;

public class MapEx1 {

	public static void main(String args[]) {
		MapEx1 demo = new MapEx1();
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "three");
		map.put(4, "four");
		map.put(1, "ONE");
		map.put(1, "one");
		map.put(2, "two");
		

		String valueForKey1 = map.get(1);
		System.out.println("value for key1=" + valueForKey1);
		System.out.println("displaying all entries");
		demo.display(map);

		System.out.println("displaying all values");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println("value=" + value);
		}
		
		map.remove(2);
	    System.out.println("displaying entries after removing entry with key 2"); 
		demo.display(map);
		
	}

	void display(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			String value = map.get(key);
			System.out.println("key=" + key + " value=" + value);
		}
	}

}
