package com.moreproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void removeDuplicates()
	{
		List<Integer> num=Arrays.asList(1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8);
		List<Integer>num2=num.stream().distinct().collect(Collectors.toList());
		System.out.println(num2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
