package com.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class longestsubstr {
	
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
	}
	public static void polyndrome(String s)
	{
		char[] a=s.toCharArray();
		
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=s.length()-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					i=i+1;
					j=j-1;
				}
			}
		}
		
		
		
		
	}
	public static void convert(String s,int rows)
	{
		for(int i=0;i<=s.length();i++)
		{
			
		}
	}
		public static void main(String[] args)
			{
			
			polyndrome("RAVAR");
			System.out.println(lengthOfLongestSubstring("Naveen"));
		    
		    }
		
	}


