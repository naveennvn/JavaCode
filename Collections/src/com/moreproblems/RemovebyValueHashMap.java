package com.moreproblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemovebyValueHashMap {

	public static void removeHashMapbasedonValue()
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
		  
        // enter data into hashmap 
        hm.put("Math", 98); 
        hm.put("Data Structure", 85); 
        hm.put("Database", 91); 
        hm.put("Java", 95); 
        hm.put("Operating System", 79); 
        hm.put("Networking", 80); 
        
      Iterator<Map.Entry<String, Integer>> iterator=hm.entrySet().iterator();
      while(iterator.hasNext())
      {
    	  Map.Entry<String, Integer> entry=iterator.next();
    	  if(entry.getValue()==79)
    		  iterator.remove();
      }
      System.out.println(hm);

	}

	public static void main(String[] args) {
		removeHashMapbasedonValue();

	}

}
