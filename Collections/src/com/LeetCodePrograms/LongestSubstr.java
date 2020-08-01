package com.LeetCodePrograms;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*It is about finding the longest substring without having any duplicates from a string 
 * it uses sliding window [a,b] using HashSet and other collections*/

public class LongestSubstr {
	public static void findLengthofSubstr()
	{
		String s = "pipuqlwwkuabcdef";
		int a_pointer=0,b_pointer=0,ans=0;
		int n=s.length();
		HashSet<Character> set=new HashSet<>();
		while(a_pointer<n&&b_pointer<n)
		{
			if(!set.contains(s.charAt(b_pointer))) {
				set.add(s.charAt(b_pointer++));
				ans=Math.max(ans,b_pointer-a_pointer);
			}else {
				set.remove(s.charAt(a_pointer++));
			}
		}
		
		System.out.println(set.toString()+"and the length is:"+ans);
		

	}
	public static void lengthOfLongestSubstring() {
		String s = "pipuqlwwkuabcdef";
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
        System.out.println(map);
        
        //To sort the HashMap based on value using comparator 
        map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(x->System.out.print(x.getKey()));
        //To collect the sorted function to a HashMap follow like this Stream follows like this  
        /*
         * 1.Stream
         * 2.Operation[Range,Sort,Filter,map]
         * 3.Terminatefunc[Collection,foreach]
        */
        Map<Character,Integer> sortedMap=map.entrySet().stream().sorted(Entry.comparingByValue())
        		.collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);
       //Entry also a type like integer string List<Entry<String,Integer>> list=new LinkedList(); 
        
    }
	public static void main(String[] args) {
		findLengthofSubstr();
		lengthOfLongestSubstring();
	}
}
