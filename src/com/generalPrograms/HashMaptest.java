package com.generalPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class HashMaptest
{

	public void findduplicates(String word2)
	{
		String word=word2;
		char[] data2=word.toCharArray();
		HashMap<Character,Integer> data=new HashMap<Character,Integer>();
			for(char c:data2)
			{
				if(data.containsKey(c))
					{
							data.put(c,data.get(c)+1);
					}
				else{data.put(c,1);}	
			}
			System.out.println(data);
			
			for(Character key:data.keySet())
			{
					System.out.println(key +","+ data.get(key)+"times");
			}
		
	}
	
	public void reverseofString(String s)
	{
	   String rev = null;
	   char [] a=s.toCharArray();
	   System.out.println("reverse of string is ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
	}
	public void randomnumber(int random)
	{
		Random rnd = new Random();
		int n = 100000 + rnd.nextInt(900000);
		System.out.println("\n"+n);
	}
	public String getRandomNumber(int digCount) {
		Random rnd = new Random();
	    StringBuilder sb = new StringBuilder(digCount);
	    for(int i=0; i < digCount; i++)
	       {
	        sb.append((char)('0'+rnd.nextInt(10)));
	        System.out.println("\n random number is getting build:"+sb);
	       }
	       // System.out.println("\n"+sb);
	    return sb.toString();
	}
	
	public String checkPrimenumber(int input)
	{
		for(int i=2;i<Math.sqrt(input);i++)
		{
			if(input%i==0)
				return "not a prime: "+input;
			else
				return "prime:"+input;
			
		}
		return "no data";
	}
	
	public int findPolyndrome(int inputvalue)
	{
		int rev=0;
		int input=inputvalue;
		for (int i = 0; i <= input; i++)
		{
			int r = input % 10;
			input = input / 10;
			rev = rev * 10 + r;
			i = 0;
		}
		System.out.println("revere of a number,before:"+inputvalue+"after reverse: "+rev);
		return rev;
	}
	
	public static void main(String[] args) 
	{
		HashMaptest t=new HashMaptest();
		t.reverseofString("NaveeN");
		t.getRandomNumber(3);
		t.findPolyndrome(3214568);
		System.out.println("\n"+t.checkPrimenumber(5));
		
		//t.findduplicates("NaveeN");
		
	}
}

