package com.comparator;
import java.util.*;
//Here we are implementing both comparator and comparable class and using both of them for sorting in Example class*/
class Dog implements Comparator<Dog>, Comparable<Dog> {
   private String name;
   private int age;
   Dog() {
   }

   Dog(String n, int a) {
      name = n;
      age = a;
   }

   public String getDogName() {
      return name;
   }

   public int getDogAge() {
      return age;
   }

   // Overriding the compareTo method
   public int compareTo(Dog d) {
	   //System.out.println((this.name+""+d.name));
	   //System.out.println((this.name).compareTo(d.name));
      return (this.name).compareTo(d.name);
   }

   // Overriding the compare method to sort the age 
   public int compare(Dog d, Dog d1) {
	   //System.out.println(d.age +"fromCompare"+d1.age);
      return d.age - d1.age;
   }
}
