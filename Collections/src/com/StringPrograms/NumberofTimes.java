package com.StringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberofTimes {
	public static void printMorethanNKtimes(int[]input,int n,int k)
	{
		int size=n/k;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<input.length;i++)
		{
			if(map.containsKey(input[i]))
			{
				map.put(input[i],map.get(input[i])+1);
			}
			else
			{
				map.put(input[i],1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>size)
			{
				System.out.println("More than"+size+"times :"+entry.getKey());
			}
		}

	}
public static void main(String[] args) {
	//Given an array of size n and a number k, find all elements that appear more than n/k times
		int []input=new int[]{3, 1, 2, 2, 1, 2, 3, 3};
		printMorethanNKtimes(input,input.length,4);
			
	}
}