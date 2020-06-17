package com.StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LenLongSubstr {
	/*length of substring without repeating chars 
	uses sliding window concept by keeping one ptr at start 
	and another will increase the size of the window*/ 
	
	public static void main(String[] args) {
		String s="abcabbc";
		int a_pointer=0,b_pointer=0,max=0;
		HashSet<Character> set=new HashSet();
		while(b_pointer<s.length())
		{
			if(!set.contains(s.charAt(b_pointer)))
			{
				set.add(s.charAt(b_pointer));
				b_pointer++;
				max=Math.max(set.size(), max);
			}
			else
			{
				set.remove(s.charAt(a_pointer));
				a_pointer++;
			}
		}
		System.out.println(set+"size:"+max);

	}
}