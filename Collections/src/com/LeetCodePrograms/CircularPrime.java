package com.LeetCodePrograms;

import java.util.HashMap;
import java.util.Map;
//Print all circular Prime Numbers 
public class CircularPrime {
	// Function to check if the number is circular  prime or not.
	public static boolean isPrime(int num)
	{
		if(num==1||num==2)
			return true;
		if(num%2==0||num%3==0)
			return false;
		for(int j=5;j<num/2;j++)
			if(num%j==0)
			return false;
		return true;
	}
	public static boolean checkforCircularN(int num)
	{
		int count=0,temp=num,N=num;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		while(isPrime(num))
		{
		int rem=num%10;
		int div=num/10;
		num=(int)(Math.pow(10, count-1)*rem)+div;
		if(num==N)
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		for(int i=1;i<1000;i++)
			if(checkforCircularN(i))
				System.out.println("Circular Prime is:"+i);
	
	}
}