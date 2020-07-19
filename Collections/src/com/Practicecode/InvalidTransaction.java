package com.Practicecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class InvalidTransaction {
//["alice,20,800,mtv","bob,50,1200,mtv","alice,55,800,india"]
	static List<String> output=new ArrayList();
	public static void verifyTransaction(List<String> trans2)
	{
		for(int i=0;i<trans2.size();i++)
		{
			if(Integer.parseInt(trans2.get(i).split(",")[1])<60) {
				if(!output.contains(trans2.get(i)))
					output.add(trans2.get(i));
			}
		}
	}
	public static void main(String[] args) {
		
		List<String> trans=new ArrayList(Arrays.asList("alice,20,800,mtv","bob,65,200,mtv","alice,55,800,india"));	
		
		for(String s:trans)
		{
			int amount=Integer.parseInt(s.split(",")[2]);
			if(amount<1000)
			{
			List<String> trans2=trans.stream().filter(x->x.contains(s.split(",")[0])).collect(Collectors.toList());
			verifyTransaction(trans2);
			}
			else 
			output.add(s);
				
		}
		System.out.println(output);
	}

}
