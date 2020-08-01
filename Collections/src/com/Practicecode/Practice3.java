package com.Practicecode;

import java.util.*;
import java.util.stream.Collectors;

public class Practice3 {
	public static void removeDuplicates() {
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8));
		List<Integer> num2 = num.stream().distinct().collect(Collectors.toList());
		System.out.println(num2);

	}

	public static void removeHashMapbasedonValue() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);

		Iterator<Map.Entry<String, Integer>> iterator = hm.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			if (entry.getValue() == 79)
				iterator.remove();
		}
		System.out.println(hm);
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

	public static void main(String[] args) {

	}

}
