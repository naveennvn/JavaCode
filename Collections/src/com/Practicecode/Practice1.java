package com.Practicecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice1 {

	public static void main(String[] args) {
		String s="SearchinG characTerS and substrinG in a StRing in JaVa";
		StringBuilder sb=new StringBuilder("Searching characters and substring in a String in Java");
		System.out.println("Printing from charArray");
		for(char c:s.toCharArray())
		{
			System.out.print(c);
			
		}
		System.out.println("Printing using CharAt");
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			
		}
		System.out.println();
		for(int i=0;i<s.length()-1;i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				if(Character.isUpperCase(s.charAt(i+1)))
				{
					sb.insert(i,"_");
				}
			}
		}
		System.out.println("Before: "+ s);
		System.out.println("After: "+sb.toString());
	}	
}
