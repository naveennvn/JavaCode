package com.comparator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//Here it contains the actual usage of Comparator and comparable in a short method using lambda without implementing any further classes
//http://zetcode.com/java/comparablecomparator/
public class Employee {
		String firstName,lastName;
		Date joinDate;
		public Employee(String firstName, String lastName, Date joinDate) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.joinDate = joinDate;
	    }
	    public String toString() {
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        return firstName + " " + lastName + " " + dateFormat.format(joinDate);
	    }
	    public Date getJoinDate() {
			// TODO Auto-generated method stub
			return joinDate;
		}
	    public String getName()
	    {
	    	return firstName+lastName;
	    }

	public static void main(String args[]) throws ParseException {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		List<Employee> listEmployees = new ArrayList<>();
		Employee employee1 = new Employee("Tom", "Eagar", dateFormat.parse("2007-12-03"));
		Employee employee2 = new Employee("Tom", "Smith", dateFormat.parse("2005-06-20"));
		Employee employee3 = new Employee("Bill", "Joy", dateFormat.parse("2009-01-31"));
		Employee employee4 = new Employee("Bill", "Gates", dateFormat.parse("2005-05-12"));
		Employee employee5 = new Employee("Alice", "Wooden", dateFormat.parse("2009-01-22"));
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		listEmployees.add(employee3);
		listEmployees.add(employee4);
		listEmployees.add(employee5);
		System.out.println("Before: "+listEmployees);
		//Collections.sort(listEmployees, new EmployeeComparator());//this type of can be simplified with lambda expressions 
		//System.out.println("After sorting: ");
		
		//to sort ascending order using comparable
		listEmployees.sort((e1, e2) -> e2.getJoinDate().compareTo(e1.getJoinDate()));
		
		//to sort descending order here it uses comparable
		listEmployees.sort((e1, e2) -> e2.getJoinDate().compareTo(e1.getJoinDate()));
		System.out.println("sorting using Comparable: "+listEmployees);
		
		listEmployees.stream().sorted((e1, e2) -> e2.getJoinDate().compareTo(e1.getJoinDate())).forEach(System.out::println);
		
		/*Deals with ----------------Comparator---------------*/
		
		//to sort with multiple comparisons using comparator
		listEmployees.sort(Comparator.comparing(Employee::getJoinDate).thenComparing(Employee::getName));
		System.out.println("sorting using Comparater:"+listEmployees);
		
		//sorting using Comparator with ListSort and CollectionSort
		Comparator<Employee> compemployee=Comparator.comparing(Employee::getJoinDate);
		System.out.println("Before:"+listEmployees);
		//Here using the list sort with the comparator created
		listEmployees.sort(compemployee.reversed());
		System.out.println("After using list sort:"+listEmployees);
		//Here using the Collections sort with the comparator created
		Collections.sort(listEmployees,compemployee);
		System.out.println("After:"+listEmployees);
		
		listEmployees.stream().sorted(compemployee).forEach(System.out::println);
	}
	
	

}
