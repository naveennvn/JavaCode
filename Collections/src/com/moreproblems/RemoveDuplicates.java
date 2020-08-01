package com.moreproblems;

import java.util.*;
import java.util.stream.Collectors;

/*THis Program Aims to remove the duplicates from the numbres given in a List*/

public class RemoveDuplicates {
	public static void removeDuplicates()
	{
		List<Integer> num=Arrays.asList(1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8);
		List<Integer>num2=num.stream().distinct().collect(Collectors.toList());
		System.out.println(num2);

	}

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<String>(Arrays.asList("1212","3454","4534","4046","2022","3035"));
		List<String> outList =new ArrayList<String>();
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
