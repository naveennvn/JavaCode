package com.Practicecode;

import java.util.*;

/**/

public class Practice4_copy2 {
	public static void main(String[] args) {
	
		String s="pipuryqlwwkuw",longstr="";
		int strlen=0;
		Map<Integer,Character> map=new HashMap();
		
		for(int i=0;i<s.length();i++)
		{
			if(!map.containsValue(s.charAt(i)))
			{
				map.put(i,s.charAt(i));
			}
			else
			{
				i=i-1;
				map.clear();
			}
			if(map.size()>strlen)
			{
				strlen=map.size();
				longstr=map.values().toString();
				
			}
		}
	System.out.println(longstr);
			}
	
}
