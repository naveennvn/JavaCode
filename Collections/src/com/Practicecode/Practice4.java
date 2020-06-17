package com.Practicecode;

import java.util.*;
import java.util.Arrays;

/*Given an array nums of n integers,
are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.*/

public class Practice4 {
	public static void main(String[] args) {
	
		int [] nums= {-1, 0, 1, 2, -1, -4}; 
		List<List<Integer>> output=new LinkedList();
		Arrays.sort(nums);//-4,-1,-1,0,1,2
		for(int i=0;i<nums.length-2;i++){
			if(i==0||( i>0 && nums[i]!=nums[i-1]))
			{
				int left=i+1;
				int right=nums.length-1;
				int sum=0-nums[i];
				while(left<right)
				{
					if(nums[left]+nums[right]==sum)
					{
						output.add(Arrays.asList(nums[i],nums[left],nums[right]));
						//while(left<right && nums[left]==nums[left+1])left++;
						//while(left<right && nums[right]==nums[right-1])right--;
						left++;
						right--;
					}
					else if (nums[left]+nums[right]>sum) right--;
					else left++;
				}
			}
		}
		System.out.println(output);
	}
	
}
