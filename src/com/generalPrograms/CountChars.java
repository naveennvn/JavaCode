package com.generalPrograms;

import java.util.HashMap;

public class CountChars {
	
	public static void main(String args[])
	{
		String s="swiss";
		HashMap<Character,Integer> entry=new HashMap();
		for(char c:s.toCharArray())
		{
			entry.put(c,entry.containsKey(c)?entry.get(c)+1:1);
			
		}
		System.out.println(entry);
	}

}

