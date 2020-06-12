package com.StringPrograms;
//Replace car with bike without using replace method
public class StringReplace {
	
public static String StringReplace(String original,String toReplace,String tobeReplaced)
{
	for(;;)
	{
		int i=original.indexOf(toReplace);
		if(i==-1)
			break;
		original=original.substring(0,i)+tobeReplaced+original.substring(i+toReplace.length());
	}
	return original;

}
	public static void main(String[] args) {
	
		String original="This car is my car"; 
		String toReplace="car";
		String tobeReplaced="bike";
		System.out.println("Before replace:"+original);
		original=StringReplace(original,toReplace,tobeReplaced);
		System.out.println("After Replacement:"+original);
	}

}
