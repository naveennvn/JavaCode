package com.StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongPolinSubstr {
	/*length of substring without repeating chars 
	uses sliding window concept by keeping one pointer at start 
	and another will increase the size of the window*/ 
	public static int expandfromMiddle(String s,int left,int right)
	{
		if(s==null || s.length()<1) return 0;
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
		{
			left--;
			right++;
		}
		return right-left-1;
	}
	public static void main(String[] args) {
		String s="racecar";
		String s1 =null,s2=null;
		int start=0,end=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			int len1=expandfromMiddle(s,i,i);
			int len2=expandfromMiddle(s,i,i+1);
			int len=Math.max(len1, len2);
			if(len>end-start)
			{
				start=i-((len-1)/2);
				end=i+(len/2);
			}
		}
		
		System.out.print(s.substring(start,end+1));
	}
}