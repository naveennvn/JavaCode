package com.generalPrograms;
import java.util.*;
import java.io.*;

public class duplicates 
{
	
	public static int countUniqueCharacters(String input) {
	    String buffer = "";
	    char[] chararray=input.toCharArray();
	    for (char c:chararray) {
	        if (!buffer.contains(String.valueOf(c))) {
	            buffer += c;	        }
	    }
	    return buffer.length();
	}
	
	boolean isPalindrome(String str) {    
	    int n = str.length();
	    for( int i = 0; i < n/2; i++ )
	        if (str.charAt(i) != str.charAt(n-i-1)) return false;
	    return true;    
	}
	
	public static String findUnique(String input)
	{
		Set<Character> characterSet = new HashSet<Character>();
		for(char c: input.toCharArray())
		{
			if(c != ' ')
			characterSet.add(c);
		}
		Iterator setitertr=characterSet.iterator();
		System.out.println("from iterator");
		while(setitertr.hasNext())
		{
			System.out.print(setitertr.next());
		}
		
		System.out.println(String.valueOf(characterSet).replace(","," "));
		System.out.println(characterSet.toString());
		return characterSet.toString();
	}

	public static void Stringfunctions(String input)
	{
		  System.out.println(input.replaceAll("(.*)Tutorial(.*)","Replaced"));
		   /*matches*/
	      System.out.print("Return Value :" );
	      System.out.println(input.matches("(.*)Tutorials(.*)"));
	      System.out.print("Return Value :" );
	      System.out.println(input.matches("Tutorials"));
	      System.out.print("Return Value :" );
	      System.out.println(input.matches("Welcome(.*)"));
		
	}
	public static void main(String args[])
	{
		String input="aaa bbb cccc";
		String Str = new String("Welcome to Tutorialspoint.com");
		findUnique("Naveen");
		Stringfunctions(Str);
		String[] array={"a","bb","cccc"};
		boolean value=Arrays.asList(array).contains("aa");
		char[] characters={'a','b'};
	}
}
