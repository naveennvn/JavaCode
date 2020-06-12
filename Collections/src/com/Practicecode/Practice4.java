package com.Practicecode;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {
	//Rotate array number of times
	
	public static void main(String[] args) {
		int [] input= {2,3,4,5,6,7,8,9,10,11};
		int times=2;
		for(int i=0;i<times;i++)
		{
			int first=input[0];
			for(int j=0;j<input.length-1;j++)
				input[j]=input[j+1];
			input[input.length-1]=first;
		}
		for(int a:input)
			System.out.print(a);
		
	}
}