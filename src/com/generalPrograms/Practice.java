package com.generalPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;

public class Practice {

	public static void HashMapUsage(String input)
	{
			HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		
		for(char c:input.toCharArray())
		{
			if(hash.containsKey(c))
			{
				hash.put(c,hash.get(c)+1);
			}
			else
			{
				hash.put(c,1);
			}
		}
		System.out.println(hash);
		for(Map.Entry m:hash.entrySet())
		{
			System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
		}

	}

	
	
	public static void main(String[] args) {
		//HashMapUsage("Naveen");
		String input="Naveen";
		Set<Character> unique=new HashSet<Character>();
		for(char c:input.toCharArray())
		{
			unique.add(c);
		}
		
		Iterator<Character> i=unique.iterator();
		while(i.hasNext())
		{
			System.out.println("value:"+i.next());
		}
		
		

	}

}
