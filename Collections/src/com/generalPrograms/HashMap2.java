package com.generalPrograms;

import java.util.*;

public class HashMap2 
{
	public void HashMapUsage()
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>(); 
		map1.put(1,"Jordan");
		map1.put(2,"Abraham");
		map1.put(3,"Neelesh");
		map1.put(4,"Akhil");
		map1.put(5, "Chris");
		map1.put(6,"Dave");
		
		for(Map.Entry m:map1.entrySet())
		{
			System.out.println("Key: "+m.getKey()+" Value:"+m.getValue());
		}
	}
	
	public void FindUniqueChar(String input)
	{
		HashMap<Character,Integer> unique=new HashMap<Character,Integer>();
		for(char c:input.toCharArray())
		{
			if(unique.containsKey(c))
			{
				unique.put(c,unique.get(c)+1);
			}
			else{unique.put(c,1);};
			
		}
		
		System.out.println(unique);
	}
	public static void main(String[] args) 
	{
		HashMap2 h1=new HashMap2();
		h1.HashMapUsage();
		h1.FindUniqueChar("Naveen");
	}


}
