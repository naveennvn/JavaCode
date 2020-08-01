package com.LeetCodePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

public class LenLongSubstr {
	public static void main(String[] args) {
		String s = "pipuqlwwkuabcdef", longstr = "";
		int b_pointer = 0, length = 0;
		List<Character> list = new ArrayList<>();
		while (b_pointer < s.length())
		{
			if (!list.contains(s.charAt(b_pointer)))
			{
				list.add(s.charAt(b_pointer));
				b_pointer++;
			}
			else
			{
				if (length < list.size())
				{
					length=list.size();
					longstr = formNewString(list);
				}
				System.out.println("SubString: "+longstr+" >> Length: "+length);
				while (list.contains(s.charAt(b_pointer)))
					list.remove(0);
			}
		}
		if (length < list.size())
		{
			length=list.size();
			longstr = formNewString(list);
		}
		System.out.println("\nLongest SubString of "+s.toUpperCase()+" is\n"+longstr.toUpperCase()+" with Length: "+length);
	}
	public static String formNewString(List<Character> chars) {
		String newStr = "";
		for (char char1: chars)
			newStr = newStr.concat(char1 + "");
		return newStr;
	}
  
  
  
}