package com.generalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* various declarations and loop through of collections*/
public class VariousWaysCollections {

	public static void stringindifferentways() {
		String s = "SearchinG characTerS and substrinG in a StRing in JaVa";
		StringBuilder sb = new StringBuilder("Searching characters and substring in a String in Java");
		System.out.println("Printing from charArray");
		for (char c : s.toCharArray()) {
			System.out.print(c);

		}
		System.out.println("Printing using CharAt");

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));

		}
		System.out.println();
		for (int i = 0; i < s.length() - 1; i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				if (Character.isUpperCase(s.charAt(i + 1))) {
					sb.insert(i, "_");

				}
			}
		}
		System.out.println("Before: " + s);
		System.out.println("After: " + sb.toString());
	}
	public static void listIndifferentways() {
		// List is interface and ArrayList is a class
				List<String> stringList = new ArrayList<String>(Arrays.asList("one", "way", "for", "llist"));
				Collections.sort(stringList);
				// Iterating over list using for loop
				for (int i = 0; i < stringList.size(); i++) {
					System.out.println(stringList.get(i));
					// stringList.remove(i); to remove based on index from List
				}
				List<Integer> numbers = new ArrayList<Integer>();
				for (int i = 0; i < 10; i++) {
					numbers.add(i);
				}
				System.out.println(numbers.toString());
				// Iterating over list using iterator
				Iterator<Integer> it = numbers.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				List<String> liststream = Stream.of("foo", "bar").collect(Collectors.toList());
				List<Map.Entry<Character, Integer>> newlist = new LinkedList();

	}
	public static void hashMapIndifferentways() {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		//Map is the interface and HashMap is the class
		//Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
				
		//Loop using Map.Entry
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
		}
		//Loop through keys
		for(String str:map.keySet()) {System.out.println("key:"+str);}
		//Loop through values 
		for(Integer value:map.values()){System.out.println("value:"+value);}
		
		//Loop using while with iterator 
		Iterator<Map.Entry<String,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String,Integer> entry=itr.next();
			System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
		}
	}
	
	
	public static void main(String[] args) {
	
	
	}	
}