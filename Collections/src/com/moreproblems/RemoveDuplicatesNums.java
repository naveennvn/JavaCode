/**
 * 
 */
package com.moreproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Naveen
 *
 */
public class RemoveDuplicatesNums {

	/*
	 * removes duplicates inside every number 
	 */
	public static void main(String[] args) {
		List<String> stringList=Arrays.asList("1212","3454","4534","4046","2022","3035");
		List<String> outList =new ArrayList();
		HashSet<Integer> set=new HashSet();
		HashSet<Character> set2=new HashSet<Character>();
		for(String s:stringList)
		{
			set2.clear();
			for(char c:s.toCharArray())
			{
				set2.add(c);
			}
			System.out.println(set2.toString().replace(",",""));
			outList.add(set2.toString().replace(",","").trim());
		}
		System.out.println(outList);
		

	}

}
