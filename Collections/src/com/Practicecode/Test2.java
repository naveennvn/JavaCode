package com.Practicecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		List<Test1> t = Arrays.asList( new Test1("John", "Wilson"), new Test1("Scott", "Anderson"), new Test1("Bruce", "Kent"));
		//String s=t.stream().reduce(" ",(acc, p) -> acc +p.firstname+" "+ p.lastname,String::concat);
		t.stream().filter(x->x.lastname.contains("Kent")).map(x->x.lastname).forEach(System.out::println);

		List<String> people = Arrays.asList("Al", "ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		people.stream().filter(x -> x.startsWith("a")).forEach(System.out::println);

		List<String> s3=Arrays.asList("Hi","Hello","","hello","","","");
		List<String> s2=new ArrayList();
		s2.add("");
		s2.add("HI");
		s2.add("IH");
		s2.remove(1);
		System.out.println(s2);
	}

}
