package com.LeetCodePrograms;

import java.util.HashMap;
import java.util.Map;

public class RotateArrayNTimes {
	//Rotate array number of times same can be used for Integer or Char Array
	
	public static void main(String[] args) {
		char[] input="Hello here it is".toCharArray();
		int Ntimes=2;
		for(int i=0;i<Ntimes;i++)
		{
			char first=input[0];
			for(int j=0;j<input.length-1;j++)
				input[j]=input[j+1];
			input[input.length-1]=first;
		}
		for(char a:input)
			System.out.print(a);
		
	}
}