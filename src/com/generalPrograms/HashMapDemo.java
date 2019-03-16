package com.generalPrograms;
import java.util.*;
public class HashMapDemo {

   public static void main(String[] args) {
      HashMap<Integer,String> m1 = new HashMap<Integer,String>(); 
      m1.put(8,"Zara");
      m1.put(9,"Mahnaz");
      m1.put(10,"Ayan");
      m1.put(11,"Daisy");
      m1.remove(10);

      for(Map.Entry m:m1.entrySet()){  
    	   System.out.println(m.getKey()+" "+m.getValue()); 
      }
      for(int key:m1.keySet())
      {
    	  System.out.println(m1.get(key));
      }
   }
}