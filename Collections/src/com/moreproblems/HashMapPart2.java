package com.moreproblems;

import java.util.*;
//Sort Hash Map values in Ascending Order

public class HashMapPart2 {

	public void sorttheHashMapbyValue(HashMap unsortMap) {

		List<Integer> mapKeys = new ArrayList<>(unsortMap.keySet());
		List<String> mapValues = new ArrayList<>(unsortMap.values());
		Collections.sort(mapKeys);
		Collections.sort(mapValues);
		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
		Iterator<String> StringIt = mapValues.iterator();
		while (StringIt.hasNext()) {
			String val = StringIt.next();
			Iterator<Integer> KeyIt = mapKeys.iterator();
			while (KeyIt.hasNext()) {
				Integer key = KeyIt.next();
				String comp1 = (String) unsortMap.get(key);
				String comp2 = val;
				if (comp1.equals(comp2)) {
					sortedMap.put(key, val);
					System.out.println(sortedMap);
					KeyIt.remove();
					break;
				}
			}
		}

		System.out.println("before Sorting:" + unsortMap);
		System.out.println("After Sorting:" + sortedMap);

	}

	public void sortHashMapbyValuenewWay(HashMap unsortMap) {
		unsortMap.entrySet()
				 .stream().sorted(Map.Entry.comparingByValue())
				 .forEach(System.out::println);

	}

	public static void main(String[] args) {
		HashMap<Integer, String> unsortMap = new HashMap<>();
		unsortMap.put(1, "froyo");
		unsortMap.put(2, "abby");
		unsortMap.put(3, "denver");
		unsortMap.put(4, "frost");
		unsortMap.put(5, "daisy");

		// Java 8 way simpler by streaming the Map.Entry values

	}

}
