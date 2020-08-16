package com.moreproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingStringtoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="naveen";
		//Sort using stream in reverse order
		
    	//List<Character> arr=s.chars()
    			//.mapToObj(e -> (char)e) 
    	List<Character> chars =s.chars().mapToObj(e->(char)e).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    	System.out.println(chars);
    	Character[] arr=new Character[] {'a'};
    	char[] ab=new char[] {'a','b'};
    	List<String> tokens=Arrays.stream(s.split("\\s+")).collect(Collectors.toList());
    	//System.out.println(tokens);

	}

}
