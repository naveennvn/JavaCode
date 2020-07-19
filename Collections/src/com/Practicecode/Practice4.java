package com.Practicecode;

import java.util.*;
import java.util.Arrays;

/**/

public class Practice4 {
	public static void main(String[] args) {
		String s="pipuryqlwwkuw",longstr="";
		int strlen=0;
		Map<Character,Integer> map=new HashMap();
		
		for(int i=0;i<s.length();i++)
		{
			if(!map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),i+1);
			}
			else
			{
				i=map.get(s.charAt(i));
				map.clear();
			}
			if(map.size()>strlen)
			{
				strlen=map.size();
				longstr=map.keySet().toString();
				
			}
		}
	System.out.println(longstr);
	}
	
}
