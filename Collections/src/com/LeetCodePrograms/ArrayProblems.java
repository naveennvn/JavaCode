package com.LeetCodePrograms;

import java.util.*;
import java.util.Arrays;

/*verified array has duplicates or not*/

public class ArrayProblems {
	public static boolean containsDuplicates(int nums[])
	{
		HashSet<Integer> set=new HashSet();
		for(int i=0;i<nums.length-1;i++) {
			if(set.contains(nums[i])) return true;
			set.add(nums[i]);
		
		}
		return false;
	}
	public static boolean verifyDuplicates(int nums[]) {
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-1;i++) {
			System.out.println(nums[i]);
		//if(nums[i]==nums[i+1]) return true;
		}
		return false;
	}
	public static int[] twoSum(int nums[],int target) {
		//Find the sum of two numbers which is equal to the target
		int a_pointer=0;
		int b_pointer=nums.length-1;
		while(a_pointer<=b_pointer)
		{
			int sum=nums[a_pointer]+nums[b_pointer];
			if(sum>target) {
				b_pointer--;
			}else if(sum<target)
			{
				a_pointer++;
			}else
			{
				System.out.println(a_pointer+""+b_pointer);
				return new int[] {a_pointer+1,b_pointer+1};
			
			}
		}
		
		return new int[] {-1,-1};
		
	}
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,3,2,1};
		int nums2[]= {2,7,11,15},target=9;
		//verifyDuplicates(nums);
		int b[]=twoSum(nums2,target);
		
		
		
		//System.out.println("array contains duplicates"+containsDuplicates(nums));
	}
}	
	

