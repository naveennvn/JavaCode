package com.comparator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Example extends Dog {
	

	   public static void main(String args[]) {
	      // Takes a list o Dog objects
	      List<Dog> list = new ArrayList<>();
	      list.add(new Dog("Shaggy", 3));
	      list.add(new Dog("Shaggy", 2));
	      list.add(new Dog("Lacy", 2));
	      list.add(new Dog("Roger", 10));
	      list.add(new Dog("abe", 40));
	      list.add(new Dog("abc", 15));
	      list.add(new Dog("ace", 25));

	     // System.out.println("Before Sort:"+list.toString());
	      
	      Collections.sort(list); // Sorts the array list using comparable method from DogClass
	     // Collections.reverse(list);//Sort the array list in reverse order
	     // System.out.print(list);
	      list.stream().sorted(new Comparator<Dog>() {
	    	  public int compare(Dog d,Dog d1) {
	    		  return d.getDogAge()-d1.getDogAge();
	    	  }
	      }).forEach(d->System.out.println("name: "+d.getDogName()+" age: "+d.getDogAge()));
	      
	      Comparator<Dog> ageCompare=Comparator.comparing(Dog::getDogAge);
	      list.stream().sorted(ageCompare).forEach(d->System.out.println(d.getDogName()+":"+d.getDogAge()));
	      
	      
	      for(Dog a: list)   // printing the sorted list of ages
	         System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
	   }
	}