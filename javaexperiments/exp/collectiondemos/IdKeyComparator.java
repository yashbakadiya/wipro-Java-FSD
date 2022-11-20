package exp.collectiondemos;

import java.util.*;


public class IdKeyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer key1, Integer key2) {
		int compareVal=key1-key2;
		return compareVal;
	}

}
