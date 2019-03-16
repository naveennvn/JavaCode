package com.generalPrograms;

public class PrintPattern {
	
	public static void printPattern()
	{
			int input=9;
		
		for(int i=1;i<input;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
				//System.out.print("|");
			}
			System.out.println();
		}
	}

	public static void printString()
	{
		String s="https://www.google.com/search?";
		String s2="OracleDBA";
		System.out.println(s.replaceAll("[://.?]","").trim());
		StringBuilder sb=new StringBuilder("OracleDBA");
		
		char a[]=s2.toCharArray();
		
		for(int i=0;i<s2.length();i++)
		{
			if(Character.isLowerCase(s2.charAt(i)))
			{
				if(Character.isUpperCase(s2.charAt(i+1)))
				{
					sb.insert(i+1,"_");
				}
			}
		}
		
		System.out.println("from first loop "+sb.toString());
	}
	
	public static void main(String[] args) {
			
			//printPattern();
		
		int n=3,a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<a;k++)
			System.out.print("*");
			
			a=a+2;
			System.out.println();
		}
		
		

		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			
//			if(Character.isLowerCase(a[i]))
//			{
//				if(Character.isUpperCase(a[i+1]))
//				{
//					sb.insert(i+1,"_");
//				}
//			}
//		}
//		System.out.println(sb);
//		
		// TODO Auto-generated method stub

	}

}
