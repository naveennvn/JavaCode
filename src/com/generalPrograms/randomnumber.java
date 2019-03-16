package com.generalPrograms;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class randomnumber {

	public static void main(String[] args) {
		int n=5,number;
		Random r=new Random(System.currentTimeMillis());
		int number1=10000+r.nextInt(10000);
		System.out.println(10000+r.nextInt(10000));
		
		method1();
	}
	
	public static void method1()
	{
		int max=9000,numbersNeeded=1000;
		if (max < numbersNeeded)
		{
		    throw new IllegalArgumentException("Can't ask for more numbers than are available");
		}
		Random rng = new Random(); // Ideally just create one instance globally
		// Note: use LinkedHashSet to maintain insertion order
		Set<Integer> generated = new LinkedHashSet<Integer>();
		while (generated.size() < numbersNeeded)
		{
		    Integer next = rng.nextInt(max) + 1;
		    // As we're adding to a set, this will automatically do a containment check
		    generated.add(next);
		}
		System.out.println(generated);
	}
	
}
