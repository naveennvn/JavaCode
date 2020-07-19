package com.Practicecode;

import java.util.*;

/**/

public class Practice4_copy3 {
	
	public static void main(String[] args) {
		//pipuqlwwkuabcdef
		String s="pipuqlwwwwwww",longstr="";
		int b_pointer=0,max=0,length=0;
		List<Character> set=new ArrayList();
		while(b_pointer<s.length())
		{
			if(!set.contains(s.charAt(b_pointer)))
			{
				set.add(s.charAt(b_pointer));
				b_pointer++;
			
			}
			else 
			{
				if(length<set.size())
				{
					longstr="";
					length=set.size();
					longstr=set.toString();
				}
				while(set.contains(s.charAt(b_pointer)))
				{
				set.remove(0);
				System.out.println(set);
				}
			}
		}
		if(length<set.size()) {
			longstr="";
			length=set.size();
			longstr=set.toString();
		}
		System.out.println(longstr);	
	}
}


