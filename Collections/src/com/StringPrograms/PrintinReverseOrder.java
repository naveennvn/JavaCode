package com.StringPrograms;

public class PrintinReverseOrder {
	//Print a sentence with all words in reverse order
	//tnirP lla eht sdrow ni esrever redro
public static String printInReverse(String input)
{
	String s="";
	for(int i=input.length()-1;i>=0;i--)
	{
		s=s+input.charAt(i);
	}
	return s;
}

public static void main(String[] args) {
		String input="Print all the words in reverse order";
		System.out.println("Before reverse:"+input);
		StringBuilder sb=new StringBuilder();
		for(String str:input.split(" "))
		{
			String result=printInReverse(str);
			sb.append(result+" ");
		}	
		System.out.println("After reverse :"+sb.toString());
	}
}