package com.generalPrograms;
import java.util.*;

public class SetDemo {
	
	public static void printcharset(String input)
	{
		Set<Character> charset=new HashSet<Character>();
		for(char c:input.toCharArray())
		      charset.add(c);
		      for(char c:charset)
		    	  System.out.print(c);
	}
	
	public static void SortArray(int count[])
	{
		Set<Integer> set = new HashSet<Integer>();
		try {
	         for(int i = 0; i < 5; i++) {
	            set.add(count[i]);
	         }
	         set.add(-1);
	         System.out.println(set);
	         System.out.println(set.contains(34));
	        for(Integer iterater:set)
	        {
	        	System.out.println("values from set are:"+iterater);
	        }

	         TreeSet sortedSet = new TreeSet<Integer>(set);
	         System.out.println("The sorted list is from TreeSet:"+sortedSet);
	         

	         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
	         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
	      }
	      catch(Exception e) {e.printStackTrace();}
	   }
	
	
	  public static void main(String args[]) { 
	      int count[] = {34, 22,10,60,30,22};
	        printcharset("Naveen");
	        SortArray(count);
	      ArrayList<Integer> list=new ArrayList<Integer>();
	      //list.addAll(count);
	  }
}	  
	  
	

