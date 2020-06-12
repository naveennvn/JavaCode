package com.moreproblems;

import java.util.HashMap;
import java.util.Map;

public class findMaxValueHashMap {
	public static  void findMaxKeyfromHashMap(Map<String,Integer> map)
	{
		 Map.Entry<String, Integer> entrywithMaxKey=null;
		    for(Map.Entry<String, Integer> currententry:map.entrySet())
		    {
		    	if(entrywithMaxKey==null)
		    		entrywithMaxKey=currententry;
		    	if(currententry.getKey().compareTo(entrywithMaxKey.getKey())>0)
		    	{
		    		entrywithMaxKey=currententry;
		    	}
		    }
		    System.out.println(map);
		    System.out.print("Max key is "+entrywithMaxKey);

	}

	public static void findMaxValuefromHashMap(Map<String,Integer> map)
	{
		Map.Entry<String, Integer> entrywithMaxValue=null;
	    for(Map.Entry<String, Integer> currententry:map.entrySet())
	    {
	    	if(entrywithMaxValue==null)
	    		entrywithMaxValue=currententry;
	    	if(currententry.getValue().compareTo(entrywithMaxValue.getValue())>0)
	    	{
	    		entrywithMaxValue=currententry;
	    	}
	    }
	    System.out.println(map);
	    System.out.print("Max value is "+entrywithMaxValue);

	}
	public static void main(String[] args) {
			Map<String, Integer> map = new HashMap<>(); 
		    map.put("ABC", 10); 
		    map.put("DEF", 30); 
		    map.put("XYZ", 20);
		    findMaxValuefromHashMap(map);
		    findMaxKeyfromHashMap(map);

	}

}
